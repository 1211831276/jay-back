package org.jay.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-admin")
public class UserController {
    @GetMapping("")
    public String getAll() {
        return "hello world";
    }
}
