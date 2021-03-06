/*
 * @(#)BoardServiceImpl.java $version 2015. 2. 28.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.maple.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maple.board.mapper.BoardMapper;
import com.maple.board.model.BaseResponse;
import com.maple.board.model.Board;
import com.maple.board.model.StandardResponseHeader;

/**
 * @author Kanghoon Choi
 */
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<Board> getList() {
		return boardMapper.selectBoardList();
	}

	@Override
	public Board getDetail(int id) {
		return boardMapper.selectBoard(id);
	}

	@Override
	public BaseResponse saveBoard(Board board) {
		board.setAuthor("최강훈");
		boardMapper.insertBoard(board);
		return new BaseResponse(new StandardResponseHeader());
	}

}
