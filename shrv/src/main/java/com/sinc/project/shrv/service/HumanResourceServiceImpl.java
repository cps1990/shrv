package com.sinc.project.shrv.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.project.shrv.model.sql.HumanResourceDao;

@Service("humanResourceService")
public class HumanResourceServiceImpl implements HumanResourceService {

	@Resource(name="humanResourceDao")
	private HumanResourceDao humanResourceDao;

	@Override
	public List<Object> getHumanResourceInfo() {
		System.out.println("HumanResourceServiceImpl getHumanResourceInfo");
		
		List<Object> list = new ArrayList<Object>();
		// dataAnalysis() 호출
		// dao 함수 호출하여 데이터 리턴
		
		return humanResourceDao.listRow();
	}
	
	/**
	 * 데이터 분석하는 알고리즘
	 * 각 데이터를 분석해서 호출해야하는 dao 함수 리턴
	 * @return Object
	 */
	private Object dataAnalysis() {
		Object obj = new Object();
		return obj;
	}
	
}
