/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package log;

/***************************************************************************
 *  
 *  Project Name     :  demo2
 *
 *  Author		     :  Keson.Liu
 *
 *  Creation Date    :  Jan 29, 2015
 *  
 *  Purpose		     :  
 *  
 *  
 *  Revision history :  
 *  Version		Author		Date			Purpose 
 * 											 					
 ***************************************************************************/

public class AILoggerUtil {

	public static String getCallerClsName() {
		return getCallerClsName(1);
	}

	public static String getCallerClsName(int deep) {
		try {
			StackTraceElement traceElement = Thread.currentThread()
					.getStackTrace()[deep];
			String className = traceElement.getClassName();
			return className;
		} catch (Exception e) {
			return "";
		}
	}

	public static String getCallerMethodName() {
		return getCallerMethodName(1);
	}

	public static String getCallerMethodName(int deep) {
		try {
			StackTraceElement traceElement = Thread.currentThread()
					.getStackTrace()[deep];
			String methodName = traceElement.getMethodName();
			return methodName;
		} catch (Exception e) {
			return "";
		}
	}

}
