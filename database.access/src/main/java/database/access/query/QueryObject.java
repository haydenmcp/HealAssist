package database.access.query;

import java.util.HashMap;

public abstract class QueryObject {
	private HashMap<String, String> queryPairs;
	private String queryString;
	
	private void init(){
		this.setQueryStr("");
		this.queryPairs = new HashMap<String, String>();
	}
	public QueryObject(){ 		
		init();
	}
	
	protected void setQueryStr(String newStr){
		this.queryString = newStr;
	}
	public String getQueryStr(){
		return this.queryString;
	}
	
	protected void addQueryPair(String key, String value){
		queryPairs.put(key, value);
	}
}
