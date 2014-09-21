package info.bluefloyd.tracer.test;

import org.junit.Test;

/**
 * Created by laci on 9/18/2014.
 */
public class CallTracePrintTest {

    private final SampleClass1 a = new SampleClass1();

    @Test
    public void testCallTraceComposing() {
       a.doSample1();
    }
}
