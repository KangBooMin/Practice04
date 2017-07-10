package com.javaex.problem02;

public class Depart extends Employee {

    private String department;
    
    public Depart(String name, int salary, String department) {
    	super(name, salary);
    	this.setDepartment(department);
    }

    public Depart(String department) {
    	this.department = department;
    }
    
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
    
	public void getInformation() {
        System.out.println("이름:" + super.getName() + "  연봉:" + super.getSalary() + " 부서:"+department);
    }

}
