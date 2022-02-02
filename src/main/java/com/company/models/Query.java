package com.company.models;


public class Query {
    private String queryReason;

    public Query(String queryReason) {
        this.queryReason = queryReason;
    }

    public String getQueryReason() {
        return queryReason;
    }

    public void setQueryReason(String queryReason) {
        this.queryReason = queryReason;
    }

    @Override
    public String toString() {
        return "Query{" +
                "queryReason='" + queryReason + '\'' +
                '}';
    }
}
