package com.core.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.service.TestUserService;

/**
 * 测试
 * @author PengKe
 * @Date 2018年3月5日 下午1:59:53
 */
@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestUserService testUserService;
	
	@RequestMapping("/t")
	public String t(String uName) {
		System.out.println("--->test>>>uName:"+uName);
		return "test";
	}
	
	@RequestMapping("/findUser")
	public void findUser(HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.write(testUserService.findUser().toString());
		out.close();
		System.out.println(testUserService.findUser());
	}
}
