package com.htkj.easybuy.controller;

import com.htkj.easybuy.entity.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: LiuShanJie
 * @date: 2019/12/2 10:10
 */
 @RestController
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> login(Login login) {
        System.out.println("post参数" + login);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", 0);
        resultMap.put("msg", "登入成功");
        resultMap.put("count", "1000");
        resultMap.put("data", "hi");
        return resultMap;
    }
}
