package info.bluefloyd.tracer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by laci on 9/18/2014.
 */
public class CallTraceComposer {


    public void getCallStack() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        List<CallTraceElement> callTraceElements = new ArrayList<CallTraceElement>();
        for(StackTraceElement stackTraceElement : stackTraceElements){
            String calledClassName = stackTraceElement.getClassName();
            String calledMethodName = stackTraceElement.getMethodName();
            if (!isIgnoredMethod(calledClassName, calledMethodName)) {
                // TODO: pass in method duration instead of current time millis when the interceptor is in place
                CallTraceElement callTraceElement = new CallTraceElement(calledClassName, calledMethodName, System.currentTimeMillis());
                callTraceElements.add(callTraceElement);
            }
        }
        System.out.println(callTraceElements);
    }

    private boolean isIgnoredMethod(String className, String methodName) {
        Set<String> ignoredNames = new HashSet<String>();
        ignoredNames.add(CallTraceComposer.class.getName());
        if (ignoredNames.contains(className)) {
            return true;
        } else {
            return (Thread.class.getName().equals(className) && "getStackTrace".equals(methodName));
        }
    }
}
