package com.unicom.gitgithub.controller;

import com.unicom.gitgithub.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:com.unicom.gitgithub.controller
 * @Author:Administrator Date:2019/5/31 0031
 * Discription:
 */
//http://10.11.1.222:8080/news/getAll
@RestController
@RequestMapping (value = "news")//拦截一级路径
public class NewsController {

    // 子注解，更细节的拦截：@GetMapping @PostMappling @PutMapping @DeleteMapping
    @RequestMapping(value = "getAll")//拦截二级路径
    public List<News> getAll(){
        News news1= new News(1,"aaa1","cccccccc111");
        News news2= new News(2,"aaa2","cccccccc222");
        News news3= new News(3,"aaa3","cccccccc333");

        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);

        return list;
    }
}
