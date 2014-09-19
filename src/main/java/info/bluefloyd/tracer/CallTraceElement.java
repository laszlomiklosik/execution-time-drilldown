package info.bluefloyd.tracer;

/**
 * Created by laci on 9/18/2014.
 */
public class CallTraceElement {
    private final String className;
    private final String methodName;
    private final long duration;
    // TODO: additional fields like e.g. effective method arguments, line number

    public CallTraceElement(String className, String methodName, long duration) {
        this.className = className;
        this.methodName = methodName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return className + "#" + methodName + ":" + duration;
    }

    public String getClassName() {
        return className;
    }

    public String getMethodName() {
        return methodName;
    }

    public long getDuration() {
        return duration;
    }
}
