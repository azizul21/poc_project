package com.poc.grant_service.controller;

import com.poc.grant_service.model.Grant;
import com.poc.grant_service.service.GrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grants")
public class GrantController {

    @Autowired
    private GrantService grantService;

    @GetMapping("/{partId}")
    public List<Grant> getGrantListForPart(@PathVariable("partId") long partId){

        return this.grantService.getGrantListOfPart(partId);
    }


}
