package l1;

import F0.AbstractC0358c;
import F0.InterfaceC0374t;
import F0.T;
import d0.C1194q;
import g0.AbstractC1297a;
import l1.K;

/* renamed from: l1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1590f implements InterfaceC1597m {

    /* renamed from: a, reason: collision with root package name */
    public final g0.y f16847a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.z f16848b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16849c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16850d;

    /* renamed from: e, reason: collision with root package name */
    public String f16851e;

    /* renamed from: f, reason: collision with root package name */
    public T f16852f;

    /* renamed from: g, reason: collision with root package name */
    public int f16853g;

    /* renamed from: h, reason: collision with root package name */
    public int f16854h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16855i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16856j;

    /* renamed from: k, reason: collision with root package name */
    public long f16857k;

    /* renamed from: l, reason: collision with root package name */
    public C1194q f16858l;

    /* renamed from: m, reason: collision with root package name */
    public int f16859m;

    /* renamed from: n, reason: collision with root package name */
    public long f16860n;

    public C1590f() {
        this(null, 0);
    }

    private boolean f(g0.z zVar, byte[] bArr, int i7) {
        int min = Math.min(zVar.a(), i7 - this.f16854h);
        zVar.l(bArr, this.f16854h, min);
        int i8 = this.f16854h + min;
        this.f16854h = i8;
        return i8 == i7;
    }

    private void g() {
        this.f16847a.p(0);
        AbstractC0358c.b d7 = AbstractC0358c.d(this.f16847a);
        C1194q c1194q = this.f16858l;
        if (c1194q == null || d7.f1858c != c1194q.f12702B || d7.f1857b != c1194q.f12703C || !"audio/ac4".equals(c1194q.f12726n)) {
            C1194q K6 = new C1194q.b().a0(this.f16851e).o0("audio/ac4").N(d7.f1858c).p0(d7.f1857b).e0(this.f16849c).m0(this.f16850d).K();
            this.f16858l = K6;
            this.f16852f.d(K6);
        }
        this.f16859m = d7.f1859d;
        this.f16857k = (d7.f1860e * 1000000) / this.f16858l.f12703C;
    }

    private boolean h(g0.z zVar) {
        int G6;
        while (true) {
            if (zVar.a() <= 0) {
                return false;
            }
            if (this.f16855i) {
                G6 = zVar.G();
                this.f16855i = G6 == 172;
                if (G6 == 64 || G6 == 65) {
                    break;
                }
            } else {
                this.f16855i = zVar.G() == 172;
            }
        }
        this.f16856j = G6 == 65;
        return true;
    }

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        AbstractC1297a.h(this.f16852f);
        while (zVar.a() > 0) {
            int i7 = this.f16853g;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(zVar.a(), this.f16859m - this.f16854h);
                        this.f16852f.e(zVar, min);
                        int i8 = this.f16854h + min;
                        this.f16854h = i8;
                        if (i8 == this.f16859m) {
                            AbstractC1297a.f(this.f16860n != -9223372036854775807L);
                            this.f16852f.b(this.f16860n, 1, this.f16859m, 0, null);
                            this.f16860n += this.f16857k;
                            this.f16853g = 0;
                        }
                    }
                } else if (f(zVar, this.f16848b.e(), 16)) {
                    g();
                    this.f16848b.T(0);
                    this.f16852f.e(this.f16848b, 16);
                    this.f16853g = 2;
                }
            } else if (h(zVar)) {
                this.f16853g = 1;
                this.f16848b.e()[0] = -84;
                this.f16848b.e()[1] = (byte) (this.f16856j ? 65 : 64);
                this.f16854h = 2;
            }
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        this.f16853g = 0;
        this.f16854h = 0;
        this.f16855i = false;
        this.f16856j = false;
        this.f16860n = -9223372036854775807L;
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        this.f16860n = j7;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        this.f16851e = dVar.b();
        this.f16852f = interfaceC0374t.a(dVar.c(), 1);
    }

    public C1590f(String str, int i7) {
        g0.y yVar = new g0.y(new byte[16]);
        this.f16847a = yVar;
        this.f16848b = new g0.z(yVar.f14341a);
        this.f16853g = 0;
        this.f16854h = 0;
        this.f16855i = false;
        this.f16856j = false;
        this.f16860n = -9223372036854775807L;
        this.f16849c = str;
        this.f16850d = i7;
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
    }
}
