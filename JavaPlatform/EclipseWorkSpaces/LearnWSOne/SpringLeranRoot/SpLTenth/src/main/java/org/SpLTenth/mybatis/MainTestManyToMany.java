package org.SpLTenth.mybatis;
import java.io.Reader;
import java.text.MessageFormat;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.SpLTenth.mybatis.GroupMaper;
import org.SpLTenth.mybatis.UserGroupMaper;
import org.SpLTenth.mybatis.UserMaper;

public class MainTestManyToMany {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("resource/Configure.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlSessionFactory;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAddGroup();
		testAddUser();
		testAddUserGroup();
		testGetGroupAndUsers();
		
	}
	
	public static void testGetGroupAndUsers() {
		MMUserGroup userGroup = new MMUserGroup();
		SqlSession session = sqlSessionFactory.openSession();
		try {
			GroupMaper groupMaper = session.getMapper(GroupMaper.class);
			MMGroup group = groupMaper.getGroup(1);
			System.out.println("Group => " + group.getGroupName());
			List<MMUser> users = group.getUsers();
			for (MMUser user : users) {
				System.out.println("\t:" + user.getId() + "\t"
						+ user.getUsername());
			}
		} finally {
			session.close();
		}
	}

	public static void testAddUserGroup() {
		MMUserGroup userGroup = new MMUserGroup();
		userGroup.setGroupId(1);
		userGroup.setUserId(2);
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserGroupMaper userGroupMaper = session
					.getMapper(UserGroupMaper.class);
			userGroupMaper.insertUserGroup(userGroup);

			session.commit();
		} finally {
			session.close();
		}

	}

	public static void testAddUser() {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			User user = new User();
			user.setUsername("User-name-1");
			user.setMobile("13838009988");
			UserMaper userMaper = session.getMapper(UserMaper.class);
			userMaper.insertUser(user);
			session.commit();
			// System.out.println(user.getGroupId());
		} finally {
			session.close();
		}
	}

	public static void testAddGroup() {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession();
		try {
			MMGroup group = new MMGroup();
			group.setGroupName("用户组-1");
			GroupMaper groupMapper = session.getMapper(GroupMaper.class);
			groupMapper.insertGroup(group);
			session.commit();
			System.out.println(group.getGroupId());
		} finally {
			session.close();
		}
	}
}