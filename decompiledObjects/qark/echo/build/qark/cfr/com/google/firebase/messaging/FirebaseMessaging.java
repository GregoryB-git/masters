/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 */
package com.google.firebase.messaging;

import V2.g;
import V2.i;
import V2.j;
import V2.k;
import V2.m;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.A;
import com.google.firebase.messaging.B;
import com.google.firebase.messaging.C;
import com.google.firebase.messaging.F;
import com.google.firebase.messaging.J;
import com.google.firebase.messaging.K;
import com.google.firebase.messaging.Q;
import com.google.firebase.messaging.T;
import com.google.firebase.messaging.W;
import com.google.firebase.messaging.b0;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.g0;
import com.google.firebase.messaging.n;
import com.google.firebase.messaging.o;
import com.google.firebase.messaging.q;
import com.google.firebase.messaging.r;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.u;
import com.google.firebase.messaging.v;
import com.google.firebase.messaging.w;
import com.google.firebase.messaging.x;
import com.google.firebase.messaging.y;
import com.google.firebase.messaging.z;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import n4.d;
import q4.a;
import s3.b;
import s3.e;

public class FirebaseMessaging {
    public static final long o = TimeUnit.HOURS.toSeconds(8L);
    public static b0 p;
    public static c2.g q;
    public static ScheduledExecutorService r;
    public final e a;
    public final q4.a b;
    public final s4.i c;
    public final Context d;
    public final F e;
    public final W f;
    public final a g;
    public final Executor h;
    public final Executor i;
    public final Executor j;
    public final j k;
    public final K l;
    public boolean m = false;
    public final Application.ActivityLifecycleCallbacks n;

    public FirebaseMessaging(e e8, q4.a a8, r4.b b8, r4.b b9, s4.i i8, c2.g g8, d d8) {
        this(e8, a8, b8, b9, i8, g8, d8, new K(e8.m()));
    }

    public FirebaseMessaging(e e8, q4.a a8, r4.b b8, r4.b b9, s4.i i8, c2.g g8, d d8, K k8) {
        this(e8, a8, i8, g8, d8, k8, new F(e8, k8, b8, b9, i8), (Executor)o.f(), (Executor)o.c(), o.b());
    }

    public FirebaseMessaging(e object, q4.a a8, s4.i i8, c2.g object2, d d8, K k8, F f8, Executor executor, Executor executor2, Executor executor3) {
        q = object2;
        this.a = object;
        this.b = a8;
        this.c = i8;
        this.g = new a(d8);
        i8 = object.m();
        this.d = i8;
        this.n = object2 = new q();
        this.l = k8;
        this.i = executor;
        this.e = f8;
        this.f = new W(executor);
        this.h = executor2;
        this.j = executor3;
        object = object.m();
        if (object instanceof Application) {
            ((Application)object).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object2);
        } else {
            object2 = new StringBuilder();
            object2.append("Context ");
            object2.append(object);
            object2.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w((String)"FirebaseMessaging", (String)object2.toString());
        }
        if (a8 != null) {
            a8.d(new r(this));
        }
        executor2.execute((Runnable)new t(this));
        this.k = object = g0.f(this, k8, f8, (Context)i8, o.g());
        object.e(executor2, new u(this));
        executor2.execute((Runnable)new v(this));
    }

    public static /* synthetic */ void a(FirebaseMessaging firebaseMessaging, k k8) {
        firebaseMessaging.E(k8);
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.I();
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, k k8) {
        firebaseMessaging.C(k8);
    }

    public static /* synthetic */ void d(FirebaseMessaging firebaseMessaging, k k8) {
        firebaseMessaging.D(k8);
    }

    public static /* synthetic */ void e(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.G();
    }

    public static /* synthetic */ j f(FirebaseMessaging firebaseMessaging, String string2, b0.a a8, String string3) {
        return firebaseMessaging.B(string2, a8, string3);
    }

    public static /* synthetic */ j g(FirebaseMessaging firebaseMessaging, String string2, b0.a a8) {
        return firebaseMessaging.A(string2, a8);
    }

    @Keep
    @NonNull
    public static FirebaseMessaging getInstance(@NonNull e object) {
        synchronized (FirebaseMessaging.class) {
            object = (FirebaseMessaging)object.k(FirebaseMessaging.class);
            A2.n.j(object, "Firebase Messaging component is not present");
            return object;
        }
    }

    public static /* synthetic */ j h(String string2, g0 g02) {
        return g02.u(string2);
    }

    public static /* synthetic */ j i(String string2, g0 g02) {
        return g02.r(string2);
    }

    public static /* synthetic */ void j(FirebaseMessaging firebaseMessaging, String string2) {
        firebaseMessaging.F(string2);
    }

    public static /* synthetic */ void k(FirebaseMessaging firebaseMessaging, g0 g02) {
        firebaseMessaging.H(g02);
    }

    public static FirebaseMessaging r() {
        synchronized (FirebaseMessaging.class) {
            FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance(e.o());
            return firebaseMessaging;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b0 s(Context object) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (p != null) return p;
                p = new b0((Context)object);
                return p;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static c2.g w() {
        return q;
    }

    public final /* synthetic */ j A(String string2, b0.a a8) {
        return this.e.f().p(this.j, new s(this, string2, a8));
    }

    public final /* synthetic */ j B(String string2, b0.a a8, String string3) {
        FirebaseMessaging.s(this.d).g(this.t(), string2, string3, this.l.a());
        if (a8 == null || !string3.equals((Object)a8.a)) {
            this.x(string3);
        }
        return m.e(string3);
    }

    public final /* synthetic */ void C(k k8) {
        try {
            this.b.c(K.c(this.a), "FCM");
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void D(k k8) {
        try {
            m.a(this.e.c());
            FirebaseMessaging.s(this.d).d(this.t(), K.c(this.a));
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void E(k k8) {
        try {
            k8.c(this.n());
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void F(String string2) {
        this.x(string2);
    }

    public final /* synthetic */ void G() {
        if (this.y()) {
            this.Q();
        }
    }

    public final /* synthetic */ void H(g0 g02) {
        if (this.y()) {
            g02.q();
        }
    }

    public final /* synthetic */ void I() {
        Q.c(this.d);
    }

    public void L(T t8) {
        if (!TextUtils.isEmpty((CharSequence)t8.U())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", (Parcelable)PendingIntent.getBroadcast((Context)this.d, (int)0, (Intent)intent2, (int)67108864));
            intent.setPackage("com.google.android.gms");
            t8.W(intent);
            this.d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void M(boolean bl) {
        this.g.f(bl);
    }

    public void N(boolean bl) {
        J.y(bl);
    }

    public void O(boolean bl) {
        synchronized (this) {
            this.m = bl;
            return;
        }
    }

    public final void P() {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                block3 : {
                    try {
                        if (this.m) break block3;
                        this.S(0L);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void Q() {
        q4.a a8 = this.b;
        if (a8 != null) {
            a8.a();
            return;
        }
        if (this.T(this.v())) {
            this.P();
        }
    }

    public j R(String string2) {
        return this.k.o(new x(string2));
    }

    public void S(long l8) {
        synchronized (this) {
            this.p(new c0(this, Math.min((long)Math.max((long)30L, (long)(2L * l8)), (long)o)), l8);
            this.m = true;
            return;
        }
    }

    public boolean T(b0.a a8) {
        if (a8 != null && !a8.b(this.l.a())) {
            return false;
        }
        return true;
    }

    public j U(String string2) {
        return this.k.o(new z(string2));
    }

    public String n() {
        void var1_7;
        Object object = this.b;
        if (object != null) {
            void var1_4;
            try {
                object = (String)m.a(object.b());
                return object;
            }
            catch (InterruptedException interruptedException) {
            }
            catch (ExecutionException executionException) {
                // empty catch block
            }
            throw new IOException((Throwable)var1_4);
        }
        object = this.v();
        if (!this.T((b0.a)object)) {
            return object.a;
        }
        String string2 = K.c(this.a);
        object = this.f.b(string2, new w(this, string2, (b0.a)object));
        try {
            object = (String)m.a((j)object);
            return object;
        }
        catch (InterruptedException interruptedException) {
        }
        catch (ExecutionException executionException) {
            // empty catch block
        }
        throw new IOException((Throwable)var1_7);
    }

    public j o() {
        if (this.b != null) {
            k k8 = new k();
            this.h.execute((Runnable)new A(this, k8));
            return k8.a();
        }
        if (this.v() == null) {
            return m.e(null);
        }
        k k9 = new k();
        o.e().execute((Runnable)new B(this, k9));
        return k9.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void p(Runnable runnable, long l8) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (r == null) {
                    r = new ScheduledThreadPoolExecutor(1, (ThreadFactory)new F2.a("TAG"));
                }
                r.schedule(runnable, l8, TimeUnit.SECONDS);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Context q() {
        return this.d;
    }

    public final String t() {
        if ("[DEFAULT]".equals((Object)this.a.q())) {
            return "";
        }
        return this.a.s();
    }

    public j u() {
        Object object = this.b;
        if (object != null) {
            return object.b();
        }
        object = new k();
        this.h.execute((Runnable)new y(this, (k)object));
        return object.a();
    }

    public b0.a v() {
        return FirebaseMessaging.s(this.d).e(this.t(), K.c(this.a));
    }

    public final void x(String string2) {
        if ("[DEFAULT]".equals((Object)this.a.q())) {
            StringBuilder stringBuilder;
            if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invoking onNewToken for app: ");
                stringBuilder.append(this.a.q());
                Log.d((String)"FirebaseMessaging", (String)stringBuilder.toString());
            }
            stringBuilder = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            stringBuilder.putExtra("token", string2);
            new n(this.d).k((Intent)stringBuilder);
        }
    }

    public boolean y() {
        return this.g.c();
    }

    public boolean z() {
        return this.l.g();
    }

    public class a {
        public final d a;
        public boolean b;
        public n4.b c;
        public Boolean d;

        public a(d d8) {
            this.a = d8;
        }

        public static /* synthetic */ void a(a a8, n4.a a9) {
            a8.d(a9);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void b() {
            synchronized (this) {
                Throwable throwable2;
                block5 : {
                    try {
                        boolean bl = this.b;
                        if (!bl) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return;
                }
                Object object = this.e();
                this.d = object;
                if (object == null) {
                    this.c = object = new C(this);
                    this.a.c(b.class, (n4.b)object);
                }
                this.b = true;
                return;
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean c() {
            synchronized (this) {
                try {
                    this.b();
                    Boolean bl = this.d;
                    if (bl == null) return FirebaseMessaging.this.a.x();
                    return bl;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public final /* synthetic */ void d(n4.a a8) {
            if (this.c()) {
                FirebaseMessaging.this.Q();
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final Boolean e() {
            block7 : {
                Context context = FirebaseMessaging.this.a.m();
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                if (sharedPreferences.contains("auto_init")) {
                    return sharedPreferences.getBoolean("auto_init", false);
                }
                try {
                    sharedPreferences = context.getPackageManager();
                    if (sharedPreferences == null) break block7;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    return null;
                }
                context = sharedPreferences.getApplicationInfo(context.getPackageName(), 128);
                if (context == null) break block7;
                sharedPreferences = context.metaData;
                if (sharedPreferences == null) break block7;
                if (!sharedPreferences.containsKey("firebase_messaging_auto_init_enabled")) break block7;
                boolean bl = context.metaData.getBoolean("firebase_messaging_auto_init_enabled");
                return bl;
            }
            do {
                return null;
                break;
            } while (true);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void f(boolean bl) {
            synchronized (this) {
                try {
                    this.b();
                    n4.b b8 = this.c;
                    if (b8 != null) {
                        this.a.d(b.class, b8);
                        this.c = null;
                    }
                    b8 = FirebaseMessaging.this.a.m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                    b8.putBoolean("auto_init", bl);
                    b8.apply();
                    if (bl) {
                        FirebaseMessaging.this.Q();
                    }
                    this.d = bl;
                    return;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
    }

}

