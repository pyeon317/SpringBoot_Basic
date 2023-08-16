package com.simple.basic.memo.service;

import java.util.ArrayList;

import com.simple.basic.command.MemoVO;

public interface MemoService {
	
	void insert(MemoVO vo);
	ArrayList<MemoVO> getList();
	
}
