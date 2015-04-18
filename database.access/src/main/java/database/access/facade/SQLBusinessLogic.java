package database.access.facade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.access.query.QueryHandler;
import database.access.tableobject.PatientInfoTable;
import database.access.tableobject.PhysicianInfoTable;

public class SQLBusinessLogic implements IBusinessLogic{
	@Override
	public Boolean authenticate(PhysicianInfoTable physician){
		try( 	Connection conn = DatabaseConnection.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM " + physician.getTableName() +
					" WHERE " + physician.getRelation(PhysicianInfoTable.USERNAME) + " AND " + 
					physician.getRelation(PhysicianInfoTable.PASSWORD));
				ResultSet results = stmt.executeQuery();
			){																																						
			
			if(!results.next()){ //Check if row returned 
				return false;
			}else{											
				return true;
			}						
		}catch(Exception e){
			System.err.println(e);
			return null;
		}
	}
	public Boolean register(PhysicianInfoTable physician){
		try( 	Connection conn = DatabaseConnection.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(QueryHandler.constructInsert(physician));				
			){																																						
			stmt.executeUpdate();														
			return true;									
		}catch(Exception e){
			System.err.println(e);
			return false;
		}
	}
	public Boolean register(PatientInfoTable patient){
		try( 	Connection conn = DatabaseConnection.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(QueryHandler.constructInsert(patient));				
			){																																						
			stmt.executeUpdate();														
			return true;									
		}catch(Exception e){
			System.err.println(e);
			return false;
		}
	}

}
