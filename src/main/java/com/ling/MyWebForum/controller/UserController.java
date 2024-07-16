package com.ling.MyWebForum.controller;

import com.ling.MyWebForum.models.user.UserDTO;
import com.ling.MyWebForum.repository.UserRepository;
import com.ling.MyWebForum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register/create")
    public String createUser(UserDTO userDTO) {
        userService.createUser(userDTO);
        return "/";
    }
}
