package tyz5.springmvc.hibernatemtom.daos;

import java.util.List;

import tyz5.springmvc.hibernatemtom.modelbeans.User;

public interface UserDao {

	User findById(int id);

	User findBySSO(String sso);

	void save(User user);

	void deleteBySSO(String sso);

	List<User> findAllUsers();

}
