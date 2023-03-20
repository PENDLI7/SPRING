package com.ciq.pojo;

public class Employee {
	
	private Integer id;
	
	private String name;
	
	private String des;
	
	private Double salary;
	public Employee() {
	}
	public Employee(Integer id, String name, String des, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.des = des;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", des=" + des + ", salary=" + salary + "]";
	}
	

}
