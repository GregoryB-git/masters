/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.TimeUnit
 */
package com.google.firebase.messaging;

import U2.a;
import V2.e;
import V2.j;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.i0;
import com.google.firebase.messaging.o0;
import java.util.concurrent.TimeUnit;

public abstract class j0 {
    public static final long a = TimeUnit.MINUTES.toMillis(1L);
    public static final Object b = new Object();
    public static a c;

    public static /* synthetic */ void a(Intent intent, j j8) {
        j0.c(intent);
    }

    public static void b(Context object) {
        if (c == null) {
            c = object = new a((Context)object, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            object.d(true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(Intent intent) {
        Object object = b;
        synchronized (object) {
            try {
                if (c != null && j0.d(intent)) {
                    j0.g(intent, false);
                    c.c();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(Context context, o0 o02, Intent intent) {
        Object object = b;
        synchronized (object) {
            try {
                j0.b(context);
                boolean bl = j0.d(intent);
                j0.g(intent, true);
                if (!bl) {
                    c.a(a);
                }
                o02.c(intent).b(new i0(intent));
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static void g(Intent intent, boolean bl) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", bl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ComponentName h(Context context, Intent intent) {
        Object object = b;
        synchronized (object) {
            try {
                j0.b(context);
                boolean bl = j0.d(intent);
                j0.g(intent, true);
                context = context.startService(intent);
                if (context == null) {
                    return null;
                }
                if (!bl) {
                    c.a(a);
                }
                return context;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

