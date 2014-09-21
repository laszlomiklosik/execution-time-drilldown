package info.bluefloyd.tracer.test;

import info.bluefloyd.tracer.CallTraceComposer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by laci on 9/18/2014.
 */
public class SampleClass3 {

    private static final Log LOGGER = LogFactory.getLog(SampleClass3.class);
    private final CallTraceComposer callTraceComposer = new CallTraceComposer();

    public void doSample3() {
        LOGGER.info("Started 'doSample3()'");
        LOGGER.info("$$ " + callTraceComposer.getCallTrace());
        LOGGER.info("Finished 'doSample3()'");
    }
}
