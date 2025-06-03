package k0;

import F0.C0368m;
import android.content.Context;
import android.os.Looper;
import d0.C1179b;
import d0.InterfaceC1165D;
import g0.AbstractC1297a;
import g0.InterfaceC1299c;
import k0.C1431q;
import k0.InterfaceC1442w;
import l0.C1569s0;
import x0.C2133n;
import x0.InterfaceC2142x;

/* renamed from: k0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1442w extends InterfaceC1165D {

    /* renamed from: k0.w$a */
    public interface a {
        void C(boolean z7);

        void m(boolean z7);
    }

    /* renamed from: k0.w$b */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        public long f16025A;

        /* renamed from: B, reason: collision with root package name */
        public boolean f16026B;

        /* renamed from: C, reason: collision with root package name */
        public boolean f16027C;

        /* renamed from: D, reason: collision with root package name */
        public Looper f16028D;

        /* renamed from: E, reason: collision with root package name */
        public boolean f16029E;

        /* renamed from: F, reason: collision with root package name */
        public boolean f16030F;

        /* renamed from: G, reason: collision with root package name */
        public String f16031G;

        /* renamed from: H, reason: collision with root package name */
        public boolean f16032H;

        /* renamed from: a, reason: collision with root package name */
        public final Context f16033a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC1299c f16034b;

        /* renamed from: c, reason: collision with root package name */
        public long f16035c;

        /* renamed from: d, reason: collision with root package name */
        public W2.s f16036d;

        /* renamed from: e, reason: collision with root package name */
        public W2.s f16037e;

        /* renamed from: f, reason: collision with root package name */
        public W2.s f16038f;

        /* renamed from: g, reason: collision with root package name */
        public W2.s f16039g;

        /* renamed from: h, reason: collision with root package name */
        public W2.s f16040h;

        /* renamed from: i, reason: collision with root package name */
        public W2.g f16041i;

        /* renamed from: j, reason: collision with root package name */
        public Looper f16042j;

        /* renamed from: k, reason: collision with root package name */
        public int f16043k;

        /* renamed from: l, reason: collision with root package name */
        public C1179b f16044l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f16045m;

        /* renamed from: n, reason: collision with root package name */
        public int f16046n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f16047o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f16048p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f16049q;

        /* renamed from: r, reason: collision with root package name */
        public int f16050r;

        /* renamed from: s, reason: collision with root package name */
        public int f16051s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f16052t;

        /* renamed from: u, reason: collision with root package name */
        public d1 f16053u;

        /* renamed from: v, reason: collision with root package name */
        public long f16054v;

        /* renamed from: w, reason: collision with root package name */
        public long f16055w;

        /* renamed from: x, reason: collision with root package name */
        public long f16056x;

        /* renamed from: y, reason: collision with root package name */
        public InterfaceC1443w0 f16057y;

        /* renamed from: z, reason: collision with root package name */
        public long f16058z;

        public b(final Context context) {
            this(context, new W2.s() { // from class: k0.y
                @Override // W2.s
                public final Object get() {
                    c1 g7;
                    g7 = InterfaceC1442w.b.g(context);
                    return g7;
                }
            }, new W2.s() { // from class: k0.z
                @Override // W2.s
                public final Object get() {
                    InterfaceC2142x.a h7;
                    h7 = InterfaceC1442w.b.h(context);
                    return h7;
                }
            });
        }

        public static /* synthetic */ c1 g(Context context) {
            return new C1436t(context);
        }

        public static /* synthetic */ InterfaceC2142x.a h(Context context) {
            return new C2133n(context, new C0368m());
        }

        public static /* synthetic */ A0.D i(Context context) {
            return new A0.n(context);
        }

        public InterfaceC1442w f() {
            AbstractC1297a.f(!this.f16029E);
            this.f16029E = true;
            return new C1410f0(this, null);
        }

        public b l(InterfaceC1443w0 interfaceC1443w0) {
            AbstractC1297a.f(!this.f16029E);
            this.f16057y = (InterfaceC1443w0) AbstractC1297a.e(interfaceC1443w0);
            return this;
        }

        public b m(final InterfaceC1445x0 interfaceC1445x0) {
            AbstractC1297a.f(!this.f16029E);
            AbstractC1297a.e(interfaceC1445x0);
            this.f16039g = new W2.s() { // from class: k0.x
                @Override // W2.s
                public final Object get() {
                    InterfaceC1445x0 k7;
                    k7 = InterfaceC1442w.b.k(InterfaceC1445x0.this);
                    return k7;
                }
            };
            return this;
        }

        public b(final Context context, W2.s sVar, W2.s sVar2) {
            this(context, sVar, sVar2, new W2.s() { // from class: k0.A
                @Override // W2.s
                public final Object get() {
                    A0.D i7;
                    i7 = InterfaceC1442w.b.i(context);
                    return i7;
                }
            }, new W2.s() { // from class: k0.B
                @Override // W2.s
                public final Object get() {
                    return new r();
                }
            }, new W2.s() { // from class: k0.C
                @Override // W2.s
                public final Object get() {
                    B0.e n7;
                    n7 = B0.j.n(context);
                    return n7;
                }
            }, new W2.g() { // from class: k0.D
                @Override // W2.g
                public final Object apply(Object obj) {
                    return new C1569s0((InterfaceC1299c) obj);
                }
            });
        }

        public b(Context context, W2.s sVar, W2.s sVar2, W2.s sVar3, W2.s sVar4, W2.s sVar5, W2.g gVar) {
            this.f16033a = (Context) AbstractC1297a.e(context);
            this.f16036d = sVar;
            this.f16037e = sVar2;
            this.f16038f = sVar3;
            this.f16039g = sVar4;
            this.f16040h = sVar5;
            this.f16041i = gVar;
            this.f16042j = g0.M.U();
            this.f16044l = C1179b.f12594g;
            this.f16046n = 0;
            this.f16050r = 1;
            this.f16051s = 0;
            this.f16052t = true;
            this.f16053u = d1.f15702g;
            this.f16054v = 5000L;
            this.f16055w = 15000L;
            this.f16056x = 3000L;
            this.f16057y = new C1431q.b().a();
            this.f16034b = InterfaceC1299c.f14278a;
            this.f16058z = 500L;
            this.f16025A = 2000L;
            this.f16027C = true;
            this.f16031G = "";
            this.f16043k = -1000;
        }

        public static /* synthetic */ InterfaceC1445x0 k(InterfaceC1445x0 interfaceC1445x0) {
            return interfaceC1445x0;
        }
    }

    /* renamed from: k0.w$c */
    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f16059b = new c(-9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f16060a;

        public c(long j7) {
            this.f16060a = j7;
        }
    }

    void d(boolean z7);

    void e(InterfaceC2142x interfaceC2142x);

    int j();

    void release();
}
