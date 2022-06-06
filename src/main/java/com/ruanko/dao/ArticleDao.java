package com.ruanko.dao;

import com.ruanko.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
* Title: TeamDao
* Description:
* 小组数据接口
* Version:1.0.0  

 */
public interface ArticleDao extends JpaRepository<Article,Integer>{

}
