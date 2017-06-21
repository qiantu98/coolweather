package com.coolweather.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

/**
 * Created by KaifengB1 on 2017/6/20.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
