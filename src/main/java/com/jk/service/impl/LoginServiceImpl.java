/** 
 * <pre>项目名称:poi_demo 
 * 文件名称:LoginServiceImpl.java 
 * 包名:com.jk.service.impl 
 * 创建日期:2018年8月10日下午7:13:48 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.mapper.UserMapper;
import com.jk.service.LoginService;

/** 
 * <pre>项目名称：poi_demo    
 * 类名称：LoginServiceImpl    
 * 类描述：    
 * 创建人 张洋凡   
 * 创建时间：2018年8月10日 下午7:13:48    
 * 修改人：张洋凡 
 * 修改时间：2018年8月10日 下午7:13:48    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public List findEmpl() {
		List list = userMapper.queryUser();
		return list;
	}

}
