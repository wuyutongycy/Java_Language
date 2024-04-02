package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/contro")
public class ControllerTest {
    @RequestMapping("/test")
    public String hello(Model model){
        model.addAttribute("msg","这是第一个 springmvc 程序");
        return "welcome";
    }

//    默认的数据绑定
    @RequestMapping("/test1")
    public String hello(HttpServletRequest request){
        String id =  request.getParameter("id");
        System.out.println("id = " + id);
        return "success";
    }

    //    简单的数据绑定
    @RequestMapping("/test2")
    public String hello(Integer id){
        System.out.println("id = " + id);
        return "success";
    }
}
