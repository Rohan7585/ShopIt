package com.rd.shopIt.entity;

import jakarta.persistence.*;

@Entity
@Table(name="USER")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_ID")
	private long usrId;
	
	@Column(name="USR_NAME")
	private String usrName;
	
	@Column(name="USR_FULL_NAME")
	private String name;
	
	@Column(name="USR_MAIL")
	private String email;
	
	@Column(name="PASSWORD")
	private String pwd;

	public long getUsrId() {
		return usrId;
	}

	public void setUsrId(long usrId) {
		this.usrId = usrId;
	}

	public String getUsrName() {
		return usrName;
	}

	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
