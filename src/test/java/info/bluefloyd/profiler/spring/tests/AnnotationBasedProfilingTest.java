package info.bluefloyd.profiler.spring.tests;

/**
 * Created by laci on 9/18/2014.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class AnnotationBasedProfilingTest {

    @Autowired
    private SampleBean sampleBean;

    @Test
    public void testProfiling() {
        sampleBean.sampleMethod();
    }

}