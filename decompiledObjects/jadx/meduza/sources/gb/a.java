package gb;

import eb.s0;
import gb.d;
import gb.j2;
import gb.t;
import hb.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a extends d implements s, j2.c {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f6163g = Logger.getLogger(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final r3 f6164a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f6165b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6166c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6167d;

    /* renamed from: e, reason: collision with root package name */
    public eb.s0 f6168e;
    public volatile boolean f;

    /* renamed from: gb.a$a, reason: collision with other inner class name */
    public class C0097a implements t0 {

        /* renamed from: a, reason: collision with root package name */
        public eb.s0 f6169a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6170b;

        /* renamed from: c, reason: collision with root package name */
        public final l3 f6171c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f6172d;

        public C0097a(eb.s0 s0Var, l3 l3Var) {
            x6.b.y(s0Var, "headers");
            this.f6169a = s0Var;
            this.f6171c = l3Var;
        }

        @Override // gb.t0
        public final t0 a(eb.l lVar) {
            return this;
        }

        @Override // gb.t0
        public final void b(InputStream inputStream) {
            x6.b.I(this.f6172d == null, "writePayload should not be called multiple times");
            try {
                this.f6172d = p7.b.b(inputStream);
                for (m.e eVar : this.f6171c.f6593a) {
                    eVar.k(0);
                }
                l3 l3Var = this.f6171c;
                byte[] bArr = this.f6172d;
                long length = bArr.length;
                long length2 = bArr.length;
                for (m.e eVar2 : l3Var.f6593a) {
                    eVar2.l(0, length, length2);
                }
                l3 l3Var2 = this.f6171c;
                long length3 = this.f6172d.length;
                for (m.e eVar3 : l3Var2.f6593a) {
                    eVar3.m(length3);
                }
                l3 l3Var3 = this.f6171c;
                long length4 = this.f6172d.length;
                for (m.e eVar4 : l3Var3.f6593a) {
                    eVar4.n(length4);
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // gb.t0
        public final void close() {
            this.f6170b = true;
            x6.b.I(this.f6172d != null, "Lack of request message. GET request is only supported for unary requests");
            a.this.r().a(this.f6169a, this.f6172d);
            this.f6172d = null;
            this.f6169a = null;
        }

        @Override // gb.t0
        public final void flush() {
        }

        @Override // gb.t0
        public final void h(int i10) {
        }

        @Override // gb.t0
        public final boolean isClosed() {
            return this.f6170b;
        }
    }

    public static abstract class b extends d.a {

        /* renamed from: h, reason: collision with root package name */
        public final l3 f6174h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f6175i;

        /* renamed from: j, reason: collision with root package name */
        public t f6176j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f6177k;

        /* renamed from: l, reason: collision with root package name */
        public eb.s f6178l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f6179m;

        /* renamed from: n, reason: collision with root package name */
        public RunnableC0098a f6180n;

        /* renamed from: o, reason: collision with root package name */
        public volatile boolean f6181o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f6182p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f6183q;

        /* renamed from: gb.a$b$a, reason: collision with other inner class name */
        public class RunnableC0098a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ eb.e1 f6184a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t.a f6185b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ eb.s0 f6186c;

            public RunnableC0098a(eb.e1 e1Var, t.a aVar, eb.s0 s0Var) {
                this.f6184a = e1Var;
                this.f6185b = aVar;
                this.f6186c = s0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.g(this.f6184a, this.f6185b, this.f6186c);
            }
        }

        public b(int i10, l3 l3Var, r3 r3Var) {
            super(i10, l3Var, r3Var);
            this.f6178l = eb.s.f5200d;
            this.f6179m = false;
            this.f6174h = l3Var;
        }

        public final void g(eb.e1 e1Var, t.a aVar, eb.s0 s0Var) {
            if (this.f6175i) {
                return;
            }
            this.f6175i = true;
            l3 l3Var = this.f6174h;
            if (l3Var.f6594b.compareAndSet(false, true)) {
                for (m.e eVar : l3Var.f6593a) {
                    eVar.o(e1Var);
                }
            }
            if (this.f6218c != null) {
                e1Var.e();
            }
            this.f6176j.d(e1Var, aVar, s0Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(eb.s0 r8) {
            /*
                Method dump skipped, instructions count: 218
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gb.a.b.h(eb.s0):void");
        }

        public final void i(eb.s0 s0Var, eb.e1 e1Var, boolean z10) {
            j(e1Var, t.a.PROCESSED, z10, s0Var);
        }

        public final void j(eb.e1 e1Var, t.a aVar, boolean z10, eb.s0 s0Var) {
            x6.b.y(e1Var, "status");
            if (!this.f6182p || z10) {
                this.f6182p = true;
                this.f6183q = e1Var.e();
                synchronized (this.f6217b) {
                    this.f6221g = true;
                }
                if (this.f6179m) {
                    this.f6180n = null;
                    g(e1Var, aVar, s0Var);
                    return;
                }
                this.f6180n = new RunnableC0098a(e1Var, aVar, s0Var);
                a0 a0Var = this.f6216a;
                if (z10) {
                    a0Var.close();
                } else {
                    a0Var.H();
                }
            }
        }
    }

    public a(eb.y yVar, l3 l3Var, r3 r3Var, eb.s0 s0Var, eb.c cVar, boolean z10) {
        x6.b.y(s0Var, "headers");
        x6.b.y(r3Var, "transportTracer");
        this.f6164a = r3Var;
        this.f6166c = !Boolean.TRUE.equals(cVar.a(v0.f6840n));
        this.f6167d = z10;
        if (z10) {
            this.f6165b = new C0097a(s0Var, l3Var);
        } else {
            this.f6165b = new j2(this, yVar, l3Var);
            this.f6168e = s0Var;
        }
    }

    @Override // gb.m3
    public final boolean b() {
        boolean z10;
        d.a q10 = q();
        synchronized (q10.f6217b) {
            z10 = q10.f && q10.f6220e < 32768 && !q10.f6221g;
        }
        return z10 && !this.f;
    }

    @Override // gb.j2.c
    public final void c(s3 s3Var, boolean z10, boolean z11, int i10) {
        xc.f fVar;
        x6.b.s("null frame before EOS", s3Var != null || z10);
        h.a r10 = r();
        r10.getClass();
        pb.b.c();
        try {
            if (s3Var == null) {
                fVar = hb.h.f7264p;
            } else {
                fVar = ((hb.o) s3Var).f7333a;
                int i11 = (int) fVar.f17252b;
                if (i11 > 0) {
                    h.b bVar = hb.h.this.f7269l;
                    synchronized (bVar.f6217b) {
                        bVar.f6220e += i11;
                    }
                }
            }
            synchronized (hb.h.this.f7269l.f7275x) {
                h.b.n(hb.h.this.f7269l, fVar, z10, z11);
                r3 r3Var = hb.h.this.f6164a;
                if (i10 == 0) {
                    r3Var.getClass();
                } else {
                    r3Var.getClass();
                    r3Var.f6800a.a();
                }
            }
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

    @Override // gb.s
    public final void g(int i10) {
        q().f6216a.g(i10);
    }

    @Override // gb.s
    public final void h(int i10) {
        this.f6165b.h(i10);
    }

    @Override // gb.s
    public final void i(d2.q qVar) {
        qVar.f(((hb.h) this).f7271n.a(eb.z.f5259a), "remote_addr");
    }

    @Override // gb.s
    public final void j(eb.q qVar) {
        eb.s0 s0Var = this.f6168e;
        s0.b bVar = v0.f6830c;
        s0Var.a(bVar);
        this.f6168e.f(bVar, Long.valueOf(Math.max(0L, qVar.h(TimeUnit.NANOSECONDS))));
    }

    @Override // gb.s
    public final void l(t tVar) {
        h.b q10 = q();
        x6.b.I(q10.f6176j == null, "Already called setListener");
        q10.f6176j = tVar;
        if (this.f6167d) {
            return;
        }
        r().a(this.f6168e, null);
        this.f6168e = null;
    }

    @Override // gb.s
    public final void m() {
        if (q().f6181o) {
            return;
        }
        q().f6181o = true;
        this.f6165b.close();
    }

    @Override // gb.s
    public final void n(eb.e1 e1Var) {
        x6.b.s("Should not cancel with OK status", !e1Var.e());
        this.f = true;
        h.a r10 = r();
        r10.getClass();
        pb.b.c();
        try {
            synchronized (hb.h.this.f7269l.f7275x) {
                hb.h.this.f7269l.o(null, e1Var, true);
            }
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

    @Override // gb.s
    public final void o(eb.s sVar) {
        h.b q10 = q();
        x6.b.I(q10.f6176j == null, "Already called start");
        x6.b.y(sVar, "decompressorRegistry");
        q10.f6178l = sVar;
    }

    @Override // gb.s
    public final void p(boolean z10) {
        q().f6177k = z10;
    }

    public abstract h.a r();

    @Override // gb.d
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract h.b q();
}
