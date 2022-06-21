package com.example.learn.autowire;

public class Employee {
	
	private int id;
	private String empName;
	private long mNo;
	
	public Employee(int id, String empName, long mNo) {
		super();
		this.id = id;
		this.empName = empName;
		this.mNo = mNo;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getmNo() {
		return mNo;
	}

	public void setmNo(long mNo) {
		this.mNo = mNo;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", mNo=" + mNo + "]";
	}
	
	
	

}
