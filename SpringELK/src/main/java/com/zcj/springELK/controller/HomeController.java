package com.zcj.springELK.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/2/22.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    private Logger log = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        log.error("Main错误");
        return "/home/hello";
    }

    @RequestMapping(value = "returnString", method = RequestMethod.GET, produces = {"text/plain;charset=UTF-8"})
    @ResponseBody
    public String returnString() {
        return "hello return string 这是中文，并没有乱码";
    }
}
