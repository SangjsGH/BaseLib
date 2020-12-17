package com.scrb.baselib.entity;

public class FinanceCalendar {
    /**
     * actual : 185
     * affect : 1
     * consensus : 185
     * country : 美国
     * id : 11905
     * name : 美国至7月3日当周石油钻井总数(口)
     * previous : 188
     * star : 3
     * time : 1593709200000
     */

    private String actual;
    private String affect;
    private String consensus;
    private String country;
    private int id;
    private String name;
    private String previous;
    private int star;
    private long time;

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String getAffect() {
        return affect;
    }

    public void setAffect(String affect) {
        this.affect = affect;
    }

    public String getConsensus() {
        return consensus;
    }

    public void setConsensus(String consensus) {
        this.consensus = consensus;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}