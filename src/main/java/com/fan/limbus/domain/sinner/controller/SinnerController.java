package com.fan.limbus.domain.sinner.controller;

import com.fan.limbus.domain.sinner.entity.Sinner;
import com.fan.limbus.domain.sinner.service.SinnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sinners")
public class SinnerController {

    private final SinnerService sinnerService;

    @GetMapping
    public List<Sinner> getAll() {
        return sinnerService.getAll();
    }
}
