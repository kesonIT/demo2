package log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import constant.CnstLog;

@Component
@Aspect
public class MethodLogger {
	AILogger logger = AILogger.getLogger(MethodLogger.class);

	// @Around("execution(* syndb.oracle2notes.dao.impl..*.*(..))")
	public Object timeMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object retVal = joinPoint.proceed();
		stopWatch.stop();
		StringBuffer logMessageStringBuffer = new StringBuffer();
		logMessageStringBuffer.append(joinPoint.getTarget().getClass()
				.getName());
		logMessageStringBuffer.append(".");
		logMessageStringBuffer.append(joinPoint.getSignature().getName());
		logMessageStringBuffer.append("(");
		logMessageStringBuffer.append(joinPoint.getArgs());
		logMessageStringBuffer.append(")");
		logMessageStringBuffer.append(" execution time: ");
		logMessageStringBuffer.append(stopWatch.getTotalTimeMillis());
		logMessageStringBuffer.append(" ms");
		logMessageStringBuffer.append(" , the result is : ");
		logMessageStringBuffer.append(retVal);
		AILogger.getLogger(this.getClass()).debug(
				"~~~~~~~~~ Test aop logger, the result is [%s]",
				logMessageStringBuffer.toString());
		return retVal;
	}

	@Around("execution(* syndb.oracle2notes.dao.impl..*.*(..))")
	public Object beforeMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String clsName = joinPoint.getTarget().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		String methodFullName = String.format("%s.%s(%s)", clsName, methodName, args);
		String pattern4Start = "%s %s";
		String pattern4End = "%s %s";
		String pattern4Result = "%s take time [%s] seconds, return value is [%s]";

		logger.debug(logger.formatMsg(pattern4Start, methodFullName,CnstLog.SUBFIX_4_START));

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object resultObj = joinPoint.proceed();
		String result = String.valueOf(resultObj);

		String costTime = String.valueOf(stopWatch.getTotalTimeSeconds());

		logger.debug(logger.formatMsg(pattern4Result, methodFullName, costTime,	result));

		logger.debug(logger.formatMsg(pattern4End, methodFullName, CnstLog.SUBFIX_4_END));
		return resultObj;
	}
}