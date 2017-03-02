package com.dn.freemarker.empty;

import java.util.Date;

/**
 * @author  大牛哥 
 * @E-mail: 201309512@qq.com 
 * @date 创建时间：2017年3月2日 下午1:56:32
 * @version 1.0
 * @parameter
 * @since
 * @return  */

public class User {
	private String name;
	private String age;
	private Date berithTime;
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", berithTime=" + berithTime + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getBerithTime() {
		return berithTime;
	}
	public void setBerithTime(Date berithTime) {
		this.berithTime = berithTime;
	}
	
}
