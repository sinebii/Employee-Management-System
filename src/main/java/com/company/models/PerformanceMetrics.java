package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class PerformanceMetrics {
    private final List<Query> queries;
    private final List<Praise> praises;

    public PerformanceMetrics() {
        this.queries = new ArrayList<>();
        this.praises = new ArrayList<>();
    }

    public List<Query> getQueries() {
        return queries;
    }

    public List<Praise> getPraises() {
        return praises;
    }

    @Override
    public String toString() {
        return "PerformanceMetrics{" +
                "queries=" + queries +
                ", praises=" + praises +
                '}';
    }
}
