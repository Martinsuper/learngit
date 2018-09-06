package com.martind.editorBlog.service;

import com.martind.editorBlog.po.Article;

import java.io.IOException;
import java.util.List;

public interface EditorArticleService {
    void insertArticle(Article article) throws IOException;
    List<Article> queryAllArticl() throws IOException;
    Article queryArticleById(Long id) throws IOException;
    void deleteArticleById(Long id) throws IOException;

}
