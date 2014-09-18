package info.bluefloyd.callstack.composer.tests.spring;

import info.bluefloyd.profiler.ProfilingMethodInterceptor;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by laci on 9/18/2014.
 */
@Configuration
@ComponentScan("info.bluefloyd.callstack.composer.tests.spring")
public class SpringConfiguration {

    @Bean
    public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
        final DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        return defaultAdvisorAutoProxyCreator;
    }

    @Bean
    public ProfilingMethodInterceptor getProfilingMethodInterceptor() {
        return new ProfilingMethodInterceptor();
    }
}
