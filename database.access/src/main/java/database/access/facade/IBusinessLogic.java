package database.access.facade;

import java.sql.ResultSet;

import database.access.tableobject.DatabaseTable;
import database.access.tableobject.PatientInfoTable;
import database.access.tableobject.PhysicianInfoTable;

public interface IBusinessLogic {

	public Boolean authenticate(PhysicianInfoTable physUser);
	
	public Boolean create(DatabaseTable entry);
	public ResultSet read(DatabaseTable entry);
//	public Boolean update(DatabaseTable entry);
//	public Boolean delete(DatabaseTable entry);
	
//	public Boolean create(PhysicianInfoTable physician); //Insert statement, dynamically generated
//	public ResultSet readPhysician();
//	public Boolean updatePhysician();
//	public Boolean deletePhysician();
		
//	public Boolean addPatientUnderPhysician();
	
//	public Boolean createPatient(PatientInfoTable patient);
//	public ResultSet readPatient();
//	public Boolean updatePatient();
//	public Boolean deletePatient();
//	
//	public Boolean createPatientMedication();
//	public ResultSet readPatientMedication();
//	public Boolean updatePatientMedication();
//	public Boolean deletePatientMedication();
//	
//	public Boolean createAppointment();
//	public ResultSet readAppointment();
//	public Boolean updateAppointment();
//	public Boolean deleteAppointment();
//	
//	public Boolean createEmergencyContact();
//	public ResultSet readEmergencyContact();
//	public Boolean updateEmergencyContact();
//	public Boolean deleteEmergencyContact();
//	
//	public Boolean createPatientAllergy();
//	public ResultSet readPatientAllergy();
//	public Boolean updatePatientAllergy();
//	public Boolean deletePatientAllergy();
//	
//	public Boolean createPhoneNumber();
//	public ResultSet readPhoneNumber();
//	public Boolean updatePhoneNumber();
//	public Boolean deletePhoneNumber();
//	
//	public Boolean createMedicalSpecialty();
//	public ResultSet readMedicalSpecialty();
//	public Boolean updateMedicalSpecialty();
//	public Boolean deleteMedicalSpecialty();
//	
//	public Boolean createOffice();
//	public ResultSet readOffice();
//	public Boolean updateOffice();
//	public Boolean deleteOffice();
	
	//Patient options
	//public Boolean authenticate(PatientInfoTable patUser);
}
