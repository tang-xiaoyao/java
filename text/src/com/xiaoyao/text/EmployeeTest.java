package com.xiaoyao.text;
import java.io.*;
public class EmployeeTest {
	public static void main(String args[]) {
		//使用构造器创造两个对象
		Employee empOne = new Employee("employeeOne");
		Employee empTwo = new Employee("employeeTwo");
		//调用这两个对象的成员方法
		empOne.empAge(23);
		empOne.empDesignation("初级程序员");
		empOne.empSalary(6000);
		empOne.printEmployee();
		
		empTwo.empAge(27);
		empTwo.empDesignation("高级程序员");
		empTwo.empSalary(12000);
		empTwo.printEmployee();
	}
}
