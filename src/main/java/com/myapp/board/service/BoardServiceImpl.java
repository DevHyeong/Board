package com.myapp.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.board.mapper.BoardMapper;
import com.myapp.board.model.Board;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper boardMapper;
	
	
	@Override
	public List<Board> boardList() {
		return boardMapper.boardList();
	}
	
	
	
	
}
