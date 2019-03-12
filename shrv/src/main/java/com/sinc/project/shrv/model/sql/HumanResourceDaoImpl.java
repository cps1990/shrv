package com.sinc.project.shrv.model.sql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("humanResourceDao")
public class HumanResourceDaoImpl implements HumanResourceDao {

	@Resource(name="sqlSession")
	private SqlSession session;

	@Override
	public List<Object> listRow() {
		System.out.println("HumanResourceDaoImpl listRow");
		return session.selectList("com.sinc.project.shrv.employeeTest.boardListRow");
	}
}
