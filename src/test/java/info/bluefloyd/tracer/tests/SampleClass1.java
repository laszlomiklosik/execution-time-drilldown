package info.bluefloyd.tracer.tests;

/**
 * Created by laci on 9/18/2014.
 */
public class SampleClass1 {
    private final SampleClass2 b = new SampleClass2();

    public void do1() {
        System.out.println("Started 'do1()'");
        b.do2();
        System.out.println("Finished 'do1()'");
    }
}
