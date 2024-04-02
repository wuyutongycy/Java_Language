package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.pojo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
// 向注册页面跳转
    @RequestMapping("toRegist")
    public String toRegist(){

        return "regist";
    }
    // 接收用户注册信息
    @RequestMapping("registUser")
    public String registUser(User user){
        String uname = user.getUname();
        String upwd = user.getUpwd();
        System.out.println("uname = " + uname);
        System.out.println("upwd = " + upwd);
        return "success";
    }

    //向修改页面跳转
    @RequestMapping("toEditUser")
    public String toEditUser(){

        return "EditUser";
    }
    @RequestMapping("editUsers")
    public String editUsers(UserVo userList){
        List<User> users = userList.getUserList();
        for (User user:users){
            if (user.getUid() != null){
                System.out.println("修改了编号为" + user.getUid() + "的用户名为" + user.getUname());
            }else{
                System.out.println("请选择用户！");
                break;
            }
        }
        return "success";
    }

    //testJson2
    @RequestMapping("/testJson2")
    @ResponseBody
    // @RequestBody 用在方法上  用户返回 User 对象（当返回 POJO 对象时，会默认转换为 JSON 格式数据进行响应）
    // @ResponseBody 用在形参上，将前端请求体中的 JSON 格式数据绑定到形参 user 上
    public  User testJson2(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}
