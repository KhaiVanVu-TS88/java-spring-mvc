package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Đúng
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UserService;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = this.userService.handleHello();
        model.addAttribute("khai", test);
        model.addAttribute("khai1", "Ngu vl");
        return "hello";
    }
}

// @RestController
// public class UserController {

// //DI : dependency injection
// private UserService userService;

// public UserController(UserService userService) {
// this.userService = userService;
// }

// @GetMapping("/")
// public String getHomePage() {
// return "Hello from controller";
// }
// }
