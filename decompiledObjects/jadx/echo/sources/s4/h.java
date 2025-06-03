package s4;

import A2.AbstractC0328n;
import B3.x;
import V2.AbstractC0659j;
import V2.C0660k;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import r4.InterfaceC1922b;
import s3.C1947e;
import s4.j;
import t4.InterfaceC1992a;
import t4.InterfaceC1993b;
import u4.C2011b;
import u4.C2012c;
import v4.AbstractC2059d;
import v4.AbstractC2061f;
import v4.C2058c;

/* loaded from: classes.dex */
public class h implements i {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f19281m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f19282n = new a();

    /* renamed from: a, reason: collision with root package name */
    public final C1947e f19283a;

    /* renamed from: b, reason: collision with root package name */
    public final C2058c f19284b;

    /* renamed from: c, reason: collision with root package name */
    public final C2012c f19285c;

    /* renamed from: d, reason: collision with root package name */
    public final q f19286d;

    /* renamed from: e, reason: collision with root package name */
    public final x f19287e;

    /* renamed from: f, reason: collision with root package name */
    public final o f19288f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f19289g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f19290h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f19291i;

    /* renamed from: j, reason: collision with root package name */
    public String f19292j;

    /* renamed from: k, reason: collision with root package name */
    public Set f19293k;

    /* renamed from: l, reason: collision with root package name */
    public final List f19294l;

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f19295a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f19295a.getAndIncrement())));
        }
    }

    public class b implements InterfaceC1993b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1992a f19296a;

        public b(InterfaceC1992a interfaceC1992a) {
            this.f19296a = interfaceC1992a;
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19298a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19299b;

        static {
            int[] iArr = new int[AbstractC2061f.b.values().length];
            f19299b = iArr;
            try {
                iArr[AbstractC2061f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19299b[AbstractC2061f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19299b[AbstractC2061f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC2059d.b.values().length];
            f19298a = iArr2;
            try {
                iArr2[AbstractC2059d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19298a[AbstractC2059d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public h(ExecutorService executorService, Executor executor, C1947e c1947e, C2058c c2058c, C2012c c2012c, q qVar, x xVar, o oVar) {
        this.f19289g = new Object();
        this.f19293k = new HashSet();
        this.f19294l = new ArrayList();
        this.f19283a = c1947e;
        this.f19284b = c2058c;
        this.f19285c = c2012c;
        this.f19286d = qVar;
        this.f19287e = xVar;
        this.f19288f = oVar;
        this.f19290h = executorService;
        this.f19291i = executor;
    }

    public static /* synthetic */ C2011b C(C1947e c1947e) {
        return new C2011b(c1947e);
    }

    public static h t() {
        return u(C1947e.o());
    }

    public static h u(C1947e c1947e) {
        AbstractC0328n.b(c1947e != null, "Null is not a valid value of FirebaseApp.");
        return (h) c1947e.k(i.class);
    }

    public final /* synthetic */ void A() {
        B(false);
    }

    public final void D() {
        AbstractC0328n.f(q(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC0328n.f(x(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC0328n.f(p(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC0328n.b(q.h(q()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC0328n.b(q.g(p()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String E(u4.d dVar) {
        if ((!this.f19283a.q().equals("CHIME_ANDROID_SDK") && !this.f19283a.y()) || !dVar.m()) {
            return this.f19288f.a();
        }
        String f7 = s().f();
        return TextUtils.isEmpty(f7) ? this.f19288f.a() : f7;
    }

    public synchronized InterfaceC1993b F(InterfaceC1992a interfaceC1992a) {
        this.f19293k.add(interfaceC1992a);
        return new b(interfaceC1992a);
    }

    public final u4.d G(u4.d dVar) {
        AbstractC2059d d7 = this.f19284b.d(p(), dVar.d(), x(), q(), (dVar.d() == null || dVar.d().length() != 11) ? null : s().i());
        int i7 = c.f19298a[d7.e().ordinal()];
        if (i7 == 1) {
            return dVar.s(d7.c(), d7.d(), this.f19286d.b(), d7.b().c(), d7.b().d());
        }
        if (i7 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.UNAVAILABLE);
    }

    public final void H(Exception exc) {
        synchronized (this.f19289g) {
            try {
                Iterator it = this.f19294l.iterator();
                while (it.hasNext()) {
                    if (((p) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I(u4.d dVar) {
        synchronized (this.f19289g) {
            try {
                Iterator it = this.f19294l.iterator();
                while (it.hasNext()) {
                    if (((p) it.next()).b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void J(String str) {
        this.f19292j = str;
    }

    public final synchronized void K(u4.d dVar, u4.d dVar2) {
        if (this.f19293k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f19293k.iterator();
            while (it.hasNext()) {
                ((InterfaceC1992a) it.next()).a(dVar2.d());
            }
        }
    }

    @Override // s4.i
    public AbstractC0659j a() {
        D();
        String r7 = r();
        if (r7 != null) {
            return V2.m.e(r7);
        }
        AbstractC0659j i7 = i();
        this.f19290h.execute(new Runnable() { // from class: s4.d
            @Override // java.lang.Runnable
            public final void run() {
                h.this.A();
            }
        });
        return i7;
    }

    @Override // s4.i
    public AbstractC0659j b(final boolean z7) {
        D();
        AbstractC0659j h7 = h();
        this.f19290h.execute(new Runnable() { // from class: s4.f
            @Override // java.lang.Runnable
            public final void run() {
                h.this.B(z7);
            }
        });
        return h7;
    }

    public final AbstractC0659j h() {
        C0660k c0660k = new C0660k();
        j(new l(this.f19286d, c0660k));
        return c0660k.a();
    }

    public final AbstractC0659j i() {
        C0660k c0660k = new C0660k();
        j(new m(c0660k));
        return c0660k.a();
    }

    public final void j(p pVar) {
        synchronized (this.f19289g) {
            this.f19294l.add(pVar);
        }
    }

    public AbstractC0659j k() {
        return V2.m.c(this.f19290h, new Callable() { // from class: s4.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void l7;
                l7 = h.this.l();
                return l7;
            }
        });
    }

    public final Void l() {
        J(null);
        u4.d v7 = v();
        if (v7.k()) {
            this.f19284b.e(p(), v7.d(), x(), v7.f());
        }
        y(v7.r());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(boolean r3) {
        /*
            r2 = this;
            u4.d r0 = r2.v()
            boolean r1 = r0.i()     // Catch: s4.j -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: s4.j -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            s4.q r3 = r2.f19286d     // Catch: s4.j -> L1d
            boolean r3 = r3.f(r0)     // Catch: s4.j -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L5e
        L1f:
            u4.d r3 = r2.o(r0)     // Catch: s4.j -> L1d
            goto L28
        L24:
            u4.d r3 = r2.G(r0)     // Catch: s4.j -> L1d
        L28:
            r2.y(r3)
            r2.K(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.d()
            r2.J(r0)
        L3b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4c
            s4.j r3 = new s4.j
            s4.j$a r0 = s4.j.a.BAD_CONFIG
            r3.<init>(r0)
        L48:
            r2.H(r3)
            goto L5d
        L4c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5a
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L48
        L5a:
            r2.I(r3)
        L5d:
            return
        L5e:
            r2.H(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.h.z(boolean):void");
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void B(final boolean z7) {
        u4.d w7 = w();
        if (z7) {
            w7 = w7.p();
        }
        I(w7);
        this.f19291i.execute(new Runnable() { // from class: s4.e
            @Override // java.lang.Runnable
            public final void run() {
                h.this.z(z7);
            }
        });
    }

    public final u4.d o(u4.d dVar) {
        AbstractC2061f f7 = this.f19284b.f(p(), dVar.d(), x(), dVar.f());
        int i7 = c.f19299b[f7.b().ordinal()];
        if (i7 == 1) {
            return dVar.o(f7.c(), f7.d(), this.f19286d.b());
        }
        if (i7 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i7 != 3) {
            throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.UNAVAILABLE);
        }
        J(null);
        return dVar.r();
    }

    public String p() {
        return this.f19283a.r().b();
    }

    public String q() {
        return this.f19283a.r().c();
    }

    public final synchronized String r() {
        return this.f19292j;
    }

    public final C2011b s() {
        return (C2011b) this.f19287e.get();
    }

    /* JADX WARN: Finally extract failed */
    public final u4.d v() {
        u4.d d7;
        synchronized (f19281m) {
            try {
                C1956b a7 = C1956b.a(this.f19283a.m(), "generatefid.lock");
                try {
                    d7 = this.f19285c.d();
                    if (a7 != null) {
                        a7.b();
                    }
                } catch (Throwable th) {
                    if (a7 != null) {
                        a7.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d7;
    }

    /* JADX WARN: Finally extract failed */
    public final u4.d w() {
        u4.d d7;
        synchronized (f19281m) {
            try {
                C1956b a7 = C1956b.a(this.f19283a.m(), "generatefid.lock");
                try {
                    d7 = this.f19285c.d();
                    if (d7.j()) {
                        d7 = this.f19285c.b(d7.t(E(d7)));
                    }
                    if (a7 != null) {
                        a7.b();
                    }
                } catch (Throwable th) {
                    if (a7 != null) {
                        a7.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d7;
    }

    public String x() {
        return this.f19283a.r().g();
    }

    /* JADX WARN: Finally extract failed */
    public final void y(u4.d dVar) {
        synchronized (f19281m) {
            try {
                C1956b a7 = C1956b.a(this.f19283a.m(), "generatefid.lock");
                try {
                    this.f19285c.b(dVar);
                    if (a7 != null) {
                        a7.b();
                    }
                } catch (Throwable th) {
                    if (a7 != null) {
                        a7.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h(final C1947e c1947e, InterfaceC1922b interfaceC1922b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c1947e, new C2058c(c1947e.m(), interfaceC1922b), new C2012c(c1947e), q.c(), new x(new InterfaceC1922b() { // from class: s4.c
            @Override // r4.InterfaceC1922b
            public final Object get() {
                C2011b C7;
                C7 = h.C(C1947e.this);
                return C7;
            }
        }), new o());
    }
}
