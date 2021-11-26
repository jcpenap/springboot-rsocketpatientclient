package com.bahrath.springboot.rsocket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClinicalPatientData {

    private int heartRate;
    private String bp;

    @Override
    public String toString() {
        return "ClinicalPatientData{" +
                "heartRate=" + heartRate +
                ", bp='" + bp + '\'' +
                '}';
    }
}
