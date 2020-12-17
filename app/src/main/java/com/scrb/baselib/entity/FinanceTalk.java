package com.scrb.baselib.entity;

public class FinanceTalk {
    /**
     * content : 【行情】加拿大4月经铁路出口的原油下跌55%至15.6万桶/日。
     * id : 204783
     * link :
     * pic :
     * time : 1592589132000
     */

    private String content;
    private int id;
    private String link;
    private String pic;
    private long time;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}