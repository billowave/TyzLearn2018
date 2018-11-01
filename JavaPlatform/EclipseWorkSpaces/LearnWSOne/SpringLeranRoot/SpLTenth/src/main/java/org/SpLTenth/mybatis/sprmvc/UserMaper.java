package org.SpLTenth.mybatis.sprmvc;

import java.util.List;



public interface UserMaper { 
	public User getUserById(int userId);
	public List<Order> getUserOrders(int userId);
}
