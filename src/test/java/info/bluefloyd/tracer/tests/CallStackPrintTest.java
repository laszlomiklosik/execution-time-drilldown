package info.bluefloyd.tracer.tests;

import org.junit.Test;

/**
 * Created by laci on 9/18/2014.
 */
public class CallStackPrintTest {

    private final SampleClass1 a = new SampleClass1();

    @Test
    public void testCallStackComposing() {
       a.do1();
    }
}
