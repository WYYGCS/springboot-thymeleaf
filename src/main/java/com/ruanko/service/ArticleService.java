package com.ruanko.service;


import com.ruanko.entity.Article;

import java.util.List;

/**
 * 
* Title: TeamService
* Description: 
* 小组接口
* Version:1.0.0  

 */
public interface ArticleService {
	/**
	 * 新增文章
	 * @param article
	 * @return
	 */
	boolean addArticle(Article article);

	/**
	 * 删除文章
	 * @param id
	 * @return
	 */
	boolean deleteArticle(Integer id);

	/**
	 * 更新文章
	 * @param article
	 * @return
	 */
	boolean updateArticle(Article article);

	/**
	 * 查找获得文章通过id
	 * @param id
	 * @return
	 */
	Article findArticleById(Integer id);

	/**
	 * 查找所有文章
	 * @return
	 */
	List<Article> findAllArticle();
}
