package com.example.test;

import com.example.test.utils.HttpUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test {

    @org.junit.Test
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

    @org.junit.Test
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

    @org.junit.Test
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
}
