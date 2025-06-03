/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 *  androidx.annotation.Nullable
 *  com.onesignal.OSSyncService
 *  com.onesignal.OSSyncService$LegacySyncRunnable
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.onesignal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.onesignal.OSSyncService;

public class SyncService
extends Service {
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int n, int n2) {
        OSSyncService.getInstance().doBackgroundSync((Context)this, (Runnable)new OSSyncService.LegacySyncRunnable((Service)this));
        return 1;
    }
}

