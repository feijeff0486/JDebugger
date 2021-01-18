package com.jeff.debugger.sample;

import android.util.Log;

import com.jeff.debugger.crashcatcher.CustomActivityOnCrash;

/**
 * @author Jeff
 * @date 1/18/21
 *
 * <a href="mailto:feijeff0486@gmail.com">Contact me</a>
 * <a href="https://github.com/feijeff0486">Follow me</a>
 */
public class SampleEventListener implements CustomActivityOnCrash.EventListener {
    private static final String TAG = "SampleEventListener";
    @Override
    public void onLaunchErrorActivity() {
        Log.d(TAG, "onLaunchErrorActivity: ");
    }

    @Override
    public void onRestartAppFromErrorActivity() {
        Log.d(TAG, "onRestartAppFromErrorActivity: ");
    }

    @Override
    public void onCloseAppFromErrorActivity() {
        Log.d(TAG, "onCloseAppFromErrorActivity: ");
    }
}
