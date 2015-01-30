/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package syndb.oracle2notes.dao.impl;

import java.util.List;

import log.AILogger;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import syndb.oracle2notes.dao.ITestDao;
import syndb.oracle2notes.mapper.TestMapper;
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

public class TestDaoImpl extends JdbcDaoSupport implements ITestDao {

	private static final AILogger LOGGER = AILogger
			.getLogger(TestDaoImpl.class);

	private static final String GET_OBJECT = "select CUST_ID from CUST_MODIFIED WHERE ROWNUM=1";
	private static final String GET_STRING = "select CUST_ID from CUST_MODIFIED WHERE ROWNUM=1";
	private static final String GET_INTEGER = "select COUNT(*) from CUST_MODIFIED WHERE ROWNUM=1";
	private static final String GET_LIST = "SELECT * FROM FTY_FACTORY WHERE ROWNUM<10";

	public TestModel testGetObj() {
		//LOGGER.debugMethodBegin();
		TestModel model = getJdbcTemplate().queryForObject(GET_OBJECT,
				new TestMapper());
		//LOGGER.debugMethodResult("object", model);
		//LOGGER.debugMethodEnd();
		return model;
	}

	public int testGetNumber() {
		//LOGGER.debugMethodBegin();
		//Integer result = 
		return getJdbcTemplate().queryForObject(GET_INTEGER, Integer.class);
		//LOGGER.debugMethodResult(1, result);
		//LOGGER.debugMethodEnd();
	}

	public String testGetString() {
		//LOGGER.debugMethodBegin();
		return getJdbcTemplate().queryForObject(GET_STRING, String.class);
		//LOGGER.debugMethodResult(1, result);
		//LOGGER.debugMethodEnd();
	}

	@SuppressWarnings("unchecked")
	public List<FtyFactory> testGetList() {
		//LOGGER.debugMethodBegin();
		return getJdbcTemplate().query(GET_LIST, new BeanPropertyRowMapper(FtyFactory.class));
		//LOGGER.debugMethodResult(1, result);
		//LOGGER.debugMethodEnd();
	}

}
