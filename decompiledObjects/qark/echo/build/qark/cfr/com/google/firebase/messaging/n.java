/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.util.Base64
 *  android.util.Log
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 */
package com.google.firebase.messaging;

import V2.b;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.Y;
import com.google.firebase.messaging.j;
import com.google.firebase.messaging.j0;
import com.google.firebase.messaging.k;
import com.google.firebase.messaging.l;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.o0;
import java.util.concurrent.Executor;

public class n {
    public static final Object c = new Object();
    public static o0 d;
    public final Context a;
    public final Executor b;

    public n(Context context) {
        this.a = context;
        this.b = new r1.m();
    }

    public static /* synthetic */ V2.j a(Context context, Intent intent, boolean bl, V2.j j8) {
        return n.j(context, intent, bl, j8);
    }

    public static /* synthetic */ Integer b(Context context, Intent intent) {
        return n.h(context, intent);
    }

    public static /* synthetic */ Integer c(V2.j j8) {
        return n.g(j8);
    }

    public static /* synthetic */ Integer d(V2.j j8) {
        return n.i(j8);
    }

    public static V2.j e(Context context, Intent intent, boolean bl) {
        if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
            Log.d((String)"FirebaseMessaging", (String)"Binding to service");
        }
        o0 o02 = n.f(context, "com.google.firebase.MESSAGING_EVENT");
        if (bl) {
            if (Y.b().e(context)) {
                j0.f(context, o02, intent);
            } else {
                o02.c(intent);
            }
            return V2.m.e(-1);
        }
        return o02.c(intent).g(new r1.m(), new m());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static o0 f(Context object, String string2) {
        Object object2 = c;
        synchronized (object2) {
            try {
                if (d != null) return d;
                d = new o0((Context)object, string2);
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* synthetic */ Integer g(V2.j j8) {
        return -1;
    }

    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Y.b().g(context, intent);
    }

    public static /* synthetic */ Integer i(V2.j j8) {
        return 403;
    }

    public static /* synthetic */ V2.j j(Context context, Intent intent, boolean bl, V2.j j8) {
        if (E2.l.h()) {
            if ((Integer)j8.j() != 402) {
                return j8;
            }
            return n.e(context, intent, bl).g(new r1.m(), new l());
        }
        return j8;
    }

    public V2.j k(Intent intent) {
        String string2 = intent.getStringExtra("gcm.rawData64");
        if (string2 != null) {
            intent.putExtra("rawData", Base64.decode((String)string2, (int)0));
            intent.removeExtra("gcm.rawData64");
        }
        return this.l(this.a, intent);
    }

    public V2.j l(Context context, Intent intent) {
        boolean bl = E2.l.h();
        boolean bl2 = false;
        boolean bl3 = bl && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            bl2 = true;
        }
        if (bl3 && !bl2) {
            return n.e(context, intent, bl2);
        }
        return V2.m.c(this.b, new j(context, intent)).h(this.b, new k(context, intent, bl2));
    }
}

