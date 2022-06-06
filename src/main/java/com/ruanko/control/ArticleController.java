package com.ruanko.control;

import com.ruanko.entity.Article;
import com.ruanko.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/showArticle")
    public String showArticle(Model model){
        System.out.println("查询所有文章");
        List<Article> articles=articleService.findAllArticle();
        model.addAttribute("articles",articles);
        return "articleShow";
    }
}
