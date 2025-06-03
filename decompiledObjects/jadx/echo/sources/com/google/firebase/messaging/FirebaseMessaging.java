package com.google.firebase.messaging;

import A2.AbstractC0328n;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0656g;
import V2.InterfaceC0658i;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.W;
import com.google.firebase.messaging.b0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n4.C1728a;
import n4.InterfaceC1729b;
import n4.InterfaceC1731d;
import q4.InterfaceC1904a;
import r4.InterfaceC1922b;
import s3.C1944b;
import s3.C1947e;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: o, reason: collision with root package name */
    public static final long f11620o = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: p, reason: collision with root package name */
    public static b0 f11621p;

    /* renamed from: q, reason: collision with root package name */
    public static c2.g f11622q;

    /* renamed from: r, reason: collision with root package name */
    public static ScheduledExecutorService f11623r;

    /* renamed from: a, reason: collision with root package name */
    public final C1947e f11624a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1904a f11625b;

    /* renamed from: c, reason: collision with root package name */
    public final s4.i f11626c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f11627d;

    /* renamed from: e, reason: collision with root package name */
    public final F f11628e;

    /* renamed from: f, reason: collision with root package name */
    public final W f11629f;

    /* renamed from: g, reason: collision with root package name */
    public final a f11630g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f11631h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f11632i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f11633j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0659j f11634k;

    /* renamed from: l, reason: collision with root package name */
    public final K f11635l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11636m;

    /* renamed from: n, reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f11637n;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1731d f11638a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f11639b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1729b f11640c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f11641d;

        public a(InterfaceC1731d interfaceC1731d) {
            this.f11638a = interfaceC1731d;
        }

        public synchronized void b() {
            try {
                if (this.f11639b) {
                    return;
                }
                Boolean e7 = e();
                this.f11641d = e7;
                if (e7 == null) {
                    InterfaceC1729b interfaceC1729b = new InterfaceC1729b() { // from class: com.google.firebase.messaging.C
                        @Override // n4.InterfaceC1729b
                        public final void a(C1728a c1728a) {
                            FirebaseMessaging.a.this.d(c1728a);
                        }
                    };
                    this.f11640c = interfaceC1729b;
                    this.f11638a.c(C1944b.class, interfaceC1729b);
                }
                this.f11639b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f11641d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f11624a.x();
        }

        public final /* synthetic */ void d(C1728a c1728a) {
            if (c()) {
                FirebaseMessaging.this.Q();
            }
        }

        public final Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m7 = FirebaseMessaging.this.f11624a.m();
            SharedPreferences sharedPreferences = m7.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m7.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m7.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void f(boolean z7) {
            try {
                b();
                InterfaceC1729b interfaceC1729b = this.f11640c;
                if (interfaceC1729b != null) {
                    this.f11638a.d(C1944b.class, interfaceC1729b);
                    this.f11640c = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.this.f11624a.m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("auto_init", z7);
                edit.apply();
                if (z7) {
                    FirebaseMessaging.this.Q();
                }
                this.f11641d = Boolean.valueOf(z7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FirebaseMessaging(C1947e c1947e, InterfaceC1904a interfaceC1904a, InterfaceC1922b interfaceC1922b, InterfaceC1922b interfaceC1922b2, s4.i iVar, c2.g gVar, InterfaceC1731d interfaceC1731d) {
        this(c1947e, interfaceC1904a, interfaceC1922b, interfaceC1922b2, iVar, gVar, interfaceC1731d, new K(c1947e.m()));
    }

    public static /* synthetic */ AbstractC0659j J(String str, g0 g0Var) {
        return g0Var.r(str);
    }

    public static /* synthetic */ AbstractC0659j K(String str, g0 g0Var) {
        return g0Var.u(str);
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull C1947e c1947e) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c1947e.k(FirebaseMessaging.class);
            AbstractC0328n.j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging r() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(C1947e.o());
        }
        return firebaseMessaging;
    }

    public static synchronized b0 s(Context context) {
        b0 b0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f11621p == null) {
                    f11621p = new b0(context);
                }
                b0Var = f11621p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0Var;
    }

    public static c2.g w() {
        return f11622q;
    }

    public final /* synthetic */ AbstractC0659j A(final String str, final b0.a aVar) {
        return this.f11628e.f().p(this.f11633j, new InterfaceC0658i() { // from class: com.google.firebase.messaging.s
            @Override // V2.InterfaceC0658i
            public final AbstractC0659j a(Object obj) {
                AbstractC0659j B7;
                B7 = FirebaseMessaging.this.B(str, aVar, (String) obj);
                return B7;
            }
        });
    }

    public final /* synthetic */ AbstractC0659j B(String str, b0.a aVar, String str2) {
        s(this.f11627d).g(t(), str, str2, this.f11635l.a());
        if (aVar == null || !str2.equals(aVar.f11731a)) {
            F(str2);
        }
        return V2.m.e(str2);
    }

    public final /* synthetic */ void C(C0660k c0660k) {
        try {
            this.f11625b.c(K.c(this.f11624a), "FCM");
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void D(C0660k c0660k) {
        try {
            V2.m.a(this.f11628e.c());
            s(this.f11627d).d(t(), K.c(this.f11624a));
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void E(C0660k c0660k) {
        try {
            c0660k.c(n());
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public final /* synthetic */ void G() {
        if (y()) {
            Q();
        }
    }

    public final /* synthetic */ void H(g0 g0Var) {
        if (y()) {
            g0Var.q();
        }
    }

    public final /* synthetic */ void I() {
        Q.c(this.f11627d);
    }

    public void L(T t7) {
        if (TextUtils.isEmpty(t7.U())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.f11627d, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        t7.W(intent);
        this.f11627d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void M(boolean z7) {
        this.f11630g.f(z7);
    }

    public void N(boolean z7) {
        J.y(z7);
    }

    public synchronized void O(boolean z7) {
        this.f11636m = z7;
    }

    public final synchronized void P() {
        if (!this.f11636m) {
            S(0L);
        }
    }

    public final void Q() {
        InterfaceC1904a interfaceC1904a = this.f11625b;
        if (interfaceC1904a != null) {
            interfaceC1904a.a();
        } else if (T(v())) {
            P();
        }
    }

    public AbstractC0659j R(final String str) {
        return this.f11634k.o(new InterfaceC0658i() { // from class: com.google.firebase.messaging.x
            @Override // V2.InterfaceC0658i
            public final AbstractC0659j a(Object obj) {
                AbstractC0659j J6;
                J6 = FirebaseMessaging.J(str, (g0) obj);
                return J6;
            }
        });
    }

    public synchronized void S(long j7) {
        p(new c0(this, Math.min(Math.max(30L, 2 * j7), f11620o)), j7);
        this.f11636m = true;
    }

    public boolean T(b0.a aVar) {
        return aVar == null || aVar.b(this.f11635l.a());
    }

    public AbstractC0659j U(final String str) {
        return this.f11634k.o(new InterfaceC0658i() { // from class: com.google.firebase.messaging.z
            @Override // V2.InterfaceC0658i
            public final AbstractC0659j a(Object obj) {
                AbstractC0659j K6;
                K6 = FirebaseMessaging.K(str, (g0) obj);
                return K6;
            }
        });
    }

    public String n() {
        InterfaceC1904a interfaceC1904a = this.f11625b;
        if (interfaceC1904a != null) {
            try {
                return (String) V2.m.a(interfaceC1904a.b());
            } catch (InterruptedException | ExecutionException e7) {
                throw new IOException(e7);
            }
        }
        final b0.a v7 = v();
        if (!T(v7)) {
            return v7.f11731a;
        }
        final String c7 = K.c(this.f11624a);
        try {
            return (String) V2.m.a(this.f11629f.b(c7, new W.a() { // from class: com.google.firebase.messaging.w
                @Override // com.google.firebase.messaging.W.a
                public final AbstractC0659j start() {
                    AbstractC0659j A7;
                    A7 = FirebaseMessaging.this.A(c7, v7);
                    return A7;
                }
            }));
        } catch (InterruptedException | ExecutionException e8) {
            throw new IOException(e8);
        }
    }

    public AbstractC0659j o() {
        if (this.f11625b != null) {
            final C0660k c0660k = new C0660k();
            this.f11631h.execute(new Runnable() { // from class: com.google.firebase.messaging.A
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.C(c0660k);
                }
            });
            return c0660k.a();
        }
        if (v() == null) {
            return V2.m.e(null);
        }
        final C0660k c0660k2 = new C0660k();
        AbstractC1125o.e().execute(new Runnable() { // from class: com.google.firebase.messaging.B
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.D(c0660k2);
            }
        });
        return c0660k2.a();
    }

    public void p(Runnable runnable, long j7) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f11623r == null) {
                    f11623r = new ScheduledThreadPoolExecutor(1, new F2.a("TAG"));
                }
                f11623r.schedule(runnable, j7, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context q() {
        return this.f11627d;
    }

    public final String t() {
        return "[DEFAULT]".equals(this.f11624a.q()) ? "" : this.f11624a.s();
    }

    public AbstractC0659j u() {
        InterfaceC1904a interfaceC1904a = this.f11625b;
        if (interfaceC1904a != null) {
            return interfaceC1904a.b();
        }
        final C0660k c0660k = new C0660k();
        this.f11631h.execute(new Runnable() { // from class: com.google.firebase.messaging.y
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.E(c0660k);
            }
        });
        return c0660k.a();
    }

    public b0.a v() {
        return s(this.f11627d).e(t(), K.c(this.f11624a));
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void F(String str) {
        if ("[DEFAULT]".equals(this.f11624a.q())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f11624a.q());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C1124n(this.f11627d).k(intent);
        }
    }

    public boolean y() {
        return this.f11630g.c();
    }

    public boolean z() {
        return this.f11635l.g();
    }

    public FirebaseMessaging(C1947e c1947e, InterfaceC1904a interfaceC1904a, InterfaceC1922b interfaceC1922b, InterfaceC1922b interfaceC1922b2, s4.i iVar, c2.g gVar, InterfaceC1731d interfaceC1731d, K k7) {
        this(c1947e, interfaceC1904a, iVar, gVar, interfaceC1731d, k7, new F(c1947e, k7, interfaceC1922b, interfaceC1922b2, iVar), AbstractC1125o.f(), AbstractC1125o.c(), AbstractC1125o.b());
    }

    public FirebaseMessaging(C1947e c1947e, InterfaceC1904a interfaceC1904a, s4.i iVar, c2.g gVar, InterfaceC1731d interfaceC1731d, K k7, F f7, Executor executor, Executor executor2, Executor executor3) {
        this.f11636m = false;
        f11622q = gVar;
        this.f11624a = c1947e;
        this.f11625b = interfaceC1904a;
        this.f11626c = iVar;
        this.f11630g = new a(interfaceC1731d);
        Context m7 = c1947e.m();
        this.f11627d = m7;
        C1127q c1127q = new C1127q();
        this.f11637n = c1127q;
        this.f11635l = k7;
        this.f11632i = executor;
        this.f11628e = f7;
        this.f11629f = new W(executor);
        this.f11631h = executor2;
        this.f11633j = executor3;
        Context m8 = c1947e.m();
        if (m8 instanceof Application) {
            ((Application) m8).registerActivityLifecycleCallbacks(c1127q);
        } else {
            Log.w("FirebaseMessaging", "Context " + m8 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC1904a != null) {
            interfaceC1904a.d(new InterfaceC1904a.InterfaceC0255a() { // from class: com.google.firebase.messaging.r
                @Override // q4.InterfaceC1904a.InterfaceC0255a
                public final void a(String str) {
                    FirebaseMessaging.this.F(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.G();
            }
        });
        AbstractC0659j f8 = g0.f(this, k7, f7, m7, AbstractC1125o.g());
        this.f11634k = f8;
        f8.e(executor2, new InterfaceC0656g() { // from class: com.google.firebase.messaging.u
            @Override // V2.InterfaceC0656g
            public final void a(Object obj) {
                FirebaseMessaging.this.H((g0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.I();
            }
        });
    }
}
