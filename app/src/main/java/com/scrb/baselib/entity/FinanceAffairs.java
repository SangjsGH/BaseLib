package com.scrb.baselib.entity;

public class FinanceAffairs {
    /**
     * content : 美联储理事夸尔斯(Randal Quarles)就压力测试进行讨论。
     * country : 美国
     * id : 2160
     * region :
     * time : 1592582400000
     */

    private String content;
    private String country;
    private int id;
    private String region;
    private long time;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}