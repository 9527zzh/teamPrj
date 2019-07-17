package com.woniu.service;

import java.util.List;

import com.woniu.model.Tree;

public interface ITreeService {

	void add(Tree tree);
	void delete(Integer tid);
	void update(Tree tree);
	Tree findOne(Integer tid);
	List<Tree>  findAll();
}
