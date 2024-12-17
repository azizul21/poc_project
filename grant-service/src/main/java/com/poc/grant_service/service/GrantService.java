package com.poc.grant_service.service;

import com.poc.grant_service.model.Grant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GrantService {

    private static final Logger logger= LoggerFactory.getLogger(GrantService.class);

    List<Grant> grantList = List.of(
        new Grant(1,1,1000,50),
        new Grant(1,2,1000,600),
        new Grant(2,1,1000,500),
        new Grant(2,1,1000,500),
        new Grant(3,1,10000,5000)
    );

    public List<Grant> getGrantListOfPart(long partId) {
        logger.info("getGrantListOfParticipant Method::");
        return grantList.stream().filter(g -> g.getPartId()==partId).collect(Collectors.toList());
    }


}
