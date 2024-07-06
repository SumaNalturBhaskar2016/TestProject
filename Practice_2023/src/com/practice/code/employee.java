package com.practice.code;

import java.util.Objects;

public class employee implements Comparable<employee> {
	
	int empId;
	String empName;
	
	public employee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;		
		
	}
		

	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	


	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}



	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + "]";
	}



@Override
	public int compareTo(employee o) {
		return this.getEmpId()-o.getEmpId();
	}
	
	
	

}
