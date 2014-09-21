package info.bluefloyd.tracer.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by laci on 9/18/2014.
 */
public class SampleClass2 {

    private static final Log LOGGER = LogFactory.getLog(SampleClass2.class);
    private final SampleClass3 sample3 = new SampleClass3();

    public void doSample2() {
        LOGGER.info("Started 'doSample2()'");
        sample3.doSample3();
        LOGGER.info("Finished 'doSample2()'");
    }

}
