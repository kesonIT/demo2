/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package domino;

import java.util.Arrays;

import org.apache.log4j.Logger;

import config.Configuration;
import de.bea.domingo.DNotesFactory;
import de.bea.domingo.DSession;
import domino.exceptions.AILotusException;

/***************************************************************************
 *  
 *  Project Name     :  demo2
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

public class Session {
	private static final Logger logger = Logger.getLogger(Session.class);
	
	protected static DSession getDSession() throws AILotusException {
		try {
			logger.debug("Get Session " + Configuration.singleton().get("SERVER") + " in server "
					+ Configuration.singleton().get("LOTUS_SERVER"));
			return DNotesFactory.getInstance().getSessionWithFullAccess(Configuration.singleton().get("PASSWORD"));
		} catch (Exception excpt) {
			logger.error(Arrays.toString(excpt.getStackTrace()));
			logger.error("Root cause 1: " + excpt.getCause().getMessage());
			logger.error("Root cause 2: " + excpt.getCause().getCause().getMessage());
			logger.error("Root cause 3: " + excpt.getCause().getCause().getCause().getMessage());
			logger.error("Root cause 4: " + excpt.getCause().getCause().getCause().getCause().getMessage());
			logger.error("Root cause 5: " + excpt.getCause().getCause().getCause().getCause().getCause().getMessage());
			throw new AILotusException(excpt.getMessage() + ": Please contact AI support team to restart the lotus server.");
		}
	}

}
