package com.fan.limbus.domain.sinner.service;

import com.fan.limbus.domain.sinner.entity.Sinner;
import com.fan.limbus.domain.sinner.repository.SinnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SinnerService {

    private final SinnerRepository sinnerRepository;

    public List<Sinner> getAll() {
        return sinnerRepository.findAll();
    }
}
