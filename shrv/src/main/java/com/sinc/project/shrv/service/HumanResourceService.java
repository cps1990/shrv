package com.sinc.project.shrv.service;

import java.util.HashMap;
import java.util.List;

public interface HumanResourceService {

	public List<HashMap<String, Object>> getHumanResourceInfo(String data);
	
	public String dataAnalysis(String data);
}
