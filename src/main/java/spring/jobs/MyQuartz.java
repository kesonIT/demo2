/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package spring.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/***************************************************************************
 *  
 *  Project Name     :  factory-service
 *
 *  Author		     :  Keson.Liu
 *
 *  Creation Date    :  Jan 26, 2015
 *  
 *  Purpose		     :  
 *  
 *  
 *  Revision history :  
 *  Version		Author		Date			Purpose 
 * 											 					
 ***************************************************************************/

public class MyQuartz extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		System.out.println("xxxxxxxxxxxxxxxxx");
		
	}

}
