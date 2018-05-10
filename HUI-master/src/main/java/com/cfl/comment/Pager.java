package com.cfl.comment;

import java.util.List;

/**
 * 返回到前端页面的分页对象
 * 创建于2017-08-16
 *
 * @author 陈飞龙
 * @version 1.0
 * @param <T> 分页组件可以返回指定类型的VO对象
 */
public class Pager<T>{

    private static final long serialVersionUID = 7596824634662805852L;

    private Integer pageNo;
    private Integer pageSize;
    private Long total;
    private List<T> rows;


    public Pager() {}

    public Pager(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
