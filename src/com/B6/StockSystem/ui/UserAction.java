package com.B6.StockSystem.ui;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.stereotype.Controller;

import com.B6.StockSystem.biz.IUserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理前端页面，所有关于User信息的请求
 * 
 * @author Strong
 *
 */
@Controller("userAction")
public class UserAction extends ActionSupport implements ServletRequestAware {

	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(UserAction.class);
	private HttpServletRequest request;
	private boolean judge;
	@Resource
	IUserService userServiceImpl;

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public boolean isJudge() {
		return judge;
	}

	public void setJudge(boolean judge) {
		this.judge = judge;
	}

	/**
	 * 处理用户注册
	 * 
	 * @return
	 * @throws IOException
	 */
	public String add() {
		log.debug("add user ...");
		judge = true;
		return SUCCESS;

	}

}
