/*
 * @(#)BoardController.java $version 2015. 2. 28.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.maple.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maple.board.model.Board;
import com.maple.board.service.BoardService;

/**
 * @author Kanghoon Choi
 */
@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping("/board/list")
	public String getList() {
		
		return "/board/list";
	}
	
	@RequestMapping("/board/detail/{id}")
	public String getDetail(Model model, @PathVariable int id) {
		
		Board board = boardService.getDetail(id);
		
		model.addAttribute("board", board);
		return "/board/detail";
	}
	
	@RequestMapping("/board/write/form")
	public String getForm() {
		return "/board/detail";
	}
	
	@RequestMapping("/board/write")
	public String write(Board board) {
		
		boardService.saveBoard(board);
		
		return "redirect:/board/list";
	}
}
