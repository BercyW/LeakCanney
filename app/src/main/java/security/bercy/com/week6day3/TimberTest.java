package security.bercy.com.week6day3;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by Bercy on 1/10/18.
 */

public class TimberTest extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Timber.plant(new ThreadAwareDebugTree());
        } else {
            Timber.plant(new ReleaseTree());
        }
    }
}
