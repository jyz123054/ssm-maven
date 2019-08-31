package com.test.service.order.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.OrderServiceDao;
import com.test.model.OrderEntity;
import com.test.service.order.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderServiceDao orderServiceDao;
	
	@Override
	public OrderEntity getOrderInfo(Long id) {
		return orderServiceDao.getOrderInfo(id);
	}

}
