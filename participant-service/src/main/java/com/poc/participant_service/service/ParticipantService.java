package com.poc.participant_service.service;

import com.poc.participant_service.model.Grant;
import com.poc.participant_service.model.Partticipant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParticipantService {


    private final WebClient webClient;

    @Autowired
    public ParticipantService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    List<Partticipant> participantList = List.of(
         new Partticipant(1L,"Aziz","Kolkata"),
         new Partticipant(2L,"Afroz","Chennai"),
         new Partticipant(3L,"Naved","Bangalore")
    );

    public List<Partticipant> getAllPart(){

        participantList.forEach(p -> {
            p.setGrants(new ArrayList<>(fetchGrantList(p.getPartId())));
        });

        return participantList;
    }

    public Partticipant getPart(long id){

        Partticipant participant = participantList.stream().filter(p -> p.getPartId() == id).findAny().orElse(null);
        participant.setGrants(new ArrayList<>(fetchGrantList(id)));
         return participant;
    }

    public List<Grant> fetchGrantList(long id) {
        return webClient.get()
                .uri("http://grant-service/grants/"+id)
                .retrieve()
                .bodyToFlux(Grant.class).toStream().collect(Collectors.toList());
    }
}
