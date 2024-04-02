package com.ssm.controller;

import com.ssm.pojo.Classroom;
import com.ssm.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    // 向注册页面跳转
    @RequestMapping("toStudent")
    public String toStudent(){

        return "student";
    }

        // 向注册页面跳转
        @RequestMapping("findStudentWithClass")
        public String findStudentWithClass(Student student) {
            String sid = student.getSid();
            Classroom classroom = student.getClassroom();
            String cname = classroom.getCname();
            System.out.println("学生编号：" + sid);
            System.out.println("班级编号：" + cname);
            return "success";
        }
        }
