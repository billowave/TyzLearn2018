package org.SpLTenth.mybatis;

import java.util.List;

/** 
 * @describe: Group
 * @author: Yiibai 
 * @version: V1.0
 * @copyright http://www.yiibai.com
 */  
public class MMGroup {
	private int groupId;
	private String groupName;
	private List<MMUser> users;
	
	public List<MMUser> getUsers() {
		return users;
	}
	public void setUsers(List<MMUser> users) {
		this.users = users;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
}