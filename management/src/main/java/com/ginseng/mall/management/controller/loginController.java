package com.ginseng.mall.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class loginController {

    @GetMapping("login")
    public Object login(){

        HashMap<Object, Object> map = new HashMap<>();
        map.put("a","0");
        return map;
    }
}
