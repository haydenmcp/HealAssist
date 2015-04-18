package database.access.tableobject;

import java.util.HashMap;

import com.google.common.base.Joiner;

public class DatabaseTable {
	private String tableName;
	private HashMap<String, String> attributeList;	
	
	public DatabaseTable(){
		this.tableName = "";
		this.attributeList = new HashMap<String, String>();
	}
	public HashMap<String, String> getAttributeMap(){
		return this.attributeList;
	}
	public String getRelation(String columnName){
		if(!this.attributeList.containsKey(columnName)){
			return null;
		}else{
			return columnName + " = " + this.attributeList.get(columnName);	
		}		
	}
	public String getStrColumnNames(char delimiter){
		String[] columns = this.getColumnNames();
		if(columns == null){
			return null; // *** Throw error
		}else if(columns.length <= 1){
			return columns.toString();			
		}else{
			return Joiner.on(delimiter).join(columns);
		}
	}
	public String[] getColumnNames(){
		return this.attributeList.keySet().toArray(new String[0]);
	}
	private void addAttribute(String attrKey, String attrValue){
		this.attributeList.put(attrKey, attrValue);
	}
	
	public String getTableName(){
		return this.tableName;
	}
	protected void setTableName(String newTableName){
		this.tableName = newTableName;
	}

	protected void addStrAttr(String attrName, String attrValue){
		String formStrAttr = this.formatStringAttr(attrValue);
		this.addAttribute(attrName, formStrAttr);		
	}
	protected void addNumAttr(String attrName, String attrValue){
		this.addAttribute(attrName, attrValue);
	}
	protected void addCharAttr(String attrName, String attrValue){
		String formCharAttr = this.formatCharAttr(attrValue);
		this.addAttribute(attrName, formCharAttr);
	}
	protected void addDateAttr(String attrName, String attrValue){
		String formStrAttr = this.formatStringAttr(attrValue);
		this.addAttribute(attrName, formStrAttr);		
	}
	protected void addTimeAttr(String attrName, String attrValue){
		String formStrAttr = this.formatStringAttr(attrValue);
		this.addAttribute(attrName, formStrAttr);		
	}
	
	private String formatStringAttr(String attrValue){
		return "'" + attrValue + "'";
	}
	private String formatCharAttr(String attrValue){
		return "'" + attrValue + "'";
	}
	
	public Boolean hasAttributes(){
		if( this.attributeList.size() <= 0 ){
			return false;
		}else{
			return true;
		}
	}
	
}
