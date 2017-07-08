package com.xiaoyao.text;
import java.io.*; 
/**
 * 实例变量
 * 当一个对象被实例化以后，实例变量也跟着确定。
 */
public class Employee {
	String name;
	int age;
	String designation;
	int salary;
	public Employee(String name) {
		this.name=name;
	}
	public void empAge(int empAge){
		age = empAge;
	}
	public void empDesignation(String empDesignation){
		designation = empDesignation;
	}
	public void empSalary(int empSalary){
		salary = empSalary;
	}
	public void printEmployee( ){
		System.out.println("名字："+name);
		System.out.println("年龄："+age);
		System.out.println("职位："+designation);
		System.out.println("薪资："+salary);
	}
}
