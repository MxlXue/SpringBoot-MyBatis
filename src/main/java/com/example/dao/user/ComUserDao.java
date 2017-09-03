package com.example.dao.user;

import com.example.dao.BaseDao;
import com.example.dao.MyBatisDao;
import com.example.enity.user.ComUser;

@MyBatisDao
public interface ComUserDao extends BaseDao<ComUser> {

	public ComUser select(ComUser user);
	
}
