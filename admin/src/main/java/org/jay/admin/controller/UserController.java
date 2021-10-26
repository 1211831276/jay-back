package org.jay.admin.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.jay.admin.domain.UserDO;
import org.jay.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public boolean validateUser(@RequestParam("username") String username,@RequestParam("password") String password) {
        QueryWrapper<UserDO> userDOQueryWrapper = new QueryWrapper<>();
        userDOQueryWrapper.eq("name", username);
        userDOQueryWrapper.eq("password", password);
        UserDO result = userService.getOne(userDOQueryWrapper);
        return result != null;
    }
    @PostMapping("/user")
    public boolean insertUser(@RequestBody UserDO user) {
        return userService.save(user);
    }


}
