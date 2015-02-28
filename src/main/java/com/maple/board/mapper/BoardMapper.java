/*
 * @(#)BoardMapper.java $version 2015. 2. 28.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.maple.board.mapper;

import java.util.List;

import com.maple.board.model.Board;

/**
 * @author Kanghoon Choi
 */
public interface BoardMapper {

	public List<Board> selectBoardList();

	/**
	 * @param id
	 * @return
	 */
	public Board selectBoard(int id);

	/**
	 * @param board
	 */
	public void insertBoard(Board board);
}
