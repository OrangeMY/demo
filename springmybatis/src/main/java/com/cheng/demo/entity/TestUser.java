package com.cheng.demo.entity;

import java.util.Date;

public class TestUser {

    private Long id;
    private String name;
    private Integer sex;
    private String remark;
    private Date createTime;
    private Date updateTime;
    private String test;
    private String BelongOprName;

    public TestUser() {

    }

    public TestUser(Long id, String name, Integer sex, String remark, Date createTime, Date updateTime, String test, String belongOprName) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.test = test;
        BelongOprName = belongOprName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getBelongOprName() {
        return BelongOprName;
    }

    public void setBelongOprName(String belongOprName) {
        BelongOprName = belongOprName;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", test='" + test + '\'' +
                ", BelongOprName='" + BelongOprName + '\'' +
                '}';
    }
}
