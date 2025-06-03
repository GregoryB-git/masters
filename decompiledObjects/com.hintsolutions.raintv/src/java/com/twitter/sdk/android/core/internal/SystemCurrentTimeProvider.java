/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.System
 */
package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.internal.CurrentTimeProvider;

public class SystemCurrentTimeProvider
implements CurrentTimeProvider {
    @Override
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}

