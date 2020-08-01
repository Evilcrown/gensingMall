package com.genSing.mall.management.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@Api(value = "/user",tags = "用户接口")
public class loginController {

    @GetMapping("login")
    @ApiOperation("用户登录验证")
    public Object login(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("a","0");
        return map;
    }
}
