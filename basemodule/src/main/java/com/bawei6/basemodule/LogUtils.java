package com.bawei6.basemodule;

import android.util.Log;

public class LogUtils {
    private final static String TAG="AK47";
    public static void i(String log){
        Log.i(TAG,log);
    }
    public static void d(String log){
        Log.d(TAG,log);
    }
    public static void w(String log){
        Log.w(TAG,log);
    }
    public static void e(String log){
        Log.e(TAG,log);
    }
}
