package com.htkj.easybuy.controller;

import com.htkj.easybuy.entity.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author: LiuShanJie
 * @date: 2019/12/2 10:10
 */
@RestController
public class LoginController {

    @RequestMapping("/loginUser")
    public boolean login2(HttpServletRequest request, HttpServletResponse response, Login login) {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:63342");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        System.out.println("post参数" + login);
        return true;
    }
}
