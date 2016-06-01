package com.danxx.mdplayer.application;

import android.app.Application;
import android.content.Context;

import com.danxx.mdplayer.module.WasuCacheModule;

/**
 * Created by Danxx on 2016/5/30.
 */
public class App extends Application {
    private Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();

        mContext = getApplicationContext();
        //初始化缓存模块
        WasuCacheModule.getInstance().init(mContext);

    }

}