package com.sinc.project.shrv.service;

import java.util.List;
import java.util.Map;

public interface HumanResourceService {

	public List<Object> list();
	public List<Object> search(Map<String, String> map);
}
