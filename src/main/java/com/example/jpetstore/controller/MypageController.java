package com.example.jpetstore.controller;

import com.example.jpetstore.service.MypageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MypageController {

    //컨트롤러는 서비스 호출
    private final MypageService mypageService;

    @Autowired
    public MypageController(MypageService mypageService) {
        this.mypageService = mypageService;
    }

    @PostMapping("/updateNickname")
    @ResponseBody
    public String updateNickname(
            @RequestParam("id") Long id,
            @RequestParam("newNickname") String newNickname
    ) {
        int rowsUpdated = mypageService.updateNickname(id, newNickname);
        if (rowsUpdated > 0) {
            return "Nickname updated successfully";
        } else {
            return "Failed to update nickname";
        }
    }

    public String changePassword(
            @RequestParam("id") Long id,
            @RequestParam("newNickname") String newPassword) {
        int rowsUpdated = mypageService.changePassword(id, newPassword);
        if (rowsUpdated > 0) {
            return "Password updated successfully";
        } else {
            return "Failed to update Password";
        }
    }

}
