package learnsprmvc.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMaper {
	
	public User getUserById(int userId);

	public List<Order> getUserOrders(int userId);
}
