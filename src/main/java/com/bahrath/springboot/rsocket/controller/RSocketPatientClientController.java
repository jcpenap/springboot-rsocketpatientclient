package com.bahrath.springboot.rsocket.controller;

import com.bahrath.springboot.rsocket.model.ClinicalPatientData;
import com.bahrath.springboot.rsocket.model.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RSocketPatientClientController {

    Logger logger = LoggerFactory.getLogger(RSocketPatientClientController.class);

    private final RSocketRequester rSocketRequester;

    public RSocketPatientClientController(@Autowired RSocketRequester.Builder builder) {
        this.rSocketRequester = builder.tcp("localhost", 7000);
    }

    @GetMapping("/request-response")
    public Mono<ClinicalPatientData> requestResponse(@RequestBody Patient patient) {
        logger.info("Sending the rsocket request for patient: "+patient);
        return rSocketRequester.route("get-patient-data")
                .data(patient)
                .retrieveMono(ClinicalPatientData.class);
    }

}
