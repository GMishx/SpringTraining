package com.siemens.spring.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "users")
@Component(value = "user")
@Scope(value = "prototype")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7949967415197051191L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserID")
	private int id;

	@Column(name = "UserName", length = 50, unique = true)
	private String userName;

	@Column(name = "Password", length = 50)
	private String password;

	@Column(name = "Age", nullable = true)
	private int age;

	@Column(name = "Gender", length = 1)
	private char gender;

	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public User setId(int id) {
		this.id = id;
		return this;
	}

	public User setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public User setPassword(String password) {
		this.password = password;
		return this;
	}

	public User setAge(int age) {
		this.age = age;
		return this;
	}

	public User setGender(char gender) {
		this.gender = gender;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (userName == null) {
			if (other.userName != null) {
				return false;
			}
		} else if (!userName.equals(other.userName)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[id: " + id + ", userName: " + userName + ", password: " + password + ", age: " + age + ", gender: "
				+ gender + "]");
		return sb.toString();
	}
}
