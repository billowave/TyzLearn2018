package tyz5.springmvc.hibernatemtom.services;

import java.util.List;

import tyz5.springmvc.hibernatemtom.modelbeans.User;

public interface UserService {

	User findById(int id);

	User findBySSO(String sso);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserBySSO(String sso);

	List<User> findAllUsers();

	boolean isUserSSOUnique(Integer id, String sso);

}