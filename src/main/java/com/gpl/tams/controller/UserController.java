package com.gpl.tams.controller;


import com.gpl.tams.model.data.TeacherDO;
import com.gpl.tams.service.TeacherService;
import com.gpl.tams.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private TeacherService teacherService;

    private final String USERNAME = "admin";
    private final String PASSWORD = "admin";

    @GetMapping("/login")
    public TeacherDO login(TeacherDO teacherDO) {
        boolean loginFlag = teacherService.loginByTeacher(teacherDO);
        if (loginFlag) {
            //添加token
            TeacherDO resTeacher = new TeacherDO();
            resTeacher.setToken(JwtUtil.createToken());
            logger.info("{}登录成功,Token:{}", teacherDO.getName(), resTeacher.getToken());
            //添加session
            return resTeacher;
        }
        logger.error("{}登录失败", teacherDO.getName());
        return null;
    }

    @GetMapping("/checkToken")
    public Boolean checkToken(HttpServletRequest request) {
        String token = request.getHeader("token");
        return JwtUtil.checkToken(token);
    }

}
