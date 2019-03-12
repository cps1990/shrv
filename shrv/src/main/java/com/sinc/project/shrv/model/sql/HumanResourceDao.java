package com.sinc.project.shrv.model.sql;

import java.util.List;
import java.util.Map;

public interface HumanResourceDao {

	public List<Object> listRow();
	public List<Object> search(Map<String, String> map);
	
}
