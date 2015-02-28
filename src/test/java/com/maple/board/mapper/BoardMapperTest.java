package com.maple.board.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maple.board.model.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BoardMapperTest {
	
	@Autowired
	private BoardMapper mapper;

	@Test
	public void testSelectBoardList() throws Exception {
		
		List<Board> actual = mapper.selectBoardList();
		
		assertNotNull(actual);
	}
	
	@Test
	public void testSelectBoard() throws Exception {
		
		Board actual = mapper.selectBoard(1);
		
		assertNotNull(actual);
	}
}
