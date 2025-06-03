/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.IllegalThreadStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.concurrent.ArrayBlockingQueue
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package com.google.firebase.analytics;

import A2.n;
import R2.m4;
import V2.j;
import V2.m;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.J0;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s4.h;
import v3.c;
import v3.d;

public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics c;
    public final J0 a;
    public ExecutorService b;

    public FirebaseAnalytics(J0 j02) {
        n.i(j02);
        this.a = j02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Keep
    @NonNull
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (c != null) return c;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (c != null) return c;
                c = new FirebaseAnalytics(J0.e(context));
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Keep
    public static m4 getScionFrontendApiImplementation(Context object, Bundle bundle) {
        if ((object = J0.f((Context)object, null, null, null, bundle)) == null) {
            return null;
        }
        return new c((J0)object);
    }

    public final j a() {
        try {
            j j8 = m.c((Executor)this.l(), new v3.a(this));
            return j8;
        }
        catch (RuntimeException runtimeException) {
            this.a.i(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return m.d((Exception)runtimeException);
        }
    }

    public final j b() {
        try {
            j j8 = m.c((Executor)this.l(), new d(this));
            return j8;
        }
        catch (RuntimeException runtimeException) {
            this.a.i(5, "Failed to schedule task for getSessionId", null, null, null);
            return m.d((Exception)runtimeException);
        }
    }

    public final void c(String string2, Bundle bundle) {
        this.a.t(string2, bundle);
    }

    public final void d() {
        this.a.R();
    }

    public final void e(boolean bl) {
        this.a.r(bl);
    }

    public final void f(Map object) {
        int n8;
        Bundle bundle = new Bundle();
        a a8 = (a)((Object)object.get((Object)b.o));
        if (a8 != null) {
            n8 = a8.ordinal();
            if (n8 != 0) {
                if (n8 == 1) {
                    bundle.putString("ad_storage", "denied");
                }
            } else {
                bundle.putString("ad_storage", "granted");
            }
        }
        if ((a8 = (a)((Object)object.get((Object)b.p))) != null) {
            n8 = a8.ordinal();
            if (n8 != 0) {
                if (n8 == 1) {
                    bundle.putString("analytics_storage", "denied");
                }
            } else {
                bundle.putString("analytics_storage", "granted");
            }
        }
        if ((a8 = (a)((Object)object.get((Object)b.q))) != null) {
            n8 = a8.ordinal();
            if (n8 != 0) {
                if (n8 == 1) {
                    bundle.putString("ad_user_data", "denied");
                }
            } else {
                bundle.putString("ad_user_data", "granted");
            }
        }
        if ((object = (a)((Object)object.get((Object)b.r))) != null) {
            n8 = object.ordinal();
            if (n8 != 0) {
                if (n8 == 1) {
                    bundle.putString("ad_personalization", "denied");
                }
            } else {
                bundle.putString("ad_personalization", "granted");
            }
        }
        this.a.G(bundle);
    }

    public final void g(Bundle bundle) {
        this.a.K(bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Keep
    @NonNull
    public final String getFirebaseInstanceId() {
        try {
            return (String)m.b(h.t().a(), 30000L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedException) {
            throw new IllegalStateException((Throwable)interruptedException);
        }
        catch (ExecutionException executionException) {
            throw new IllegalStateException(executionException.getCause());
        }
        catch (TimeoutException timeoutException) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public final void h(long l8) {
        this.a.j(l8);
    }

    public final void i(String string2) {
        this.a.L(string2);
    }

    public final void j(String string2, String string3) {
        this.a.C(string2, string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ExecutorService l() {
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.b != null) return this.b;
                this.b = new v3.b(this, 0, 1, 30L, TimeUnit.SECONDS, (BlockingQueue)new ArrayBlockingQueue(100));
                return this.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Deprecated
    @Keep
    public final void setCurrentScreen(@NonNull Activity activity, String string2, String string3) {
        this.a.l(activity, string2, string3);
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a o;
        public static final /* enum */ a p;
        public static final /* synthetic */ a[] q;

        static {
            a a8;
            a a9;
            o = a8 = new a();
            p = a9 = new a();
            q = new a[]{a8, a9};
        }

        @NonNull
        public static a valueOf(@NonNull String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        @NonNull
        public static a[] values() {
            return (a[])q.clone();
        }
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o;
        public static final /* enum */ b p;
        public static final /* enum */ b q;
        public static final /* enum */ b r;
        public static final /* synthetic */ b[] s;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            o = b9 = new b();
            p = b8 = new b();
            q = b11 = new b();
            r = b10 = new b();
            s = new b[]{b9, b8, b11, b10};
        }

        @NonNull
        public static b valueOf(@NonNull String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        @NonNull
        public static b[] values() {
            return (b[])s.clone();
        }
    }

}

