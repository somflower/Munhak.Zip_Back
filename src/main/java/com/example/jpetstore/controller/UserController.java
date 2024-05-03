package com.example.jpetstore.controller;

import com.example.jpetstore.service.MypageService;
import com.example.jpetstore.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

//    private final UserServiceImpl userServiceImpl;
//
//    @Autowired
//    public UserController(UserServiceImpl userServiceImpl) {
//        this.userServiceImpl = userServiceImpl;
//    }
//
//    @PostMapping("/updatePw")
//    @ResponseBody
//    public String updatePassword(
//            @RequestParam("id") Long id,
//            @RequestParam("newPassword") String newPassword
//    ) {
//        int rowsUpdated = userServiceImpl.updatePassword(id, newPassword);
//        if (rowsUpdated > 0) {
//            return "Password updated successfully";
//        } else {
//            return "Failed to update password";
//        }
//    }
}
