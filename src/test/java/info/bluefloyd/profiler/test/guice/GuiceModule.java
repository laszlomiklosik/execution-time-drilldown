package info.bluefloyd.profiler.test.guice;

import static com.google.inject.matcher.Matchers.*;

import com.google.inject.matcher.Matchers;
import info.bluefloyd.profiler.ProfileExecution;
import info.bluefloyd.profiler.ProfilingMethodInterceptor;
import com.google.inject.AbstractModule;


/**
 * Created by laci on 9/19/2014.
 */
public class GuiceModule extends AbstractModule {

    public void configure() {

        bindInterceptor(
                subclassesOf(SampleBean.class),
                Matchers.annotatedWith(ProfileExecution.class),
                new ProfilingMethodInterceptor());
    }
}