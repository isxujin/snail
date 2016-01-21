/**
 * 
 */
package org.openquantum.service.restful.sample;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

/**
 * @author xujin
 *
 */
@Service
@Path("/rest/sample")
public class SampleRestService {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes("application/x-www-form-urlencoded")
	public Response token(final MultivaluedMap<String, String> formParameters) {
		return null;
	}

}
