package info.bluefloyd.profiler.test.guice;

import info.bluefloyd.profiler.ProfileExecution;
import info.bluefloyd.tracer.test.SampleClass1;

/**
 * Created by laci on 9/19/2014.
 */
public class SampleBean {

    @ProfileExecution
    public void sampleMethod() {
        new SampleClass1().doSample1();
    }
}