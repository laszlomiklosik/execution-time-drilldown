package info.bluefloyd.profiler.spring.tests;

import info.bluefloyd.profiler.ProfileExecution;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * Created by laci on 9/18/2014.
 */
@Component
public class SampleBean {
    private static final Log LOGGER = LogFactory.getLog(SampleBean.class);

    @ProfileExecution
    public void sampleMethod() {
        LOGGER.info("Executing method 'sampleMethod'.");
    }

}