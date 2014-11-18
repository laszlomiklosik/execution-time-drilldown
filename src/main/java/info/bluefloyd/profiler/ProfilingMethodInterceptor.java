package info.bluefloyd.profiler;

import info.bluefloyd.tracer.CallTraceComposer;
import net.openhft.chronicle.logger.slf4j.ChronicleLoggingConfig;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProfilingMethodInterceptor implements MethodInterceptor {

    static {
        System.setProperty(ChronicleLoggingConfig.KEY_PROPERTIES_FILE, "src/main/resources/duration-logging.properties");
    }

    private static final Logger LOGGER = LoggerFactory.getLogger("DURATION");
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
            //LOGGER.info("$$ " + callTraceComposer.getCallTrace());
        }
    }
}