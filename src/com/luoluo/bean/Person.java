package com.luoluo.bean;

import java.io.Serializable;

/**
 * Created by luozhiyun on 17/1/20.
 */
public class Person implements Serializable{
	private long pid;
	private String name;
	private String description;


	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
