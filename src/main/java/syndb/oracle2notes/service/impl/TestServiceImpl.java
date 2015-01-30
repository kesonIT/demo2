/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package syndb.oracle2notes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import syndb.oracle2notes.dao.ITestDao;
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

public class TestServiceImpl implements ITestService {
	@Autowired
	@Qualifier("testDao")
	private ITestDao testDao;

	public void testGetObj() {
		testDao.testGetObj();
	}

	public void testGetNumber() {
		testDao.testGetNumber();
	}

	public void testGetString() {
		testDao.testGetString();
	}

	public void testGetList() {
		testDao.testGetList();
	}

}
