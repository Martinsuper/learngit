package com.martind.editorBlog.po;

import java.util.Date;

public class Article {
    private Long id;
    private Date firstEditorTime;
    private Date modifyTime;
    private String articleTitle;
    private String articleContent;
    private String category;

    public Article() {
    }

    public Article(Long id, Date firstEditorTime, Date modifyTime, String articleTitle, String articleContent, String category) {
        this.id = id;
        this.firstEditorTime = firstEditorTime;
        this.modifyTime = modifyTime;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFirstEditorTime() {
        return firstEditorTime;
    }

    public void setFirstEditorTime(Date firstEditorTime) {
        this.firstEditorTime = firstEditorTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", firstEditorTime=" + firstEditorTime +
                ", modifyTime=" + modifyTime +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
