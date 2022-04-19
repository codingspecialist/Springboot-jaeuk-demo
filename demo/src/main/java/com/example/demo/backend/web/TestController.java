package com.example.demo.shelterde.web;

import java.util.List;

import com.example.demo.shelterde.service.ShelterDeService;
import com.example.demo.shelterde.shelterdedto.ShelterDeDto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TestController {

    private final ShelterDeService Service;

    @GetMapping("/shelter/detail")
    public String testDownload(ShelterDeDto shelterDto, Model model) {

        List<ShelterDeDto> shelterEntity = Service.다운로드(shelterDto);

        model.addAttribute("shelterlist", shelterEntity);

        return "/api/shelterDeDownload";

    }
}
