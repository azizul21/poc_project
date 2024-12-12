package com.poc.participant_service.controller;

import com.poc.participant_service.model.Partticipant;
import com.poc.participant_service.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping("/All")
    public List<Partticipant> getAllPart(){
        return this.participantService.getAllPart();
    }

    @GetMapping("/part/{id}")
    public Partticipant getPart(@PathVariable("id") long id){
        return this.participantService.getPart(id);
    }

}
