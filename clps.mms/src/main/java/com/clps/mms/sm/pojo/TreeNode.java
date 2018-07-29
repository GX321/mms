/**  
* <p>Title: DepartmentNode.java</p>  
* <p>Description:clps.mms </p>  
* @author kartoffeln
* @date 2018年6月5日  
* @version 1.0  
*/  
package com.clps.mms.sm.pojo;

import java.io.Serializable;

/** 
 * <p>Title: DepartmentNode.java</p>  
 * <p>Description:clps.mms </p>  
 * @author kartoffeln.fu
 * 2018年6月5日 & 下午1:39:53
 */
public class TreeNode implements Serializable{
	

		
	    private static final long serialVersionUID = 1L;

		private int nodeId;				
		
		private String nodeName;		
	    
	    private int parentId;			
	    				 
	    private String text;			
	   
	    private String state;			

			
		public TreeNode() {
			
					super();
				
		}


		
		
		
		/**
		 * @param text
		 * @param state
		 *
		 */
			
		public TreeNode(String text, String state) {
			super();
			this.text = text;
			this.state = state;
			
		}





		/**
		 * @param nodeId
		 * @param parentId
		 * @param text
		 * @param state
		 
		 */
			
		public TreeNode(int nodeId, int parentId, String text, String state) {
			super(); 
			this.nodeId = nodeId;
			this.parentId = parentId;
			this.text = text;
			this.state = state;
			
		}

		
		/**
		 * @return the nodeName
		 */
		
		public String getNodeName() {
		
			return nodeName;
		}


		
		/**
		 * @param nodeName the nodeName to set
		 */
		
		public void setNodeName(String nodeName) {
		
			this.nodeName = nodeName;
		}





		/**
		 * @return the url
		 */
		
	


		

		
		
	





		
	




		
		/**
		 * @return the nodeId
		 */
		
		public int getNodeId() {
		
			return nodeId;
		}





		
		/**
		 * @param nodeId the nodeId to set
		 */
		
		public void setNodeId(int nodeId) {
		
			this.nodeId = nodeId;
		}





		/**
		 * @return the parentId
		 */
		
		public int getParentId() {
		
			return parentId;
		}





		
		/**
		 * @param parentId the parentId to set
		 */
		
		public void setParentId(int parentId) {
		
			this.parentId = parentId;
		}





		
		/**
		 * @return the text
		 */
		
		public String getText() {
		
			return text;
		}





		
		/**
		 * @param text the text to set
		 */
		
		public void setText(String text) {
		
			this.text = text;
		}





		
		/**
		 * @return the state
		 */
		
		public String getState() {
		
			return state;
		}





		
		/**
		 * @param state the state to set
		 */
		
		public void setState(String state) {
		
			this.state = state;
		}





		
		/*
		 *(non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
			
	

		
	    
	    
	


}
