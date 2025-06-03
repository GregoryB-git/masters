/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ThreadFactory
 */
package w2;

import F2.a;
import L2.e;
import V2.j;
import V2.k;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import w2.p;
import w2.q;
import w2.s;
import w2.t;
import w2.v;

public final class w {
    public static w e;
    public final Context a;
    public final ScheduledExecutorService b;
    public q c;
    public int d;

    public w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.c = new q(this, null);
        this.d = 1;
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static w b(Context object) {
        synchronized (w.class) {
            try {
                if (e != null) return e;
                e.a();
                e = new w((Context)object, Executors.unconfigurableScheduledExecutorService((ScheduledExecutorService)Executors.newScheduledThreadPool((int)1, (ThreadFactory)new a("MessengerIpcClient"))));
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final j c(int n8, Bundle bundle) {
        return this.g(new s(this.f(), 2, bundle));
    }

    public final j d(int n8, Bundle bundle) {
        return this.g(new v(this.f(), 1, bundle));
    }

    public final int f() {
        synchronized (this) {
            int n8 = this.d;
            this.d = n8 + 1;
            return n8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final j g(t object) {
        synchronized (this) {
            try {
                Object object2;
                if (Log.isLoggable((String)"MessengerIpcClient", (int)3)) {
                    object2 = String.valueOf((Object)object);
                    StringBuilder stringBuilder = new StringBuilder(object2.length() + 9);
                    stringBuilder.append("Queueing ");
                    stringBuilder.append((String)object2);
                    Log.d((String)"MessengerIpcClient", (String)stringBuilder.toString());
                }
                if (this.c.g((t)object)) return object.b.a();
                this.c = object2 = new q(this, null);
                object2.g((t)object);
                return object.b.a();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

