package com.zytwo.demotwo.user.controller;

import com.zytwo.demotwo.user.entity.UserEntity;
import com.zytwo.demotwo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

//    增
    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map) {

        return userService.getAll(map);

    }
//    删
    @RequestMapping("/delById")
    public String delById(Integer id){
        userService.delById(id);
        return "redirect:/index.html";//重定向到原网页
    }

//    增
    //保存用户的接口
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity){

        userService.save(userEntity);
        return "success";

    }
}


