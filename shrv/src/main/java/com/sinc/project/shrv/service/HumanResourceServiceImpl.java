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
	public List<Object> list() {
		System.out.println("HumanResourceServiceImpl list");
		List<Object> list = new ArrayList<Object>();
		return humanResourceDao.listRow();
	}

	@Override
	public List<Object> search(Map<String, String> map) {
		System.out.println("HumanResourceServiceImpl search");
		List<Object> list = new ArrayList<Object>();
		//humanResourceDao.search(map);
		return list;
	}
}
