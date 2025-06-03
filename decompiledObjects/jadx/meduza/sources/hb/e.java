package hb;

import eb.k1;
import eb.o0;
import eb.v;
import gb.d1;
import gb.e2;
import gb.h.a;
import gb.h3;
import gb.j3;
import gb.m2;
import gb.o1;
import gb.r3;
import gb.v;
import gb.v0;
import gb.x;
import ib.b;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class e extends v<e> {

    /* renamed from: m, reason: collision with root package name */
    public static final ib.b f7231m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f7232n;

    /* renamed from: o, reason: collision with root package name */
    public static final j3 f7233o;

    /* renamed from: a, reason: collision with root package name */
    public final e2 f7234a;

    /* renamed from: e, reason: collision with root package name */
    public SSLSocketFactory f7238e;

    /* renamed from: b, reason: collision with root package name */
    public r3.a f7235b = r3.f6799c;

    /* renamed from: c, reason: collision with root package name */
    public j3 f7236c = f7233o;

    /* renamed from: d, reason: collision with root package name */
    public j3 f7237d = new j3(v0.f6843q);
    public ib.b f = f7231m;

    /* renamed from: g, reason: collision with root package name */
    public int f7239g = 1;

    /* renamed from: h, reason: collision with root package name */
    public long f7240h = Long.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public long f7241i = v0.f6838l;

    /* renamed from: j, reason: collision with root package name */
    public int f7242j = 65535;

    /* renamed from: k, reason: collision with root package name */
    public int f7243k = 4194304;

    /* renamed from: l, reason: collision with root package name */
    public int f7244l = Integer.MAX_VALUE;

    public class a implements h3.c<Executor> {
        @Override // gb.h3.c
        public final Executor a() {
            return Executors.newCachedThreadPool(v0.d("grpc-okhttp-%d"));
        }

        @Override // gb.h3.c
        public final void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }
    }

    public final class b implements e2.a {
        public b() {
        }

        @Override // gb.e2.a
        public final int a() {
            e eVar = e.this;
            int c10 = q0.g.c(eVar.f7239g);
            if (c10 == 0) {
                return 443;
            }
            if (c10 == 1) {
                return 80;
            }
            throw new AssertionError(defpackage.g.p(eVar.f7239g) + " not handled");
        }
    }

    public final class c implements e2.b {
        public c() {
        }

        @Override // gb.e2.b
        public final d a() {
            SSLSocketFactory sSLSocketFactory;
            e eVar = e.this;
            boolean z10 = eVar.f7240h != Long.MAX_VALUE;
            j3 j3Var = eVar.f7236c;
            j3 j3Var2 = eVar.f7237d;
            int c10 = q0.g.c(eVar.f7239g);
            if (c10 == 0) {
                try {
                    if (eVar.f7238e == null) {
                        eVar.f7238e = SSLContext.getInstance("Default", ib.i.f7920d.f7921a).getSocketFactory();
                    }
                    sSLSocketFactory = eVar.f7238e;
                } catch (GeneralSecurityException e10) {
                    throw new RuntimeException("TLS Provider failure", e10);
                }
            } else {
                if (c10 != 1) {
                    StringBuilder l10 = defpackage.f.l("Unknown negotiation type: ");
                    l10.append(defpackage.g.p(eVar.f7239g));
                    throw new RuntimeException(l10.toString());
                }
                sSLSocketFactory = null;
            }
            return new d(j3Var, j3Var2, sSLSocketFactory, eVar.f, eVar.f7243k, z10, eVar.f7240h, eVar.f7241i, eVar.f7242j, eVar.f7244l, eVar.f7235b);
        }
    }

    public static final class d implements gb.v {

        /* renamed from: a, reason: collision with root package name */
        public final m2<Executor> f7247a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f7248b;

        /* renamed from: c, reason: collision with root package name */
        public final m2<ScheduledExecutorService> f7249c;

        /* renamed from: d, reason: collision with root package name */
        public final ScheduledExecutorService f7250d;

        /* renamed from: e, reason: collision with root package name */
        public final r3.a f7251e;

        /* renamed from: o, reason: collision with root package name */
        public final SSLSocketFactory f7252o;

        /* renamed from: q, reason: collision with root package name */
        public final ib.b f7254q;

        /* renamed from: r, reason: collision with root package name */
        public final int f7255r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f7256s;
        public final gb.h t;

        /* renamed from: u, reason: collision with root package name */
        public final long f7257u;

        /* renamed from: v, reason: collision with root package name */
        public final int f7258v;

        /* renamed from: x, reason: collision with root package name */
        public final int f7260x;

        /* renamed from: z, reason: collision with root package name */
        public boolean f7262z;
        public final SocketFactory f = null;

        /* renamed from: p, reason: collision with root package name */
        public final HostnameVerifier f7253p = null;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f7259w = false;

        /* renamed from: y, reason: collision with root package name */
        public final boolean f7261y = false;

        public d(j3 j3Var, j3 j3Var2, SSLSocketFactory sSLSocketFactory, ib.b bVar, int i10, boolean z10, long j10, long j11, int i11, int i12, r3.a aVar) {
            this.f7247a = j3Var;
            this.f7248b = (Executor) j3Var.b();
            this.f7249c = j3Var2;
            this.f7250d = (ScheduledExecutorService) j3Var2.b();
            this.f7252o = sSLSocketFactory;
            this.f7254q = bVar;
            this.f7255r = i10;
            this.f7256s = z10;
            this.t = new gb.h(j10);
            this.f7257u = j11;
            this.f7258v = i11;
            this.f7260x = i12;
            x6.b.y(aVar, "transportTracerFactory");
            this.f7251e = aVar;
        }

        @Override // gb.v
        public final x W(SocketAddress socketAddress, v.a aVar, d1.f fVar) {
            if (this.f7262z) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            gb.h hVar = this.t;
            long j10 = hVar.f6452b.get();
            i iVar = new i(this, (InetSocketAddress) socketAddress, aVar.f6824a, aVar.f6826c, aVar.f6825b, aVar.f6827d, new f(hVar.new a(j10)));
            if (this.f7256s) {
                long j11 = this.f7257u;
                boolean z10 = this.f7259w;
                iVar.H = true;
                iVar.I = j10;
                iVar.J = j11;
                iVar.K = z10;
            }
            return iVar;
        }

        @Override // gb.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f7262z) {
                return;
            }
            this.f7262z = true;
            this.f7247a.a(this.f7248b);
            this.f7249c.a(this.f7250d);
        }

        @Override // gb.v
        public final ScheduledExecutorService p0() {
            return this.f7250d;
        }

        @Override // gb.v
        public final Collection<Class<? extends SocketAddress>> y0() {
            return Collections.singleton(InetSocketAddress.class);
        }
    }

    static {
        Logger.getLogger(e.class.getName());
        b.a aVar = new b.a(ib.b.f7899e);
        aVar.a(ib.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, ib.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, ib.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, ib.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, ib.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, ib.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        aVar.b(ib.k.TLS_1_2);
        if (!aVar.f7904a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        aVar.f7907d = true;
        f7231m = new ib.b(aVar);
        f7232n = TimeUnit.DAYS.toNanos(1000L);
        f7233o = new j3(new a());
        EnumSet.of(k1.MTLS, k1.CUSTOM_MANAGERS);
    }

    public e(String str) {
        this.f7234a = new e2(str, new c(), new b());
    }

    @Override // eb.o0
    public final void b(TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(30L);
        this.f7240h = nanos;
        long max = Math.max(nanos, o1.f6605l);
        this.f7240h = max;
        if (max >= f7232n) {
            this.f7240h = Long.MAX_VALUE;
        }
    }

    @Override // eb.o0
    public final void c() {
        this.f7239g = 2;
    }

    @Override // eb.v
    public final o0<?> d() {
        return this.f7234a;
    }
}
