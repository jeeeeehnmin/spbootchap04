package com.example.repository;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyEmpRepositoryTest {

	@Inject
	MyDeptRepository deptRepository;
	
	@Inject
	MyEmpRepository empRepository;
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
