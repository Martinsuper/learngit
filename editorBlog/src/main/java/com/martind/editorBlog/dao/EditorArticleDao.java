package com.martind.editorBlog.dao;


import com.martind.editorBlog.po.Article;

import java.io.IOException;
import java.util.List;

public interface EditorArticleDao {
    void insertArticle(Article article) throws IOException;
    List<Article> queryAllArticle() throws IOException;
    Article queryArticleById(Long id) throws IOException;
    void deleteArticleById(Long id) throws IOException;
}
