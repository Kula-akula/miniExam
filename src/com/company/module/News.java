package com.company.module;

import java.util.Date;

public class News {
    private int id;
    private String headLine;
    private String text;
    private Date publishingTime;

    public News() {
    }

    public News(int id, String headLine, String text, Date publishingTime) {
        this.id = id;
        this.headLine = headLine;
        this.text = text;
        this.publishingTime = publishingTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getPublishingTime() {
        return publishingTime;
    }

    public void setPublishingTime(Date publishingTime) {
        this.publishingTime = publishingTime;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", headLine='" + headLine + '\'' +
                ", text='" + text + '\'' +
                ", publishingTime=" + publishingTime +
                '}';
    }
}
