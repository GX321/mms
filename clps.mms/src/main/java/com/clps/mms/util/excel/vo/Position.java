
package com.clps.mms.util.excel.vo;


/**
 * 
* @ClassName: PoiExportTest  
* @Description: Position  
* @author Clement.chen  
* @date 2018年5月21日 下午3:18:23  
*
 */

public class Position {


	private String positionId;					//职位编号

	private String positionName;				//职位名称

	private String positionDescription;			//职位描述

	private String positionLevel;				//职位等级

	private String positionDepartmentId;		//部门编号

	/**
	 * @return the positionId
	 */
	public String getPositionId() {
		return positionId;
	}

	/**
	 * @param positionId
	 *            the positionId to set
	 */
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	/**
	 * @return the positionName
	 */
	public String getPositionName() {
		return positionName;
	}

	/**
	 * @param positionName
	 *            the positionName to set
	 */
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	/**
	 * @return the positionDescription
	 */
	public String getPositionDescription() {
		return positionDescription;
	}

	/**
	 * @param positionDescription
	 *            the positionDescription to set
	 */
	public void setPositionDescription(String positionDescription) {
		this.positionDescription = positionDescription;
	}

	/**
	 * @return the positionLevel
	 */
	public String getPositionLevel() {
		return positionLevel;
	}

	/**
	 * @param positionLevel
	 *            the positionLevel to set
	 */
	public void setPositionLevel(String positionLevel) {
		this.positionLevel = positionLevel;
	}

	/**
	 * @return the positionDepartmentId
	 */
	public String getPositionDepartmentId() {
		return positionDepartmentId;
	}

	/**
	 * @param positionDepartmentId
	 *            the positionDepartmentId to set
	 */
	public void setPositionDepartmentId(String positionDepartmentId) {
		this.positionDepartmentId = positionDepartmentId;
	}

	/*
	 * (non-Javadoc) <p>Title: toString</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", positionName=" + positionName + ", positionDescription="
				+ positionDescription + ", positionLevel=" + positionLevel + ", positionDepartmentId="
				+ positionDepartmentId + "]";
	}

}
