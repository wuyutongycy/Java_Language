package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
//    向科创页面跳转
    @RequestMapping("/toCourse")
    public String toCourse(){
        return "course";
    }
    @RequestMapping("/findCourse")
    public String findCourse(Integer[] ids){
        if (ids != null){
            for (Integer id : ids){
                System.out.println("删除了 id 为" + id + "的课程");
            }
        }else {
            System.out.println("ids = null");
        }
        return "success";
    }
}
