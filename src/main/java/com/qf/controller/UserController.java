package com.qf.controller;

import com.qf.pojo.TUser;
import com.qf.service.UserService;
import com.qf.vo.ResultVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/addUser.do")
    @CrossOrigin
    public ResultVo addUser(TUser user) throws UnsupportedEncodingException {
        return ResultVo.setOK(userService.addUser(user));
    }


    @RequestMapping("/userlogin.do")
    @CrossOrigin
    public ResultVo login(String name,String password) {
        TUser user = userService.userlogin(name,password);
        System.out.println(user);
        if(user != null) {
            //Shiro完成登录认证
            //1、获取主题
            Subject subject= SecurityUtils.getSubject();
            //2、设置登录的Token
            UsernamePasswordToken token=new UsernamePasswordToken(name, password);
            //3、存储数据到Session
            subject.getSession().setAttribute(user.getUsername() , user);
            //4、登录认证
            subject.login(token);
            return  ResultVo.setOK(user.getUserid());
        } else {
            return ResultVo.setERROR();
        }
    }

}
