package com.miaosha.model;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-01-21
 */
public class Booklist {
    private Integer id;

    private String title;

    private String content;

    private Date spantime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getSpantime() {
        return spantime;
    }

    public void setSpantime(Date spantime) {
        this.spantime = spantime;
    }
}