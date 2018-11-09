package tyz4.mybatis.add.spring;

import java.util.List;

public interface UserMaper {

	List<Order> getUserOrders(int i);

	User getUserById(int i);

}
