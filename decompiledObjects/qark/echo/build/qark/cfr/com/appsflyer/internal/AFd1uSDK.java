/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Thread
 *  java.util.TimerTask
 */
package com.appsflyer.internal;

import java.util.TimerTask;

public final class AFd1uSDK
extends TimerTask {
    private final Thread AFInAppEventType;

    public AFd1uSDK(Thread thread) {
        this.AFInAppEventType = thread;
    }

    public final void run() {
        this.AFInAppEventType.interrupt();
    }
}

