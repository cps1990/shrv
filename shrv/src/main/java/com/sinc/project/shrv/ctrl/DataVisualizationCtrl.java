package com.sinc.project.shrv.ctrl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinc.project.shrv.model.vo.EmployeeVO;
import com.sinc.project.shrv.service.HumanResourceService;

@Controller
public class DataVisualizationCtrl {
	
	@Resource(name="humanResourceService")
	private HumanResourceService humanResourceService;
	
	// 결과데이터 저장 변수
	JSONObject successJObj = new JSONObject();
	
	@RequestMapping(value="/getHumanResourceInfo.do", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> getHumanResourceInfo (HttpServletRequest request, @RequestBody Map<String, Object> data) {
		
		System.out.println("getHumanResourceInfo Controller");
		//String str = (String)data.get("data");
		List<HashMap<String, Object>> storedData = humanResourceService.getHumanResourceInfo("");
  		System.out.println(storedData);
  		
  		successJObj.put("data", storedData);
  		System.out.println(successJObj);

		Map<String, String> result = new HashMap<String, String>();
		String connUrl = "http://10.149.178.248:8088/visualization.do";
		result.put("recvData", connUrl);
		return result;
	}
	
	@RequestMapping(value = "/visualization.do")
	public String visual(HttpServletRequest request, Model model) {
		model.addAttribute("data", successJObj);
		
		return "visualization" ;
	}

}
