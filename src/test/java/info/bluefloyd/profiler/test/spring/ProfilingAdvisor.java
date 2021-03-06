package info.bluefloyd.profiler.test.spring;

import info.bluefloyd.profiler.ProfileExecution;
import info.bluefloyd.profiler.ProfilingMethodInterceptor;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by laci on 9/18/2014.
 */
@Component
public class ProfilingAdvisor extends AbstractPointcutAdvisor {

    private static final long serialVersionUID = 1L;

    private final StaticMethodMatcherPointcut pointcut = new StaticMethodMatcherPointcut() {
        @Override
        public boolean matches(Method method, Class<?> targetClass) {
            return method.isAnnotationPresent(ProfileExecution.class);
        }
    };

    @Autowired
    private ProfilingMethodInterceptor interceptor;

    @Override
    public Pointcut getPointcut() {
        return this.pointcut;
    }

    @Override
    public Advice getAdvice() {
        return this.interceptor;
    }
}