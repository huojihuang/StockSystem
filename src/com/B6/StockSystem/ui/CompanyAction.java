/**
 * 
 */
package com.B6.StockSystem.ui;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.stereotype.Controller;

import com.B6.StockSystem.biz.ICompanyService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理前端页面，所有关于Company信息的请求
 * @author Nike
 * @version2015年5月10日 下午4:35:36
 */
@Controller("companyAction")
public class CompanyAction extends ActionSupport implements ServletRequestAware {

	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(UserAction.class);
	private HttpServletRequest request;
	private boolean judge;
    @Resource
	ICompanyService CompanyServiceImpl;
	
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
	 * 处理company信息
	 *@authorNike
	 *@Version2015年5月10日 下午4:39:35
	 * @param judge
	 * @return
	 */
	public String add(boolean judge){
		log.debug("add Company.....");
		judge=true;
		return SUCCESS;
	}
}
