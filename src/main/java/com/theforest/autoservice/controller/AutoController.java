package com.theforest.autoservice.controller;

import com.theforest.autoservice.dto.AutoDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class AutoController {

    @GetMapping("/info")
    public String getInfoAuto() {
        return "info";
    }

    @GetMapping("/info/{title}")
    public String getInfoAutoByTitle(@PathVariable String title) {
        return "title: " + title;
    }

    @PostMapping("/buy_auto")
    public AutoDto buyAuto(@RequestBody AutoDto dto) {
        return dto;
    }
}
