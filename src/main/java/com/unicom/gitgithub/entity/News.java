package com.unicom.gitgithub.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @ClassName:com.unicom.gitgithub.entity
 * @Author:Administrator Date:2019/5/31 0031
 * Discription:
 */
@ApiModel(value = "News",description = "新闻实体")
public class News {
    private Integer id;
    @ApiModelProperty(value = "新闻标题",required = false)
    private String title;
//    @JsonProperty("content1")
//    @JsonIgnore
    private String content;

    //timezone的值要与数据库连接字符串中的时区设置保持一致 GMT%2B8 连接数据库时，特殊字符要做转义
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    @JsonInclude(JsonInclude.Include.NON_NULL)  //不为null才输出
    private Date inputDate;

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public News() {
    }

    public News(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

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
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", inputDate=" + inputDate +
                '}';
    }
}
