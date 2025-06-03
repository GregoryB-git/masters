package hb;

import c4.x;
import gb.f3;
import hb.b;
import java.io.IOException;
import java.net.Socket;
import xc.w;
import xc.z;

/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: c, reason: collision with root package name */
    public final f3 f7207c;

    /* renamed from: d, reason: collision with root package name */
    public final b.a f7208d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7209e;

    /* renamed from: q, reason: collision with root package name */
    public w f7212q;

    /* renamed from: r, reason: collision with root package name */
    public Socket f7213r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7214s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f7215u;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7205a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final xc.f f7206b = new xc.f();
    public boolean f = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7210o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7211p = false;

    /* renamed from: hb.a$a, reason: collision with other inner class name */
    public class C0106a extends e {
        public C0106a() {
            super();
            pb.b.b();
        }

        @Override // hb.a.e
        public final void a() {
            a aVar;
            int i10;
            xc.f fVar = new xc.f();
            pb.b.c();
            try {
                pb.a aVar2 = pb.b.f13110a;
                aVar2.getClass();
                synchronized (a.this.f7205a) {
                    xc.f fVar2 = a.this.f7206b;
                    fVar.g0(fVar2, fVar2.g());
                    aVar = a.this;
                    aVar.f = false;
                    i10 = aVar.f7215u;
                }
                aVar.f7212q.g0(fVar, fVar.f17252b);
                synchronized (a.this.f7205a) {
                    a.this.f7215u -= i10;
                }
                aVar2.getClass();
            } catch (Throwable th) {
                try {
                    pb.b.f13110a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public class b extends e {
        public b() {
            super();
            pb.b.b();
        }

        @Override // hb.a.e
        public final void a() {
            a aVar;
            xc.f fVar = new xc.f();
            pb.b.c();
            try {
                pb.a aVar2 = pb.b.f13110a;
                aVar2.getClass();
                synchronized (a.this.f7205a) {
                    xc.f fVar2 = a.this.f7206b;
                    fVar.g0(fVar2, fVar2.f17252b);
                    aVar = a.this;
                    aVar.f7210o = false;
                }
                aVar.f7212q.g0(fVar, fVar.f17252b);
                a.this.f7212q.flush();
                aVar2.getClass();
            } catch (Throwable th) {
                try {
                    pb.b.f13110a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a aVar = a.this;
                w wVar = aVar.f7212q;
                if (wVar != null) {
                    xc.f fVar = aVar.f7206b;
                    long j10 = fVar.f17252b;
                    if (j10 > 0) {
                        wVar.g0(fVar, j10);
                    }
                }
            } catch (IOException e10) {
                a.this.f7208d.a(e10);
            }
            a.this.f7206b.getClass();
            try {
                w wVar2 = a.this.f7212q;
                if (wVar2 != null) {
                    wVar2.close();
                }
            } catch (IOException e11) {
                a.this.f7208d.a(e11);
            }
            try {
                Socket socket = a.this.f7213r;
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e12) {
                a.this.f7208d.a(e12);
            }
        }
    }

    public class d extends hb.c {
        public d(jb.c cVar) {
            super(cVar);
        }

        @Override // jb.c
        public final void L(x xVar) {
            a.this.t++;
            this.f7225a.L(xVar);
        }

        @Override // jb.c
        public final void R(int i10, jb.a aVar) {
            a.this.t++;
            this.f7225a.R(i10, aVar);
        }

        @Override // jb.c
        public final void e(int i10, int i11, boolean z10) {
            if (z10) {
                a.this.t++;
            }
            this.f7225a.e(i10, i11, z10);
        }
    }

    public abstract class e implements Runnable {
        public e() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (a.this.f7212q == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                a();
            } catch (Exception e10) {
                a.this.f7208d.a(e10);
            }
        }
    }

    public a(f3 f3Var, b.a aVar) {
        x6.b.y(f3Var, "executor");
        this.f7207c = f3Var;
        x6.b.y(aVar, "exceptionHandler");
        this.f7208d = aVar;
        this.f7209e = 10000;
    }

    @Override // xc.w
    public final z c() {
        return z.f17297d;
    }

    @Override // xc.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7211p) {
            return;
        }
        this.f7211p = true;
        this.f7207c.execute(new c());
    }

    public final void f(xc.d dVar, Socket socket) {
        x6.b.I(this.f7212q == null, "AsyncSink's becomeConnected should only be called once.");
        this.f7212q = dVar;
        this.f7213r = socket;
    }

    @Override // xc.w, java.io.Flushable
    public final void flush() {
        if (this.f7211p) {
            throw new IOException("closed");
        }
        pb.b.c();
        try {
            synchronized (this.f7205a) {
                if (!this.f7210o) {
                    this.f7210o = true;
                    this.f7207c.execute(new b());
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

    @Override // xc.w
    public final void g0(xc.f fVar, long j10) {
        x6.b.y(fVar, "source");
        if (this.f7211p) {
            throw new IOException("closed");
        }
        pb.b.c();
        try {
            synchronized (this.f7205a) {
                this.f7206b.g0(fVar, j10);
                int i10 = this.f7215u + this.t;
                this.f7215u = i10;
                boolean z10 = false;
                this.t = 0;
                if (!this.f7214s && i10 > this.f7209e) {
                    this.f7214s = true;
                    z10 = true;
                } else if (!this.f && !this.f7210o && this.f7206b.g() > 0) {
                    this.f = true;
                }
                if (z10) {
                    try {
                        this.f7213r.close();
                    } catch (IOException e10) {
                        this.f7208d.a(e10);
                    }
                } else {
                    this.f7207c.execute(new C0106a());
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
}
