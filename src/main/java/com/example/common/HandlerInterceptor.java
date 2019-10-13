package com.example.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class HandlerInterceptor implements org.springframework.web.servlet.HandlerInterceptor{

	//进入handler方法之前（用于身份认证、身份授权（不通过，说明当前用户没有登录，需要此方法拦截不往下放行））
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		
//		return  false 表示拦截，不往下放行
//		return true 表示放行
		
		return false;
	}

	// 进入handler方法之后，返回到ModelAndView之前
	// 应用场景从ModelAndView 出发，将够用的模型数据（比如菜单导航）在这里传到视图,也可以在这里统一指定视图
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	//执行handler完成执行此方法
	//应用场景：  统一异常处理、统一日志处理
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
	}

}
