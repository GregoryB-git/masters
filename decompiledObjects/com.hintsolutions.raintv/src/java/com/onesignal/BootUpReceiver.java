/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 */
package com.onesignal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.onesignal.OSNotificationRestoreWorkManager;

public class BootUpReceiver
extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        OSNotificationRestoreWorkManager.beginEnqueueingWork(context, true);
    }
}

