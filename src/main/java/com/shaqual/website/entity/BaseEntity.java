package com.shaqual.website.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体
 */
public abstract class BaseEntity<T extends  BaseEntity> implements Serializable {

    BaseEntity(){

    }
    /**
     * ID
     */
    private String id;
    /**
     * 存在状态 1、存在  -1、删除
     */
    private int status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifyTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString(){
        return "["+this.getClass().getName()+":id="+this.id+"]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
