package com.atguigu.mybatis.pojo;

import java.util.Set;

public class Dept {

	private Integer deptId;
	private String deptName;
	private Set<Emp> emp;

	public Dept(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Set<Emp> getEmp() {
		return emp;
	}
	public void setEmp(Set<Emp> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
	
}
