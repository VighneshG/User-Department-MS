package com.vighnesh.user.controller;

import com.vighnesh.user.VO.ResponseVO;
import com.vighnesh.user.entity.User;
import com.vighnesh.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("In saveUser inside User Controller");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseVO getUserDepartment(@PathVariable("id") long userId){
        log.info("In getUserDepartment inside User Controller");
        return userService.findUserDepartmentDetails(userId);
    }
}
