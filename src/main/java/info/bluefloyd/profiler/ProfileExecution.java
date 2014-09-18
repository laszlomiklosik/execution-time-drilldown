package info.bluefloyd.profiler;

import java.lang.annotation.*;

/**
 * Created by laci on 9/18/2014.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented
public @interface ProfileExecution {

}