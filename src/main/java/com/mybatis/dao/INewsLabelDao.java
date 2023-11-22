package com.mybatis.dao;

import java.util.List;

import com.mybatis.beans.NewsLabel;

public interface INewsLabelDao {

	List<NewsLabel> selectChildrenById(int pid);

	NewsLabel selectNewsLabelById(int id);
}
