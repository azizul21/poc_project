package com.poc.participant_service.model;


import java.util.ArrayList;

public class Partticipant {

    private long partId;
    private String name;
    private String country;
    private ArrayList<Grant> grants = new ArrayList<>();

    public Partticipant(long partId,String name, String country) {
        this.partId = partId;
        this.name = name;
        this.country = country;
    }

    public long getPartId() {
        return partId;
    }

    public void setPartId(long partId) {
        this.partId = partId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Grant> getGrants() {
        return grants;
    }

    public void setGrants(ArrayList<Grant> grants) {
        this.grants = grants;
    }
}
