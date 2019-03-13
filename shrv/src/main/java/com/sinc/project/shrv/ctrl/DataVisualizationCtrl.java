package com.sinc.project.shrv.ctrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.project.shrv.service.HumanResourceService;

@Controller
//@RequestMapping(value="/board")
public class DataVisualizationCtrl {
	
	@Resource(name="humanResourceService")
	private HumanResourceService humanResourceService;
	
	@RequestMapping(value="/shrv/getHumanResourceInfo.do", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> getHumanResourceInfo (String data) {
		
		System.out.println("getHumanResourceInfo Controller");
		System.out.println(data);
		// 받아온 데이터를 파라미터에 추가하여 서비스단 getHumanResourceInfo 함수 호출
  		List<Object> list = humanResourceService.getHumanResourceInfo(data);
		System.out.println(list);
		Map<String, String> result = new HashMap();
		String connUrl = humanResourceService.dataAnalysis(data);
		result.put("recvData", connUrl);
		return result;
	}

}
