package com.ruanko.service.impl;

import com.ruanko.dao.ArticleDao;
import com.ruanko.entity.Article;
import com.ruanko.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 
* Title: TeamServiceImpl
* Description: 
* 小组操作实现类
* Version:1.0.0  

 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Override
    public boolean addArticle(Article article) {
        boolean flag=false;
        try{
            articleDao.save(article);
            flag=true;
        }catch(Exception e){
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteArticle(Integer id) {
        boolean flag=false;
        try{
            articleDao.deleteById(id);
            flag=true;
        }catch(Exception e){
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateArticle(Article article) {
        boolean flag=false;
        try{
            articleDao.save(article);
            flag=true;
        }catch(Exception e){
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Article findArticleById(Integer id) {
        try{
            Optional<Article> article=articleDao.findById(id);
            if(article.isPresent())
                return article.get();
        }catch(Exception e){
            System.out.println("查询失败!");
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public List<Article> findAllArticle() {
        return articleDao.findAll();
    }
}
