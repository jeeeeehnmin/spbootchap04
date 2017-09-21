package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table
@EqualsAndHashCode(of="fno")
public class Profile {
	
	@Id
	private Long fno;
	private String fname;
	private boolean current2;
}
