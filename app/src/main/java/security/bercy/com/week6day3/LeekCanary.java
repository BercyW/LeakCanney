package security.bercy.com.week6day3;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Bercy on 1/10/18.
 */

public class LeekCanary extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
