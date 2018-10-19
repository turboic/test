package com.example.test.controller;

import com.example.test.utils.IpUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/request")
public class RequestController {

    @RequestMapping(value="/get/{id}",method = RequestMethod.GET)
    public String get(@PathVariable(name="id",required = false) String id){
        if(StringUtils.isEmpty(id)){
            return "传递的参数为空";
        }
        return id;
    }

    @RequestMapping(value="/getRequest",method = RequestMethod.GET)
    public String getToGet(@RequestParam(name="id",defaultValue = "哈利波特",required = false) String id){
        return id;
    }

    @RequestMapping(value="/post",method = RequestMethod.POST)
    public String post(@RequestParam(name="from",defaultValue = "fromDefault",required = false) String from,
                       @RequestParam(name="to",defaultValue = "toDefault",required = false) String to){
       return from+"【后台拼接的数据返回】"+to;
    }


    /**
     * 主机IP地址
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/ip")
    public String getIp(HttpServletRequest request, HttpServletResponse response){
       return IpUtils.getIP( request);
    }

    /**
     * 请求路径URL
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/url")
    public String getUrl(HttpServletRequest request, HttpServletResponse response){
        String url = "http://" + request.getServerName() //服务器地址
                + ":"
                + request.getServerPort()           //端口号
                + request.getContextPath()      //项目名称
                + request.getServletPath()      //请求页面或其他地址
                + "?" + (request.getQueryString()); //参数
        return url;
    }
}
