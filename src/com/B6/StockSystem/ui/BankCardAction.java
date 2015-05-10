/**
 * 
 */
package com.B6.StockSystem.ui;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.stereotype.Controller;

import com.B6.StockSystem.biz.IBankCardService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理前端页面，所有关于BankCard信息的请求
 * @author Nike
 *@version2015年5月10日 下午3:47:43
 */
@Controller("bankCardAction")
public class BankCardAction extends ActionSupport implements ServletRequestAware{
	
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(BankCardAction.class);
	private HttpServletRequest request;
	private boolean judge;
	
	@Resource
	IBankCardService bankCardServiceImpl;
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
	 * 处理添加银行卡
	 *@author Nike
	 *@Version 2015年5月10日 下午4:01:47
	 * @param judge
	 * @return
	 */
	public String add(boolean judge){
		log.debug("add BankCard.....");
		judge=true;
		return SUCCESS;		
	}
	
	

}
