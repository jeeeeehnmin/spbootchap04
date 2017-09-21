package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name="tbl_members")
@EqualsAndHashCode(of="uid2")
public class Member {

	
	@Id
	private String uid2;
	private String upw;
	private String uname;
}
