package tyz3.mybatis.add.springmvc.interfaces;

import java.util.List;

import tyz3.mybatis.add.springmvc.modelbeans.Order;
import tyz3.mybatis.add.springmvc.modelbeans.User;

public interface UserMaper {

	List<Order> getUserOrders(int i);

	User getUserById(int i);

}
