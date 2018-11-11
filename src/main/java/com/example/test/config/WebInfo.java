package com.example.test.config;

import com.example.test.utils.IpUtils;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * 获取运行中应用程序的上下文和端口
 */
@Configuration
public class WebInfo implements ApplicationListener<WebServerInitializedEvent> {
    private static WebServerInitializedEvent event;



    public String getUrl(String path){
        int port = event.getWebServer().getPort();
        String applicationName = event.getApplicationContext().getApplicationName();
        String [] hosts = IpUtils.getIps();
        String host = "0.0.0.0";
        if(hosts!=null && hosts.length > 0){
            for(String str : hosts){
                System.out.println("IP:--->"+str);
                if(str.contains(":")){
                    continue;
                }
                host = str;
                break;
            }

        }
        return "http://"+host+":"+port+applicationName+path;
    }

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        event = webServerInitializedEvent;
    }
}