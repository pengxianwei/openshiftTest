package org.p.one.factory;

import java.util.List;
import java.util.Map;

public interface FactoryInterface {
	
	Object insertObjec(Map<String,Object> data);
	
	List<Map<String,Object>> getList();

}
