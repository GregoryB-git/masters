package H0;

import F0.InterfaceC0373s;
import F0.M;
import F0.N;
import F0.T;
import g0.AbstractC1297a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final T f2147a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2148b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2149c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2150d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2151e;

    /* renamed from: f, reason: collision with root package name */
    public int f2152f;

    /* renamed from: g, reason: collision with root package name */
    public int f2153g;

    /* renamed from: h, reason: collision with root package name */
    public int f2154h;

    /* renamed from: i, reason: collision with root package name */
    public int f2155i;

    /* renamed from: j, reason: collision with root package name */
    public int f2156j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f2157k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f2158l;

    public e(int i7, int i8, long j7, int i9, T t7) {
        boolean z7 = true;
        if (i8 != 1 && i8 != 2) {
            z7 = false;
        }
        AbstractC1297a.a(z7);
        this.f2150d = j7;
        this.f2151e = i9;
        this.f2147a = t7;
        this.f2148b = d(i7, i8 == 2 ? 1667497984 : 1651965952);
        this.f2149c = i8 == 2 ? d(i7, 1650720768) : -1;
        this.f2157k = new long[512];
        this.f2158l = new int[512];
    }

    public static int d(int i7, int i8) {
        return (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48) | i8;
    }

    public void a() {
        this.f2154h++;
    }

    public void b(long j7) {
        if (this.f2156j == this.f2158l.length) {
            long[] jArr = this.f2157k;
            this.f2157k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f2158l;
            this.f2158l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f2157k;
        int i7 = this.f2156j;
        jArr2[i7] = j7;
        this.f2158l[i7] = this.f2155i;
        this.f2156j = i7 + 1;
    }

    public void c() {
        this.f2157k = Arrays.copyOf(this.f2157k, this.f2156j);
        this.f2158l = Arrays.copyOf(this.f2158l, this.f2156j);
    }

    public final long e(int i7) {
        return (this.f2150d * i7) / this.f2151e;
    }

    public long f() {
        return e(this.f2154h);
    }

    public long g() {
        return e(1);
    }

    public final N h(int i7) {
        return new N(this.f2158l[i7] * g(), this.f2157k[i7]);
    }

    public M.a i(long j7) {
        int g7 = (int) (j7 / g());
        int g8 = g0.M.g(this.f2158l, g7, true, true);
        if (this.f2158l[g8] == g7) {
            return new M.a(h(g8));
        }
        N h7 = h(g8);
        int i7 = g8 + 1;
        return i7 < this.f2157k.length ? new M.a(h7, h(i7)) : new M.a(h7);
    }

    public boolean j(int i7) {
        return this.f2148b == i7 || this.f2149c == i7;
    }

    public void k() {
        this.f2155i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f2158l, this.f2154h) >= 0;
    }

    public boolean m(InterfaceC0373s interfaceC0373s) {
        int i7 = this.f2153g;
        int f7 = i7 - this.f2147a.f(interfaceC0373s, i7, false);
        this.f2153g = f7;
        boolean z7 = f7 == 0;
        if (z7) {
            if (this.f2152f > 0) {
                this.f2147a.b(f(), l() ? 1 : 0, this.f2152f, 0, null);
            }
            a();
        }
        return z7;
    }

    public void n(int i7) {
        this.f2152f = i7;
        this.f2153g = i7;
    }

    public void o(long j7) {
        int i7;
        if (this.f2156j == 0) {
            i7 = 0;
        } else {
            i7 = this.f2158l[g0.M.h(this.f2157k, j7, true, true)];
        }
        this.f2154h = i7;
    }
}
