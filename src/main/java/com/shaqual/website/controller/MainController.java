package com.shaqual.website.controller;

import com.shaqual.website.entity.User;
import com.shaqual.website.service.ClientUserService;
import com.shaqual.website.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/shaqual/")
public class MainController {

    @Autowired
    private ClientUserService clientUserService;

    @RequestMapping("index.html")
    public String index(){
        return "index";
    }

    @RequestMapping("introduce.html")
    public String introduce(){
        return "introduce";
    }

    @RequestMapping("users.json")
    @ResponseBody
    public String users(){
        Map map = new HashMap();
        map.put("offset",0);
        map.put("psize",10);
        List<User> list = clientUserService.selectByPage(map);
        return JsonUtil.turnToJson(true,"操作成功",list);
    }
}
