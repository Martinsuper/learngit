package com.martind.editorBlog.controller;

import com.martind.editorBlog.po.Article;
import com.martind.editorBlog.service.EditorArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class EditorBlogArticleController {
    @Autowired
    private EditorArticleService editorArticleService;
    @RequestMapping("/")
    public String home(){
        return "homePage";
    }
    @RequestMapping(value = "/insertArticle")
    public String insertArticle(Article article) throws IOException {
        article.setFirstEditorTime(new Date());
        article.setModifyTime(new Date());
        editorArticleService.insertArticle(article);

        return "redirect:/queryAllArticle";
    }

    @RequestMapping(value = "/queryAllArticle")
    public String queryAllArticle(Model model) throws IOException {
        List<Article> articleList = editorArticleService.queryAllArticl();
        model.addAttribute("articleList",articleList);
        return "queryAllArticleResult";
    }

    @RequestMapping(value = "/queryArticleById/{id}")
    public String queryArticleById(@PathVariable Long id,Model model) throws IOException {
        Article article = editorArticleService.queryArticleById(id);
        model.addAttribute("article",article);
        return "articlePage";
    }

    @RequestMapping(value = "/deleteArticleById/{id}")
    public String deleteArticleById(@PathVariable Long id) throws IOException {
        editorArticleService.deleteArticleById(id);
        return "redirect: /queryAllArticle";
    }
}
