package com.sinc.project.shrv.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sinc.project.shrv.model.sql.HumanResourceDao;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.Token;

@Service("humanResourceService")
public class HumanResourceServiceImpl implements HumanResourceService {

	@Resource(name="humanResourceDao")
	private HumanResourceDao humanResourceDao;

	@Override
	public List<HashMap<String, Object>> getHumanResourceInfo(String data) {
		System.out.println("HumanResourceServiceImpl getHumanResourceInfo");
		
		List<Object> list = new ArrayList<Object>();
		// dataAnalysis() 호출
		// dataAnalysis 에서 데이터 분석하여 나온 dao 함수 호출하여 결과 리턴
		//dataAnalysis(data);
		
		// dao 함수 호출하여 데이터 리턴
		return humanResourceDao.listRow();
	} 
	 
	/**
	 * 데이터 분석하는 알고리즘
	 * 각 데이터를 분석해서 호출해야하는 dao 함수 리턴
	 * @return Object
	 */
	@Override
	public String dataAnalysis(String data) {
		
		Komoran komoran = new Komoran(DEFAULT_MODEL.FULL);
		  List<Token> tokens = komoran.analyze(data).getTokenList();
		        for(Token token : tokens) {
		            System.out.println(token);
		        }
		
		return "";
	}
	
}
