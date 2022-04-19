package com.example.demo.model;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final HttpSession session;

    // 보호소 정보
    @GetMapping("/shelterList")
    public String shelterList() {
        return "/layout/shelterList";
    }

    // 보호소 정보
    // @GetMapping("/animal/shelterList")
    // public String shelterList(Model model) {

    // Shelter shel = (Shelter) session.getAttribute("shel");

    // model.addAttribute("shel", shelterList(null));

    // return "/animal/shelterList";
    // }
}
