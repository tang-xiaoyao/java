package com.xiaoyao.text;

/**
 * 构造方法
 * 每个类都有构造方法，如果没有显式创建，编辑器会提供一个默认空的构造方法。
 * 该类显式创建仅有一个参数：name的构造方法。
 */
public class Puppy {
	int puppyAge;
	
	public Puppy(String name) {//构造方法
		System.out.println("小狗的名字是：" + name);
	}
	public void setAge(int age) {
		puppyAge = age;
	}
	public int getAge( ) {
		System.out.println("小狗的年龄设定为：" + puppyAge);
		return puppyAge;
	}
	
	/**
	 * 创建对象
	 * 对象通过类来创建，先声明，用new关键字调用构造方法初始化对象。
	 */
	public static void main(String args[]) {
			Puppy myPuppy = new Puppy("Jack");//实例化一个对象
			myPuppy.setAge(3);
			myPuppy.getAge( );
	}
}
