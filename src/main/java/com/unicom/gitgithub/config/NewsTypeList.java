package com.unicom.gitgithub.config;

import com.unicom.gitgithub.entity.News;
import com.unicom.gitgithub.entity.NewsType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName:com.unicom.gitgithub.config
 * @Author:Administrator Date:2019/5/31 0031
 * Discription:
 */
@Repository
public class NewsTypeList {
    private List<NewsType> list;

    public List<NewsType> getList(){
        return list;
    }

    public void setList(List<NewsType> list) {
        this.list = list;
    }

    public NewsTypeList(){
        NewsType newsType1= new NewsType(1,"bagua","guonei");
        NewsType newsType2= new NewsType(2,"tiyu","guonei");
        NewsType newsType3= new NewsType(3,"bagua","guoji");
        NewsType newsType4= new NewsType(4,"tiyu","guoji");

        List<NewsType> list = new ArrayList<>();
        list.add(newsType1);
        list.add(newsType2);
        list.add(newsType3);
        list.add(newsType4);

        this.setList(list);

    }

    @Override
    public String toString() {
        return "NewsTypeList{" +
                "list=" + list +
                '}';
    }
}
