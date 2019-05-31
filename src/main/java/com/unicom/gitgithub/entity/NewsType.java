package com.unicom.gitgithub.entity;

/**
 * @ClassName:com.unicom.gitgithub.entity
 * @Author:Administrator Date:2019/5/31 0031
 * Discription:
 */
public class NewsType {
    private Integer id;
    private String type;
    private String limit;

    public NewsType() {
    }

    @Override
    public String toString() {
        return "NewsType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", limit='" + limit + '\'' +
                '}';
    }

    public NewsType(Integer id, String type, String limit) {
        this.id = id;
        this.type = type;
        this.limit = limit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }
}
