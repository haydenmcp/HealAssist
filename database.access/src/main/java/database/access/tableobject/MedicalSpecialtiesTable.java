package database.access.tableobject;

public class MedicalSpecialtiesTable extends DatabaseTable {
	public static final String TABLE_NAME = MedicalSpecialtiesEnum.TABLE_NAME.toString();
	public static final String SPECIALTY_ID = MedicalSpecialtiesEnum.SPECIALTY_ID.toString();
	public static final String SPECIALTY_TITLE = MedicalSpecialtiesEnum.SPECIALTY_TITLE.toString();
	public static final String SPECIALTY_DESCRIPTION = MedicalSpecialtiesEnum.SPECIALTY_DESCRIPTION.toString();
	public static final String OFFICE_ID = MedicalSpecialtiesEnum.OFFICE_ID.toString();
	public static final String PHYSICIAN_USERNAME = MedicalSpecialtiesEnum.PHYSICIAN_USERNAME.toString();
	
	public MedicalSpecialtiesTable(){
		super();
		this.setTableName(TABLE_NAME);
	}
	public MedicalSpecialtiesTable addSpecialtyId(String newId){		
		this.addNumAttr(SPECIALTY_ID, newId);
		return this;
	}
	public MedicalSpecialtiesTable addSpecialtyTitle(String newTitle){		
		this.addStrAttr(SPECIALTY_TITLE, newTitle);
		return this;
	}
	public MedicalSpecialtiesTable addSpecialtyDescription(String newDescription){		
		this.addStrAttr(SPECIALTY_DESCRIPTION, newDescription);
		return this;
	}	
	public MedicalSpecialtiesTable addOfficeId(String newId){		
		this.addNumAttr(OFFICE_ID, newId);
		return this;
	}
	public MedicalSpecialtiesTable addPhysicianUsername(String newPhyUsername){		
		this.addStrAttr(PHYSICIAN_USERNAME, newPhyUsername);
		return this;
	}
}
