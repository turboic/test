package com.example.test;

import com.example.test.utils.HttpUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test {

    //@org.junit.Test
    public void test() throws Exception {
        String host = "http://localhost:9999";
        String path ="/execute/get/网络请求数据哈哈哈哈哈哈";
        String method ="get";
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> querys = new HashMap<String, String>();
        HttpResponse response  = HttpUtils.doGet(host,path,method,headers,querys);
        HttpEntity entity = response.getEntity();
        BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));
        StringBuilder sb = new StringBuilder();
        String content = null;
        while((content = br.readLine())!=null){
            sb.append(content);
        }
        if(br !=null){
            br.close();
        }
        System.out.println("输出结果："+sb.toString());

    }

    //@org.junit.Test
    public void testGetRequest() throws Exception {
        String host = "http://localhost:9999";
        String path ="/execute/getRequest";
        String method ="get";
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("id","北方飘雪");
        HttpResponse response  = HttpUtils.doGet(host,path,method,headers,querys);
        HttpEntity entity = response.getEntity();
        BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));
        StringBuilder sb = new StringBuilder();
        String content = null;
        while((content = br.readLine())!=null){
            sb.append(content);
        }
        if(br !=null){
            br.close();
        }
        System.out.println("输出结果："+sb.toString());

    }

    //@org.junit.Test
    public void post() throws Exception {
        String host = "http://localhost:9999";
        String path ="/execute/post";
        String method ="post";
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        querys.put("from","南方");
        querys.put("to","北方");
        HttpResponse response  = HttpUtils.doPost(host,path,method,headers,querys,bodys);
        HttpEntity entity = response.getEntity();
        BufferedReader br = new BufferedReader(new InputStreamReader(entity.getContent()));
        StringBuilder sb = new StringBuilder();
        String content = null;
        while((content = br.readLine())!=null){
            sb.append(content);
        }
        if(br !=null){
            br.close();
        }
        System.out.println("输出结果："+sb.toString());

    }

    //@org.junit.Test
    public void executeRequestTest(){
        String url = "http://10.10.10.101:9080/jmwroute";
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("rest","远程路由测试调用啊");
        headers.put("jmwesb_fromarea","0000010000000000");
        headers.put("jmwesb_toarea","0000110000000000");
        headers.put("jmwesb_servicecode","restservice");
        BufferedReader br = null;
        try{
            HttpResponse response  = HttpUtils.executePost(url,headers,bodys);
            HttpEntity entity = response.getEntity();
            br = new BufferedReader(new InputStreamReader(entity.getContent()));
            StringBuilder sb = new StringBuilder();
            String content = null;
            while((content = br.readLine())!=null){
                sb.append(content);
            }
            System.out.println("输出结果："+sb.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(br !=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @org.junit.Test
    public void webInfoTest(){
        String localhost = "http://localhost:9999/xtgl-web/test/webinfo";
        BufferedReader br = null;
        try{
            HttpResponse response  = HttpUtils.executePost(localhost,new HashMap<String, String>(),null);
            HttpEntity entity = response.getEntity();
            br = new BufferedReader(new InputStreamReader(entity.getContent()));
            StringBuilder sb = new StringBuilder();
            String content = null;
            while((content = br.readLine())!=null){
                sb.append(content);
            }
            System.out.println("本地测试获取运行服务器的端口结果："+sb.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(br !=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
