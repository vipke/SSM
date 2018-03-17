package com.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.TestUserDao;
import com.core.entity.TestUser;

/**
 * 测试
 * @author PengKe
 * @Date 2018年3月10日 下午7:29:42
 */
@Service("testUserService")
public class TestUserService {
	@Autowired
	private TestUserDao testUserDao;
	
	public List<TestUser> findUser() {
		return testUserDao.findUser();
	}
}
