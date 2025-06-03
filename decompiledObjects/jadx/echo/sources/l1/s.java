package l1;

import F0.AbstractC0356a;
import F0.InterfaceC0374t;
import F0.T;
import d0.C1162A;
import d0.C1194q;
import g0.AbstractC1297a;
import java.util.Collections;
import l1.K;

/* loaded from: classes.dex */
public final class s implements InterfaceC1597m {

    /* renamed from: a, reason: collision with root package name */
    public final String f17052a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17053b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.z f17054c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.y f17055d;

    /* renamed from: e, reason: collision with root package name */
    public T f17056e;

    /* renamed from: f, reason: collision with root package name */
    public String f17057f;

    /* renamed from: g, reason: collision with root package name */
    public C1194q f17058g;

    /* renamed from: h, reason: collision with root package name */
    public int f17059h;

    /* renamed from: i, reason: collision with root package name */
    public int f17060i;

    /* renamed from: j, reason: collision with root package name */
    public int f17061j;

    /* renamed from: k, reason: collision with root package name */
    public int f17062k;

    /* renamed from: l, reason: collision with root package name */
    public long f17063l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17064m;

    /* renamed from: n, reason: collision with root package name */
    public int f17065n;

    /* renamed from: o, reason: collision with root package name */
    public int f17066o;

    /* renamed from: p, reason: collision with root package name */
    public int f17067p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17068q;

    /* renamed from: r, reason: collision with root package name */
    public long f17069r;

    /* renamed from: s, reason: collision with root package name */
    public int f17070s;

    /* renamed from: t, reason: collision with root package name */
    public long f17071t;

    /* renamed from: u, reason: collision with root package name */
    public int f17072u;

    /* renamed from: v, reason: collision with root package name */
    public String f17073v;

    public s(String str, int i7) {
        this.f17052a = str;
        this.f17053b = i7;
        g0.z zVar = new g0.z(1024);
        this.f17054c = zVar;
        this.f17055d = new g0.y(zVar.e());
        this.f17063l = -9223372036854775807L;
    }

    public static long f(g0.y yVar) {
        return yVar.h((yVar.h(2) + 1) * 8);
    }

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        AbstractC1297a.h(this.f17056e);
        while (zVar.a() > 0) {
            int i7 = this.f17059h;
            if (i7 != 0) {
                if (i7 == 1) {
                    int G6 = zVar.G();
                    if ((G6 & 224) == 224) {
                        this.f17062k = G6;
                        this.f17059h = 2;
                    } else if (G6 != 86) {
                        this.f17059h = 0;
                    }
                } else if (i7 == 2) {
                    int G7 = ((this.f17062k & (-225)) << 8) | zVar.G();
                    this.f17061j = G7;
                    if (G7 > this.f17054c.e().length) {
                        m(this.f17061j);
                    }
                    this.f17060i = 0;
                    this.f17059h = 3;
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(zVar.a(), this.f17061j - this.f17060i);
                    zVar.l(this.f17055d.f14341a, this.f17060i, min);
                    int i8 = this.f17060i + min;
                    this.f17060i = i8;
                    if (i8 == this.f17061j) {
                        this.f17055d.p(0);
                        g(this.f17055d);
                        this.f17059h = 0;
                    }
                }
            } else if (zVar.G() == 86) {
                this.f17059h = 1;
            }
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        this.f17059h = 0;
        this.f17063l = -9223372036854775807L;
        this.f17064m = false;
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        this.f17063l = j7;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        this.f17056e = interfaceC0374t.a(dVar.c(), 1);
        this.f17057f = dVar.b();
    }

    public final void g(g0.y yVar) {
        if (!yVar.g()) {
            this.f17064m = true;
            l(yVar);
        } else if (!this.f17064m) {
            return;
        }
        if (this.f17065n != 0) {
            throw C1162A.a(null, null);
        }
        if (this.f17066o != 0) {
            throw C1162A.a(null, null);
        }
        k(yVar, j(yVar));
        if (this.f17068q) {
            yVar.r((int) this.f17069r);
        }
    }

    public final int h(g0.y yVar) {
        int b7 = yVar.b();
        AbstractC0356a.b d7 = AbstractC0356a.d(yVar, true);
        this.f17073v = d7.f1841c;
        this.f17070s = d7.f1839a;
        this.f17072u = d7.f1840b;
        return b7 - yVar.b();
    }

    public final void i(g0.y yVar) {
        int i7;
        int h7 = yVar.h(3);
        this.f17067p = h7;
        if (h7 == 0) {
            i7 = 8;
        } else {
            if (h7 != 1) {
                if (h7 == 3 || h7 == 4 || h7 == 5) {
                    yVar.r(6);
                    return;
                } else {
                    if (h7 != 6 && h7 != 7) {
                        throw new IllegalStateException();
                    }
                    yVar.r(1);
                    return;
                }
            }
            i7 = 9;
        }
        yVar.r(i7);
    }

    public final int j(g0.y yVar) {
        int h7;
        if (this.f17067p != 0) {
            throw C1162A.a(null, null);
        }
        int i7 = 0;
        do {
            h7 = yVar.h(8);
            i7 += h7;
        } while (h7 == 255);
        return i7;
    }

    public final void k(g0.y yVar, int i7) {
        int e7 = yVar.e();
        if ((e7 & 7) == 0) {
            this.f17054c.T(e7 >> 3);
        } else {
            yVar.i(this.f17054c.e(), 0, i7 * 8);
            this.f17054c.T(0);
        }
        this.f17056e.e(this.f17054c, i7);
        AbstractC1297a.f(this.f17063l != -9223372036854775807L);
        this.f17056e.b(this.f17063l, 1, i7, 0, null);
        this.f17063l += this.f17071t;
    }

    public final void l(g0.y yVar) {
        boolean g7;
        int h7 = yVar.h(1);
        int h8 = h7 == 1 ? yVar.h(1) : 0;
        this.f17065n = h8;
        if (h8 != 0) {
            throw C1162A.a(null, null);
        }
        if (h7 == 1) {
            f(yVar);
        }
        if (!yVar.g()) {
            throw C1162A.a(null, null);
        }
        this.f17066o = yVar.h(6);
        int h9 = yVar.h(4);
        int h10 = yVar.h(3);
        if (h9 != 0 || h10 != 0) {
            throw C1162A.a(null, null);
        }
        if (h7 == 0) {
            int e7 = yVar.e();
            int h11 = h(yVar);
            yVar.p(e7);
            byte[] bArr = new byte[(h11 + 7) / 8];
            yVar.i(bArr, 0, h11);
            C1194q K6 = new C1194q.b().a0(this.f17057f).o0("audio/mp4a-latm").O(this.f17073v).N(this.f17072u).p0(this.f17070s).b0(Collections.singletonList(bArr)).e0(this.f17052a).m0(this.f17053b).K();
            if (!K6.equals(this.f17058g)) {
                this.f17058g = K6;
                this.f17071t = 1024000000 / K6.f12703C;
                this.f17056e.d(K6);
            }
        } else {
            yVar.r(((int) f(yVar)) - h(yVar));
        }
        i(yVar);
        boolean g8 = yVar.g();
        this.f17068q = g8;
        this.f17069r = 0L;
        if (g8) {
            if (h7 == 1) {
                this.f17069r = f(yVar);
            } else {
                do {
                    g7 = yVar.g();
                    this.f17069r = (this.f17069r << 8) + yVar.h(8);
                } while (g7);
            }
        }
        if (yVar.g()) {
            yVar.r(8);
        }
    }

    public final void m(int i7) {
        this.f17054c.P(i7);
        this.f17055d.n(this.f17054c.e());
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
    }
}
