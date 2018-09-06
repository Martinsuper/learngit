package com.martind.editorBlog.dao.impl;

import com.martind.editorBlog.Mapper.EditorBlogMapper;
import com.martind.editorBlog.dao.EditorArticleDao;
import com.martind.editorBlog.po.Article;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Repository
public class EditorArticleDaoImpl implements EditorArticleDao {

    @Override
    public void insertArticle(Article article) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession opensession = sqlSessionFactory.openSession(true);
        try{
            EditorBlogMapper mapper = opensession.getMapper(EditorBlogMapper.class);
            mapper.insertArticle(article);
        }finally {
            opensession.close();
        }
    }

    @Override
    public Article queryArticleById(Long id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession opensession = sqlSessionFactory.openSession(true);
        try{
            EditorBlogMapper mapper = opensession.getMapper(EditorBlogMapper.class);
            Article article = mapper.queryArticleById(id);
            return article;
        }finally {
            opensession.close();
        }
    }

    @Override
    public List<Article> queryAllArticle() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession opensession = sqlSessionFactory.openSession(true);
        try{
            EditorBlogMapper mapper = opensession.getMapper(EditorBlogMapper.class);
            List<Article> articleList = mapper.queryAllArticle();
            return articleList;
        }finally {
            opensession.close();
        }
    }

    @Override
    public void deleteArticleById(Long id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession opensession = sqlSessionFactory.openSession(true);
        try{
            EditorBlogMapper mapper = opensession.getMapper(EditorBlogMapper.class);
            mapper.deleteArticleById(id);
        }finally {
            opensession.close();
        }
    }
}
