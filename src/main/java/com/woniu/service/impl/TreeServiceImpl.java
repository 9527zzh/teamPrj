package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniu.mapper.TreeMapper;
import com.woniu.model.PageBean;
import com.woniu.model.Tree;
import com.woniu.model.TreeExample;
import com.woniu.model.TreeExample.Criteria;
import com.woniu.service.ITreeService;
@Service
public class TreeServiceImpl implements ITreeService {
	@Resource
	private TreeMapper treeMapper;
	@Override
	public void add(Tree tree) {
		// TODO Auto-generated method stub
		treeMapper.insertSelective(tree);
	}

	@Override
	public void delete(Integer tid) {
		// TODO Auto-generated method stub
		treeMapper.deleteByPrimaryKey(tid);
	}

	@Override
	public void update(Tree tree) {
		// TODO Auto-generated method stub
		treeMapper.updateByPrimaryKey(tree);
	}

	@Override
	public Tree findOne(Integer tid) {
		// TODO Auto-generated method stub
		treeMapper.selectByPrimaryKey(tid);
		return null;
	}

	@Override
	public List<Tree> findAll(PageBean page,Tree tree) {
		// TODO Auto-generated method stub
		TreeExample e=new TreeExample();
		Criteria c=e.or();
		if (tree.getTid()!=null) {
			c.andTidEqualTo(tree.getTid());
		}
		if (tree.getName()!=null&&tree.getName().trim()!="") {
			c.andNameLike(tree.getName());
		}
				
		page.setCount(treeMapper.countByExample(e));
		return treeMapper.selectByExample(e,new RowBounds(page.getOffset(),page.getLimit()));
	}

	
}
