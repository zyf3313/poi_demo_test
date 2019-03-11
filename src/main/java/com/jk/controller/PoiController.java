package com.jk.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jk.pojo.User;
import com.jk.service.LoginService;
import com.jk.util.ExportExcel;

@Controller
@RequestMapping("poi")
public class PoiController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/exportXlsx")
	public void exportXlsx(HttpServletResponse response, HttpServletRequest request) {
		List list = loginService.findEmpl(); // 查询数据（需要更改的地方）
		System.out.println(list);
		// 设置标头（需要更改的地方）
		String[] rowName = { "用户编号", "真实姓名", "密码", "创建时间", "用户名", "邮箱", "手机号", "性别" };
		List<Object[]> dataList = new ArrayList<Object[]>();
		for (int i = 0; i < list.size(); i++) {
			
			//转换成对象（需要更改的地方）
			User object = (User) list.get(i);
			
			//对象转数组（需要更改的地方）
			Object[] obj ={object.getUserid(),object.getName(),object.getPwd(),object.getUserdate(),object.getLoginname(),object.getEmail(),object.getPhone(),object.getSex()};
			
			//添加到数组里
			dataList.add(obj);
		}
		
		ExportExcel exportExcel = new ExportExcel("用户信息", rowName, dataList, response);
		try {
			exportExcel.export();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
