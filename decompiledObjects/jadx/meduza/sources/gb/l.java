package gb;

import eb.b;
import gb.d1;
import gb.k2;
import gb.r1;
import gb.v;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f6575a;

    /* renamed from: b, reason: collision with root package name */
    public final eb.b f6576b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f6577c;

    public class a extends p0 {

        /* renamed from: a, reason: collision with root package name */
        public final x f6578a;

        /* renamed from: c, reason: collision with root package name */
        public volatile eb.e1 f6580c;

        /* renamed from: d, reason: collision with root package name */
        public eb.e1 f6581d;

        /* renamed from: e, reason: collision with root package name */
        public eb.e1 f6582e;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f6579b = new AtomicInteger(-2147483647);
        public final C0101a f = new C0101a();

        /* renamed from: gb.l$a$a, reason: collision with other inner class name */
        public class C0101a implements k2.a {
            public C0101a() {
            }

            public final void a() {
                if (a.this.f6579b.decrementAndGet() == 0) {
                    a.b(a.this);
                }
            }
        }

        public class b extends b.AbstractC0074b {
        }

        public a(x xVar, String str) {
            x6.b.y(xVar, "delegate");
            this.f6578a = xVar;
            x6.b.y(str, "authority");
        }

        public static void b(a aVar) {
            synchronized (aVar) {
                if (aVar.f6579b.get() != 0) {
                    return;
                }
                eb.e1 e1Var = aVar.f6581d;
                eb.e1 e1Var2 = aVar.f6582e;
                aVar.f6581d = null;
                aVar.f6582e = null;
                if (e1Var != null) {
                    super.c(e1Var);
                }
                if (e1Var2 != null) {
                    super.h(e1Var2);
                }
            }
        }

        @Override // gb.p0
        public final x a() {
            return this.f6578a;
        }

        @Override // gb.p0, gb.h2
        public final void c(eb.e1 e1Var) {
            x6.b.y(e1Var, "status");
            synchronized (this) {
                if (this.f6579b.get() < 0) {
                    this.f6580c = e1Var;
                    this.f6579b.addAndGet(Integer.MAX_VALUE);
                    if (this.f6579b.get() != 0) {
                        this.f6581d = e1Var;
                    } else {
                        super.c(e1Var);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2, types: [eb.b] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // gb.u
        public final s d(eb.t0<?, ?> t0Var, eb.s0 s0Var, eb.c cVar, eb.h[] hVarArr) {
            eb.g0 kVar;
            s sVar;
            Executor executor;
            eb.b bVar = cVar.f5038d;
            if (bVar == null) {
                kVar = l.this.f6576b;
            } else {
                eb.b bVar2 = l.this.f6576b;
                kVar = bVar;
                if (bVar2 != null) {
                    kVar = new eb.k(bVar2, bVar);
                }
            }
            if (kVar == 0) {
                return this.f6579b.get() >= 0 ? new l0(this.f6580c, hVarArr) : this.f6578a.d(t0Var, s0Var, cVar, hVarArr);
            }
            k2 k2Var = new k2(this.f6578a, t0Var, s0Var, cVar, this.f, hVarArr);
            if (this.f6579b.incrementAndGet() > 0) {
                this.f.a();
                return new l0(this.f6580c, hVarArr);
            }
            b bVar3 = new b();
            try {
                if (!(kVar instanceof eb.g0) || !kVar.a() || (executor = cVar.f5036b) == null) {
                    executor = l.this.f6577c;
                }
                kVar.a(bVar3, executor, k2Var);
            } catch (Throwable th) {
                k2Var.b(eb.e1.f5074j.g("Credentials should use fail() instead of throwing exceptions").f(th));
            }
            synchronized (k2Var.f6569h) {
                s sVar2 = k2Var.f6570i;
                sVar = sVar2;
                if (sVar2 == null) {
                    g0 g0Var = new g0();
                    k2Var.f6572k = g0Var;
                    k2Var.f6570i = g0Var;
                    sVar = g0Var;
                }
            }
            return sVar;
        }

        @Override // gb.p0, gb.h2
        public final void h(eb.e1 e1Var) {
            x6.b.y(e1Var, "status");
            synchronized (this) {
                if (this.f6579b.get() < 0) {
                    this.f6580c = e1Var;
                    this.f6579b.addAndGet(Integer.MAX_VALUE);
                } else if (this.f6582e != null) {
                    return;
                }
                if (this.f6579b.get() != 0) {
                    this.f6582e = e1Var;
                } else {
                    super.h(e1Var);
                }
            }
        }
    }

    public l(v vVar, eb.b bVar, r1.h hVar) {
        x6.b.y(vVar, "delegate");
        this.f6575a = vVar;
        this.f6576b = bVar;
        this.f6577c = hVar;
    }

    @Override // gb.v
    public final x W(SocketAddress socketAddress, v.a aVar, d1.f fVar) {
        return new a(this.f6575a.W(socketAddress, aVar, fVar), aVar.f6824a);
    }

    @Override // gb.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6575a.close();
    }

    @Override // gb.v
    public final ScheduledExecutorService p0() {
        return this.f6575a.p0();
    }

    @Override // gb.v
    public final Collection<Class<? extends SocketAddress>> y0() {
        return this.f6575a.y0();
    }
}
