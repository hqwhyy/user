package com.test.hyy.controller;

/**
 *
 *新建的Controller用来玩
 *
 */

import com.test.hyy.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user",produces = "application/json; charset=utf-8")
public class UserController {
    @Autowired
    private UserDAO userDAO;
}
