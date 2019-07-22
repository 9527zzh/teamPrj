package com.woniu.model;

public class PageBean {
	private Integer offset;
	private Integer limit=10;
	private Integer pageNow=1;
	private Integer count;
	private Integer pagecount;
	

	private Integer page;
	private Integer rows;
	public Integer getOffset() {
		return (pageNow-1)*limit;
	}
	public void setOffset(Integer offset) {
		this.offset=offset;
	}
	public Integer getPage() {
		return page;
	}
	@Override
	public String toString() {
		return "PageBean [offset=" + offset + ", limit=" + limit + ", pageNow=" + pageNow + ", count=" + count
				+ ", pagecount=" + pagecount + ", page=" + page + ", rows=" + rows + "]";
	}
	public Integer getRows() {
		return rows;
	}
	public Integer getLimit() {
		return limit;
		
	}
	public void setLimit(Integer limit) {
		this.rows=limit;
		this.limit = limit;
	}
	public Integer getPageNow() {
		return pageNow;
	}
	public void setPageNow(Integer pageNow) {
		this.page=pageNow;
		this.pageNow = pageNow;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getPagecount() {
		return (count+limit-1)/limit;
	}
	public void setPagecount(Integer pagecount) {
		this.pagecount = pagecount;
	}
}
