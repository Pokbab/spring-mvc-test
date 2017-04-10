/*
 * @(#)BoardController.java $version 2015. 2. 28.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.maple.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maple.board.model.BaseResponse;
import com.maple.board.model.Board;
import com.maple.board.model.BoardResponse;
import com.maple.board.model.BoardsResponse;
import com.maple.board.model.StandardResponseHeader;
import com.maple.board.service.BoardService;

/**
 * @author Kanghoon Choi
 */
@RestController
@RequestMapping("/api")
public class ApiBoardController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping(value="/boards", method=RequestMethod.GET)
	public BoardsResponse getList() {
		
		List<Board> boardList = boardService.getList();
		
		BoardsResponse boardsResponse = new BoardsResponse();
		boardsResponse.setHeader(new StandardResponseHeader());
		boardsResponse.setBoards(boardList);
		
		return boardsResponse;
	}
	
	@RequestMapping(value="/boards/{id}", method=RequestMethod.GET)
	public BoardResponse getDetail(@PathVariable int id) {
		
		Board board = boardService.getDetail(id);
		
		BoardResponse boardResponse = new BoardResponse();
		boardResponse.setHeader(new StandardResponseHeader());
		boardResponse.setBoard(board);
		
		return boardResponse;
	}
	
	@RequestMapping(value="/boards", method=RequestMethod.POST)
	public BaseResponse write(@RequestBody Board board) {
		return boardService.saveBoard(board);
	}
	
//	@RequestMapping(value="/boards/{id}", method=RequestMethod.DELETE)
//	public BaseResponse delete(@PathVariable int id) {
////		return boardService.d(board);
//		return BaseResponse
//	}
}
