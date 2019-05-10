package com.miaosha.controller;

import com.miaosha.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by HolSha on 2019/1/18 0018.
 */
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private ILoginService iLoginService;

    @RequestMapping("/dele")
    public void dele(){
        iLoginService.hello("sdfasdfa");
    }
}
