package gb;

import eb.e;
import gb.r1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import n7.g;

/* loaded from: classes.dex */
public class d0<ReqT, RespT> extends eb.e<ReqT, RespT> {

    /* renamed from: j, reason: collision with root package name */
    public static final g f6222j;

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture<?> f6223a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f6224b;

    /* renamed from: c, reason: collision with root package name */
    public final eb.p f6225c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f6226d;

    /* renamed from: e, reason: collision with root package name */
    public e.a<RespT> f6227e;
    public eb.e<ReqT, RespT> f;

    /* renamed from: g, reason: collision with root package name */
    public eb.e1 f6228g;

    /* renamed from: h, reason: collision with root package name */
    public List<Runnable> f6229h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public i<RespT> f6230i;

    public class a extends z {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f6231b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0 d0Var, i iVar) {
            super(d0Var.f6225c);
            this.f6231b = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // gb.z
        public final void a() {
            List list;
            i iVar = this.f6231b;
            iVar.getClass();
            List arrayList = new ArrayList();
            while (true) {
                synchronized (iVar) {
                    if (iVar.f6246c.isEmpty()) {
                        iVar.f6246c = null;
                        iVar.f6245b = true;
                        return;
                    } else {
                        list = iVar.f6246c;
                        iVar.f6246c = arrayList;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e.a f6232a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eb.s0 f6233b;

        public b(e.a aVar, eb.s0 s0Var) {
            this.f6232a = aVar;
            this.f6233b = s0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d0.this.f.e(this.f6232a, this.f6233b);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eb.e1 f6235a;

        public c(eb.e1 e1Var) {
            this.f6235a = e1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            eb.e<ReqT, RespT> eVar = d0.this.f;
            eb.e1 e1Var = this.f6235a;
            eVar.a(e1Var.f5082b, e1Var.f5083c);
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f6237a;

        public d(Object obj) {
            this.f6237a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            d0.this.f.d(this.f6237a);
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6239a;

        public e(int i10) {
            this.f6239a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d0.this.f.c(this.f6239a);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d0.this.f.b();
        }
    }

    public class g extends eb.e<Object, Object> {
        @Override // eb.e
        public final void a(String str, Throwable th) {
        }

        @Override // eb.e
        public final void b() {
        }

        @Override // eb.e
        public final void c(int i10) {
        }

        @Override // eb.e
        public final void d(Object obj) {
        }

        @Override // eb.e
        public final void e(e.a<Object> aVar, eb.s0 s0Var) {
        }
    }

    public final class h extends z {

        /* renamed from: b, reason: collision with root package name */
        public final e.a<RespT> f6242b;

        /* renamed from: c, reason: collision with root package name */
        public final eb.e1 f6243c;

        public h(d0 d0Var, e.a<RespT> aVar, eb.e1 e1Var) {
            super(d0Var.f6225c);
            this.f6242b = aVar;
            this.f6243c = e1Var;
        }

        @Override // gb.z
        public final void a() {
            this.f6242b.a(new eb.s0(), this.f6243c);
        }
    }

    public static final class i<RespT> extends e.a<RespT> {

        /* renamed from: a, reason: collision with root package name */
        public final e.a<RespT> f6244a;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f6245b;

        /* renamed from: c, reason: collision with root package name */
        public List<Runnable> f6246c = new ArrayList();

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ eb.s0 f6247a;

            public a(eb.s0 s0Var) {
                this.f6247a = s0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.this.f6244a.b(this.f6247a);
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f6249a;

            public b(Object obj) {
                this.f6249a = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.this.f6244a.c(this.f6249a);
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.this.f6244a.d();
            }
        }

        public i(e.a<RespT> aVar) {
            this.f6244a = aVar;
        }

        @Override // eb.e.a
        public final void a(eb.s0 s0Var, eb.e1 e1Var) {
            e(new e0(this, e1Var, s0Var));
        }

        @Override // eb.e.a
        public final void b(eb.s0 s0Var) {
            if (this.f6245b) {
                this.f6244a.b(s0Var);
            } else {
                e(new a(s0Var));
            }
        }

        @Override // eb.e.a
        public final void c(RespT respt) {
            if (this.f6245b) {
                this.f6244a.c(respt);
            } else {
                e(new b(respt));
            }
        }

        @Override // eb.e.a
        public final void d() {
            if (this.f6245b) {
                this.f6244a.d();
            } else {
                e(new c());
            }
        }

        public final void e(Runnable runnable) {
            synchronized (this) {
                if (this.f6245b) {
                    runnable.run();
                } else {
                    this.f6246c.add(runnable);
                }
            }
        }
    }

    static {
        Logger.getLogger(d0.class.getName());
        f6222j = new g();
    }

    public d0(Executor executor, r1.n nVar, eb.q qVar) {
        String str;
        ScheduledFuture<?> schedule;
        x6.b.y(executor, "callExecutor");
        this.f6224b = executor;
        x6.b.y(nVar, "scheduler");
        eb.p b10 = eb.p.b();
        this.f6225c = b10;
        b10.getClass();
        if (qVar == null) {
            schedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long h10 = qVar.h(timeUnit);
            long abs = Math.abs(h10);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = abs / timeUnit2.toNanos(1L);
            long abs2 = Math.abs(h10) % timeUnit2.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            if (h10 < 0) {
                sb2.append("ClientCall started after ");
                sb2.append("CallOptions");
                str = " deadline was exceeded. Deadline has been exceeded for ";
            } else {
                sb2.append("Deadline ");
                sb2.append("CallOptions");
                str = " will be exceeded in ";
            }
            sb2.append(str);
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb2.append("s. ");
            schedule = nVar.schedule(new c0(this, sb2), h10, timeUnit);
        }
        this.f6223a = schedule;
    }

    @Override // eb.e
    public final void a(String str, Throwable th) {
        eb.e1 e1Var = eb.e1.f;
        if (str == null) {
            str = "Call cancelled without message";
        }
        eb.e1 g10 = e1Var.g(str);
        if (th != null) {
            g10 = g10.f(th);
        }
        g(g10, false);
    }

    @Override // eb.e
    public final void b() {
        h(new f());
    }

    @Override // eb.e
    public final void c(int i10) {
        if (this.f6226d) {
            this.f.c(i10);
        } else {
            h(new e(i10));
        }
    }

    @Override // eb.e
    public final void d(ReqT reqt) {
        if (this.f6226d) {
            this.f.d(reqt);
        } else {
            h(new d(reqt));
        }
    }

    @Override // eb.e
    public final void e(e.a<RespT> aVar, eb.s0 s0Var) {
        eb.e1 e1Var;
        boolean z10;
        x6.b.I(this.f6227e == null, "already started");
        synchronized (this) {
            x6.b.y(aVar, "listener");
            this.f6227e = aVar;
            e1Var = this.f6228g;
            z10 = this.f6226d;
            if (!z10) {
                i<RespT> iVar = new i<>(aVar);
                this.f6230i = iVar;
                aVar = iVar;
            }
        }
        if (e1Var != null) {
            this.f6224b.execute(new h(this, aVar, e1Var));
        } else if (z10) {
            this.f.e(aVar, s0Var);
        } else {
            h(new b(aVar, s0Var));
        }
    }

    public void f() {
    }

    public final void g(eb.e1 e1Var, boolean z10) {
        e.a<RespT> aVar;
        synchronized (this) {
            try {
                eb.e<ReqT, RespT> eVar = this.f;
                boolean z11 = false;
                boolean z12 = true;
                if (eVar == null) {
                    g gVar = f6222j;
                    if (eVar != null) {
                        z12 = false;
                    }
                    x6.b.G(eVar, "realCall already set to %s", z12);
                    ScheduledFuture<?> scheduledFuture = this.f6223a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f = gVar;
                    aVar = this.f6227e;
                    this.f6228g = e1Var;
                } else {
                    if (z10) {
                        return;
                    }
                    aVar = null;
                    z11 = true;
                }
                if (z11) {
                    h(new c(e1Var));
                } else {
                    if (aVar != null) {
                        this.f6224b.execute(new h(this, aVar, e1Var));
                    }
                    i();
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(Runnable runnable) {
        synchronized (this) {
            if (this.f6226d) {
                runnable.run();
            } else {
                this.f6229h.add(runnable);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f6229h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.f6229h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f6226d = r0     // Catch: java.lang.Throwable -> L42
            gb.d0$i<RespT> r0 = r3.f6230i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f6224b
            gb.d0$a r2 = new gb.d0$a
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List<java.lang.Runnable> r1 = r3.f6229h     // Catch: java.lang.Throwable -> L42
            r3.f6229h = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.d0.i():void");
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(this.f, "realCall");
        return b10.toString();
    }
}
