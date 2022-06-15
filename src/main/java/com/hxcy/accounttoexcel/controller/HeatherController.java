package com.hxcy.accounttoexcel.controller;

import com.hxcy.accounttoexcel.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevin
 * @date 2022/4/27
 * @desc
 */
@RestController
@RequestMapping("/api")
public class HeatherController {

    @RequestMapping("/health")
    public String getHealth(){
        return "hello world!";
    }
}
