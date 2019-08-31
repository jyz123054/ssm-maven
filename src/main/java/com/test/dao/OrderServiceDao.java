package com.test.dao;

import com.test.model.OrderEntity;

public interface OrderServiceDao {
	public OrderEntity getOrderInfo(Long id);
}
