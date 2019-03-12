package com.sinc.project.shrv.ctrl;

import java.util.ArrayList;
import java.util.List;

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
	public List<Object> getHumanResourceInfo (String searchType, String searchKeyword) {
		
		System.out.println("getHumanResourceInfo Controller");
		List<Object> list = humanResourceService.list();
		System.out.println(list);
		//System.out.println(boardList.toString());
		
		/*
		 * System.out.println("BoardCtrl search");
		 * 
		 * Map<String, String> map = new HashMap<String, String>();
		 * map.put("searchType", searchType); map.put("searchKeyword", searchKeyword);
		 * System.out.println(map); List<Object> list = boardService.search(map);
		 * 
		 * System.out.println(list);
		 */
		return list;
	}
	
	/*
	 * @RequestMapping(value="/register.do", method=RequestMethod.GET) public String
	 * register() { System.out.println("BoardCtrl register"); return
	 * "/board/register"; }
	 */

}
