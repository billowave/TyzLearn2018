package org.SpLTenth.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Select;

/**
 * @author yiibai.com
 */
public interface IUserIDUQ {
//	@Select("select * from user where id= #{id}")
//	public UserIDUQ getUserByID(int id);

	public List<UserIDUQ> getUserIDUQList();

	public void insertUser(UserIDUQ user);

	public void updateUser(UserIDUQ user);

	public void deleteUser(int userId);

	public UserIDUQ getUser(int id);
}