/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package syndb.oracle2notes.controller.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import syndb.oracle2notes.controller.ITestController;
import syndb.oracle2notes.service.ITestService;

/***************************************************************************
 *  
 *  Project Name     :  demo2
 *
 *  Author		     :  Keson.Liu
 *
 *  Creation Date    :  Jan 28, 2015
 *  
 *  Purpose		     :  
 *  
 *  
 *  Revision history :  
 *  Version		Author		Date			Purpose 
 * 											 					
 ***************************************************************************/
@Controller
@Path("/home")
@Produces({ MediaType.APPLICATION_JSON })
public class TestControllerImpl implements ITestController {
	@Autowired
	@Qualifier("testService")
	private ITestService testService;

	@GET
	@Path("/test/get-object")
	@Produces({ MediaType.APPLICATION_JSON })
	public void testGetObj() {
		System.out.println("test controller");
		testService.testGetObj();
	}

	@GET
	@Path("/test/get-number")
	@Produces({ MediaType.APPLICATION_JSON })
	public void testGetNumber() {
		testService.testGetNumber();
	}

	@GET
	@Path("/test/get-string")
	@Produces({ MediaType.APPLICATION_JSON })
	public void testGetString() {
		testService.testGetString();
	}

	@GET
	@Path("/test/get-list")
	@Produces({ MediaType.APPLICATION_JSON })
	public void testGetList() {
		testService.testGetList();
	}

}
