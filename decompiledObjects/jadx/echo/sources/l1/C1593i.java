package l1;

import F0.AbstractC0356a;
import F0.C0369n;
import F0.InterfaceC0374t;
import F0.T;
import d0.C1194q;
import g0.AbstractC1297a;
import java.util.Arrays;
import java.util.Collections;
import l1.K;

/* renamed from: l1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1593i implements InterfaceC1597m {

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f16874w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16875a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.y f16876b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.z f16877c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16878d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16879e;

    /* renamed from: f, reason: collision with root package name */
    public String f16880f;

    /* renamed from: g, reason: collision with root package name */
    public T f16881g;

    /* renamed from: h, reason: collision with root package name */
    public T f16882h;

    /* renamed from: i, reason: collision with root package name */
    public int f16883i;

    /* renamed from: j, reason: collision with root package name */
    public int f16884j;

    /* renamed from: k, reason: collision with root package name */
    public int f16885k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16886l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16887m;

    /* renamed from: n, reason: collision with root package name */
    public int f16888n;

    /* renamed from: o, reason: collision with root package name */
    public int f16889o;

    /* renamed from: p, reason: collision with root package name */
    public int f16890p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16891q;

    /* renamed from: r, reason: collision with root package name */
    public long f16892r;

    /* renamed from: s, reason: collision with root package name */
    public int f16893s;

    /* renamed from: t, reason: collision with root package name */
    public long f16894t;

    /* renamed from: u, reason: collision with root package name */
    public T f16895u;

    /* renamed from: v, reason: collision with root package name */
    public long f16896v;

    public C1593i(boolean z7) {
        this(z7, null, 0);
    }

    private boolean i(g0.z zVar, byte[] bArr, int i7) {
        int min = Math.min(zVar.a(), i7 - this.f16884j);
        zVar.l(bArr, this.f16884j, min);
        int i8 = this.f16884j + min;
        this.f16884j = i8;
        return i8 == i7;
    }

    public static boolean m(int i7) {
        return (i7 & 65526) == 65520;
    }

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        f();
        while (zVar.a() > 0) {
            int i7 = this.f16883i;
            if (i7 == 0) {
                j(zVar);
            } else if (i7 == 1) {
                g(zVar);
            } else if (i7 != 2) {
                if (i7 == 3) {
                    if (i(zVar, this.f16876b.f14341a, this.f16886l ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i7 != 4) {
                        throw new IllegalStateException();
                    }
                    p(zVar);
                }
            } else if (i(zVar, this.f16877c.e(), 10)) {
                o();
            }
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        this.f16894t = -9223372036854775807L;
        q();
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        this.f16894t = j7;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        this.f16880f = dVar.b();
        T a7 = interfaceC0374t.a(dVar.c(), 1);
        this.f16881g = a7;
        this.f16895u = a7;
        if (!this.f16875a) {
            this.f16882h = new C0369n();
            return;
        }
        dVar.a();
        T a8 = interfaceC0374t.a(dVar.c(), 5);
        this.f16882h = a8;
        a8.d(new C1194q.b().a0(dVar.b()).o0("application/id3").K());
    }

    public final void f() {
        AbstractC1297a.e(this.f16881g);
        g0.M.i(this.f16895u);
        g0.M.i(this.f16882h);
    }

    public final void g(g0.z zVar) {
        if (zVar.a() == 0) {
            return;
        }
        this.f16876b.f14341a[0] = zVar.e()[zVar.f()];
        this.f16876b.p(2);
        int h7 = this.f16876b.h(4);
        int i7 = this.f16889o;
        if (i7 != -1 && h7 != i7) {
            q();
            return;
        }
        if (!this.f16887m) {
            this.f16887m = true;
            this.f16888n = this.f16890p;
            this.f16889o = h7;
        }
        t();
    }

    public final boolean h(g0.z zVar, int i7) {
        zVar.T(i7 + 1);
        if (!w(zVar, this.f16876b.f14341a, 1)) {
            return false;
        }
        this.f16876b.p(4);
        int h7 = this.f16876b.h(1);
        int i8 = this.f16888n;
        if (i8 != -1 && h7 != i8) {
            return false;
        }
        if (this.f16889o != -1) {
            if (!w(zVar, this.f16876b.f14341a, 1)) {
                return true;
            }
            this.f16876b.p(2);
            if (this.f16876b.h(4) != this.f16889o) {
                return false;
            }
            zVar.T(i7 + 2);
        }
        if (!w(zVar, this.f16876b.f14341a, 4)) {
            return true;
        }
        this.f16876b.p(14);
        int h8 = this.f16876b.h(13);
        if (h8 < 7) {
            return false;
        }
        byte[] e7 = zVar.e();
        int g7 = zVar.g();
        int i9 = i7 + h8;
        if (i9 >= g7) {
            return true;
        }
        byte b7 = e7[i9];
        if (b7 == -1) {
            int i10 = i9 + 1;
            if (i10 == g7) {
                return true;
            }
            return l((byte) -1, e7[i10]) && ((e7[i10] & 8) >> 3) == h7;
        }
        if (b7 != 73) {
            return false;
        }
        int i11 = i9 + 1;
        if (i11 == g7) {
            return true;
        }
        if (e7[i11] != 68) {
            return false;
        }
        int i12 = i9 + 2;
        return i12 == g7 || e7[i12] == 51;
    }

    public final void j(g0.z zVar) {
        int i7;
        byte[] e7 = zVar.e();
        int f7 = zVar.f();
        int g7 = zVar.g();
        while (f7 < g7) {
            int i8 = f7 + 1;
            byte b7 = e7[f7];
            int i9 = b7 & 255;
            if (this.f16885k == 512 && l((byte) -1, (byte) i9) && (this.f16887m || h(zVar, f7 - 1))) {
                this.f16890p = (b7 & 8) >> 3;
                this.f16886l = (b7 & 1) == 0;
                if (this.f16887m) {
                    t();
                } else {
                    r();
                }
                zVar.T(i8);
                return;
            }
            int i10 = this.f16885k;
            int i11 = i9 | i10;
            if (i11 != 329) {
                if (i11 == 511) {
                    this.f16885k = 512;
                } else if (i11 == 836) {
                    i7 = 1024;
                } else if (i11 == 1075) {
                    u();
                    zVar.T(i8);
                    return;
                } else if (i10 != 256) {
                    this.f16885k = 256;
                }
                f7 = i8;
            } else {
                i7 = 768;
            }
            this.f16885k = i7;
            f7 = i8;
        }
        zVar.T(f7);
    }

    public long k() {
        return this.f16892r;
    }

    public final boolean l(byte b7, byte b8) {
        return m(((b7 & 255) << 8) | (b8 & 255));
    }

    public final void n() {
        this.f16876b.p(0);
        if (this.f16891q) {
            this.f16876b.r(10);
        } else {
            int i7 = 2;
            int h7 = this.f16876b.h(2) + 1;
            if (h7 != 2) {
                g0.o.h("AdtsReader", "Detected audio object type: " + h7 + ", but assuming AAC LC.");
            } else {
                i7 = h7;
            }
            this.f16876b.r(5);
            byte[] a7 = AbstractC0356a.a(i7, this.f16889o, this.f16876b.h(3));
            AbstractC0356a.b e7 = AbstractC0356a.e(a7);
            C1194q K6 = new C1194q.b().a0(this.f16880f).o0("audio/mp4a-latm").O(e7.f1841c).N(e7.f1840b).p0(e7.f1839a).b0(Collections.singletonList(a7)).e0(this.f16878d).m0(this.f16879e).K();
            this.f16892r = 1024000000 / K6.f12703C;
            this.f16881g.d(K6);
            this.f16891q = true;
        }
        this.f16876b.r(4);
        int h8 = this.f16876b.h(13);
        int i8 = h8 - 7;
        if (this.f16886l) {
            i8 = h8 - 9;
        }
        v(this.f16881g, this.f16892r, 0, i8);
    }

    public final void o() {
        this.f16882h.e(this.f16877c, 10);
        this.f16877c.T(6);
        v(this.f16882h, 0L, 10, this.f16877c.F() + 10);
    }

    public final void p(g0.z zVar) {
        int min = Math.min(zVar.a(), this.f16893s - this.f16884j);
        this.f16895u.e(zVar, min);
        int i7 = this.f16884j + min;
        this.f16884j = i7;
        if (i7 == this.f16893s) {
            AbstractC1297a.f(this.f16894t != -9223372036854775807L);
            this.f16895u.b(this.f16894t, 1, this.f16893s, 0, null);
            this.f16894t += this.f16896v;
            s();
        }
    }

    public final void q() {
        this.f16887m = false;
        s();
    }

    public final void r() {
        this.f16883i = 1;
        this.f16884j = 0;
    }

    public final void s() {
        this.f16883i = 0;
        this.f16884j = 0;
        this.f16885k = 256;
    }

    public final void t() {
        this.f16883i = 3;
        this.f16884j = 0;
    }

    public final void u() {
        this.f16883i = 2;
        this.f16884j = f16874w.length;
        this.f16893s = 0;
        this.f16877c.T(0);
    }

    public final void v(T t7, long j7, int i7, int i8) {
        this.f16883i = 4;
        this.f16884j = i7;
        this.f16895u = t7;
        this.f16896v = j7;
        this.f16893s = i8;
    }

    public final boolean w(g0.z zVar, byte[] bArr, int i7) {
        if (zVar.a() < i7) {
            return false;
        }
        zVar.l(bArr, 0, i7);
        return true;
    }

    public C1593i(boolean z7, String str, int i7) {
        this.f16876b = new g0.y(new byte[7]);
        this.f16877c = new g0.z(Arrays.copyOf(f16874w, 10));
        s();
        this.f16888n = -1;
        this.f16889o = -1;
        this.f16892r = -9223372036854775807L;
        this.f16894t = -9223372036854775807L;
        this.f16875a = z7;
        this.f16878d = str;
        this.f16879e = i7;
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
    }
}
