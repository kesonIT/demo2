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
import de.bea.domingo.DDatabase;
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

public class Connector {
	
	protected DDatabase getDDatabase(String database) throws AILotusException {
		DDatabase db;
		try {
			logger.info("Get Database " + database + " in server " + Configuration.singleton().get("LOTUS_SERVER"));
			db = Session.getDSession().getDatabase(Configuration.singleton().get("LOTUS_SERVER"), database);
			logger.info("Connected to the database " + database);
			return db;
		} catch (Exception e) {
			logger.error(Arrays.toString(e.getStackTrace()));
			throw new AILotusException("Please contact AI support team to restart the lotus server.", e.getMessage());
		}
	}

	private static final Logger logger = Logger.getLogger(Connector.class);

	protected DDatabase getDDatabase(String serverName, String database) throws AILotusException {
		DDatabase db;
		try {
			logger.info("Get Database " + database + " in server " + serverName);
			db = Session.getDSession().getDatabase(serverName, database);
			logger.info("Connected to the database " + database);
			return db;
		} catch (Exception e) {
			logger.error(Arrays.toString(e.getStackTrace()));
			throw new AILotusException("Please contact AI support team to restart the lotus server.", e.getMessage());
		}
	}

	
}
