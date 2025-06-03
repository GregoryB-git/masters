/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class b0 {
    @Nullable
    private final BroadcastReceiver a;
    private boolean b = false;

    public b0(@Nullable BroadcastReceiver broadcastReceiver) {
        this.a = broadcastReceiver;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public Intent a(@NonNull Context context, @NonNull IntentFilter intentFilter) {
        b0 b02 = this;
        synchronized (b02) {
            try {
                context = context.registerReceiver(this.a, intentFilter);
            }
            catch (Throwable throwable) {
                return null;
            }
            try {}
            catch (Throwable throwable) {
            }
            this.b = true;
            return context;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull Context context) {
        b0 b02 = this;
        synchronized (b02) {
            boolean bl = this.b;
            if (bl) {
                try {
                    context.unregisterReceiver(this.a);
                    this.b = false;
                }
                catch (Throwable throwable) {}
            }
            return;
        }
    }

    public static class a {
        @NonNull
        public b0 a(@Nullable BroadcastReceiver broadcastReceiver) {
            return new b0(broadcastReceiver);
        }
    }
}

