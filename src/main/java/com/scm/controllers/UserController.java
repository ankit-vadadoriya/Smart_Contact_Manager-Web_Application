package com.scm.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scm.services.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

    // private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    
    // user dashboard page
    @RequestMapping(value = "/dashboard")
    public String userDashboard() {
        return "user/dashboard";
    }

    @RequestMapping(value = "/profile")
    public String userProfile() {
        return "user/profile";
    }

    @RequestMapping(value = "/feedback")
    public String userFeedback() {
        return "user/feedback";
    }

    @RequestMapping(value = "/home")
    public String userHome() {
        return "user/home";
    }

    @RequestMapping(value = "/about")
    public String userAbout() {
        return "user/about";
    }

    @RequestMapping(value = "/services")
    public String userServices() {
        return "user/services";
    }

    @RequestMapping(value = "/contactUs")
    public String userContactUs() {
        return "user/contactUs";
    }


}
