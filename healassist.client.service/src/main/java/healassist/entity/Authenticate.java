package healassist.entity;

import healassist.client.service.misc.GlobalConstant;
import healassist.service.response.JsonFeedbackResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import database.access.facade.SQLBusinessLogic;
import database.access.facade.DatabaseInterface;
import database.access.facade.IBusinessLogic;
import database.access.tableobject.PhysicianInfoTable;

@Path("authenticate")
public class Authenticate {	
	private static final String CLASS_NAME = "Authenticate";
	
	private static final String AUTH_PHYSICIAN = "AuthenticatePhysician";
	@GET
	@Path("/physician")
	@Produces(MediaType.APPLICATION_JSON)
	public String AuthenticatePhysician(@QueryParam("username") String username, 
			@QueryParam("password") String password){
		PhysicianInfoTable physician = new PhysicianInfoTable();
		try{			
			physician.addUsername(username).addPassword(password);						
			
			if( !GlobalConstant.BusinessLogic.authenticate(physician) ){
				return JsonFeedbackResponse.failure().toString();
			}else{
				return JsonFeedbackResponse.success().append("key", username).toString();
			}					
		}catch(Exception e){
			System.err.println(e);
			return JsonFeedbackResponse.error(
					GlobalConstant.PROJECT_NAME, CLASS_NAME, AUTH_PHYSICIAN, 
					"Try Failure" );
		}		
	}
}
