package com.sinc.project.shrv.ctrl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.project.shrv.service.HumanResourceService;

@Controller
public class DataVisualizationCtrl {
	
	@Resource(name="humanResourceService")
	private HumanResourceService humanResourceService;
	
	@RequestMapping(value="/shrv/getHumanResourceInfo.do", method=RequestMethod.POST)
	@ResponseBody
	public List<Object> getHumanResourceInfo (String voiceText) {
		
		System.out.println("getHumanResourceInfo Controller");
		System.out.println(voiceText);
		
		// 받아온 데이터를 파라미터에 추가하여 서비스단 getHumanResourceInfo 함수 호출
		List<Object> list = humanResourceService.getHumanResourceInfo();
		System.out.println(list);
		
		return list;
	}

}
