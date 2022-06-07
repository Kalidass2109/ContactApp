package com.aitacs.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;






@Entity
@Table(name="CONTACT_INFO")
@Data
public class Contact {

	@Id
	@GeneratedValue
	private int cid;
	private String name;
	private String email;
	private long phno;
	private String activeSw;
	
	//@Column(name="address", table="CONTACT_ADDRESS")
	private String address;
	
}
