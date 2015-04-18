package healassist.entity;

import java.text.SimpleDateFormat;

import healassist.client.service.misc.GlobalConstant;
import healassist.service.response.JsonFeedbackResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import database.access.tableobject.PatientInfoTable;
import database.access.tableobject.PhysicianInfoTable;

@Path("/register-user")
public class RegisterUser {
	private static final String CLASS_NAME = "RegisterUser";
	
	private static final String REGISTER_PHYSICIAN = "RegisterPhysician";
	@GET
	@Path("/physician")
	@Produces(MediaType.APPLICATION_JSON)
	public String RegisterPhysician(@QueryParam("username") String username, 
			@QueryParam("password") String password, @QueryParam("firstname") String firstname,
			@QueryParam("middlename") String middlename, @QueryParam("lastname") String lastname, 
			@QueryParam("email") String email){
		// *** This service also needs to verify that user doesn't already exist and that
		// all usernames are unique in the db	
		// *** Do walk-through to guarentee errors associated with failure are handled
		// gracefully
		PhysicianInfoTable physician = new PhysicianInfoTable();
		try{												
			physician.addUsername(username);
			physician.addPassword(password);
			physician.addFirstName(firstname);
			physician.addMiddleName(middlename);
			physician.addLastName(lastname);
			physician.addEmail(email);			
												
			if(!GlobalConstant.BusinessLogic.register(physician)){
				return JsonFeedbackResponse.failure(GlobalConstant.REFINE_NEEDED);
			}else{
				return JsonFeedbackResponse.success().toString();
			}
		}catch(Exception e){
			System.err.println(e);	
			return JsonFeedbackResponse.error(GlobalConstant.PROJECT_NAME,
					CLASS_NAME, REGISTER_PHYSICIAN, "Try Failure");
		}		
	}
	
	private static final String REGISTER_PATIENT = "RegisterPatient";
	@GET
	@Path("/patient")
	@Produces(MediaType.APPLICATION_JSON)
	public String RegisterPatient(@QueryParam("chartid") String chartId, 
			@QueryParam("firstname") String firstname, @QueryParam("middlename") String middlename, 
			@QueryParam("lastname") String lastname, @QueryParam("email") String email,
			@QueryParam("phonenumber") String phoneNumber, @QueryParam("dob") String dob,
			@QueryParam("gender") String gender, @QueryParam("race") String race){
		// *** This service also needs to verify that user doesn't already exist and that
		// all usernames are unique in the db	
		// *** Do walk-through to guarentee errors associated with failure are handled
		// gracefully
		PatientInfoTable patient = new PatientInfoTable();
//		SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date formatedDate = Date.valueOf(dob);
		try{							
			//Add all required fields
			patient.addChartId(chartId).addFirstName(firstname).addMiddleName(middlename).addLastName(lastname);
			patient.addPrimaryEmail(email).addPrimaryPhoneNumber(phoneNumber).addDateOfBirth(dob).addGender(gender);
			patient.addRace(race);
			//Add remaining fields
			
												
			if(!GlobalConstant.BusinessLogic.register(patient)){
				return JsonFeedbackResponse.failure(GlobalConstant.REFINE_NEEDED);
			}else{
				return JsonFeedbackResponse.success().toString();
			}
		}catch(Exception e){
			System.err.println(e);	
			return JsonFeedbackResponse.error(GlobalConstant.PROJECT_NAME,
					CLASS_NAME, REGISTER_PATIENT, "Try Failure");
		}		
	}
	
	
}
