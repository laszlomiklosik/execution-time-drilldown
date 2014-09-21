package info.bluefloyd.profiler;

import info.bluefloyd.tracer.CallTraceComposer;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ProfilingMethodInterceptor implements MethodInterceptor {

    private static final Log LOGGER = LogFactory.getLog(ProfilingMethodInterceptor.class);
    private final CallTraceComposer callTraceComposer = new CallTraceComposer();

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        long startTimeNanos = System.nanoTime();
        try {
            return invocation.proceed();
        } finally {
            long endTimeNanos = System.nanoTime();
            long methodCallDuration = endTimeNanos - startTimeNanos;
            LOGGER.info("## " + invocation.getMethod().toGenericString() + " took: " + methodCallDuration + " nanos");
            LOGGER.info("$$ " + callTraceComposer.getCallTrace());
        }
    }
}