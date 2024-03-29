package database.access.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import database.access.query.QueryHandler;
import database.access.tableobject.DatabaseTable;

public class DatabaseInterface {	
	public Boolean insert(DatabaseTable table){
		try(Connection conn = DatabaseConnection.getConnection();
			Statement stmt = conn.createStatement();){
			
			String insertStr = QueryHandler.constructInsert(table);			
			stmt.executeUpdate(insertStr);
			return true;			
		}catch(Exception e){
			System.out.println(e);
			return false;
		}
	}
	
	public ResultSet select(DatabaseTable table, String[] columns, String whereString ){
		try(Connection conn = DatabaseConnection.getConnection();
			Statement stmt = conn.createStatement();){			
			String selectStr = QueryHandler.constructSelect(table, columns);			
			return stmt.executeQuery(selectStr);
		}catch(Exception e){
			System.err.println(e);			
		}
		return null;
	}
		
	public void selectAll(DatabaseTable table){
		
	}
}
