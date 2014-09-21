package info.bluefloyd.profiler.test.guice;

import info.bluefloyd.profiler.ProfileExecution;
import info.bluefloyd.tracer.test.SampleClass1;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by laci on 9/19/2014.
 */
public class SampleBean {

    private static final Log LOGGER = LogFactory.getLog(SampleBean.class);

    @ProfileExecution
    public void sampleMethod() {
        LOGGER.info("Executing method 'sampleMethod' (guice).");
        new SampleClass1().doSample1();
    }
}