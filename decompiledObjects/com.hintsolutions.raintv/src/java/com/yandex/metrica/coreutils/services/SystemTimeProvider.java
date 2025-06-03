/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.System
 */
package com.yandex.metrica.coreutils.services;

import android.os.SystemClock;
import com.yandex.metrica.coreutils.services.TimeProvider;

public class SystemTimeProvider
implements TimeProvider {
    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override
    public long currentTimeSeconds() {
        return System.currentTimeMillis() / 1000L;
    }

    @Override
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public long systemNanoTime() {
        return System.nanoTime();
    }
}

