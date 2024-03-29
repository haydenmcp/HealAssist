package database.access.tableobject;

public class PatAppointmentsTable extends DatabaseTable {
	public static final String TABLE_NAME = PatAppointmentsEnum.TABLE_NAME.toString();
	public static final String APPT_ID = PatAppointmentsEnum.APPT_ID.toString();
	public static final String PATIENT_CHART_ID = PatAppointmentsEnum.PATIENT_CHART_ID.toString();
	public static final String DATE = PatAppointmentsEnum.DATE.toString();
	public static final String TIME = PatAppointmentsEnum.TIME.toString();
	public static final String REASON = PatAppointmentsEnum.REASON.toString();
	public static final String NOTES = PatAppointmentsEnum.NOTES.toString();
	
	public PatAppointmentsTable(){
		super();
		this.setTableName(TABLE_NAME);
	}			
	public PatAppointmentsTable addAppointmentId(String newId){		
		this.addNumAttr(APPT_ID, newId);
		return this;
	}
	public PatAppointmentsTable addPatientChartId(String newChartId){		
		this.addNumAttr(PATIENT_CHART_ID, newChartId);
		return this;
	}
	public PatAppointmentsTable addAppointmentDate(String newDate){		
		this.addDateAttr(DATE, newDate);
		return this;
	}
	public PatAppointmentsTable addAppointmentTime(String newTime){		
		this.addTimeAttr(TIME, newTime);
		return this;
	}
	public PatAppointmentsTable addAppointmentReason(String newReason){		
		this.addStrAttr(REASON, newReason);
		return this;
	}
	public PatAppointmentsTable addAppointmentNote(String newNote){		
		this.addStrAttr(NOTES, newNote);
		return this;
	}
}
