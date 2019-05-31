package com.unicom.gitgithub.config;

import com.unicom.gitgithub.entity.News;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName:com.unicom.gitgithub.config
 * @Author:Administrator Date:2019/5/31 0031
 * Discription:
 */
//@Bean  @Service  @Controller  @Configeration  @Repository  都是bean注解的升级版，效果同bean效果一样，是bean更详细的的分类
@Repository  //持久层的注解
public class NewsList {

    private List<News> list;

    public List<News> getList(){
        return list;
    }

    public void setList(List<News> list) {
        this.list = list;
    }

    public NewsList(){
        News news1= new News(1,"aaa1","cccccccc111");
        News news2= new News(2,"aaa2","cccccccc222");
        News news3= new News(3,"aaa3","cccccccc333");
        news1.setInputDate(new Date());

        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);

        this.setList(list);

    }

    @Override
    public String toString() {
        return "NewsList{" +
                "list=" + list +
                '}';
    }
}
