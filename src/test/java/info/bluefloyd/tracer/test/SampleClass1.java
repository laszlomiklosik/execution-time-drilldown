package info.bluefloyd.tracer.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by laci on 9/18/2014.
 */
public class SampleClass1 {

    private static final Log LOGGER = LogFactory.getLog(SampleClass1.class);
    private final SampleClass2 sample2 = new SampleClass2();

    public void doSample1() {
        LOGGER.info("Started 'doSample1()'");
        sample2.doSample2();
        LOGGER.info("Finished 'doSample1()'");
    }
}
