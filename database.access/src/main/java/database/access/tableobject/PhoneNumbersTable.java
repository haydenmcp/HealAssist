package database.access.tableobject;

public class PhoneNumbersTable extends DatabaseTable {
	public static final String TABLE_NAME = PhoneNumbersEnum.TABLE_NAME.toString();
	public static final String NUMBER_ACCESSIBILITY = PhoneNumbersEnum.NUMBER_ACCESSIBILITY.toString();
	public static final String NUMBER_RELIABILITY = PhoneNumbersEnum.NUMBER_RELIABILITY.toString();
	public static final String NUMBER_LOCATION = PhoneNumbersEnum.NUMBER_LOCATION.toString();
	public static final String PHONE_NUMBER = PhoneNumbersEnum.PHONE_NUMBER.toString();
	
	public PhoneNumbersTable(){
		super();
		this.setTableName(TABLE_NAME);
	}			
	public PhoneNumbersTable addNumAccessibility(String newAccessibility){		
		this.addStrAttr(NUMBER_ACCESSIBILITY, newAccessibility);
		return this;
	}
	public PhoneNumbersTable addNumReliability(String newReliability){		
		this.addStrAttr(NUMBER_RELIABILITY, newReliability);
		return this;
	}
	public PhoneNumbersTable addNumLocation(String newLocation){		
		this.addStrAttr(NUMBER_LOCATION, newLocation);
		return this;
	}
	public PhoneNumbersTable addNumber(String newNumber){				
		this.addNumAttr(PHONE_NUMBER, newNumber);
		return this;
	}	
}
