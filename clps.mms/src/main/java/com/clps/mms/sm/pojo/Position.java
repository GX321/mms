package com.clps.mms.sm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @desc: clps.mms
 * @author: James.gu
 * @createTime: 2018年5月21日 下午12:40:13
 * @version: v1.0
 */
public class Position implements Serializable {

	

	private static final long serialVersionUID = -2561474713474027047L;

	private Integer positionId; 				// 职位ID ，主键

	private String positionName; 				// 职位名称

	private String positionCreatedName; 		// 创建人

	private Date positionCreatedDatetime; 		// 创建时间

	private String positionUpdatedName;			// 修改人

	private Date positionUpdatedDatetime; 		// 修改时间

	private String positionComment; 			// 职位注释

	private Integer positionIsvaild; 			// 职位有效状态

	public Position() {
		super();
	}

	public String getPositionComment() {
		return positionComment;
	}

	public Date getPositionCreatedDatetime() {
		return positionCreatedDatetime;
	}

	public String getPositionCreatedName() {
		return positionCreatedName;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public Integer getPositionIsvaild() {
		return positionIsvaild;
	}

	public String getPositionName() {
		return positionName;
	}

	public Date getPositionUpdatedDatetime() {
		return positionUpdatedDatetime;
	}

	public String getPositionUpdatedName() {
		return positionUpdatedName;
	}

	public void setPositionComment(String positionComment) {
		this.positionComment = positionComment;
	}

	public void setPositionCreatedDatetime(Date positionCreatedDatetime) {
		this.positionCreatedDatetime = positionCreatedDatetime;
	}

	public void setPositionCreatedName(String positionCreatedName) {
		this.positionCreatedName = positionCreatedName;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public void setPositionIsvaild(Integer positionIsvaild) {
		this.positionIsvaild = positionIsvaild;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public void setPositionUpdatedDatetime(Date positionUpdatedDatetime) {
		this.positionUpdatedDatetime = positionUpdatedDatetime;
	}

	public void setPositionUpdatedName(String positionUpdatedName) {
		this.positionUpdatedName = positionUpdatedName;
	}

	
	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", positionName=" + positionName + ", positionCreatedName="
				+ positionCreatedName + ", positionCreatedDatetime=" + positionCreatedDatetime
				+ ", positionUpdatedName=" + positionUpdatedName + ", positionUpdatedDatetime="
				+ positionUpdatedDatetime + ", positionComment=" + positionComment + ", positionIsvaild="
				+ positionIsvaild + "]";
	}

}