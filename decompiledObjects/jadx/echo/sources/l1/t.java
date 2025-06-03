package l1;

import F0.I;
import F0.InterfaceC0374t;
import F0.T;
import d0.C1194q;
import g0.AbstractC1297a;
import l1.K;

/* loaded from: classes.dex */
public final class t implements InterfaceC1597m {

    /* renamed from: a, reason: collision with root package name */
    public final g0.z f17074a;

    /* renamed from: b, reason: collision with root package name */
    public final I.a f17075b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17076c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17077d;

    /* renamed from: e, reason: collision with root package name */
    public T f17078e;

    /* renamed from: f, reason: collision with root package name */
    public String f17079f;

    /* renamed from: g, reason: collision with root package name */
    public int f17080g;

    /* renamed from: h, reason: collision with root package name */
    public int f17081h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17082i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17083j;

    /* renamed from: k, reason: collision with root package name */
    public long f17084k;

    /* renamed from: l, reason: collision with root package name */
    public int f17085l;

    /* renamed from: m, reason: collision with root package name */
    public long f17086m;

    public t() {
        this(null, 0);
    }

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        AbstractC1297a.h(this.f17078e);
        while (zVar.a() > 0) {
            int i7 = this.f17080g;
            if (i7 == 0) {
                f(zVar);
            } else if (i7 == 1) {
                h(zVar);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                g(zVar);
            }
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        this.f17080g = 0;
        this.f17081h = 0;
        this.f17083j = false;
        this.f17086m = -9223372036854775807L;
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        this.f17086m = j7;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        this.f17079f = dVar.b();
        this.f17078e = interfaceC0374t.a(dVar.c(), 1);
    }

    public final void f(g0.z zVar) {
        byte[] e7 = zVar.e();
        int g7 = zVar.g();
        for (int f7 = zVar.f(); f7 < g7; f7++) {
            byte b7 = e7[f7];
            boolean z7 = (b7 & 255) == 255;
            boolean z8 = this.f17083j && (b7 & 224) == 224;
            this.f17083j = z7;
            if (z8) {
                zVar.T(f7 + 1);
                this.f17083j = false;
                this.f17074a.e()[1] = e7[f7];
                this.f17081h = 2;
                this.f17080g = 1;
                return;
            }
        }
        zVar.T(g7);
    }

    public final void g(g0.z zVar) {
        int min = Math.min(zVar.a(), this.f17085l - this.f17081h);
        this.f17078e.e(zVar, min);
        int i7 = this.f17081h + min;
        this.f17081h = i7;
        if (i7 < this.f17085l) {
            return;
        }
        AbstractC1297a.f(this.f17086m != -9223372036854775807L);
        this.f17078e.b(this.f17086m, 1, this.f17085l, 0, null);
        this.f17086m += this.f17084k;
        this.f17081h = 0;
        this.f17080g = 0;
    }

    public final void h(g0.z zVar) {
        int min = Math.min(zVar.a(), 4 - this.f17081h);
        zVar.l(this.f17074a.e(), this.f17081h, min);
        int i7 = this.f17081h + min;
        this.f17081h = i7;
        if (i7 < 4) {
            return;
        }
        this.f17074a.T(0);
        if (!this.f17075b.a(this.f17074a.p())) {
            this.f17081h = 0;
            this.f17080g = 1;
            return;
        }
        this.f17085l = this.f17075b.f1783c;
        if (!this.f17082i) {
            this.f17084k = (r8.f1787g * 1000000) / r8.f1784d;
            this.f17078e.d(new C1194q.b().a0(this.f17079f).o0(this.f17075b.f1782b).f0(4096).N(this.f17075b.f1785e).p0(this.f17075b.f1784d).e0(this.f17076c).m0(this.f17077d).K());
            this.f17082i = true;
        }
        this.f17074a.T(0);
        this.f17078e.e(this.f17074a, 4);
        this.f17080g = 2;
    }

    public t(String str, int i7) {
        this.f17080g = 0;
        g0.z zVar = new g0.z(4);
        this.f17074a = zVar;
        zVar.e()[0] = -1;
        this.f17075b = new I.a();
        this.f17086m = -9223372036854775807L;
        this.f17076c = str;
        this.f17077d = i7;
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
    }
}
