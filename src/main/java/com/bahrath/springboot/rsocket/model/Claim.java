package com.bahrath.springboot.rsocket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Claim {
    private float amount;
    private String service;
}
