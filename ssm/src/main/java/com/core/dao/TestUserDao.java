package com.core.dao;

import java.util.List;

import com.core.entity.TestUser;

/**
 * 测试dao类
 * @author PengKe
 * @Date 2018年3月10日 下午7:32:03
 */
public interface TestUserDao {
	List<TestUser> findUser();
}
