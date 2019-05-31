package com.unicom.gitgithub.controller;

import com.alibaba.fastjson.JSONObject;
import com.unicom.gitgithub.config.NewsList;
import com.unicom.gitgithub.entity.News;
import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@Api(tags = "新闻系统-新闻管理模块API")
public class NewsController {

    @Autowired
    private NewsList newsList;

    // 子注解，更细节的拦截：@GetMapping @PostMappling @PutMapping @DeleteMapping
    @GetMapping(value = "getAll")//拦截二级路径
    @ApiOperation(value = "获取新闻列表")
    @ApiImplicitParam(name = "id",value = "新闻编号",required = true,dataType = "String")
    public List<News> getAll(){
        return newsList.getList();
    }

    //获取新闻详情
    @GetMapping(value = "detail/{id}")
    @ApiOperation(value = "获取新闻详情")
    public News getOne(@PathVariable(name = "id") Integer id){
        System.out.println(id);
        News news = newsList.getList().get(id);
        return news;

    }
    //新增新闻
    @PostMapping(value = "insert")
    @ApiOperation(value = "新增新闻")
    public void addNews(@RequestBody @ApiParam(value = "新闻对象",required = true) News news){
        newsList.getList().add(news);
        System.out.println(newsList.getList());
    }
    //修改新闻
    @PutMapping(value = "update/{id}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "news",value = "新闻对象",dataType = "News"),
            @ApiImplicitParam(name = "id",value = "新闻编号",dataType = "int")
    })
    @ApiOperation(value = "修改新闻")
    public void updateNews(@RequestBody News news,@PathVariable(name = "id") int id){
        news.setId(id);
        newsList.getList().set(1,news);
        System.out.println(newsList.getList());
    }

    @PutMapping(value = "delete/{id}")
    public void deleteNews(@PathVariable(name = "id") int id){
        for (int i = 0; i < newsList.getList().size(); i++) {
            if (newsList.getList().get(i).getId()==id){
                System.out.println("delete:"+newsList.getList().get(i).toString());
                newsList.getList().remove(i);
            }
        }

    }

    //fastJson示例
    @PostMapping(value = "json")
    public void getJson(@RequestBody JSONObject jsonObject){
        System.out.println(jsonObject.getString("userid"));
        System.out.println(jsonObject.getInteger("age"));
        System.out.println(jsonObject.getObject("ids",List.class).get(0));//反射
    }

}
