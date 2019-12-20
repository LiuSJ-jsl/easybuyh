package com.htkj.easybuy.controller;

import com.alibaba.fastjson.JSONObject;
import com.htkj.easybuy.entity.User;
import com.htkj.easybuy.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: LiuShanJie
 * @date: 2019/12/2 10:10
 */
@RestController
public class LoginController {

    @Autowired
    LoginMapper loginMapper;

    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    public @ResponseBody Map<String, Object> login(User user) {
        System.out.println("登录参数" + user);
        User getuser = loginMapper.login(user.getUserName(), user.getPassword());
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", 0);
        resultMap.put("msg", "登入成功");
        resultMap.put("count", "1000");
        resultMap.put("data", getuser);
        return resultMap;
    }
}
