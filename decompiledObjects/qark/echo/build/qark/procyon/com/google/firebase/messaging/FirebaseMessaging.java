// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.os.BaseBundle;
import android.content.SharedPreferences$Editor;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.SharedPreferences;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.content.Intent;
import android.text.TextUtils;
import V2.m;
import androidx.annotation.Keep;
import A2.n;
import androidx.annotation.NonNull;
import V2.k;
import android.util.Log;
import android.app.Application;
import n4.d;
import r4.b;
import java.util.concurrent.TimeUnit;
import android.app.Application$ActivityLifecycleCallbacks;
import V2.j;
import java.util.concurrent.Executor;
import android.content.Context;
import s4.i;
import q4.a;
import s3.e;
import java.util.concurrent.ScheduledExecutorService;
import c2.g;

public class FirebaseMessaging
{
    public static final long o;
    public static b0 p;
    public static g q;
    public static ScheduledExecutorService r;
    public final e a;
    public final q4.a b;
    public final i c;
    public final Context d;
    public final F e;
    public final W f;
    public final a g;
    public final Executor h;
    public final Executor i;
    public final Executor j;
    public final j k;
    public final K l;
    public boolean m;
    public final Application$ActivityLifecycleCallbacks n;
    
    static {
        o = TimeUnit.HOURS.toSeconds(8L);
    }
    
    public FirebaseMessaging(final e e, final q4.a a, final b b, final b b2, final i i, final g g, final d d) {
        this(e, a, b, b2, i, g, d, new K(e.m()));
    }
    
    public FirebaseMessaging(final e e, final q4.a a, final b b, final b b2, final i i, final g g, final d d, final K k) {
        this(e, a, i, g, d, k, new F(e, k, b, b2, i), com.google.firebase.messaging.o.f(), com.google.firebase.messaging.o.c(), com.google.firebase.messaging.o.b());
    }
    
    public FirebaseMessaging(final e a, final q4.a b, final i c, final g q, final d d, final K l, final F e, final Executor i, final Executor h, final Executor j) {
        this.m = false;
        FirebaseMessaging.q = q;
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = new a(d);
        final Context m = a.m();
        this.d = m;
        final q n = new q();
        this.n = (Application$ActivityLifecycleCallbacks)n;
        this.l = l;
        this.i = i;
        this.e = e;
        this.f = new W(i);
        this.h = h;
        this.j = j;
        final Context k = a.m();
        if (k instanceof Application) {
            ((Application)k).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)n);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Context ");
            sb.append(k);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (b != null) {
            b.d((q4.a.a)new r(this));
        }
        h.execute(new t(this));
        (this.k = g0.f(this, l, e, m, com.google.firebase.messaging.o.g())).e(h, new u(this));
        h.execute(new v(this));
    }
    
    @Keep
    @NonNull
    public static FirebaseMessaging getInstance(@NonNull final e e) {
        synchronized (FirebaseMessaging.class) {
            final FirebaseMessaging firebaseMessaging = (FirebaseMessaging)e.k(FirebaseMessaging.class);
            n.j(firebaseMessaging, "Firebase Messaging component is not present");
            return firebaseMessaging;
        }
    }
    
    public static /* synthetic */ e l(final FirebaseMessaging firebaseMessaging) {
        return firebaseMessaging.a;
    }
    
    public static FirebaseMessaging r() {
        synchronized (FirebaseMessaging.class) {
            return getInstance(e.o());
        }
    }
    
    public static b0 s(final Context context) {
        // monitorenter(FirebaseMessaging.class)
        while (true) {
            try {
                if (FirebaseMessaging.p == null) {
                    FirebaseMessaging.p = new b0(context);
                }
                // monitorexit(FirebaseMessaging.class)
                return FirebaseMessaging.p;
                // monitorexit(FirebaseMessaging.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static g w() {
        return FirebaseMessaging.q;
    }
    
    public void L(final T t) {
        if (!TextUtils.isEmpty((CharSequence)t.U())) {
            final Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            final Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", (Parcelable)PendingIntent.getBroadcast(this.d, 0, intent2, 67108864));
            intent.setPackage("com.google.android.gms");
            t.W(intent);
            this.d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }
    
    public void M(final boolean b) {
        this.g.f(b);
    }
    
    public void N(final boolean b) {
        J.y(b);
    }
    
    public void O(final boolean m) {
        synchronized (this) {
            this.m = m;
        }
    }
    
    public final void P() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0024: {
            try {
                if (!this.m) {
                    this.S(0L);
                }
            }
            finally {
                break Label_0024;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public final void Q() {
        final q4.a b = this.b;
        if (b != null) {
            b.a();
            return;
        }
        if (this.T(this.v())) {
            this.P();
        }
    }
    
    public j R(final String s) {
        return this.k.o(new x(s));
    }
    
    public void S(final long n) {
        synchronized (this) {
            this.p(new c0(this, Math.min(Math.max(30L, 2L * n), FirebaseMessaging.o)), n);
            this.m = true;
        }
    }
    
    public boolean T(final b0.a a) {
        return a == null || a.b(this.l.a());
    }
    
    public j U(final String s) {
        return this.k.o(new z(s));
    }
    
    public String n() {
        Object b = this.b;
        if (b != null) {
            try {
                b = V2.m.a(((q4.a)b).b());
                return (String)b;
            }
            catch (InterruptedException b) {}
            catch (ExecutionException ex) {}
            throw new IOException((Throwable)b);
        }
        final b0.a v = this.v();
        if (!this.T(v)) {
            return v.a;
        }
        final String c = K.c(this.a);
        Object b2 = this.f.b(c, (W.a)new w(this, c, v));
        try {
            b2 = V2.m.a((j)b2);
            return (String)b2;
        }
        catch (InterruptedException b2) {}
        catch (ExecutionException ex2) {}
        throw new IOException((Throwable)b2);
    }
    
    public j o() {
        if (this.b != null) {
            final k k = new k();
            this.h.execute(new A(this, k));
            return k.a();
        }
        if (this.v() == null) {
            return V2.m.e(null);
        }
        final k i = new k();
        com.google.firebase.messaging.o.e().execute(new B(this, i));
        return i.a();
    }
    
    public void p(final Runnable runnable, final long n) {
        // monitorenter(FirebaseMessaging.class)
        while (true) {
            try {
                if (FirebaseMessaging.r == null) {
                    FirebaseMessaging.r = new ScheduledThreadPoolExecutor(1, new F2.a("TAG"));
                }
                FirebaseMessaging.r.schedule(runnable, n, TimeUnit.SECONDS);
                // monitorexit(FirebaseMessaging.class)
                return;
                // monitorexit(FirebaseMessaging.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public Context q() {
        return this.d;
    }
    
    public final String t() {
        if ("[DEFAULT]".equals(this.a.q())) {
            return "";
        }
        return this.a.s();
    }
    
    public j u() {
        final q4.a b = this.b;
        if (b != null) {
            return b.b();
        }
        final k k = new k();
        this.h.execute(new y(this, k));
        return k.a();
    }
    
    public b0.a v() {
        return s(this.d).e(this.t(), K.c(this.a));
    }
    
    public final void x(final String s) {
        if ("[DEFAULT]".equals(this.a.q())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invoking onNewToken for app: ");
                sb.append(this.a.q());
                Log.d("FirebaseMessaging", sb.toString());
            }
            final Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", s);
            new com.google.firebase.messaging.n(this.d).k(intent);
        }
    }
    
    public boolean y() {
        return this.g.c();
    }
    
    public boolean z() {
        return this.l.g();
    }
    
    public class a
    {
        public final d a;
        public boolean b;
        public n4.b c;
        public Boolean d;
        
        public a(final d a) {
            this.a = a;
        }
        
        public void b() {
            // monitorenter(this)
            while (true) {
                try {
                    if (this.b) {
                        // monitorexit(this)
                        return;
                    }
                    if ((this.d = this.e()) == null) {
                        final C c = new C(this);
                        this.c = c;
                        this.a.c(s3.b.class, c);
                    }
                    this.b = true;
                    // monitorexit(this)
                    return;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        public boolean c() {
            // monitorenter(this)
            while (true) {
                try {
                    this.b();
                    final Boolean d = this.d;
                    boolean b;
                    if (d != null) {
                        b = d;
                    }
                    else {
                        b = FirebaseMessaging.l(FirebaseMessaging.this).x();
                    }
                    // monitorexit(this)
                    return b;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        public final Boolean e() {
            final Context m = FirebaseMessaging.l(FirebaseMessaging.this).m();
            final SharedPreferences sharedPreferences = m.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return sharedPreferences.getBoolean("auto_init", false);
            }
            try {
                final PackageManager packageManager = m.getPackageManager();
                if (packageManager != null) {
                    final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(m.getPackageName(), 128);
                    if (applicationInfo != null) {
                        final Bundle metaData = applicationInfo.metaData;
                        if (metaData != null && ((BaseBundle)metaData).containsKey("firebase_messaging_auto_init_enabled")) {
                            return ((BaseBundle)applicationInfo.metaData).getBoolean("firebase_messaging_auto_init_enabled");
                        }
                    }
                }
                return null;
            }
            catch (PackageManager$NameNotFoundException ex) {
                return null;
            }
        }
        
        public void f(final boolean b) {
            // monitorenter(this)
            while (true) {
                try {
                    this.b();
                    final n4.b c = this.c;
                    if (c != null) {
                        this.a.d(s3.b.class, c);
                        this.c = null;
                    }
                    final SharedPreferences$Editor edit = FirebaseMessaging.l(FirebaseMessaging.this).m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                    edit.putBoolean("auto_init", b);
                    edit.apply();
                    if (b) {
                        FirebaseMessaging.this.Q();
                    }
                    this.d = b;
                    // monitorexit(this)
                    return;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
