package gb;

import gb.n3;
import gb.t;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class g0 implements s {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f6388a;

    /* renamed from: b, reason: collision with root package name */
    public t f6389b;

    /* renamed from: c, reason: collision with root package name */
    public s f6390c;

    /* renamed from: d, reason: collision with root package name */
    public eb.e1 f6391d;
    public n f;

    /* renamed from: g, reason: collision with root package name */
    public long f6393g;

    /* renamed from: h, reason: collision with root package name */
    public long f6394h;

    /* renamed from: e, reason: collision with root package name */
    public List<Runnable> f6392e = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f6395i = new ArrayList();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6396a;

        public a(int i10) {
            this.f6396a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.f(this.f6396a);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.e();
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eb.l f6399a;

        public c(eb.l lVar) {
            this.f6399a = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.a(this.f6399a);
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6401a;

        public d(boolean z10) {
            this.f6401a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.p(this.f6401a);
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eb.s f6403a;

        public e(eb.s sVar) {
            this.f6403a = sVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.o(this.f6403a);
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6405a;

        public f(int i10) {
            this.f6405a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.g(this.f6405a);
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6407a;

        public g(int i10) {
            this.f6407a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.h(this.f6407a);
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eb.q f6409a;

        public h(eb.q qVar) {
            this.f6409a = qVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.j(this.f6409a);
        }
    }

    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6411a;

        public i(String str) {
            this.f6411a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.k(this.f6411a);
        }
    }

    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f6413a;

        public j(InputStream inputStream) {
            this.f6413a = inputStream;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.d(this.f6413a);
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.flush();
        }
    }

    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eb.e1 f6416a;

        public l(eb.e1 e1Var) {
            this.f6416a = e1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.n(this.f6416a);
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.f6390c.m();
        }
    }

    public static class n implements t {

        /* renamed from: a, reason: collision with root package name */
        public final t f6419a;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f6420b;

        /* renamed from: c, reason: collision with root package name */
        public List<Runnable> f6421c = new ArrayList();

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n3.a f6422a;

            public a(n3.a aVar) {
                this.f6422a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n.this.f6419a.a(this.f6422a);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                n.this.f6419a.c();
            }
        }

        public class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ eb.s0 f6425a;

            public c(eb.s0 s0Var) {
                this.f6425a = s0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n.this.f6419a.b(this.f6425a);
            }
        }

        public class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ eb.e1 f6427a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t.a f6428b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ eb.s0 f6429c;

            public d(eb.e1 e1Var, t.a aVar, eb.s0 s0Var) {
                this.f6427a = e1Var;
                this.f6428b = aVar;
                this.f6429c = s0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n.this.f6419a.d(this.f6427a, this.f6428b, this.f6429c);
            }
        }

        public n(t tVar) {
            this.f6419a = tVar;
        }

        @Override // gb.n3
        public final void a(n3.a aVar) {
            if (this.f6420b) {
                this.f6419a.a(aVar);
            } else {
                e(new a(aVar));
            }
        }

        @Override // gb.t
        public final void b(eb.s0 s0Var) {
            e(new c(s0Var));
        }

        @Override // gb.n3
        public final void c() {
            if (this.f6420b) {
                this.f6419a.c();
            } else {
                e(new b());
            }
        }

        @Override // gb.t
        public final void d(eb.e1 e1Var, t.a aVar, eb.s0 s0Var) {
            e(new d(e1Var, aVar, s0Var));
        }

        public final void e(Runnable runnable) {
            synchronized (this) {
                if (this.f6420b) {
                    runnable.run();
                } else {
                    this.f6421c.add(runnable);
                }
            }
        }
    }

    @Override // gb.m3
    public final void a(eb.l lVar) {
        x6.b.I(this.f6389b == null, "May only be called before start");
        x6.b.y(lVar, "compressor");
        this.f6395i.add(new c(lVar));
    }

    @Override // gb.m3
    public final boolean b() {
        if (this.f6388a) {
            return this.f6390c.b();
        }
        return false;
    }

    public final void c(Runnable runnable) {
        x6.b.I(this.f6389b != null, "May only be called after start");
        synchronized (this) {
            if (this.f6388a) {
                runnable.run();
            } else {
                this.f6392e.add(runnable);
            }
        }
    }

    @Override // gb.m3
    public final void d(InputStream inputStream) {
        x6.b.I(this.f6389b != null, "May only be called after start");
        x6.b.y(inputStream, Constants.MESSAGE);
        if (this.f6388a) {
            this.f6390c.d(inputStream);
        } else {
            c(new j(inputStream));
        }
    }

    @Override // gb.m3
    public final void e() {
        x6.b.I(this.f6389b == null, "May only be called before start");
        this.f6395i.add(new b());
    }

    @Override // gb.m3
    public final void f(int i10) {
        x6.b.I(this.f6389b != null, "May only be called after start");
        if (this.f6388a) {
            this.f6390c.f(i10);
        } else {
            c(new a(i10));
        }
    }

    @Override // gb.m3
    public final void flush() {
        x6.b.I(this.f6389b != null, "May only be called after start");
        if (this.f6388a) {
            this.f6390c.flush();
        } else {
            c(new k());
        }
    }

    @Override // gb.s
    public final void g(int i10) {
        x6.b.I(this.f6389b == null, "May only be called before start");
        this.f6395i.add(new f(i10));
    }

    @Override // gb.s
    public final void h(int i10) {
        x6.b.I(this.f6389b == null, "May only be called before start");
        this.f6395i.add(new g(i10));
    }

    @Override // gb.s
    public void i(d2.q qVar) {
        synchronized (this) {
            if (this.f6389b == null) {
                return;
            }
            if (this.f6390c != null) {
                qVar.f(Long.valueOf(this.f6394h - this.f6393g), "buffered_nanos");
                this.f6390c.i(qVar);
            } else {
                qVar.f(Long.valueOf(System.nanoTime() - this.f6393g), "buffered_nanos");
                qVar.e("waiting_for_connection");
            }
        }
    }

    @Override // gb.s
    public final void j(eb.q qVar) {
        x6.b.I(this.f6389b == null, "May only be called before start");
        this.f6395i.add(new h(qVar));
    }

    @Override // gb.s
    public final void k(String str) {
        x6.b.I(this.f6389b == null, "May only be called before start");
        x6.b.y(str, "authority");
        this.f6395i.add(new i(str));
    }

    @Override // gb.s
    public final void l(t tVar) {
        eb.e1 e1Var;
        boolean z10;
        x6.b.I(this.f6389b == null, "already started");
        synchronized (this) {
            e1Var = this.f6391d;
            z10 = this.f6388a;
            if (!z10) {
                n nVar = new n(tVar);
                this.f = nVar;
                tVar = nVar;
            }
            this.f6389b = tVar;
            this.f6393g = System.nanoTime();
        }
        if (e1Var != null) {
            tVar.d(e1Var, t.a.PROCESSED, new eb.s0());
        } else if (z10) {
            r(tVar);
        }
    }

    @Override // gb.s
    public final void m() {
        x6.b.I(this.f6389b != null, "May only be called after start");
        c(new m());
    }

    @Override // gb.s
    public void n(eb.e1 e1Var) {
        boolean z10 = false;
        boolean z11 = true;
        x6.b.I(this.f6389b != null, "May only be called after start");
        x6.b.y(e1Var, Constants.REASON);
        synchronized (this) {
            try {
                s sVar = this.f6390c;
                if (sVar == null) {
                    l2 l2Var = l2.f6592a;
                    if (sVar != null) {
                        z11 = false;
                    }
                    x6.b.G(sVar, "realStream already set to %s", z11);
                    this.f6390c = l2Var;
                    this.f6394h = System.nanoTime();
                    this.f6391d = e1Var;
                } else {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            c(new l(e1Var));
            return;
        }
        q();
        s(e1Var);
        this.f6389b.d(e1Var, t.a.PROCESSED, new eb.s0());
    }

    @Override // gb.s
    public final void o(eb.s sVar) {
        x6.b.I(this.f6389b == null, "May only be called before start");
        x6.b.y(sVar, "decompressorRegistry");
        this.f6395i.add(new e(sVar));
    }

    @Override // gb.s
    public final void p(boolean z10) {
        x6.b.I(this.f6389b == null, "May only be called before start");
        this.f6395i.add(new d(z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List<java.lang.Runnable> r1 = r6.f6392e     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.f6392e = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.f6388a = r1     // Catch: java.lang.Throwable -> L6d
            gb.g0$n r2 = r6.f     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List<java.lang.Runnable> r4 = r2.f6421c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.f6421c = r0     // Catch: java.lang.Throwable -> L4b
            r2.f6420b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            goto L4e
        L2d:
            java.util.List<java.lang.Runnable> r4 = r2.f6421c     // Catch: java.lang.Throwable -> L4b
            r2.f6421c = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List<java.lang.Runnable> r1 = r6.f6392e     // Catch: java.lang.Throwable -> L6d
            r6.f6392e = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.g0.q():void");
    }

    public final void r(t tVar) {
        Iterator it = this.f6395i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f6395i = null;
        this.f6390c.l(tVar);
    }

    public void s(eb.e1 e1Var) {
    }

    public final h0 t(s sVar) {
        synchronized (this) {
            if (this.f6390c != null) {
                return null;
            }
            x6.b.y(sVar, "stream");
            s sVar2 = this.f6390c;
            x6.b.G(sVar2, "realStream already set to %s", sVar2 == null);
            this.f6390c = sVar;
            this.f6394h = System.nanoTime();
            t tVar = this.f6389b;
            if (tVar == null) {
                this.f6392e = null;
                this.f6388a = true;
            }
            if (tVar == null) {
                return null;
            }
            r(tVar);
            return new h0(this);
        }
    }
}
