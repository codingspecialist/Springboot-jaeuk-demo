package com.example.demo.web;

import java.util.List;

import com.example.demo.domain.shelterde.ShelterDe;
import com.example.demo.service.ShelterDeService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ShelterController {
    private final ShelterDeService shelterDeService;

    @GetMapping("/shelter/init-data")
    public @ResponseBody List<ShelterDe> initData(ShelterDe shelterDto, Model model) {

        List<ShelterDe> sheltersEntity = shelterDeService.다운로드(shelterDto);

        return sheltersEntity;

    }

    @GetMapping("/shelter")
    public String list(Model model) {
        PageRequest pr = PageRequest.of(1, 3);
        Page<ShelterDe> sheltersEntity = shelterDeService.전체보기(pr);

        model.addAttribute("shelterlistPage", sheltersEntity);

        return "/shelter/shelterList";
    }

    @GetMapping("/test/shelter")
    public @ResponseBody Page<ShelterDe> list() {
        PageRequest pr = PageRequest.of(1, 3);
        Page<ShelterDe> sheltersEntity = shelterDeService.전체보기(pr);

        return sheltersEntity;
    }
}
