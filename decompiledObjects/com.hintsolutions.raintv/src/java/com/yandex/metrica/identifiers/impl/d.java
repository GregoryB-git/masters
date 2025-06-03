/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class d
implements ServiceConnection {
    @NonNull
    private final Intent a;
    @Nullable
    private IBinder b;
    private final Object c = new Object();

    public d(@NonNull Intent intent, @NonNull String string2) {
        this.a = intent;
        String.format((String)"[AdServiceConnection-%s]", (Object[])new Object[]{string2});
    }

    @NonNull
    public Intent a() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IBinder a(long l2) {
        if (this.b == null) {
            Object object;
            Object object2 = object = this.c;
            synchronized (object2) {
                IBinder iBinder = this.b;
                if (iBinder == null) {
                    try {
                        this.c.wait(l2);
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
        }
        return this.b;
    }

    public boolean a(@NonNull Context context) {
        return context.bindService(this.a, (ServiceConnection)this, 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(@NonNull Context context) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            this.b = null;
            this.c.notifyAll();
        }
        context.unbindService((ServiceConnection)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onBindingDied(ComponentName componentName) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            this.b = null;
            this.c.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onNullBinding(ComponentName componentName) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            this.c.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onServiceConnected(ComponentName object, IBinder iBinder) {
        Object object2 = object = this.c;
        synchronized (object2) {
            this.b = iBinder;
            this.c.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onServiceDisconnected(ComponentName object) {
        Object object2 = object = this.c;
        synchronized (object2) {
            this.b = null;
            this.c.notifyAll();
            return;
        }
    }
}

