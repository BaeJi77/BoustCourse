package kr.or.connet.jdbcexam1.dto;

public class role {
	private int roleId;
	private String description;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "role [roleId=" + roleId + ", description=" + description + "]";
	}
	public role(int roleId, String description) {
		super();
		this.roleId = roleId;
		this.description = description;
	}
	
	public role() {
		
	}
	
	
}
