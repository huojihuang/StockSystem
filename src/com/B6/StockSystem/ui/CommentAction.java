/**
 * 
 */
package com.B6.StockSystem.ui;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.stereotype.Controller;

import com.B6.StockSystem.biz.ICommentService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理前端页面，所有关于Comment信息的请求
 * @author Nike
 *@version2015年5月10日 下午4:11:24
 */
@Controller("commentAction")
public class CommentAction extends ActionSupport implements ServletRequestAware{
 
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(UserAction.class);
	private HttpServletRequest request;
	private boolean judge;
	
	@Resource
	ICommentService commentServiceImpl;
	@Override
	public void setServletRequest(HttpServletRequest request) {

		this.request=request;
	}

	public boolean isJudge() {
		return judge;
	}

	public void setJudge(boolean judge) {
		this.judge = judge;
	}
	
	/**
	 * 处理comment发布
	 *@authorNike
	 *@Version2015年5月10日 下午4:14:59
	 * @param judge
	 * @return
	 */
	public String add(boolean judge){
		
		log.debug("add comment....");
		judge=true;
		return SUCCESS;
	}

}
