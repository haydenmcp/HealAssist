package database.access.tableobject;

public enum PhysicianInfoEnum {
	TABLE_NAME("PHYSICIAN_INFO"),
	USERNAME("PHY_USERNAME"),
	PASSWORD("PHY_PASSWORD"),
	FIRSTNAME("PHY_FNAME"),
	MIDDLENAME("PHY_MNAME"),
	LASTNAME("PHY_LNAME"),
	EMAIL("PHY_EMAIL"),
	//PRIMARY_PHONE("PHY_PRIMARY_PHONE_NUM"),
	//SECONDARY_PHONE("PHY_SECONDARY_PHONE_NUM")
	;		
	
	public String toString(){
		return this.stringRepresentation;
	}
	
	PhysicianInfoEnum(String newStringRepresentation){
		this.stringRepresentation = newStringRepresentation;
	}
	
	private String stringRepresentation;	
}
