package com.poc.grant_service.service;

import com.poc.grant_service.VestGrantClient;
import com.poc.grant_service.model.Grant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GrantService {
    private static final Logger logger= LoggerFactory.getLogger(GrantService.class);
    private final VestGrantClient vestGrantClient;

    @Autowired
    public GrantService(VestGrantClient vestGrantClient) {
        this.vestGrantClient = vestGrantClient;
    }



    List<Grant> grantList = List.of(
        new Grant(1,1,1000,50),
        new Grant(1,2,1000,600),
        new Grant(2,1,1000,500),
        new Grant(2,1,1000,500),
        new Grant(3,1,10000,5000)
    );

    public List<Grant> getGrantListOfPart(long partId) {
        logger.info("getGrantListOfParticipant Method::");
        List<Grant> grants =grantList.stream().filter(g -> g.getPartId()==partId).collect(Collectors.toList());
        grants.forEach(g -> g.setHaveVestGrants(this.getVestGrantInfo()));
        return grants;
    }

    public String getVestGrantInfo(){
        return this.vestGrantClient.getVestGrantInfo();
    }

}
