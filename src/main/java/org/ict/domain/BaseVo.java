package org.ict.domain;

import lombok.Data;

@Data
public class BaseVo {
	//컨트롤러가 해당 변수들을 url 파라미터로 수집함.
	private String name;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return this.job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	private int age;
	private String job;

}
