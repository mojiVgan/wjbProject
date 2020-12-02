package com.job.demo.config;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel(value = "返回结果说明")
public class Pager<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final int DEFAULT_PAGESIZE = 10;

	@ApiModelProperty(value = "数据集合", hidden = true)
	private List<T> records;

	@ApiModelProperty(value = "当前页码")
	private int pageNum = 1;

	@ApiModelProperty(value = "显示最大条数")
	private int pageSize = 10;

	@ApiModelProperty(value = "排序字段")
	private String order;

	@ApiModelProperty(value = "总页码", hidden = true)
	private int totalPage;

	@ApiModelProperty(value = "总条数", hidden = true)
	private long totalCount;
	@ApiModelProperty(value = "扩展字段", hidden = true)
	private Object desc;

	/**
	 * sql 开始行数
	 */
	@ApiModelProperty(hidden = true)
	private int startRow;

	/**
	 * sql 结束函数
	 */
	@ApiModelProperty(hidden = true)
	private int endRow;

	@ApiModelProperty(hidden = true)
	private int startPageIndex;
	@ApiModelProperty(hidden = true)
	private int endPageIndex;
	@ApiModelProperty(hidden = true)
	private int pageCode = 10;
	@ApiModelProperty(hidden = true)
	private int previewPage = 1;

	@ApiModelProperty(value = "下个页码", hidden = true)
	private int nextPage = 1;

	@ApiModelProperty(hidden = true)
	private Object jsonObj;

	public Pager(){
	}

	public Pager(int pageNum, int pageSize){
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	public Pager(int page){
		this.setPageNum(page);
		this.pageSize = DEFAULT_PAGESIZE;
	}
	
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int page) {
		if( page > 0 ){
			this.pageNum = page;
		}
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int rows) {
		if( rows > 0 ){
			this.pageSize = rows;
		}
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
		
		this.startPageIndex  = this.pageNum-(pageCode%2==0? pageCode/2-1 : pageCode/2);
		this.endPageIndex = this.pageNum+pageCode/2;
		if(this.startPageIndex <1){
			this.startPageIndex  = 1;
			if(totalPage>=pageCode) {
				this.endPageIndex = pageCode;
			} else {
				this.endPageIndex = totalPage;
			}
		}
		if(this.endPageIndex>totalPage){
			this.endPageIndex = totalPage;
			if((this.endPageIndex-pageCode)>0) {
				this.startPageIndex = this.endPageIndex -pageCode+1;
			}else{
				this.startPageIndex  = 1;
			}
		}
		if(this.endPageIndex<=1){
			this.endPageIndex = 1;
		}
		this.previewPage = this.pageNum - 1;
		this.nextPage = this.pageNum + 1;
		if(this.pageNum<=1){
			this.previewPage = 1;
		}
		if(this.pageNum>=this.totalPage){
			this.nextPage = this.totalPage;
		}
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
		setTotalPage((int) (totalCount%pageSize==0?totalCount/pageSize:(totalCount/pageSize+1)));
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	public Object getJsonObj() {
		return jsonObj;
	}

	public void setJsonObj(Object jsonObj) {
		this.jsonObj = jsonObj;
	}

	public void setDesc(Object desc) {
		this.desc = desc;
	}

	public Object getDesc() {
		return desc;
	}

	public int getStartRow(){
		if(this.pageNum > 0){
			this.startRow = (this.pageNum - 1) * this.pageSize;
		}else{
			this.startRow = 0;
		}
		return this.startRow;
	}

	public int getEndRow(){
		if(this.pageNum > 0){
			this.endRow = this.pageNum * this.pageSize;
		}else{
			this.endRow = this.pageSize;
		}
		return this.endRow;
	}

}
