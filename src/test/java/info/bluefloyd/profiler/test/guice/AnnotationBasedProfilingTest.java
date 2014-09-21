package info.bluefloyd.profiler.test.guice;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;


/**
 * Created by laci on 9/19/2014.
 */
public class AnnotationBasedProfilingTest {

    @Inject
    private SampleBean sampleBean;

    @Before
    public void setup() {

        Injector injector = Guice.createInjector(new GuiceModule());
        injector.injectMembers(this);
    }

    @Test
    public void testProfiling() throws Exception {
        for (int i = 0; i < 50; i++) {
            sampleBean.sampleMethod();
        }
    }
}
