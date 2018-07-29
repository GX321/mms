package com.clps.mms.log.pojo;

import java.io.Serializable;

/**
 * 
 * @author peri.yao
 *
 * 2018年5月14日上午9:33:32
 *
 */

public class Log implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer logId;

    private String logOperationTime;

    private String logOperatorName;

    private String logOperationObject;

    private String logOperationKind;

    private String logOperationComment;
    
    

    public Log() {
		super();
	}

    
    
	public Log(Integer logId, String logOperationTime, String logOperatorName, String logOperationObject,
			String logOperationKind, String logOperationComment) {
		super();
		this.logId = logId;
		this.logOperationTime = logOperationTime;
		this.logOperatorName = logOperatorName;
		this.logOperationObject = logOperationObject;
		this.logOperationKind = logOperationKind;
		this.logOperationComment = logOperationComment;
	}



	public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogOperationTime() {
        return logOperationTime;
    }

    public void setLogOperationTime(String logOperationTime) {
        this.logOperationTime = logOperationTime;
    }

    public String getLogOperatorName() {
        return logOperatorName;
    }

    public void setLogOperatorName(String logOperatorName) {
        this.logOperatorName = logOperatorName;
    }

    public String getLogOperationObject() {
        return logOperationObject;
    }

    public void setLogOperationObject(String logOperationObject) {
        this.logOperationObject = logOperationObject;
    }

    public String getLogOperationKind() {
        return logOperationKind;
    }

    public void setLogOperationKind(String logOperationKind) {
        this.logOperationKind = logOperationKind;
    }

    public String getLogOperationComment() {
        return logOperationComment;
    }

    public void setLogOperationComment(String logOperationComment) {
        this.logOperationComment = logOperationComment;
    }

	@Override
	public String toString() {
		return "Log [logId=" + logId + ", logOperationTime=" + logOperationTime + ", logOperatorName=" + logOperatorName
				+ ", logOperationObject=" + logOperationObject + ", logOperationKind=" + logOperationKind
				+ ", logOperationComment=" + logOperationComment + "]";
	}
    
    
}