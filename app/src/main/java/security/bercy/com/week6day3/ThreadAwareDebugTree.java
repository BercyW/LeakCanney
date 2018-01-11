package security.bercy.com.week6day3;

import timber.log.Timber;

/**
 * Created by Bercy on 1/10/18.
 */

public class ThreadAwareDebugTree extends Timber.DebugTree {
    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        if (tag != null) {
            String threadName = Thread.currentThread().getName();
            tag = "<" + threadName + "> " + tag;
        }
        super.log(priority, tag, message, t);
    }
    @Override
    protected String createStackElementTag(StackTraceElement element) {
        return super.createStackElementTag(element) + "(Line " + element.getLineNumber() + ")";  //日志显示行号
    }

}
