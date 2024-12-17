package com.poc.participant_service.controller;

import com.poc.participant_service.model.Partticipant;
import com.poc.participant_service.service.ParticipantService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping("/All")
    @CircuitBreaker(name = "Test",fallbackMethod = "testFallBackMethod")
    public List<Partticipant> getAllPart(){
        return this.participantService.getAllPart();
    }

    public List<Partticipant> testFallBackMethod(Throwable t) {
        Partticipant p = new Partticipant(0,"Dummy","US");
        List<Partticipant> dummyList = new ArrayList<Partticipant>();
        dummyList.add(p);
        return dummyList;
    }

    @GetMapping("/part/{id}")
    public Partticipant getPart(@PathVariable("id") long id){
        return this.participantService.getPart(id);
    }

}
