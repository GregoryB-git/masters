package l1;

import F0.AbstractC0357b;
import F0.InterfaceC0374t;
import F0.T;
import d0.C1194q;
import g0.AbstractC1297a;
import l1.K;

/* renamed from: l1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1587c implements InterfaceC1597m {

    /* renamed from: a, reason: collision with root package name */
    public final g0.y f16830a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.z f16831b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16832c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16833d;

    /* renamed from: e, reason: collision with root package name */
    public String f16834e;

    /* renamed from: f, reason: collision with root package name */
    public T f16835f;

    /* renamed from: g, reason: collision with root package name */
    public int f16836g;

    /* renamed from: h, reason: collision with root package name */
    public int f16837h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16838i;

    /* renamed from: j, reason: collision with root package name */
    public long f16839j;

    /* renamed from: k, reason: collision with root package name */
    public C1194q f16840k;

    /* renamed from: l, reason: collision with root package name */
    public int f16841l;

    /* renamed from: m, reason: collision with root package name */
    public long f16842m;

    public C1587c() {
        this(null, 0);
    }

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        AbstractC1297a.h(this.f16835f);
        while (zVar.a() > 0) {
            int i7 = this.f16836g;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(zVar.a(), this.f16841l - this.f16837h);
                        this.f16835f.e(zVar, min);
                        int i8 = this.f16837h + min;
                        this.f16837h = i8;
                        if (i8 == this.f16841l) {
                            AbstractC1297a.f(this.f16842m != -9223372036854775807L);
                            this.f16835f.b(this.f16842m, 1, this.f16841l, 0, null);
                            this.f16842m += this.f16839j;
                            this.f16836g = 0;
                        }
                    }
                } else if (f(zVar, this.f16831b.e(), 128)) {
                    g();
                    this.f16831b.T(0);
                    this.f16835f.e(this.f16831b, 128);
                    this.f16836g = 2;
                }
            } else if (h(zVar)) {
                this.f16836g = 1;
                this.f16831b.e()[0] = 11;
                this.f16831b.e()[1] = 119;
                this.f16837h = 2;
            }
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        this.f16836g = 0;
        this.f16837h = 0;
        this.f16838i = false;
        this.f16842m = -9223372036854775807L;
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        this.f16842m = j7;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        this.f16834e = dVar.b();
        this.f16835f = interfaceC0374t.a(dVar.c(), 1);
    }

    public final boolean f(g0.z zVar, byte[] bArr, int i7) {
        int min = Math.min(zVar.a(), i7 - this.f16837h);
        zVar.l(bArr, this.f16837h, min);
        int i8 = this.f16837h + min;
        this.f16837h = i8;
        return i8 == i7;
    }

    public final void g() {
        this.f16830a.p(0);
        AbstractC0357b.C0029b f7 = AbstractC0357b.f(this.f16830a);
        C1194q c1194q = this.f16840k;
        if (c1194q == null || f7.f1851d != c1194q.f12702B || f7.f1850c != c1194q.f12703C || !g0.M.c(f7.f1848a, c1194q.f12726n)) {
            C1194q.b j02 = new C1194q.b().a0(this.f16834e).o0(f7.f1848a).N(f7.f1851d).p0(f7.f1850c).e0(this.f16832c).m0(this.f16833d).j0(f7.f1854g);
            if ("audio/ac3".equals(f7.f1848a)) {
                j02.M(f7.f1854g);
            }
            C1194q K6 = j02.K();
            this.f16840k = K6;
            this.f16835f.d(K6);
        }
        this.f16841l = f7.f1852e;
        this.f16839j = (f7.f1853f * 1000000) / this.f16840k.f12703C;
    }

    public final boolean h(g0.z zVar) {
        while (true) {
            boolean z7 = false;
            if (zVar.a() <= 0) {
                return false;
            }
            if (this.f16838i) {
                int G6 = zVar.G();
                if (G6 == 119) {
                    this.f16838i = false;
                    return true;
                }
                if (G6 != 11) {
                    this.f16838i = z7;
                }
                z7 = true;
                this.f16838i = z7;
            } else {
                if (zVar.G() != 11) {
                    this.f16838i = z7;
                }
                z7 = true;
                this.f16838i = z7;
            }
        }
    }

    public C1587c(String str, int i7) {
        g0.y yVar = new g0.y(new byte[128]);
        this.f16830a = yVar;
        this.f16831b = new g0.z(yVar.f14341a);
        this.f16836g = 0;
        this.f16842m = -9223372036854775807L;
        this.f16832c = str;
        this.f16833d = i7;
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
    }
}
