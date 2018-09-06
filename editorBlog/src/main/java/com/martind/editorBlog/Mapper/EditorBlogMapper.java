package com.martind.editorBlog.Mapper;

import com.martind.editorBlog.po.Article;

import java.util.List;

public interface EditorBlogMapper {
    public void insertArticle(Article article);
    public List<Article> queryAllArticle();
    public Article queryArticleById(Long id);
    public void deleteArticleById(Long id);
}
