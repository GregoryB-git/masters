/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Map
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package com.google.firebase.messaging;

import V2.j;
import V2.k;
import V2.m;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.F;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.K;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.f0;
import com.google.firebase.messaging.h0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t.a;

public class g0 {
    public static final long i = TimeUnit.HOURS.toSeconds(8L);
    public final Context a;
    public final K b;
    public final F c;
    public final FirebaseMessaging d;
    public final Map e = new a();
    public final ScheduledExecutorService f;
    public boolean g = false;
    public final e0 h;

    public g0(FirebaseMessaging firebaseMessaging, K k8, e0 e02, F f8, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = firebaseMessaging;
        this.b = k8;
        this.h = e02;
        this.c = f8;
        this.a = context;
        this.f = scheduledExecutorService;
    }

    public static /* synthetic */ g0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, K k8, F f8) {
        return g0.j(context, scheduledExecutorService, firebaseMessaging, k8, f8);
    }

    public static void c(j j8) {
        ExecutionException executionException2;
        block6 : {
            void var0_4;
            try {
                m.b(j8, 30L, TimeUnit.SECONDS);
                return;
            }
            catch (TimeoutException timeoutException) {
            }
            catch (InterruptedException interruptedException) {
            }
            catch (ExecutionException executionException2) {
                break block6;
            }
            throw new IOException("SERVICE_NOT_AVAILABLE", (Throwable)var0_4);
        }
        Throwable throwable = executionException2.getCause();
        if (!(throwable instanceof IOException)) {
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException)throwable;
            }
            throw new IOException((Throwable)executionException2);
        }
        throw (IOException)throwable;
    }

    public static j f(FirebaseMessaging firebaseMessaging, K k8, F f8, Context context, ScheduledExecutorService scheduledExecutorService) {
        return m.c((Executor)scheduledExecutorService, new f0(context, scheduledExecutorService, firebaseMessaging, k8, f8));
    }

    public static boolean h() {
        if (!(Log.isLoggable((String)"FirebaseMessaging", (int)3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable((String)"FirebaseMessaging", (int)3))) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ g0 j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, K k8, F f8) {
        return new g0(firebaseMessaging, k8, e0.b(context, (Executor)scheduledExecutorService), f8, context, scheduledExecutorService);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(d0 d02, k k8) {
        Map map = this.e;
        synchronized (map) {
            try {
                String string2 = d02.e();
                if (this.e.containsKey((Object)string2)) {
                    d02 = (ArrayDeque)this.e.get((Object)string2);
                } else {
                    d02 = new ArrayDeque();
                    this.e.put((Object)string2, (Object)d02);
                }
                d02.add((Object)k8);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void d(String string2) {
        g0.c(this.c.l(this.d.n(), string2));
    }

    public final void e(String string2) {
        g0.c(this.c.m(this.d.n(), string2));
    }

    public boolean g() {
        if (this.h.c() != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        synchronized (this) {
            boolean bl = this.g;
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(d0 object) {
        Map map = this.e;
        synchronized (map) {
            try {
                object = object.e();
                if (!this.e.containsKey(object)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque)this.e.get(object);
                k k8 = (k)arrayDeque.poll();
                if (k8 != null) {
                    k8.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.e.remove(object);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean l(d0 var1_1) {
        try {
            block12 : {
                block11 : {
                    var4_2 = var1_1.b();
                    var2_4 = var4_2.hashCode();
                    if (var2_4 == 83) break block11;
                    if (var2_4 != 85 || !var4_2.equals((Object)"U")) ** GOTO lbl-1000
                    var2_4 = 1;
                    break block12;
                }
                var3_5 = var4_2.equals((Object)"S");
                if (var3_5) {
                    var2_4 = 0;
                } else lbl-1000: // 2 sources:
                {
                    var2_4 = -1;
                }
            }
            if (var2_4 != 0) {
                if (var2_4 != 1) {
                    if (g0.h() == false) return true;
                    var4_2 = new StringBuilder();
                    var4_2.append("Unknown topic operation");
                    var4_2.append(var1_1);
                    var4_2.append(".");
                    var1_1 = var4_2.toString();
                } else {
                    this.e(var1_1.c());
                    if (g0.h() == false) return true;
                    var4_2 = new StringBuilder();
                    var4_2.append("Unsubscribe from topic: ");
                    var4_2.append(var1_1.c());
                    var4_2.append(" succeeded.");
                    var1_1 = var4_2.toString();
                }
            } else {
                this.d(var1_1.c());
                if (g0.h() == false) return true;
                var4_2 = new StringBuilder();
                var4_2.append("Subscribe to topic: ");
                var4_2.append(var1_1.c());
                var4_2.append(" succeeded.");
                var1_1 = var4_2.toString();
            }
            Log.d((String)"FirebaseMessaging", (String)var1_1);
            return true;
        }
        catch (IOException var4_3) {}
        if (!"SERVICE_NOT_AVAILABLE".equals((Object)var4_3.getMessage()) && !"INTERNAL_SERVER_ERROR".equals((Object)var4_3.getMessage())) {
            if (var4_3.getMessage() != null) throw var4_3;
            var1_1 = "Topic operation failed without exception message. Will retry Topic operation.";
        } else {
            var1_1 = new StringBuilder();
            var1_1.append("Topic operation failed: ");
            var1_1.append(var4_3.getMessage());
            var1_1.append(". Will retry Topic operation.");
            var1_1 = var1_1.toString();
        }
        Log.e((String)"FirebaseMessaging", (String)var1_1);
        return false;
    }

    public void m(Runnable runnable, long l8) {
        this.f.schedule(runnable, l8, TimeUnit.SECONDS);
    }

    public j n(d0 d02) {
        this.h.a(d02);
        k k8 = new k();
        this.b(d02, k8);
        return k8.a();
    }

    public void o(boolean bl) {
        synchronized (this) {
            this.g = bl;
            return;
        }
    }

    public final void p() {
        if (!this.i()) {
            this.t(0L);
        }
    }

    public void q() {
        if (this.g()) {
            this.p();
        }
    }

    public j r(String object) {
        object = this.n(d0.f((String)object));
        this.q();
        return object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean s() {
        do lbl-1000: // 2 sources:
        {
            // MONITORENTER : this
            var1_1 = this.h.c();
            if (var1_1 == null) {
                if (g0.h()) {
                    Log.d((String)"FirebaseMessaging", (String)"topic sync succeeded");
                }
                // MONITOREXIT : this
                return true;
            }
            // MONITOREXIT : this
            break;
        } while (true);
        catch (Throwable var1_2) {
            throw var1_2;
        }
        {
            if (!this.l(var1_1)) {
                return false;
            }
            this.h.e(var1_1);
            this.k(var1_1);
            ** while (true)
        }
    }

    public void t(long l8) {
        long l9 = Math.min((long)Math.max((long)30L, (long)(2L * l8)), (long)i);
        this.m(new h0(this, this.a, this.b, l9), l8);
        this.o(true);
    }

    public j u(String object) {
        object = this.n(d0.g((String)object));
        this.q();
        return object;
    }
}

