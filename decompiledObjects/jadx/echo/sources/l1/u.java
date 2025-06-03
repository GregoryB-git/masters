package l1;

import F0.InterfaceC0374t;
import F0.T;
import X2.AbstractC0703v;
import d0.C1194q;
import g0.AbstractC1297a;
import l1.K;
import l1.v;

/* loaded from: classes.dex */
public final class u implements InterfaceC1597m {

    /* renamed from: e, reason: collision with root package name */
    public String f17091e;

    /* renamed from: f, reason: collision with root package name */
    public T f17092f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17095i;

    /* renamed from: k, reason: collision with root package name */
    public int f17097k;

    /* renamed from: l, reason: collision with root package name */
    public int f17098l;

    /* renamed from: n, reason: collision with root package name */
    public int f17100n;

    /* renamed from: o, reason: collision with root package name */
    public int f17101o;

    /* renamed from: s, reason: collision with root package name */
    public int f17105s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17107u;

    /* renamed from: d, reason: collision with root package name */
    public int f17090d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final g0.z f17087a = new g0.z(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final g0.y f17088b = new g0.y();

    /* renamed from: c, reason: collision with root package name */
    public final g0.z f17089c = new g0.z();

    /* renamed from: p, reason: collision with root package name */
    public v.b f17102p = new v.b();

    /* renamed from: q, reason: collision with root package name */
    public int f17103q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f17104r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f17106t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17096j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17099m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f17093g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f17094h = -9.223372036854776E18d;

    private boolean k(g0.z zVar) {
        int i7 = this.f17097k;
        if ((i7 & 2) == 0) {
            zVar.T(zVar.g());
            return false;
        }
        if ((i7 & 4) != 0) {
            return true;
        }
        while (zVar.a() > 0) {
            int i8 = this.f17098l << 8;
            this.f17098l = i8;
            int G6 = i8 | zVar.G();
            this.f17098l = G6;
            if (v.e(G6)) {
                zVar.T(zVar.f() - 3);
                this.f17098l = 0;
                return true;
            }
        }
        return false;
    }

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        AbstractC1297a.h(this.f17092f);
        while (zVar.a() > 0) {
            int i7 = this.f17090d;
            if (i7 != 0) {
                if (i7 == 1) {
                    f(zVar, this.f17087a, false);
                    if (this.f17087a.a() == 0) {
                        if (i()) {
                            this.f17087a.T(0);
                            T t7 = this.f17092f;
                            g0.z zVar2 = this.f17087a;
                            t7.e(zVar2, zVar2.g());
                            this.f17087a.P(2);
                            this.f17089c.P(this.f17102p.f17110c);
                            this.f17099m = true;
                            this.f17090d = 2;
                        } else if (this.f17087a.g() < 15) {
                            g0.z zVar3 = this.f17087a;
                            zVar3.S(zVar3.g() + 1);
                        }
                    }
                    this.f17099m = false;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f17102p.f17108a)) {
                        f(zVar, this.f17089c, true);
                    }
                    l(zVar);
                    int i8 = this.f17100n;
                    v.b bVar = this.f17102p;
                    if (i8 == bVar.f17110c) {
                        int i9 = bVar.f17108a;
                        if (i9 == 1) {
                            h(new g0.y(this.f17089c.e()));
                        } else if (i9 == 17) {
                            this.f17105s = v.f(new g0.y(this.f17089c.e()));
                        } else if (i9 == 2) {
                            g();
                        }
                        this.f17090d = 1;
                    }
                }
            } else if (k(zVar)) {
                this.f17090d = 1;
            }
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        this.f17090d = 0;
        this.f17098l = 0;
        this.f17087a.P(2);
        this.f17100n = 0;
        this.f17101o = 0;
        this.f17103q = -2147483647;
        this.f17104r = -1;
        this.f17105s = 0;
        this.f17106t = -1L;
        this.f17107u = false;
        this.f17095i = false;
        this.f17099m = true;
        this.f17096j = true;
        this.f17093g = -9.223372036854776E18d;
        this.f17094h = -9.223372036854776E18d;
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        this.f17097k = i7;
        if (!this.f17096j && (this.f17101o != 0 || !this.f17099m)) {
            this.f17095i = true;
        }
        if (j7 != -9223372036854775807L) {
            double d7 = j7;
            if (this.f17095i) {
                this.f17094h = d7;
            } else {
                this.f17093g = d7;
            }
        }
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        this.f17091e = dVar.b();
        this.f17092f = interfaceC0374t.a(dVar.c(), 1);
    }

    public final void f(g0.z zVar, g0.z zVar2, boolean z7) {
        int f7 = zVar.f();
        int min = Math.min(zVar.a(), zVar2.a());
        zVar.l(zVar2.e(), zVar2.f(), min);
        zVar2.U(min);
        if (z7) {
            zVar.T(f7);
        }
    }

    public final void g() {
        int i7;
        if (this.f17107u) {
            this.f17096j = false;
            i7 = 1;
        } else {
            i7 = 0;
        }
        double d7 = ((this.f17104r - this.f17105s) * 1000000.0d) / this.f17103q;
        long round = Math.round(this.f17093g);
        if (this.f17095i) {
            this.f17095i = false;
            this.f17093g = this.f17094h;
        } else {
            this.f17093g += d7;
        }
        this.f17092f.b(round, i7, this.f17101o, 0, null);
        this.f17107u = false;
        this.f17105s = 0;
        this.f17101o = 0;
    }

    public final void h(g0.y yVar) {
        v.c h7 = v.h(yVar);
        this.f17103q = h7.f17112b;
        this.f17104r = h7.f17113c;
        long j7 = this.f17106t;
        long j8 = this.f17102p.f17109b;
        if (j7 != j8) {
            this.f17106t = j8;
            String str = "mhm1";
            if (h7.f17111a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(h7.f17111a));
            }
            byte[] bArr = h7.f17114d;
            this.f17092f.d(new C1194q.b().a0(this.f17091e).o0("audio/mhm1").p0(this.f17103q).O(str).b0((bArr == null || bArr.length <= 0) ? null : AbstractC0703v.a0(g0.M.f14266f, bArr)).K());
        }
        this.f17107u = true;
    }

    public final boolean i() {
        int g7 = this.f17087a.g();
        this.f17088b.o(this.f17087a.e(), g7);
        boolean g8 = v.g(this.f17088b, this.f17102p);
        if (g8) {
            this.f17100n = 0;
            this.f17101o += this.f17102p.f17110c + g7;
        }
        return g8;
    }

    public final boolean j(int i7) {
        return i7 == 1 || i7 == 17;
    }

    public final void l(g0.z zVar) {
        int min = Math.min(zVar.a(), this.f17102p.f17110c - this.f17100n);
        this.f17092f.e(zVar, min);
        this.f17100n += min;
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
    }
}
