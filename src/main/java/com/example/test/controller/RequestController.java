package com.example.test.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/execute")
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
}
