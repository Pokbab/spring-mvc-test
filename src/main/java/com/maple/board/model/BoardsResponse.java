package com.maple.board.model;

import java.util.List;

import lombok.Data;

@Data
public class BoardsResponse extends BaseResponse {
	private List<Board> boards;
}
