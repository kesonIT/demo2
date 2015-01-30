package domino.exceptions;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class AIException extends Exception {

	private static final long serialVersionUID = 8983406072792930402L;
	protected static Logger _logger = null;

	public AIException() {
		super();
		Logger.getLogger(AIException.class);
	}

	public AIException(Class<?> exceptionClass) {
		super();
		_logger = Logger.getLogger(exceptionClass);
	}

	public AIException(Class<?> exceptionClass, String businessMessage) {
		super(businessMessage);
		_logger = Logger.getLogger(exceptionClass);
		_logger.error(businessMessage);
	}

	public AIException(String businessMessage) {
		super(businessMessage);
		_logger = Logger.getLogger(AIException.class);
		_logger.error(businessMessage);
	}

	public AIException(String businessMessage, String detailMessage) {
		super(businessMessage);
		_logger = Logger.getLogger(AIException.class);
		_logger.error(businessMessage);
		_logger.error("detailMessage: " + detailMessage);
	}

	public AIException(Class<?> exceptionClass, String businessMessage, String detailMessage) {
		super(businessMessage);
		_logger = Logger.getLogger(exceptionClass);
		_logger.error(businessMessage);
		_logger.error("detailMessage: " + detailMessage);
	}

	public AIException(Class<?> exceptionClass, String msg, Throwable e) {
		super(msg, e);
		_logger = Logger.getLogger(exceptionClass);
		_logger.error(e.fillInStackTrace());
		_logger.error(Arrays.toString(e.getStackTrace()));
	}
}
