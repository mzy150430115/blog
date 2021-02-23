package com.mzy.entity;

import java.util.Date;

/**
 * comment
 *
 * @author bianj
 * @version 1.0.0 2020-08-20
 */
public class Comment implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3817270145548596116L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** id */
    private Integer id;

    /** replyName */
    private String replyName;

    /** replyEmail */
    private String replyEmail;

    /** blogId */
    private Integer blogId;

    /** publishDate */
    private Date publishDate;

    /** bloggerState */
    private Integer bloggerState;

    /** replyState */
    private Integer replyState;

    /** replyContent */
    private String replyContent;

    /** parentId */
    private Integer parentId;

    /** createTime */
    private Date createTime;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取id
     *
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取replyName
     *
     * @return replyName
     */
    public String getReplyName() {
        return this.replyName;
    }

    /**
     * 设置replyName
     *
     * @param replyName
     */
    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    /**
     * 获取replyEmail
     *
     * @return replyEmail
     */
    public String getReplyEmail() {
        return this.replyEmail;
    }

    /**
     * 设置replyEmail
     *
     * @param replyEmail
     */
    public void setReplyEmail(String replyEmail) {
        this.replyEmail = replyEmail;
    }

    /**
     * 获取blogId
     *
     * @return blogId
     */
    public Integer getBlogId() {
        return this.blogId;
    }

    /**
     * 设置blogId
     *
     * @param blogId
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    /**
     * 获取publishDate
     *
     * @return publishDate
     */
    public Date getPublishDate() {
        return this.publishDate;
    }

    /**
     * 设置publishDate
     *
     * @param publishDate
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * 获取bloggerState
     *
     * @return bloggerState
     */
    public Integer getBloggerState() {
        return this.bloggerState;
    }

    /**
     * 设置bloggerState
     *
     * @param bloggerState
     */
    public void setBloggerState(Integer bloggerState) {
        this.bloggerState = bloggerState;
    }

    /**
     * 获取replyState
     *
     * @return replyState
     */
    public Integer getReplyState() {
        return this.replyState;
    }

    /**
     * 设置replyState
     *
     * @param replyState
     */
    public void setReplyState(Integer replyState) {
        this.replyState = replyState;
    }

    /**
     * 获取replyContent
     *
     * @return replyContent
     */
    public String getReplyContent() {
        return this.replyContent;
    }

    /**
     * 设置replyContent
     *
     * @param replyContent
     */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    /**
     * 获取parentId
     *
     * @return parentId
     */
    public Integer getParentId() {
        return this.parentId;
    }

    /**
     * 设置parentId
     *
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取createTime
     *
     * @return createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置createTime
     *
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}
