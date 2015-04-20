package database.access.query;
 
import java.util.Arrays;
import java.util.HashMap;

import database.access.tableobject.DatabaseTable;

public class QueryHandler {
	public static String constructInsert(DatabaseTable table){
		try{									
			String tableName = table.getTableName();				
			String[] attrList = table.getAttributeMap().keySet().toArray(new String[0]);
			HashMap<String, String> attrCollection = table.getAttributeMap();			
			String statement = 
					"INSERT INTO " + tableName; 											
					
			String attrNames = " ( ";
			String attrValues = " ( ";
			attrNames += attrList[0];
			attrValues += attrCollection.get( attrList[0] );
			for(String attribute: Arrays.copyOfRange(attrList, 1, attrList.length)){
				attrNames += ", " + attribute;
				attrValues += ", " + attrCollection.get(attribute);				
			}
			attrNames += " ) ";
			attrValues += " ) ";
			
			statement+= attrNames + " VALUES " + attrValues;
			return statement;			
		}catch(Exception e){
			System.out.println(e.toString());
			return null;
		}
	}
	public static String constructSelectAll(DatabaseTable table){
		try{
			String tableName = table.getTableName();																
			return "SELECT * FROM " + tableName;			
		}catch(Exception e){
			System.err.println(e.toString());
			return null;
		}		
	}
	
	public static String constructSelect(DatabaseTable table, String[] columns){
		try{
			String tableName = table.getTableName();				
			String[] attrList = table.getAttributeMap().keySet().toArray(new String[0]);
			HashMap<String, String> attrCollection = table.getAttributeMap();			
			String statement = "SELECT ";
			
			statement += columns[0];
			for(String column: columns){
				statement += ", " + column;
			}
			
			String attrNames = "";
			String attrValues = "";
						
			attrValues += attrList[0] + " = " + attrCollection.get( attrList[0] );
			for(String attribute: Arrays.copyOfRange(attrList, 1, attrList.length)){
				attrNames += ", " + attribute;
				attrValues += " AND " + attribute + " = " + attrCollection.get(attribute) ;				
			}
			
			
			statement += attrNames + " FROM " + tableName + " WHERE " + attrValues;
			return statement;			
		}catch(Exception e){
			System.out.println(e.toString());
			return null;
		}
	}
}
