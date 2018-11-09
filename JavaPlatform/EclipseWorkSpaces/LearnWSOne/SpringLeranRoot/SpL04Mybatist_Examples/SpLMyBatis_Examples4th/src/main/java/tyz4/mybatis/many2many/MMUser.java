package tyz4.mybatis.many2many;

import java.util.List;

/** 
 * @describe: User
 * @author: Yiibai 
 * @version: V1.0
 * @copyright http://www.yiibai.com
 */  
public class MMUser {
	private int id;
	private String username;
	private String mobile;
	private List<MMGroup> groups;
	public List<MMGroup> getGroups() {
		return groups;
	}
	public void setGroups(List<MMGroup> groups) {
		this.groups = groups;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}