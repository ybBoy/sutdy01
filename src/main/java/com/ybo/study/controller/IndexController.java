package com.ybo.study.controller;

import com.ybo.study.servcie.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/")
    public String index(){
        int count = indexService.selectDb();
        return "hai , welcome study01! " + count;
    }
}
