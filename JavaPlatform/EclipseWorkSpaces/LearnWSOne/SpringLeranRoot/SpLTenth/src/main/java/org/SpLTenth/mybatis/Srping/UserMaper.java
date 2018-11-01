package org.SpLTenth.mybatis.Srping;

import java.util.List;

public interface UserMaper {

	List<Order> getUserOrders(int i);

	User getUserById(int i);

}
