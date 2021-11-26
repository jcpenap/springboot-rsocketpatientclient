package com.bahrath.springboot.rsocket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Patient {

    private String firstName;
    private String secondName;
    private String ssn;

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
