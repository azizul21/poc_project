package com.poc.grant_service.service;

import com.poc.grant_service.model.Grant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GrantService {

    List<Grant> grantList = List.of(
        new Grant(1,1,1000,50),
        new Grant(1,2,1000,600),
        new Grant(2,1,1000,500),
        new Grant(2,1,1000,500),
        new Grant(3,1,10000,5000)
    );

    public List<Grant> getGrantListOfPart(long partId) {
        return grantList.stream().filter(g -> g.getPartId()==partId).collect(Collectors.toList());
    }


}
