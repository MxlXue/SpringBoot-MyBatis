package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.BaseDao;
import com.example.enity.BaseEntity;

public abstract class BaseService<D extends BaseDao<T>, T extends BaseEntity> {
	/**
	 * 持久层对象
	 */
	@Autowired
	protected D dao;
	
	@Transactional(readOnly = false)
	public void save(T entity) {
		if (entity.getIsNewRecord()){
			dao.insert(entity);
		}else{
			dao.update(entity);
		}
	}
}
