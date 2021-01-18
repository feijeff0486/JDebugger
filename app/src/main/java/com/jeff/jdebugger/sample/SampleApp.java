package com.jeff.jdebugger.sample;

import android.app.Application;

import com.jeff.jdebugger.crashcatcher.CatcherConfig;
import com.jeff.jdebugger.crashcatcher.DefaultErrorDescActivity;

/**
 * @author Jeff
 * @date 1/18/21
 *
 * <a href="mailto:feijeff0486@gmail.com">Contact me</a>
 * <a href="https://github.com/feijeff0486">Follow me</a>
 */
public class SampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CatcherConfig.Builder
                .create()
                .backgroundMode(CatcherConfig.BackgroundMode.BACKGROUND_MODE_SHOW_CUSTOM)
                .errorActivity(DefaultErrorDescActivity.class)
                .enabled(true)
                .showRestartButton(true)
                .logErrorOnRestart(true)
                .trackActivities(true)
                .minTimeBetweenCrashesMs(3000)
                .restartActivity(MainActivity.class)
                .eventListener(new SampleEventListener())
                .apply();
    }
}
