/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.onesignal.OneSignal;

class OSTimeoutHandler
extends HandlerThread {
    private static final Object SYNC_LOCK;
    private static final String TAG;
    private static OSTimeoutHandler timeoutHandler;
    private final Handler mHandler;

    static {
        TAG = OSTimeoutHandler.class.getCanonicalName();
        SYNC_LOCK = new Object();
    }

    private OSTimeoutHandler() {
        super(TAG);
        this.start();
        this.mHandler = new Handler(this.getLooper());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OSTimeoutHandler getTimeoutHandler() {
        Object object;
        if (timeoutHandler != null) return timeoutHandler;
        Object object2 = object = SYNC_LOCK;
        synchronized (object2) {
            OSTimeoutHandler oSTimeoutHandler;
            if (timeoutHandler != null) return timeoutHandler;
            timeoutHandler = oSTimeoutHandler = new OSTimeoutHandler();
            return timeoutHandler;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void destroyTimeout(Runnable runnable) {
        Object object;
        Object object2 = object = SYNC_LOCK;
        synchronized (object2) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Running destroyTimeout with runnable: ");
            stringBuilder.append(runnable.toString());
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            this.mHandler.removeCallbacks(runnable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void startTimeout(long l, @NonNull Runnable runnable) {
        Object object;
        Object object2 = object = SYNC_LOCK;
        synchronized (object2) {
            this.destroyTimeout(runnable);
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Running startTimeout with timeout: ");
            stringBuilder.append(l);
            stringBuilder.append(" and runnable: ");
            stringBuilder.append(runnable.toString());
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            this.mHandler.postDelayed(runnable, l);
            return;
        }
    }
}

