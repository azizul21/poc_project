package com.poc.grant_service.model;

public class Grant {

    private long partId;
    private int grantId;
    private int option_granted;
    private int option_exercised;

    public Grant(long partId, int grantId, int option_granted, int option_exercised) {
        this.partId = partId;
        this.grantId = grantId;
        this.option_granted = option_granted;
        this.option_exercised = option_exercised;
    }

    public long getPartId() {
        return partId;
    }

    public void setPartId(long partId) {
        this.partId = partId;
    }

    public int getGrantId() {
        return grantId;
    }

    public void setGrantId(int grantId) {
        this.grantId = grantId;
    }

    public int getOption_granted() {
        return option_granted;
    }

    public void setOption_granted(int option_granted) {
        this.option_granted = option_granted;
    }

    public int getOption_exercised() {
        return option_exercised;
    }

    public void setOption_exercised(int option_exercised) {
        this.option_exercised = option_exercised;
    }
}
