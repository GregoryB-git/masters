package com.google.firebase.iid;

import A2.AbstractC0328n;
import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import V2.InterfaceC0654e;
import V2.InterfaceC0656g;
import V2.InterfaceC0658i;
import V2.m;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.a;
import com.google.firebase.iid.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p4.AbstractC1810b;
import p4.C1819k;
import p4.C1821m;
import p4.C1822n;
import p4.ExecutorC1812d;
import p4.ExecutorC1816h;
import p4.InterfaceC1820l;
import q4.InterfaceC1904a;
import r4.InterfaceC1922b;
import s3.C1947e;
import s4.i;

@Deprecated
/* loaded from: classes.dex */
public class FirebaseInstanceId {

    /* renamed from: j, reason: collision with root package name */
    public static b f11578j;

    /* renamed from: l, reason: collision with root package name */
    public static ScheduledExecutorService f11580l;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f11581a;

    /* renamed from: b, reason: collision with root package name */
    public final C1947e f11582b;

    /* renamed from: c, reason: collision with root package name */
    public final C1822n f11583c;

    /* renamed from: d, reason: collision with root package name */
    public final C1819k f11584d;

    /* renamed from: e, reason: collision with root package name */
    public final a f11585e;

    /* renamed from: f, reason: collision with root package name */
    public final i f11586f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11587g;

    /* renamed from: h, reason: collision with root package name */
    public final List f11588h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f11577i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f11579k = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId(C1947e c1947e, C1822n c1822n, Executor executor, Executor executor2, InterfaceC1922b interfaceC1922b, InterfaceC1922b interfaceC1922b2, i iVar) {
        this.f11587g = false;
        this.f11588h = new ArrayList();
        if (C1822n.c(c1947e) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f11578j == null) {
                    f11578j = new b(c1947e.m());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11582b = c1947e;
        this.f11583c = c1822n;
        this.f11584d = new C1819k(c1947e, c1822n, interfaceC1922b, interfaceC1922b2, iVar);
        this.f11581a = executor2;
        this.f11585e = new a(executor);
        this.f11586f = iVar;
    }

    public static String A(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    public static Object c(AbstractC0659j abstractC0659j) {
        AbstractC0328n.j(abstractC0659j, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC0659j.c(ExecutorC1812d.f18432o, new InterfaceC0654e(countDownLatch) { // from class: p4.e

            /* renamed from: a, reason: collision with root package name */
            public final CountDownLatch f18433a;

            {
                this.f18433a = countDownLatch;
            }

            @Override // V2.InterfaceC0654e
            public void a(AbstractC0659j abstractC0659j2) {
                this.f18433a.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        return l(abstractC0659j);
    }

    public static void e(C1947e c1947e) {
        AbstractC0328n.f(c1947e.r().g(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        AbstractC0328n.f(c1947e.r().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        AbstractC0328n.f(c1947e.r().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        AbstractC0328n.b(u(c1947e.r().c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC0328n.b(t(c1947e.r().b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @NonNull
    @Keep
    public static FirebaseInstanceId getInstance(@NonNull C1947e c1947e) {
        e(c1947e);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) c1947e.k(FirebaseInstanceId.class);
        AbstractC0328n.j(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public static Object l(AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            return abstractC0659j.j();
        }
        if (abstractC0659j.l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC0659j.m()) {
            throw new IllegalStateException(abstractC0659j.i());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    public static boolean r() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
    }

    public static boolean t(String str) {
        return f11579k.matcher(str).matches();
    }

    public static boolean u(String str) {
        return str.contains(":");
    }

    public synchronized void B() {
        f11578j.d();
    }

    public synchronized void C(boolean z7) {
        this.f11587g = z7;
    }

    public synchronized void D() {
        if (this.f11587g) {
            return;
        }
        E(0L);
    }

    public synchronized void E(long j7) {
        g(new c(this, Math.min(Math.max(30L, j7 + j7), f11577i)), j7);
        this.f11587g = true;
    }

    public boolean F(b.a aVar) {
        return aVar == null || aVar.c(this.f11583c.a());
    }

    public void a(InterfaceC1904a.InterfaceC0255a interfaceC0255a) {
        this.f11588h.add(interfaceC0255a);
    }

    public final Object b(AbstractC0659j abstractC0659j) {
        try {
            return m.b(abstractC0659j, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    B();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e7);
        }
    }

    public String d() {
        return o(C1822n.c(this.f11582b), "*");
    }

    public void f(String str, String str2) {
        e(this.f11582b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        String A7 = A(str2);
        b(this.f11584d.b(i(), str, A7));
        f11578j.e(m(), str, A7);
    }

    public void g(Runnable runnable, long j7) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f11580l == null) {
                    f11580l = new ScheduledThreadPoolExecutor(1, new F2.a("FirebaseInstanceId"));
                }
                f11580l.schedule(runnable, j7, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1947e h() {
        return this.f11582b;
    }

    public String i() {
        try {
            f11578j.j(this.f11582b.s());
            return (String) c(this.f11586f.a());
        } catch (InterruptedException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public AbstractC0659j j() {
        e(this.f11582b);
        return k(C1822n.c(this.f11582b), "*");
    }

    public final AbstractC0659j k(final String str, String str2) {
        final String A7 = A(str2);
        return m.e(null).h(this.f11581a, new InterfaceC0651b(this, str, A7) { // from class: p4.c

            /* renamed from: a, reason: collision with root package name */
            public final FirebaseInstanceId f18429a;

            /* renamed from: b, reason: collision with root package name */
            public final String f18430b;

            /* renamed from: c, reason: collision with root package name */
            public final String f18431c;

            {
                this.f18429a = this;
                this.f18430b = str;
                this.f18431c = A7;
            }

            @Override // V2.InterfaceC0651b
            public Object a(AbstractC0659j abstractC0659j) {
                return this.f18429a.z(this.f18430b, this.f18431c, abstractC0659j);
            }
        });
    }

    public final String m() {
        return "[DEFAULT]".equals(this.f11582b.q()) ? "" : this.f11582b.s();
    }

    public String n() {
        e(this.f11582b);
        b.a p7 = p();
        if (F(p7)) {
            D();
        }
        return b.a.b(p7);
    }

    public String o(String str, String str2) {
        e(this.f11582b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InterfaceC1820l) b(k(str, str2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    public b.a p() {
        return q(C1822n.c(this.f11582b), "*");
    }

    public b.a q(String str, String str2) {
        return f11578j.g(m(), str, str2);
    }

    public boolean s() {
        return this.f11583c.g();
    }

    public final /* synthetic */ AbstractC0659j w(String str, String str2, String str3, String str4) {
        f11578j.i(m(), str, str2, str4, this.f11583c.a());
        return m.e(new C1821m(str3, str4));
    }

    public final /* synthetic */ void x(b.a aVar, InterfaceC1820l interfaceC1820l) {
        String a7 = interfaceC1820l.a();
        if (aVar == null || !a7.equals(aVar.f11596a)) {
            Iterator it = this.f11588h.iterator();
            while (it.hasNext()) {
                ((InterfaceC1904a.InterfaceC0255a) it.next()).a(a7);
            }
        }
    }

    public final /* synthetic */ AbstractC0659j y(final String str, final String str2, final String str3, final b.a aVar) {
        return this.f11584d.e(str, str2, str3).p(this.f11581a, new InterfaceC0658i(this, str2, str3, str) { // from class: p4.g

            /* renamed from: a, reason: collision with root package name */
            public final FirebaseInstanceId f18439a;

            /* renamed from: b, reason: collision with root package name */
            public final String f18440b;

            /* renamed from: c, reason: collision with root package name */
            public final String f18441c;

            /* renamed from: d, reason: collision with root package name */
            public final String f18442d;

            {
                this.f18439a = this;
                this.f18440b = str2;
                this.f18441c = str3;
                this.f18442d = str;
            }

            @Override // V2.InterfaceC0658i
            public AbstractC0659j a(Object obj) {
                return this.f18439a.w(this.f18440b, this.f18441c, this.f18442d, (String) obj);
            }
        }).e(ExecutorC1816h.f18443o, new InterfaceC0656g(this, aVar) { // from class: p4.i

            /* renamed from: a, reason: collision with root package name */
            public final FirebaseInstanceId f18444a;

            /* renamed from: b, reason: collision with root package name */
            public final b.a f18445b;

            {
                this.f18444a = this;
                this.f18445b = aVar;
            }

            @Override // V2.InterfaceC0656g
            public void a(Object obj) {
                this.f18444a.x(this.f18445b, (InterfaceC1820l) obj);
            }
        });
    }

    public final /* synthetic */ AbstractC0659j z(final String str, final String str2, AbstractC0659j abstractC0659j) {
        final String i7 = i();
        final b.a q7 = q(str, str2);
        return !F(q7) ? m.e(new C1821m(i7, q7.f11596a)) : this.f11585e.a(str, str2, new a.InterfaceC0175a(this, i7, str, str2, q7) { // from class: p4.f

            /* renamed from: a, reason: collision with root package name */
            public final FirebaseInstanceId f18434a;

            /* renamed from: b, reason: collision with root package name */
            public final String f18435b;

            /* renamed from: c, reason: collision with root package name */
            public final String f18436c;

            /* renamed from: d, reason: collision with root package name */
            public final String f18437d;

            /* renamed from: e, reason: collision with root package name */
            public final b.a f18438e;

            {
                this.f18434a = this;
                this.f18435b = i7;
                this.f18436c = str;
                this.f18437d = str2;
                this.f18438e = q7;
            }

            @Override // com.google.firebase.iid.a.InterfaceC0175a
            public AbstractC0659j start() {
                return this.f18434a.y(this.f18435b, this.f18436c, this.f18437d, this.f18438e);
            }
        });
    }

    public FirebaseInstanceId(C1947e c1947e, InterfaceC1922b interfaceC1922b, InterfaceC1922b interfaceC1922b2, i iVar) {
        this(c1947e, new C1822n(c1947e.m()), AbstractC1810b.b(), AbstractC1810b.b(), interfaceC1922b, interfaceC1922b2, iVar);
    }
}
