package security.bercy.com.week6day3;

import android.util.Log;

/**
 * Created by Bercy on 1/10/18.
 */

public class ReleaseTree extends ThreadAwareDebugTree {
    @Override
    protected boolean isLoggable(String tag, int priority) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG || priority == Log.INFO) {
            return false;
        }
        return true;
    }
    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        if (!isLoggable(tag, priority)) {
            return;
        }
        super.log(priority, tag, message, t);
    }
}
