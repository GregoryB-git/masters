/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.concurrent.Executor
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.a0;
import com.google.firebase.messaging.d0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public final class e0 {
    public static WeakReference d;
    public final SharedPreferences a;
    public a0 b;
    public final Executor c;

    public e0(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e0 b(Context context, Executor executor) {
        synchronized (e0.class) {
            Throwable throwable2;
            Object object;
            block3 : {
                try {
                    Object object2 = d;
                    object2 = object2 != null ? (e0)object2.get() : null;
                    object = object2;
                    if (object2 != null) break block3;
                    object = new e0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    object.d();
                    d = new WeakReference(object);
                }
                catch (Throwable throwable2) {}
            }
            return object;
            throw throwable2;
        }
    }

    public boolean a(d0 d02) {
        synchronized (this) {
            boolean bl = this.b.b(d02.e());
            return bl;
        }
    }

    public d0 c() {
        synchronized (this) {
            d0 d02 = d0.a(this.b.f());
            return d02;
        }
    }

    public final void d() {
        synchronized (this) {
            this.b = a0.d(this.a, "topic_operation_queue", ",", this.c);
            return;
        }
    }

    public boolean e(d0 d02) {
        synchronized (this) {
            boolean bl = this.b.g(d02.e());
            return bl;
        }
    }
}

