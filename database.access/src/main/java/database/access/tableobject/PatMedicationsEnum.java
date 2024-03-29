package database.access.tableobject;

public enum PatMedicationsEnum {
	TABLE_NAME("PAT_MEDICATIONS"),
	PATIENT_MED_ID("PAT_MED_ID"),
	PATIENT_CHART_ID("PAT_CHART_ID"),
	MEDICATION_NAME("MED_NAME"),
	MEDICATION_DOSAGE_QTTY("MED_DOSAGE_QTTY"),
	MEDICATION_DOSAGE_ROUTE("MED_DOSAGE_ROUTE"),
	MEDICATION_DOSAGE_FREQ("MED_DOSAGE_FREQ"),
	MEDICATION_DOSAGE_STATUS("MED_DOSAGE_STATUS"),
	APPOINTMENT_ID("APPT_ID"),
	MEDICATION_START_DATE("MED_START_DATE"),
	MEDICATION_END_DATE("MED_END_DATE"),
	MEDICATION_DISPENSE_QTTY("MED_DISPENSE_QTTY"),
	MEDICATION_DISPENSE_PACKAGE("MED_DISPENSE_PACKAGE"),
	NUMBER_REFILLS("MED_NUM_REFILLS")
	;			
	public String toString(){
		return this.stringRepresentation;
	}	
	PatMedicationsEnum(String newStringRepresentation){
		this.stringRepresentation = newStringRepresentation;
	}
	
	private String stringRepresentation;		
}
