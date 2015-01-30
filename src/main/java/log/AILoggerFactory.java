/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package log;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/***************************************************************************
 *  
 *  Project Name     :  demo2
 *
 *  Author		     :  Keson.Liu
 *
 *  Creation Date    :  Jan 27, 2015
 *  
 *  Purpose		     :  
 *  
 *  
 *  Revision history :  
 *  Version		Author		Date			Purpose 
 * 											 					
 ***************************************************************************/

public class AILoggerFactory implements LoggerFactory {

	public AILoggerFactory() {
	}

	public Logger makeNewLoggerInstance(String name) {
		return new AILogger(name);
	}
}
