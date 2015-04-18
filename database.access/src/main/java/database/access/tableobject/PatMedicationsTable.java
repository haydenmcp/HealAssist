package database.access.tableobject;

public class PatMedicationsTable extends DatabaseTable{
	public static final String TABLE_NAME = PatMedicationsEnum.TABLE_NAME.toString();
	public static final String PATIENT_MED_ID = PatMedicationsEnum.PATIENT_MED_ID.toString();
	public static final String PATIENT_CHART_ID = PatMedicationsEnum.PATIENT_CHART_ID.toString();
	public static final String MEDICATION_NAME = PatMedicationsEnum.MEDICATION_NAME.toString();
	public static final String MEDICATION_DOSAGE_QTTY = PatMedicationsEnum.MEDICATION_DOSAGE_QTTY.toString();
	public static final String MEDICATION_DOSAGE_ROUTE = PatMedicationsEnum.MEDICATION_DOSAGE_ROUTE.toString();
	public static final String MEDICATION_DOSAGE_FREQ = PatMedicationsEnum.MEDICATION_DOSAGE_FREQ.toString();
	public static final String MEDICATION_DOSAGE_STATUS = PatMedicationsEnum.MEDICATION_DOSAGE_STATUS.toString();
	public static final String APPOINTMENT_ID = PatMedicationsEnum.APPOINTMENT_ID.toString();
	public static final String MEDICATION_START_DATE = PatMedicationsEnum.MEDICATION_START_DATE.toString();
	public static final String MEDICATION_END_DATE = PatMedicationsEnum.MEDICATION_END_DATE.toString();
	public static final String MEDICATION_DISPENSE_QTTY = PatMedicationsEnum.MEDICATION_DISPENSE_QTTY.toString();
	public static final String MEDICATION_DISPENSE_PACKAGE = PatMedicationsEnum.MEDICATION_DISPENSE_PACKAGE.toString();
	public static final String NUMBER_REFILLS = PatMedicationsEnum.NUMBER_REFILLS.toString();
	
	public PatMedicationsTable(){
		super();
		this.setTableName(TABLE_NAME);
	}			
	public PatMedicationsTable addPatientMedicalId(String newPatMedId){		
		this.addNumAttr(PATIENT_MED_ID, newPatMedId);
		return this;
	}
	public PatMedicationsTable addPatientChartId(String newPatChartId){		
		this.addNumAttr(PATIENT_CHART_ID, newPatChartId);
		return this;
	}
	public PatMedicationsTable addMedicationName(String newMedName){		
		this.addStrAttr(MEDICATION_NAME, newMedName);
		return this;
	}
	public PatMedicationsTable addMedDosageQtty(String newMedDosageQtty){		
		this.addStrAttr(MEDICATION_DOSAGE_QTTY, newMedDosageQtty);
		return this;
	}
	public PatMedicationsTable addMedDosageRoute(String newMedDosageRoute){		
		this.addStrAttr(MEDICATION_DOSAGE_ROUTE, newMedDosageRoute);
		return this;
	}
	public PatMedicationsTable addMedDosageFreq(String newMedDosageFreq){		
		this.addStrAttr(MEDICATION_DOSAGE_FREQ, newMedDosageFreq);
		return this;
	}
	public PatMedicationsTable addMedDosageStatus(String newMedDosageStatus){		
		this.addStrAttr(MEDICATION_DOSAGE_STATUS, newMedDosageStatus);
		return this;
	}
	public PatMedicationsTable addAppointmentId(String newAppointmentId){		
		this.addStrAttr(APPOINTMENT_ID, newAppointmentId);
		return this;
	}
	public PatMedicationsTable addMedicationStartDate(String newMedicationStartDate){		
		this.addStrAttr(MEDICATION_START_DATE, newMedicationStartDate); // *** Add addDateAttr to DatabaseTable
		return this;
	}
	public PatMedicationsTable addMedicationEndDate(String newMedicationEndDate){		
		this.addStrAttr(MEDICATION_END_DATE, newMedicationEndDate);     // *** Add addDateAttr to DatabaseTable
		return this;
	}
	public PatMedicationsTable addMedicationDispenseQtty(String newMedDispenseQtty){		
		this.addStrAttr(MEDICATION_DISPENSE_QTTY, newMedDispenseQtty);
		return this;
	}
	public PatMedicationsTable addMedicationDispensePackage(String newMedDispensePackage){		
		this.addStrAttr(MEDICATION_DISPENSE_PACKAGE, newMedDispensePackage);
		return this;
	}
	public PatMedicationsTable addMedicationNumberRefills(String newNumberRefills){		
		this.addStrAttr(NUMBER_REFILLS, newNumberRefills);
		return this;
	}
}
