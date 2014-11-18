package info.bluefloyd.profiler.test.spring;

import info.bluefloyd.profiler.ProfileExecution;
import info.bluefloyd.tracer.test.SampleClass1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by laci on 9/18/2014.
 */
@Component
public class SampleBean {

    @ProfileExecution
    public void sampleMethod(){}
}


