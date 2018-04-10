package com.oracle.mybatistest.controller;

import com.oracle.mybatistest.po.User;
import com.oracle.mybatistest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    @Qualifier("UserService")
   private UserService userService;
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name","world");
        return "home";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable(value = "id") int id){
        User u = userService.find(id);
        model.addAttribute("name",u.getName());
        return "home";
    }
}
