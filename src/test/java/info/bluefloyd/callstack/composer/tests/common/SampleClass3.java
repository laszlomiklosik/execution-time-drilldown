package info.bluefloyd.callstack.composer.tests.common;

import info.bluefloyd.tracer.CallTraceComposer;

/**
 * Created by laci on 9/18/2014.
 */
public class SampleClass3 {
    private final CallTraceComposer callStackComposer = new CallTraceComposer();

    public void do3() {
        System.out.println("Started 'do3()'");
        callStackComposer.getCallStack();
        System.out.println("Finished 'do3()'");
    }
}
