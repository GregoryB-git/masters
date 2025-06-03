/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.System
 */
package com.onesignal;

import android.os.SystemClock;
import com.onesignal.OSTime;

public class OSTimeImpl
implements OSTime {
    @Override
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override
    public long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}

