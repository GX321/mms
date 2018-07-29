/**
 * 
 */
package com.clps.mms.sm.controller;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.clps.mms.common.SupportConstant;
import com.clps.mms.sm.pojo.Position;
import com.clps.mms.sm.service.IPositionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;




/**
 * SpringMvc负责页面的跳转
 * 
 * @desc: clps.mms
 * @author: James.gu
 * @createTime: 2018年5月21日 上午10:43:29
 * @version: v1.0
 */

 
	

 
@Controller
@RequestMapping(value = "/sm")
public class PositionController {

	@Resource
	private IPositionService positionService;
	Logger log=Logger.getLogger(PositionController.class);
	List<Position> positions = null;
    //页码对象
    //PagingVO pagingVO = new PagingVO();
    

	/**
	 *点击查询标签，跳转到position_list.jsp查询界面
	 * @author: James.gu
	 * @createTime: 2018年5月21日 上午10:45:24
	 * @param model
	 * @return String
	 */

	@RequestMapping(value = "/positionList", method = RequestMethod.GET)
	public String showPosition(@RequestParam(required=true,defaultValue="1") Integer page,Model model) {
	    PageHelper.startPage(page, 6);
	    positions=this.positionService.showPosition();
	      PageInfo<Position> p=new PageInfo<Position>(positions);
        if(null!=positions){
        model.addAttribute("positions", positions);
        model.addAttribute("pagingVO", p);
        }
        else{
        	log.error(SupportConstant.QUERY_FAILURE);	
        }
		
        return "sm/position_list";

	}

	/**
	 *点击删除标签，之后返回position_list.jsp查询界面
	 * @author: James.gu
	 * @createTime: 2018年5月21日 上午10:45:05
	 * @param request
	 * @param model
	 * @return String
	 */
	@RequestMapping(value = "/positionDelete", method = RequestMethod.GET)
	public String delUser(HttpServletRequest request, Model model,@RequestParam(required=true,defaultValue="1") Integer page) {

		int positionid = Integer.parseInt(request.getParameter("positionid"));
		log.info(positionService.deletePosition(positionid));
		PageHelper.startPage(page, 6);
        positions=this.positionService.showPosition();
          PageInfo<Position> p=new PageInfo<Position>(positions);
		if(null!=positions){
			model.addAttribute("positions", positions);
			model.addAttribute("pagingVO", p);
			log.info(SupportConstant.QUERY_SUCCESS);
		}
		else
			log.error(SupportConstant.QUERY_FAILURE);

		return "sm/position_list";
	}

	/**
	 * 点击添加职位标签，跳转到position_add.jsp添加界面
	 * @author: James.gu
	 * @createTime: 2018年5月21日 上午10:45:43
	 * @param request
	 * @param model
	 * @return String
	 */

	@RequestMapping(value = "/positionAdd", method = RequestMethod.GET)
	public String addposition() {
		return "sm/position_add";
	}

	/**
	 * 提交添加的form表单，跳转到position_list.jsp查询界面
	 * @author: James.gu
	 * @createTime: 2018年5月21日 上午10:45:48
	 * @param request
	 * @param response
	 * @param model
	 * @return String
	 */

	@RequestMapping(value = "/positionCreate", method = RequestMethod.POST)
	public String createposition(Model model,Position position,@RequestParam(required=true,defaultValue="1") Integer page,HttpServletRequest request) {
		if(null!=position){
			position.setPositionCreatedName((String)request.getSession().getAttribute("account"));
			position.setPositionUpdatedName(position.getPositionCreatedName());
			log.info(positionService.addposition(position));
			PageHelper.startPage(page, 6);
	        positions=this.positionService.showPosition();
	          PageInfo<Position> p=new PageInfo<Position>(positions);
			if(null!=positions){
				log.info(SupportConstant.QUERY_SUCCESS);
			model.addAttribute("positions", positions);
			model.addAttribute("pagingVO", p);
			return "sm/position_list";
			}
			else{
				log.error(SupportConstant.QUERY_FAILURE);
				return "sm/position_list";
			}
		}
		else{
			log.error(SupportConstant.ADD_FAILURE);
			return "sm/position_list";
		}
		
	}

	/**
	 * 点击修改标签，跳转到position_edit.jsp编辑界面
	 * @author: James.gu
	 * @createTime: 2018年5月21日 上午10:45:54
	 * @param request
	 * @param model
	 * @return String
	 */
	@RequestMapping(value = "/positionUpdate", method = RequestMethod.GET)
	public String update(HttpServletRequest request, Model model,@RequestParam(required=true,defaultValue="1") Integer page) {
		int positionid = Integer.parseInt(request.getParameter("positionid"));
		Position position = positionService.queryPosition(positionid);
		
		if(null!=position){
			model.addAttribute("position", position);
			model.addAttribute("page",page);
			log.info(SupportConstant.QUERY_SUCCESS);
		}
		else{
			log.error(SupportConstant.QUERY_FAILURE);
		}

		return "sm/position_edit";
	}

	/**
	 * 提交更新form表单，跳转到position_list.jsp查询界面
	 * @author: James.gu
	 * @createTime: 2018年5月21日 上午10:45:59
	 * @param request
	 * @param model
	 * @return String
	 */
	@RequestMapping(value = "/positionUpdate1", method = RequestMethod.POST)
	public String update1(HttpServletRequest request, Model model,Position position,@RequestParam(required=true,defaultValue="1") Integer page) {
		int positionid = Integer.parseInt(request.getParameter("positionid"));
		Position position1 = positionService.queryPosition(positionid);
		
		if(null!=position1){
			log.info(SupportConstant.QUERY_SUCCESS);
			position1.setPositionName(position.getPositionName());
			position1.setPositionUpdatedName((String)request.getSession().getAttribute("account"));
			position1.setPositionComment(position.getPositionComment());
			position1.setPositionUpdatedDatetime(new Timestamp(new Date().getTime()));
			log.info(positionService.updateposition(position1));

			PageHelper.startPage(page, 6);
	        positions=this.positionService.showPosition();
	          PageInfo<Position> p=new PageInfo<Position>(positions);
			if(null!=positions){
				log.info(SupportConstant.QUERY_SUCCESS);
				model.addAttribute("pagingVO", p);
				model.addAttribute("positions", positions);
				return "sm/position_list";
			}
			else{
				log.error(SupportConstant.QUERY_FAILURE);
				return "sm/position_list";
			}
		}
		else{
			log.error(SupportConstant.QUERY_FAILURE);
			return "sm/position_list";
		}	
	}
	/**
		*根据职位名称进行模糊查询,跳转到positionList界面 
		* @author: James.gu
		* @createTime: 2018年6月3日 下午12:24:19
		* @param model
		* @param positionName
		* @return
		* String
	 */
	@RequestMapping(value = "/positionSelect", method = RequestMethod.POST)
	public String select(Model model,String positionName) {
		PageHelper.startPage(1, 6);
		positions=this.positionService.queryPositionByName(positionName);
        PageInfo<Position> p=new PageInfo<Position>(positions);
		if(null!=positions){
			log.info(SupportConstant.QUERY_SUCCESS);
			model.addAttribute("pagingVO", p);
			model.addAttribute("positions", positions);
			return "sm/position_list";
		}

		else{
			log.error(SupportConstant.QUERY_FAILURE);
			return "sm/position_list";
		}
	}
	
}
