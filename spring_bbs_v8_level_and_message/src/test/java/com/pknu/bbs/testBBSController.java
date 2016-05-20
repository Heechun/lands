package com.pknu.bbs;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pknu.bbs.dao.BBSDao;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@ContextConfiguration(locations={"classpath:/spring/*.xml"})
public class testBBSController {
	
	//getArticleCount메소드를 받아오고 싶어서
	@Autowired
	BBSDao bbsDao;

	@Before
	public void test(){
		System.out.println("before");
	}
	
	@Test
	public void getArticleCount(){
		System.out.println(bbsDao.getArticleCount());
	}
}
