package com.unicom.gitgithub.controller;

import com.unicom.gitgithub.config.NewsTypeList;
import com.unicom.gitgithub.entity.NewsType;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName:com.unicom.gitgithub.controller
 * @Author:Administrator Date:2019/5/31 0031
 * Discription:
 */
@RestController
@RequestMapping(value = "newstype")//拦截一级路径
@Api(value = "新闻类别")
public class NewsTypeController {
    @Autowired
    private NewsTypeList newsTypeList;

    //查询所有
    @GetMapping(value = "getAll")
    public List<NewsType> getAll(){
        return newsTypeList.getList();
    }

    //查询单条
    @GetMapping(value = "typeDetail/{id}")
    public NewsType getOne(@PathVariable(name = "id") Integer id){
        System.out.println(id);
        NewsType newsType = newsTypeList.getList().get(id);
        System.out.println(newsType);
        return newsType;
    }

    @PutMapping(value = "update/{id}")
    public void updateNewsType(@RequestBody NewsType newsType,@PathVariable(name = "id") int id){

        newsTypeList.getList().set(id,newsType);
        System.out.println(newsTypeList.getList());
    }

    @PutMapping(value = "delete/{id}")
    public void deleteNewsType(@PathVariable(name = "id") int id){
        System.out.println(id);
        System.out.println(newsTypeList.getList().get(id));
        newsTypeList.getList().remove(id);

    }
}
