package com.example.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.domain.MyEmp.Gender;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="tbl_dept")
@Data
@ToString(exclude={"emps"})				//없으면 toString이 재귀적으로 발stackoverflow 발생
public class MyDept {

	@Id
	Integer deptno;
	String dname;
	String loc;
	
	@OneToMany(mappedBy="dept")
	List<MyEmp> emps;
	
	/*
	 * 1. @OneToOne
	 * 2. @OneToMany   --> 관계형 db의 foreign key 설정
	 * 3. @ManyToOne   --> 관계형 db의 foreign key 설정
	 * 4. @ManyToMany
	 */
}