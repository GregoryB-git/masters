package k0;

import X2.AbstractC0703v;
import android.os.SystemClock;
import d0.AbstractC1170I;
import d0.C1164C;
import java.util.List;
import x0.InterfaceC2142x;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: u, reason: collision with root package name */
    public static final InterfaceC2142x.b f15629u = new InterfaceC2142x.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1170I f15630a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2142x.b f15631b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15632c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15633d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15634e;

    /* renamed from: f, reason: collision with root package name */
    public final C1438u f15635f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15636g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.Z f15637h;

    /* renamed from: i, reason: collision with root package name */
    public final A0.E f15638i;

    /* renamed from: j, reason: collision with root package name */
    public final List f15639j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2142x.b f15640k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f15641l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15642m;

    /* renamed from: n, reason: collision with root package name */
    public final int f15643n;

    /* renamed from: o, reason: collision with root package name */
    public final C1164C f15644o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f15645p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f15646q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f15647r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f15648s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f15649t;

    public U0(AbstractC1170I abstractC1170I, InterfaceC2142x.b bVar, long j7, long j8, int i7, C1438u c1438u, boolean z7, x0.Z z8, A0.E e7, List list, InterfaceC2142x.b bVar2, boolean z9, int i8, int i9, C1164C c1164c, long j9, long j10, long j11, long j12, boolean z10) {
        this.f15630a = abstractC1170I;
        this.f15631b = bVar;
        this.f15632c = j7;
        this.f15633d = j8;
        this.f15634e = i7;
        this.f15635f = c1438u;
        this.f15636g = z7;
        this.f15637h = z8;
        this.f15638i = e7;
        this.f15639j = list;
        this.f15640k = bVar2;
        this.f15641l = z9;
        this.f15642m = i8;
        this.f15643n = i9;
        this.f15644o = c1164c;
        this.f15646q = j9;
        this.f15647r = j10;
        this.f15648s = j11;
        this.f15649t = j12;
        this.f15645p = z10;
    }

    public static U0 k(A0.E e7) {
        AbstractC1170I abstractC1170I = AbstractC1170I.f12388a;
        InterfaceC2142x.b bVar = f15629u;
        return new U0(abstractC1170I, bVar, -9223372036854775807L, 0L, 1, null, false, x0.Z.f20700d, e7, AbstractC0703v.Y(), bVar, false, 1, 0, C1164C.f12353d, 0L, 0L, 0L, 0L, false);
    }

    public static InterfaceC2142x.b l() {
        return f15629u;
    }

    public U0 a() {
        return new U0(this.f15630a, this.f15631b, this.f15632c, this.f15633d, this.f15634e, this.f15635f, this.f15636g, this.f15637h, this.f15638i, this.f15639j, this.f15640k, this.f15641l, this.f15642m, this.f15643n, this.f15644o, this.f15646q, this.f15647r, m(), SystemClock.elapsedRealtime(), this.f15645p);
    }

    public U0 b(boolean z7) {
        return new U0(this.f15630a, this.f15631b, this.f15632c, this.f15633d, this.f15634e, this.f15635f, z7, this.f15637h, this.f15638i, this.f15639j, this.f15640k, this.f15641l, this.f15642m, this.f15643n, this.f15644o, this.f15646q, this.f15647r, this.f15648s, this.f15649t, this.f15645p);
    }

    public U0 c(InterfaceC2142x.b bVar) {
        return new U0(this.f15630a, this.f15631b, this.f15632c, this.f15633d, this.f15634e, this.f15635f, this.f15636g, this.f15637h, this.f15638i, this.f15639j, bVar, this.f15641l, this.f15642m, this.f15643n, this.f15644o, this.f15646q, this.f15647r, this.f15648s, this.f15649t, this.f15645p);
    }

    public U0 d(InterfaceC2142x.b bVar, long j7, long j8, long j9, long j10, x0.Z z7, A0.E e7, List list) {
        return new U0(this.f15630a, bVar, j8, j9, this.f15634e, this.f15635f, this.f15636g, z7, e7, list, this.f15640k, this.f15641l, this.f15642m, this.f15643n, this.f15644o, this.f15646q, j10, j7, SystemClock.elapsedRealtime(), this.f15645p);
    }

    public U0 e(boolean z7, int i7, int i8) {
        return new U0(this.f15630a, this.f15631b, this.f15632c, this.f15633d, this.f15634e, this.f15635f, this.f15636g, this.f15637h, this.f15638i, this.f15639j, this.f15640k, z7, i7, i8, this.f15644o, this.f15646q, this.f15647r, this.f15648s, this.f15649t, this.f15645p);
    }

    public U0 f(C1438u c1438u) {
        return new U0(this.f15630a, this.f15631b, this.f15632c, this.f15633d, this.f15634e, c1438u, this.f15636g, this.f15637h, this.f15638i, this.f15639j, this.f15640k, this.f15641l, this.f15642m, this.f15643n, this.f15644o, this.f15646q, this.f15647r, this.f15648s, this.f15649t, this.f15645p);
    }

    public U0 g(C1164C c1164c) {
        return new U0(this.f15630a, this.f15631b, this.f15632c, this.f15633d, this.f15634e, this.f15635f, this.f15636g, this.f15637h, this.f15638i, this.f15639j, this.f15640k, this.f15641l, this.f15642m, this.f15643n, c1164c, this.f15646q, this.f15647r, this.f15648s, this.f15649t, this.f15645p);
    }

    public U0 h(int i7) {
        return new U0(this.f15630a, this.f15631b, this.f15632c, this.f15633d, i7, this.f15635f, this.f15636g, this.f15637h, this.f15638i, this.f15639j, this.f15640k, this.f15641l, this.f15642m, this.f15643n, this.f15644o, this.f15646q, this.f15647r, this.f15648s, this.f15649t, this.f15645p);
    }

    public U0 i(boolean z7) {
        return new U0(this.f15630a, this.f15631b, this.f15632c, this.f15633d, this.f15634e, this.f15635f, this.f15636g, this.f15637h, this.f15638i, this.f15639j, this.f15640k, this.f15641l, this.f15642m, this.f15643n, this.f15644o, this.f15646q, this.f15647r, this.f15648s, this.f15649t, z7);
    }

    public U0 j(AbstractC1170I abstractC1170I) {
        return new U0(abstractC1170I, this.f15631b, this.f15632c, this.f15633d, this.f15634e, this.f15635f, this.f15636g, this.f15637h, this.f15638i, this.f15639j, this.f15640k, this.f15641l, this.f15642m, this.f15643n, this.f15644o, this.f15646q, this.f15647r, this.f15648s, this.f15649t, this.f15645p);
    }

    public long m() {
        long j7;
        long j8;
        if (!n()) {
            return this.f15648s;
        }
        do {
            j7 = this.f15649t;
            j8 = this.f15648s;
        } while (j7 != this.f15649t);
        return g0.M.J0(g0.M.i1(j8) + ((long) ((SystemClock.elapsedRealtime() - j7) * this.f15644o.f12356a)));
    }

    public boolean n() {
        return this.f15634e == 3 && this.f15641l && this.f15643n == 0;
    }

    public void o(long j7) {
        this.f15648s = j7;
        this.f15649t = SystemClock.elapsedRealtime();
    }
}
