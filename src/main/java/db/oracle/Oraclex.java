package db.oracle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

/***************************************************************************
 *  
 *  Project Name     :  Test2
 *
 *  Author		     :  Keson.Liu
 *
 *  Creation Date    :  Jan 2, 2015
 *  
 *  Purpose		     :  
 *  
 *  
 *  Revision history :  
 *  Version		Author		Date			Purpose 
 * 											 					
 ***************************************************************************/

public class Oraclex {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = null;
		connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.6:1521:aidev","aidatauser","tiger");
		connection.close();
		System.out.println("xx");
	}

}
