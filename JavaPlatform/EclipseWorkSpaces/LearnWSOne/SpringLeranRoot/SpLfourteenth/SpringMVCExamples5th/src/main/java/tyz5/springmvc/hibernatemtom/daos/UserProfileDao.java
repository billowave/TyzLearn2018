package tyz5.springmvc.hibernatemtom.daos;

import java.util.List;

import tyz5.springmvc.hibernatemtom.modelbeans.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();

	UserProfile findByType(String type);

	UserProfile findById(int id);
}