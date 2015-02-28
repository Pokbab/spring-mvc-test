/*
 * @(#)BoardService.java $version 2015. 2. 28.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.maple.board.service;

import java.util.List;

import com.maple.board.model.Board;

/**
 * @author Kanghoon Choi
 */
public interface BoardService {

	/**
	 * @return
	 */
	List<Board> getList();

	/**
	 * @param id
	 * @return
	 */
	Board getDetail(int id);

	/**
	 * @param board
	 */
	void saveBoard(Board board);

}
