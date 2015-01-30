/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package log;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

import constant.CnstLog;

/***************************************************************************
 *  
 *  Project Name     :  demo2
 *
 *  Author		     :  Keson.Liu
 *
 *  Creation Date    :  Jan 27, 2015
 *  
 *  Purpose		     :  The logger
 *  
 *  
 *  Revision history :  
 *  Version		Author		Date			Purpose 
 * 											 					
 ***************************************************************************/

public class AILogger extends Logger {

	protected AILogger(String name) {
		super(name);
	}

	private static AILoggerFactory myFactory = new AILoggerFactory();

	/*
	private static Logger logger = null;

	public static <T> Logger getLogger(Class<T> clazz) {
		logger = Logger.getLogger(clazz);
		return logger;
	}
	*/
	public void debug(String msgFormat, Object... args) {
		super.debug(formatMsg(msgFormat, args));
	}

	public void debugMethodBegin() {
		String className = AILoggerUtil.getCallerClsName(3);
		String methodName = AILoggerUtil.getCallerMethodName(3);
		super.debug(formatMsg("%s.%s %s", className, methodName,
				CnstLog.SUBFIX_4_START));
	}

	public void debugMethodEnd() {
		String className = AILoggerUtil.getCallerClsName(3);
		String methodName = AILoggerUtil.getCallerMethodName(3);
		super.debug(formatMsg("%s.%s %s", className, methodName,
				CnstLog.SUBFIX_4_END));
	}

	public void debugMethodResult(Object keyword, Object value) {
		String className = AILoggerUtil.getCallerClsName(3);
		String methodName = AILoggerUtil.getCallerMethodName(3);
		super.debug(formatMsg("%s.%s() part %s return [%s]", className,
				methodName, keyword.toString(), value.toString()));
	}

	public void error(String msgFormat, Object... args) {
		super.error(formatMsg(msgFormat, args));
	}

	public void info(String msgFormat, Object... args) {
		super.info(formatMsg(msgFormat, args));
	}

	public void fatal(String msgFormat, Object... args) {
		super.fatal(formatMsg(msgFormat, args));
	}

	public void trace(String msgFormat, Object... args) {
		super.trace(formatMsg(msgFormat, args));
	}

	public void debug(String msgFormat, Throwable t, Object... args) {
		super.debug(formatMsg(msgFormat, args), t);
	}

	public void error(String msgFormat, Throwable t, Object... args) {
		super.error(formatMsg(msgFormat, args), t);
	}

	public void info(String msgFormat, Throwable t, Object... args) {
		super.info(formatMsg(msgFormat, args), t);
	}

	public void fatal(String msgFormat, Throwable t, Object... args) {
		super.fatal(formatMsg(msgFormat, args), t);
	}

	public void trace(String msgFormat, Throwable t, Object... args) {
		super.trace(formatMsg(msgFormat, args), t);
	}

	public String formatMsg(String msgFormat, Object... args) {
		try {
			return String.format(CnstLog.AI_LOGGER_PREFIX + msgFormat, args);
		} catch (Exception e) {
			return msgFormat;
		}
	}

	public static Category getInstance(String name) {
		return Logger.getLogger(name, myFactory);
	}

	public static Logger getLogger(String name) {
		return Logger.getLogger(name, myFactory);
	}

	public static <T> AILogger getLogger(Class<T> clazz) {
		return (AILogger) Logger.getLogger(clazz.getName(), myFactory);
	}
}
