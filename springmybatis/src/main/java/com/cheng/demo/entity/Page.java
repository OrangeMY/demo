package com.cheng.demo.entity;

import java.util.List;

/**
 * @author chengmingyang
 */
public class Page<T> {

    /**
     * 每一页的大小
     */
    private Integer size;
    /**
     * 分页起始页
     */
    private Integer page;
    /**
     * 返回的记录集合
     */
    private List<T> rows;
    /**
     * 总记录数
     */
    private Long total;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
