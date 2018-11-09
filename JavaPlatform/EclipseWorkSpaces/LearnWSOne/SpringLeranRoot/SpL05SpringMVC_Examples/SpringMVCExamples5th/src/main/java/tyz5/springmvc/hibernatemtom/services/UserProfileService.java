package tyz5.springmvc.hibernatemtom.services;

import java.util.List;

import tyz5.springmvc.hibernatemtom.modelbeans.UserProfile;

public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);

	List<UserProfile> findAll();

}