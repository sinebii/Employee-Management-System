package com.company.models;

public class Praise {
    private String reasonForPraise;

    public Praise(String reasonForPraise) {
        this.reasonForPraise = reasonForPraise;
    }

    public String getReasonForPraise() {
        return reasonForPraise;
    }

    public void setReasonForPraise(String reasonForPraise) {
        this.reasonForPraise = reasonForPraise;
    }

    @Override
    public String toString() {
        return "Praise{" +
                "reasonForPraise='" + reasonForPraise + '\'' +
                '}';
    }
}


