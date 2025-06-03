/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.onesignal;

import androidx.annotation.NonNull;
import com.onesignal.OSLogger;
import com.onesignal.OneSignal;

class OSLogWrapper
implements OSLogger {
    @Override
    public void debug(@NonNull String string2) {
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, string2);
    }

    @Override
    public void error(@NonNull String string2) {
        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, string2);
    }

    @Override
    public void error(@NonNull String string2, @NonNull Throwable throwable) {
        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, string2, throwable);
    }

    @Override
    public void info(@NonNull String string2) {
        OneSignal.Log(OneSignal.LOG_LEVEL.INFO, string2);
    }

    @Override
    public void verbose(@NonNull String string2) {
        OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, string2);
    }

    @Override
    public void warning(@NonNull String string2) {
        OneSignal.Log(OneSignal.LOG_LEVEL.WARN, string2);
    }
}

