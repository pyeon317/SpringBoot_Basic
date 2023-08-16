package com.simple.basic.memo.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.simple.basic.command.MemoVO;

@Mapper
public interface MemoMapper {
	void insert(MemoVO vo);
	ArrayList<MemoVO> getList();
}
