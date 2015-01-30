/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package syndb.oracle2notes.dao;

import java.util.List;

import syndb.oracle2notes.model.FtyFactory;
import syndb.oracle2notes.model.TestModel;


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

public interface ITestDao {
	public TestModel testGetObj();
	public int testGetNumber();
	public String testGetString();
	public List<FtyFactory> testGetList();

}
