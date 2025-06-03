package gb;

import eb.e;
import eb.e1;
import eb.t0;
import gb.n3;
import gb.r1;
import gb.t;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.g;

/* loaded from: classes.dex */
public final class q<ReqT, RespT> extends eb.e<ReqT, RespT> {
    public static final Logger t = Logger.getLogger(q.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f6654u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* renamed from: v, reason: collision with root package name */
    public static final double f6655v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* renamed from: a, reason: collision with root package name */
    public final eb.t0<ReqT, RespT> f6656a;

    /* renamed from: b, reason: collision with root package name */
    public final pb.c f6657b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f6658c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6659d;

    /* renamed from: e, reason: collision with root package name */
    public final m f6660e;
    public final eb.p f;

    /* renamed from: g, reason: collision with root package name */
    public volatile ScheduledFuture<?> f6661g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6662h;

    /* renamed from: i, reason: collision with root package name */
    public eb.c f6663i;

    /* renamed from: j, reason: collision with root package name */
    public s f6664j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f6665k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6666l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6667m;

    /* renamed from: n, reason: collision with root package name */
    public final c f6668n;

    /* renamed from: p, reason: collision with root package name */
    public final ScheduledExecutorService f6670p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6671q;

    /* renamed from: o, reason: collision with root package name */
    public final q<ReqT, RespT>.d f6669o = new d(this);

    /* renamed from: r, reason: collision with root package name */
    public eb.s f6672r = eb.s.f5200d;

    /* renamed from: s, reason: collision with root package name */
    public eb.m f6673s = eb.m.f5172b;

    public class a extends z {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e.a f6674b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f6675c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e.a aVar, String str) {
            super(q.this.f);
            this.f6674b = aVar;
            this.f6675c = str;
        }

        @Override // gb.z
        public final void a() {
            q qVar = q.this;
            e.a aVar = this.f6674b;
            eb.e1 g10 = eb.e1.f5077m.g(String.format("Unable to find compressor by name %s", this.f6675c));
            eb.s0 s0Var = new eb.s0();
            qVar.getClass();
            aVar.a(s0Var, g10);
        }
    }

    public class b implements t {

        /* renamed from: a, reason: collision with root package name */
        public final e.a<RespT> f6677a;

        /* renamed from: b, reason: collision with root package name */
        public eb.e1 f6678b;

        public final class a extends z {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ eb.s0 f6680b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(eb.s0 s0Var) {
                super(q.this.f);
                this.f6680b = s0Var;
            }

            @Override // gb.z
            public final void a() {
                pb.b.c();
                try {
                    pb.c cVar = q.this.f6657b;
                    pb.b.a();
                    pb.b.f13110a.getClass();
                    b bVar = b.this;
                    if (bVar.f6678b == null) {
                        try {
                            bVar.f6677a.b(this.f6680b);
                        } catch (Throwable th) {
                            b bVar2 = b.this;
                            eb.e1 g10 = eb.e1.f.f(th).g("Failed to read headers");
                            bVar2.f6678b = g10;
                            q.this.f6664j.n(g10);
                        }
                    }
                    pb.b.f13110a.getClass();
                } catch (Throwable th2) {
                    try {
                        pb.b.f13110a.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }

        /* renamed from: gb.q$b$b, reason: collision with other inner class name */
        public final class C0102b extends z {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n3.a f6682b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0102b(n3.a aVar) {
                super(q.this.f);
                this.f6682b = aVar;
            }

            @Override // gb.z
            public final void a() {
                pb.b.c();
                try {
                    pb.c cVar = q.this.f6657b;
                    pb.b.a();
                    pb.a aVar = pb.b.f13110a;
                    aVar.getClass();
                    b();
                    aVar.getClass();
                } catch (Throwable th) {
                    try {
                        pb.b.f13110a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }

            public final void b() {
                if (b.this.f6678b != null) {
                    n3.a aVar = this.f6682b;
                    Logger logger = v0.f6828a;
                    while (true) {
                        InputStream next = aVar.next();
                        if (next == null) {
                            return;
                        } else {
                            v0.b(next);
                        }
                    }
                } else {
                    while (true) {
                        try {
                            InputStream next2 = this.f6682b.next();
                            if (next2 == null) {
                                return;
                            }
                            try {
                                b bVar = b.this;
                                bVar.f6677a.c(q.this.f6656a.f5220e.a(next2));
                                next2.close();
                            } catch (Throwable th) {
                                v0.b(next2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            n3.a aVar2 = this.f6682b;
                            Logger logger2 = v0.f6828a;
                            while (true) {
                                InputStream next3 = aVar2.next();
                                if (next3 == null) {
                                    b bVar2 = b.this;
                                    eb.e1 g10 = eb.e1.f.f(th2).g("Failed to read message.");
                                    bVar2.f6678b = g10;
                                    q.this.f6664j.n(g10);
                                    return;
                                }
                                v0.b(next3);
                            }
                        }
                    }
                }
            }
        }

        public final class c extends z {
            public c() {
                super(q.this.f);
            }

            @Override // gb.z
            public final void a() {
                pb.b.c();
                try {
                    pb.c cVar = q.this.f6657b;
                    pb.b.a();
                    pb.b.f13110a.getClass();
                    b bVar = b.this;
                    if (bVar.f6678b == null) {
                        try {
                            bVar.f6677a.d();
                        } catch (Throwable th) {
                            b bVar2 = b.this;
                            eb.e1 g10 = eb.e1.f.f(th).g("Failed to call onReady.");
                            bVar2.f6678b = g10;
                            q.this.f6664j.n(g10);
                        }
                    }
                    pb.b.f13110a.getClass();
                } catch (Throwable th2) {
                    try {
                        pb.b.f13110a.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }

        public b(e.a<RespT> aVar) {
            x6.b.y(aVar, "observer");
            this.f6677a = aVar;
        }

        @Override // gb.n3
        public final void a(n3.a aVar) {
            pb.b.c();
            try {
                pb.c cVar = q.this.f6657b;
                pb.b.a();
                pb.b.b();
                q.this.f6658c.execute(new C0102b(aVar));
                pb.b.f13110a.getClass();
            } catch (Throwable th) {
                try {
                    pb.b.f13110a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // gb.t
        public final void b(eb.s0 s0Var) {
            pb.b.c();
            try {
                pb.c cVar = q.this.f6657b;
                pb.b.a();
                pb.b.b();
                q.this.f6658c.execute(new a(s0Var));
                pb.b.f13110a.getClass();
            } catch (Throwable th) {
                try {
                    pb.b.f13110a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // gb.n3
        public final void c() {
            t0.c cVar = q.this.f6656a.f5216a;
            cVar.getClass();
            if (cVar == t0.c.UNARY || cVar == t0.c.SERVER_STREAMING) {
                return;
            }
            pb.b.c();
            try {
                pb.c cVar2 = q.this.f6657b;
                pb.b.a();
                pb.b.b();
                q.this.f6658c.execute(new c());
                pb.b.f13110a.getClass();
            } catch (Throwable th) {
                try {
                    pb.b.f13110a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // gb.t
        public final void d(eb.e1 e1Var, t.a aVar, eb.s0 s0Var) {
            pb.b.c();
            try {
                pb.c cVar = q.this.f6657b;
                pb.b.a();
                e(e1Var, s0Var);
                pb.b.f13110a.getClass();
            } catch (Throwable th) {
                try {
                    pb.b.f13110a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final void e(eb.e1 e1Var, eb.s0 s0Var) {
            q qVar = q.this;
            eb.q qVar2 = qVar.f6663i.f5035a;
            qVar.f.getClass();
            if (qVar2 == null) {
                qVar2 = null;
            }
            if (e1Var.f5081a == e1.a.CANCELLED && qVar2 != null && qVar2.g()) {
                d2.q qVar3 = new d2.q();
                q.this.f6664j.i(qVar3);
                e1Var = eb.e1.f5072h.a("ClientCall was cancelled at or after deadline. " + qVar3);
                s0Var = new eb.s0();
            }
            pb.b.b();
            q.this.f6658c.execute(new r(this, e1Var, s0Var));
        }
    }

    public interface c {
    }

    public final class d {
        public d(q qVar) {
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final long f6685a;

        public e(long j10) {
            this.f6685a = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d2.q qVar = new d2.q();
            q.this.f6664j.i(qVar);
            long abs = Math.abs(this.f6685a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1L);
            long abs2 = Math.abs(this.f6685a) % timeUnit.toNanos(1L);
            StringBuilder l10 = defpackage.f.l("deadline exceeded after ");
            if (this.f6685a < 0) {
                l10.append('-');
            }
            l10.append(nanos);
            Locale locale = Locale.US;
            l10.append(String.format(locale, ".%09d", Long.valueOf(abs2)));
            l10.append("s. ");
            Object[] objArr = new Object[1];
            objArr[0] = Double.valueOf(((Long) q.this.f6663i.a(eb.h.f5112b)) == null ? 0.0d : r4.longValue() / q.f6655v);
            l10.append(String.format(locale, "Name resolution delay %.9f seconds. ", objArr));
            l10.append(qVar);
            q.this.f6664j.n(eb.e1.f5072h.a(l10.toString()));
        }
    }

    public q(eb.t0 t0Var, Executor executor, eb.c cVar, r1.e eVar, ScheduledExecutorService scheduledExecutorService, m mVar) {
        this.f6656a = t0Var;
        String str = t0Var.f5217b;
        System.identityHashCode(this);
        pb.a aVar = pb.b.f13110a;
        aVar.getClass();
        this.f6657b = pb.a.f13108a;
        boolean z10 = true;
        if (executor == s7.c.f14261a) {
            this.f6658c = new e3();
            this.f6659d = true;
        } else {
            this.f6658c = new f3(executor);
            this.f6659d = false;
        }
        this.f6660e = mVar;
        this.f = eb.p.b();
        t0.c cVar2 = t0Var.f5216a;
        if (cVar2 != t0.c.UNARY && cVar2 != t0.c.SERVER_STREAMING) {
            z10 = false;
        }
        this.f6662h = z10;
        this.f6663i = cVar;
        this.f6668n = eVar;
        this.f6670p = scheduledExecutorService;
        aVar.getClass();
    }

    @Override // eb.e
    public final void a(String str, Throwable th) {
        pb.b.c();
        try {
            pb.b.a();
            f(str, th);
            pb.b.f13110a.getClass();
        } catch (Throwable th2) {
            try {
                pb.b.f13110a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // eb.e
    public final void b() {
        pb.b.c();
        try {
            pb.b.a();
            x6.b.I(this.f6664j != null, "Not started");
            x6.b.I(!this.f6666l, "call was cancelled");
            x6.b.I(!this.f6667m, "call already half-closed");
            this.f6667m = true;
            this.f6664j.m();
            pb.b.f13110a.getClass();
        } catch (Throwable th) {
            try {
                pb.b.f13110a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // eb.e
    public final void c(int i10) {
        pb.b.c();
        try {
            pb.b.a();
            boolean z10 = true;
            x6.b.I(this.f6664j != null, "Not started");
            if (i10 < 0) {
                z10 = false;
            }
            x6.b.s("Number requested must be non-negative", z10);
            this.f6664j.f(i10);
            pb.b.f13110a.getClass();
        } catch (Throwable th) {
            try {
                pb.b.f13110a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // eb.e
    public final void d(ReqT reqt) {
        pb.b.c();
        try {
            pb.b.a();
            h(reqt);
            pb.b.f13110a.getClass();
        } catch (Throwable th) {
            try {
                pb.b.f13110a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // eb.e
    public final void e(e.a<RespT> aVar, eb.s0 s0Var) {
        pb.b.c();
        try {
            pb.b.a();
            i(aVar, s0Var);
            pb.b.f13110a.getClass();
        } catch (Throwable th) {
            try {
                pb.b.f13110a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f6666l) {
            return;
        }
        this.f6666l = true;
        try {
            if (this.f6664j != null) {
                eb.e1 e1Var = eb.e1.f;
                if (str == null) {
                    str = "Call cancelled without message";
                }
                eb.e1 g10 = e1Var.g(str);
                if (th != null) {
                    g10 = g10.f(th);
                }
                this.f6664j.n(g10);
            }
        } finally {
            g();
        }
    }

    public final void g() {
        this.f.getClass();
        ScheduledFuture<?> scheduledFuture = this.f6661g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void h(ReqT reqt) {
        x6.b.I(this.f6664j != null, "Not started");
        x6.b.I(!this.f6666l, "call was cancelled");
        x6.b.I(!this.f6667m, "call was half-closed");
        try {
            s sVar = this.f6664j;
            if (sVar instanceof y2) {
                ((y2) sVar).A(reqt);
            } else {
                sVar.d(this.f6656a.f5219d.b(reqt));
            }
            if (this.f6662h) {
                return;
            }
            this.f6664j.flush();
        } catch (Error e10) {
            this.f6664j.n(eb.e1.f.g("Client sendMessage() failed with Error"));
            throw e10;
        } catch (RuntimeException e11) {
            this.f6664j.n(eb.e1.f.f(e11).g("Failed to stream message"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if ((r10 < 0 ? 65535 : r10 > 0 ? 1 : 0) < 0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(eb.e.a<RespT> r17, eb.s0 r18) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.q.i(eb.e$a, eb.s0):void");
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(this.f6656a, Constants.METHOD);
        return b10.toString();
    }
}
