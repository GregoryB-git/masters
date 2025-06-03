/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.J0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class U0
implements ThreadFactory {
    public ThreadFactory a = Executors.defaultThreadFactory();

    public U0(J0 j02) {
    }

    public final Thread newThread(Runnable runnable) {
        runnable = this.a.newThread(runnable);
        runnable.setName("ScionFrontendApi");
        return runnable;
    }
}

