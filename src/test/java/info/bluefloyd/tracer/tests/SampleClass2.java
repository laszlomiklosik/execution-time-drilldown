package info.bluefloyd.tracer.tests;

/**
 * Created by laci on 9/18/2014.
 */
public class SampleClass2 {
    private final SampleClass3 c = new SampleClass3();

    public void do2() {
        System.out.println("Started 'do2()'");
        c.do3();
        System.out.println("Finished 'do2()'");
    }

}
