package com.fan.limbus.domain.sinner.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Sinner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;        // 죄인 이름 (예: 이상, 파우스트)

    private String description; // 설명

    private String imageUrl;    // 이미지 URL
}
