package k0;

import X2.AbstractC0703v;
import android.util.Pair;
import d0.AbstractC1170I;
import g0.AbstractC1297a;
import g0.InterfaceC1307k;
import java.util.ArrayList;
import java.util.List;
import k0.B0;
import k0.InterfaceC1442w;
import l0.InterfaceC1533a;
import x0.InterfaceC2140v;
import x0.InterfaceC2142x;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1533a f15539c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1307k f15540d;

    /* renamed from: e, reason: collision with root package name */
    public final B0.a f15541e;

    /* renamed from: f, reason: collision with root package name */
    public long f15542f;

    /* renamed from: g, reason: collision with root package name */
    public int f15543g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15544h;

    /* renamed from: i, reason: collision with root package name */
    public B0 f15545i;

    /* renamed from: j, reason: collision with root package name */
    public B0 f15546j;

    /* renamed from: k, reason: collision with root package name */
    public B0 f15547k;

    /* renamed from: l, reason: collision with root package name */
    public int f15548l;

    /* renamed from: m, reason: collision with root package name */
    public Object f15549m;

    /* renamed from: n, reason: collision with root package name */
    public long f15550n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1442w.c f15551o;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1170I.b f15537a = new AbstractC1170I.b();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1170I.c f15538b = new AbstractC1170I.c();

    /* renamed from: p, reason: collision with root package name */
    public List f15552p = new ArrayList();

    public E0(InterfaceC1533a interfaceC1533a, InterfaceC1307k interfaceC1307k, B0.a aVar, InterfaceC1442w.c cVar) {
        this.f15539c = interfaceC1533a;
        this.f15540d = interfaceC1307k;
        this.f15541e = aVar;
        this.f15551o = cVar;
    }

    public static boolean C(AbstractC1170I.b bVar) {
        int c7 = bVar.c();
        if (c7 == 0) {
            return false;
        }
        if ((c7 == 1 && bVar.q(0)) || !bVar.r(bVar.o())) {
            return false;
        }
        long j7 = 0;
        if (bVar.e(0L) != -1) {
            return false;
        }
        if (bVar.f12400d == 0) {
            return true;
        }
        int i7 = c7 - (bVar.q(c7 + (-1)) ? 2 : 1);
        for (int i8 = 0; i8 <= i7; i8++) {
            j7 += bVar.i(i8);
        }
        return bVar.f12400d <= j7;
    }

    public static InterfaceC2142x.b K(AbstractC1170I abstractC1170I, Object obj, long j7, long j8, AbstractC1170I.c cVar, AbstractC1170I.b bVar) {
        abstractC1170I.h(obj, bVar);
        abstractC1170I.n(bVar.f12399c, cVar);
        Object obj2 = obj;
        for (int b7 = abstractC1170I.b(obj); C(bVar) && b7 <= cVar.f12434o; b7++) {
            abstractC1170I.g(b7, bVar, true);
            obj2 = AbstractC1297a.e(bVar.f12398b);
        }
        abstractC1170I.h(obj2, bVar);
        int e7 = bVar.e(j7);
        return e7 == -1 ? new InterfaceC2142x.b(obj2, j8, bVar.d(j7)) : new InterfaceC2142x.b(obj2, e7, bVar.k(e7), j8);
    }

    public static boolean d(long j7, long j8) {
        return j7 == -9223372036854775807L || j7 == j8;
    }

    public final boolean A(AbstractC1170I abstractC1170I, InterfaceC2142x.b bVar) {
        if (y(bVar)) {
            return abstractC1170I.n(abstractC1170I.h(bVar.f20848a, this.f15537a).f12399c, this.f15538b).f12434o == abstractC1170I.b(bVar.f20848a);
        }
        return false;
    }

    public boolean B(InterfaceC2140v interfaceC2140v) {
        B0 b02 = this.f15547k;
        return b02 != null && b02.f15507a == interfaceC2140v;
    }

    public final /* synthetic */ void D(AbstractC0703v.a aVar, InterfaceC2142x.b bVar) {
        this.f15539c.L(aVar.k(), bVar);
    }

    public final void E() {
        final AbstractC0703v.a M6 = AbstractC0703v.M();
        for (B0 b02 = this.f15545i; b02 != null; b02 = b02.k()) {
            M6.a(b02.f15512f.f15523a);
        }
        B0 b03 = this.f15546j;
        final InterfaceC2142x.b bVar = b03 == null ? null : b03.f15512f.f15523a;
        this.f15540d.j(new Runnable() { // from class: k0.D0
            @Override // java.lang.Runnable
            public final void run() {
                E0.this.D(M6, bVar);
            }
        });
    }

    public void F(long j7) {
        B0 b02 = this.f15547k;
        if (b02 != null) {
            b02.u(j7);
        }
    }

    public final void G(List list) {
        for (int i7 = 0; i7 < this.f15552p.size(); i7++) {
            ((B0) this.f15552p.get(i7)).v();
        }
        this.f15552p = list;
    }

    public void H() {
        if (this.f15552p.isEmpty()) {
            return;
        }
        G(new ArrayList());
    }

    public boolean I(B0 b02) {
        AbstractC1297a.h(b02);
        boolean z7 = false;
        if (b02.equals(this.f15547k)) {
            return false;
        }
        this.f15547k = b02;
        while (b02.k() != null) {
            b02 = (B0) AbstractC1297a.e(b02.k());
            if (b02 == this.f15546j) {
                this.f15546j = this.f15545i;
                z7 = true;
            }
            b02.v();
            this.f15548l--;
        }
        ((B0) AbstractC1297a.e(this.f15547k)).y(null);
        E();
        return z7;
    }

    public final B0 J(C0 c02) {
        for (int i7 = 0; i7 < this.f15552p.size(); i7++) {
            if (((B0) this.f15552p.get(i7)).d(c02)) {
                return (B0) this.f15552p.remove(i7);
            }
        }
        return null;
    }

    public InterfaceC2142x.b L(AbstractC1170I abstractC1170I, Object obj, long j7) {
        long M6 = M(abstractC1170I, obj);
        abstractC1170I.h(obj, this.f15537a);
        abstractC1170I.n(this.f15537a.f12399c, this.f15538b);
        boolean z7 = false;
        for (int b7 = abstractC1170I.b(obj); b7 >= this.f15538b.f12433n; b7--) {
            abstractC1170I.g(b7, this.f15537a, true);
            boolean z8 = this.f15537a.c() > 0;
            z7 |= z8;
            AbstractC1170I.b bVar = this.f15537a;
            if (bVar.e(bVar.f12400d) != -1) {
                obj = AbstractC1297a.e(this.f15537a.f12398b);
            }
            if (z7 && (!z8 || this.f15537a.f12400d != 0)) {
                break;
            }
        }
        return K(abstractC1170I, obj, j7, M6, this.f15538b, this.f15537a);
    }

    public final long M(AbstractC1170I abstractC1170I, Object obj) {
        int b7;
        int i7 = abstractC1170I.h(obj, this.f15537a).f12399c;
        Object obj2 = this.f15549m;
        if (obj2 != null && (b7 = abstractC1170I.b(obj2)) != -1 && abstractC1170I.f(b7, this.f15537a).f12399c == i7) {
            return this.f15550n;
        }
        B0 b02 = this.f15545i;
        while (true) {
            if (b02 == null) {
                b02 = this.f15545i;
                while (b02 != null) {
                    int b8 = abstractC1170I.b(b02.f15508b);
                    if (b8 == -1 || abstractC1170I.f(b8, this.f15537a).f12399c != i7) {
                        b02 = b02.k();
                    }
                }
                long N6 = N(obj);
                if (N6 != -1) {
                    return N6;
                }
                long j7 = this.f15542f;
                this.f15542f = 1 + j7;
                if (this.f15545i == null) {
                    this.f15549m = obj;
                    this.f15550n = j7;
                }
                return j7;
            }
            if (b02.f15508b.equals(obj)) {
                break;
            }
            b02 = b02.k();
        }
        return b02.f15512f.f15523a.f20851d;
    }

    public final long N(Object obj) {
        for (int i7 = 0; i7 < this.f15552p.size(); i7++) {
            B0 b02 = (B0) this.f15552p.get(i7);
            if (b02.f15508b.equals(obj)) {
                return b02.f15512f.f15523a.f20851d;
            }
        }
        return -1L;
    }

    public boolean O() {
        B0 b02 = this.f15547k;
        return b02 == null || (!b02.f15512f.f15531i && b02.s() && this.f15547k.f15512f.f15527e != -9223372036854775807L && this.f15548l < 100);
    }

    public final boolean P(AbstractC1170I abstractC1170I) {
        B0 b02 = this.f15545i;
        if (b02 == null) {
            return true;
        }
        int b7 = abstractC1170I.b(b02.f15508b);
        while (true) {
            b7 = abstractC1170I.d(b7, this.f15537a, this.f15538b, this.f15543g, this.f15544h);
            while (((B0) AbstractC1297a.e(b02)).k() != null && !b02.f15512f.f15529g) {
                b02 = b02.k();
            }
            B0 k7 = b02.k();
            if (b7 == -1 || k7 == null || abstractC1170I.b(k7.f15508b) != b7) {
                break;
            }
            b02 = k7;
        }
        boolean I6 = I(b02);
        b02.f15512f = v(abstractC1170I, b02.f15512f);
        return !I6;
    }

    public void Q(AbstractC1170I abstractC1170I, InterfaceC1442w.c cVar) {
        this.f15551o = cVar;
        x(abstractC1170I);
    }

    public boolean R(AbstractC1170I abstractC1170I, long j7, long j8) {
        C0 c02;
        B0 b02 = this.f15545i;
        B0 b03 = null;
        while (b02 != null) {
            C0 c03 = b02.f15512f;
            if (b03 == null) {
                c02 = v(abstractC1170I, c03);
            } else {
                C0 k7 = k(abstractC1170I, b03, j7);
                if (k7 == null) {
                    return !I(b03);
                }
                if (!e(c03, k7)) {
                    return !I(b03);
                }
                c02 = k7;
            }
            b02.f15512f = c02.a(c03.f15525c);
            if (!d(c03.f15527e, c02.f15527e)) {
                b02.C();
                long j9 = c02.f15527e;
                return (I(b02) || (b02 == this.f15546j && !b02.f15512f.f15528f && ((j8 > Long.MIN_VALUE ? 1 : (j8 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j8 > ((j9 > (-9223372036854775807L) ? 1 : (j9 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : b02.B(j9)) ? 1 : (j8 == ((j9 > (-9223372036854775807L) ? 1 : (j9 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : b02.B(j9)) ? 0 : -1)) >= 0))) ? false : true;
            }
            b03 = b02;
            b02 = b02.k();
        }
        return true;
    }

    public boolean S(AbstractC1170I abstractC1170I, int i7) {
        this.f15543g = i7;
        return P(abstractC1170I);
    }

    public boolean T(AbstractC1170I abstractC1170I, boolean z7) {
        this.f15544h = z7;
        return P(abstractC1170I);
    }

    public B0 b() {
        B0 b02 = this.f15545i;
        if (b02 == null) {
            return null;
        }
        if (b02 == this.f15546j) {
            this.f15546j = b02.k();
        }
        this.f15545i.v();
        int i7 = this.f15548l - 1;
        this.f15548l = i7;
        if (i7 == 0) {
            this.f15547k = null;
            B0 b03 = this.f15545i;
            this.f15549m = b03.f15508b;
            this.f15550n = b03.f15512f.f15523a.f20851d;
        }
        this.f15545i = this.f15545i.k();
        E();
        return this.f15545i;
    }

    public B0 c() {
        this.f15546j = ((B0) AbstractC1297a.h(this.f15546j)).k();
        E();
        return (B0) AbstractC1297a.h(this.f15546j);
    }

    public final boolean e(C0 c02, C0 c03) {
        return c02.f15524b == c03.f15524b && c02.f15523a.equals(c03.f15523a);
    }

    public void f() {
        if (this.f15548l == 0) {
            return;
        }
        B0 b02 = (B0) AbstractC1297a.h(this.f15545i);
        this.f15549m = b02.f15508b;
        this.f15550n = b02.f15512f.f15523a.f20851d;
        while (b02 != null) {
            b02.v();
            b02 = b02.k();
        }
        this.f15545i = null;
        this.f15547k = null;
        this.f15546j = null;
        this.f15548l = 0;
        E();
    }

    public B0 g(C0 c02) {
        B0 b02 = this.f15547k;
        long m7 = b02 == null ? 1000000000000L : (b02.m() + this.f15547k.f15512f.f15527e) - c02.f15524b;
        B0 J6 = J(c02);
        if (J6 == null) {
            J6 = this.f15541e.a(c02, m7);
        } else {
            J6.f15512f = c02;
            J6.z(m7);
        }
        B0 b03 = this.f15547k;
        if (b03 != null) {
            b03.y(J6);
        } else {
            this.f15545i = J6;
            this.f15546j = J6;
        }
        this.f15549m = null;
        this.f15547k = J6;
        this.f15548l++;
        E();
        return J6;
    }

    public final Pair h(AbstractC1170I abstractC1170I, Object obj, long j7) {
        int e7 = abstractC1170I.e(abstractC1170I.h(obj, this.f15537a).f12399c, this.f15543g, this.f15544h);
        if (e7 != -1) {
            return abstractC1170I.k(this.f15538b, this.f15537a, e7, -9223372036854775807L, j7);
        }
        return null;
    }

    public final C0 i(U0 u02) {
        return n(u02.f15630a, u02.f15631b, u02.f15632c, u02.f15648s);
    }

    public final C0 j(AbstractC1170I abstractC1170I, B0 b02, long j7) {
        C0 c02;
        long j8;
        long j9;
        Object obj;
        long j10;
        long j11;
        long N6;
        C0 c03 = b02.f15512f;
        int d7 = abstractC1170I.d(abstractC1170I.b(c03.f15523a.f20848a), this.f15537a, this.f15538b, this.f15543g, this.f15544h);
        if (d7 == -1) {
            return null;
        }
        int i7 = abstractC1170I.g(d7, this.f15537a, true).f12399c;
        Object e7 = AbstractC1297a.e(this.f15537a.f12398b);
        long j12 = c03.f15523a.f20851d;
        if (abstractC1170I.n(i7, this.f15538b).f12433n == d7) {
            c02 = c03;
            Pair k7 = abstractC1170I.k(this.f15538b, this.f15537a, i7, -9223372036854775807L, Math.max(0L, j7));
            if (k7 == null) {
                return null;
            }
            Object obj2 = k7.first;
            long longValue = ((Long) k7.second).longValue();
            B0 k8 = b02.k();
            if (k8 == null || !k8.f15508b.equals(obj2)) {
                N6 = N(obj2);
                if (N6 == -1) {
                    N6 = this.f15542f;
                    this.f15542f = 1 + N6;
                }
            } else {
                N6 = k8.f15512f.f15523a.f20851d;
            }
            j8 = N6;
            j9 = -9223372036854775807L;
            obj = obj2;
            j10 = longValue;
        } else {
            c02 = c03;
            j8 = j12;
            j9 = 0;
            obj = e7;
            j10 = 0;
        }
        InterfaceC2142x.b K6 = K(abstractC1170I, obj, j10, j8, this.f15538b, this.f15537a);
        if (j9 != -9223372036854775807L && c02.f15525c != -9223372036854775807L) {
            boolean w7 = w(c02.f15523a.f20848a, abstractC1170I);
            if (K6.b() && w7) {
                j9 = c02.f15525c;
            } else if (w7) {
                j11 = c02.f15525c;
                return n(abstractC1170I, K6, j9, j11);
            }
        }
        j11 = j10;
        return n(abstractC1170I, K6, j9, j11);
    }

    public final C0 k(AbstractC1170I abstractC1170I, B0 b02, long j7) {
        C0 c02 = b02.f15512f;
        long m7 = (b02.m() + c02.f15527e) - j7;
        return c02.f15529g ? j(abstractC1170I, b02, m7) : l(abstractC1170I, b02, m7);
    }

    public final C0 l(AbstractC1170I abstractC1170I, B0 b02, long j7) {
        C0 c02 = b02.f15512f;
        InterfaceC2142x.b bVar = c02.f15523a;
        abstractC1170I.h(bVar.f20848a, this.f15537a);
        if (!bVar.b()) {
            int i7 = bVar.f20852e;
            if (i7 != -1 && this.f15537a.q(i7)) {
                return j(abstractC1170I, b02, j7);
            }
            int k7 = this.f15537a.k(bVar.f20852e);
            boolean z7 = this.f15537a.r(bVar.f20852e) && this.f15537a.h(bVar.f20852e, k7) == 3;
            if (k7 == this.f15537a.a(bVar.f20852e) || z7) {
                return p(abstractC1170I, bVar.f20848a, r(abstractC1170I, bVar.f20848a, bVar.f20852e), c02.f15527e, bVar.f20851d);
            }
            return o(abstractC1170I, bVar.f20848a, bVar.f20852e, k7, c02.f15527e, bVar.f20851d);
        }
        int i8 = bVar.f20849b;
        int a7 = this.f15537a.a(i8);
        if (a7 == -1) {
            return null;
        }
        int l7 = this.f15537a.l(i8, bVar.f20850c);
        if (l7 < a7) {
            return o(abstractC1170I, bVar.f20848a, i8, l7, c02.f15525c, bVar.f20851d);
        }
        long j8 = c02.f15525c;
        if (j8 == -9223372036854775807L) {
            AbstractC1170I.c cVar = this.f15538b;
            AbstractC1170I.b bVar2 = this.f15537a;
            Pair k8 = abstractC1170I.k(cVar, bVar2, bVar2.f12399c, -9223372036854775807L, Math.max(0L, j7));
            if (k8 == null) {
                return null;
            }
            j8 = ((Long) k8.second).longValue();
        }
        return p(abstractC1170I, bVar.f20848a, Math.max(r(abstractC1170I, bVar.f20848a, bVar.f20849b), j8), c02.f15525c, bVar.f20851d);
    }

    public B0 m() {
        return this.f15547k;
    }

    public final C0 n(AbstractC1170I abstractC1170I, InterfaceC2142x.b bVar, long j7, long j8) {
        abstractC1170I.h(bVar.f20848a, this.f15537a);
        boolean b7 = bVar.b();
        Object obj = bVar.f20848a;
        return b7 ? o(abstractC1170I, obj, bVar.f20849b, bVar.f20850c, j7, bVar.f20851d) : p(abstractC1170I, obj, j8, j7, bVar.f20851d);
    }

    public final C0 o(AbstractC1170I abstractC1170I, Object obj, int i7, int i8, long j7, long j8) {
        InterfaceC2142x.b bVar = new InterfaceC2142x.b(obj, i7, i8, j8);
        long b7 = abstractC1170I.h(bVar.f20848a, this.f15537a).b(bVar.f20849b, bVar.f20850c);
        long g7 = i8 == this.f15537a.k(i7) ? this.f15537a.g() : 0L;
        return new C0(bVar, (b7 == -9223372036854775807L || g7 < b7) ? g7 : Math.max(0L, b7 - 1), j7, -9223372036854775807L, b7, this.f15537a.r(bVar.f20849b), false, false, false);
    }

    public final C0 p(AbstractC1170I abstractC1170I, Object obj, long j7, long j8, long j9) {
        boolean z7;
        long j10;
        long j11;
        long j12;
        long j13 = j7;
        abstractC1170I.h(obj, this.f15537a);
        int d7 = this.f15537a.d(j13);
        boolean z8 = d7 != -1 && this.f15537a.q(d7);
        AbstractC1170I.b bVar = this.f15537a;
        if (d7 == -1) {
            if (bVar.c() > 0) {
                AbstractC1170I.b bVar2 = this.f15537a;
                if (bVar2.r(bVar2.o())) {
                    z7 = true;
                }
            }
            z7 = false;
        } else {
            if (bVar.r(d7)) {
                long f7 = this.f15537a.f(d7);
                AbstractC1170I.b bVar3 = this.f15537a;
                if (f7 == bVar3.f12400d && bVar3.p(d7)) {
                    z7 = true;
                    d7 = -1;
                }
            }
            z7 = false;
        }
        InterfaceC2142x.b bVar4 = new InterfaceC2142x.b(obj, j9, d7);
        boolean y7 = y(bVar4);
        boolean A7 = A(abstractC1170I, bVar4);
        boolean z9 = z(abstractC1170I, bVar4, y7);
        boolean z10 = (d7 == -1 || !this.f15537a.r(d7) || z8) ? false : true;
        if (d7 != -1 && !z8) {
            j11 = this.f15537a.f(d7);
        } else {
            if (!z7) {
                j10 = -9223372036854775807L;
                j12 = (j10 != -9223372036854775807L || j10 == Long.MIN_VALUE) ? this.f15537a.f12400d : j10;
                if (j12 != -9223372036854775807L && j13 >= j12) {
                    j13 = Math.max(0L, j12 - ((z9 && z7) ? 0 : 1));
                }
                return new C0(bVar4, j13, j8, j10, j12, z10, y7, A7, z9);
            }
            j11 = this.f15537a.f12400d;
        }
        j10 = j11;
        if (j10 != -9223372036854775807L) {
        }
        if (j12 != -9223372036854775807L) {
            j13 = Math.max(0L, j12 - ((z9 && z7) ? 0 : 1));
        }
        return new C0(bVar4, j13, j8, j10, j12, z10, y7, A7, z9);
    }

    public final C0 q(AbstractC1170I abstractC1170I, Object obj, long j7, long j8) {
        InterfaceC2142x.b K6 = K(abstractC1170I, obj, j7, j8, this.f15538b, this.f15537a);
        boolean b7 = K6.b();
        Object obj2 = K6.f20848a;
        return b7 ? o(abstractC1170I, obj2, K6.f20849b, K6.f20850c, j7, K6.f20851d) : p(abstractC1170I, obj2, j7, -9223372036854775807L, K6.f20851d);
    }

    public final long r(AbstractC1170I abstractC1170I, Object obj, int i7) {
        abstractC1170I.h(obj, this.f15537a);
        long f7 = this.f15537a.f(i7);
        return f7 == Long.MIN_VALUE ? this.f15537a.f12400d : f7 + this.f15537a.i(i7);
    }

    public C0 s(long j7, U0 u02) {
        B0 b02 = this.f15547k;
        return b02 == null ? i(u02) : k(u02.f15630a, b02, j7);
    }

    public B0 t() {
        return this.f15545i;
    }

    public B0 u() {
        return this.f15546j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k0.C0 v(d0.AbstractC1170I r19, k0.C0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            x0.x$b r3 = r2.f15523a
            boolean r12 = r0.y(r3)
            boolean r13 = r0.A(r1, r3)
            boolean r14 = r0.z(r1, r3, r12)
            x0.x$b r4 = r2.f15523a
            java.lang.Object r4 = r4.f20848a
            d0.I$b r5 = r0.f15537a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.f20852e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            d0.I$b r7 = r0.f15537a
            long r7 = r7.f(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            d0.I$b r1 = r0.f15537a
            int r4 = r3.f20849b
            int r5 = r3.f20850c
            long r4 = r1.b(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            d0.I$b r1 = r0.f15537a
            long r4 = r1.j()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            d0.I$b r1 = r0.f15537a
            int r4 = r3.f20849b
            boolean r1 = r1.r(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f20852e
            if (r1 == r6) goto L7a
            d0.I$b r4 = r0.f15537a
            boolean r1 = r4.r(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            k0.C0 r15 = new k0.C0
            long r4 = r2.f15524b
            long r1 = r2.f15525c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.E0.v(d0.I, k0.C0):k0.C0");
    }

    public final boolean w(Object obj, AbstractC1170I abstractC1170I) {
        int c7 = abstractC1170I.h(obj, this.f15537a).c();
        int o7 = this.f15537a.o();
        return c7 > 0 && this.f15537a.r(o7) && (c7 > 1 || this.f15537a.f(o7) != Long.MIN_VALUE);
    }

    public void x(AbstractC1170I abstractC1170I) {
        B0 b02;
        if (this.f15551o.f16060a == -9223372036854775807L || (b02 = this.f15547k) == null) {
            H();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair h7 = h(abstractC1170I, b02.f15512f.f15523a.f20848a, 0L);
        if (h7 != null && !abstractC1170I.n(abstractC1170I.h(h7.first, this.f15537a).f12399c, this.f15538b).f()) {
            long N6 = N(h7.first);
            if (N6 == -1) {
                N6 = this.f15542f;
                this.f15542f = 1 + N6;
            }
            C0 q7 = q(abstractC1170I, h7.first, ((Long) h7.second).longValue(), N6);
            B0 J6 = J(q7);
            if (J6 == null) {
                J6 = this.f15541e.a(q7, (b02.m() + b02.f15512f.f15527e) - q7.f15524b);
            }
            arrayList.add(J6);
        }
        G(arrayList);
    }

    public final boolean y(InterfaceC2142x.b bVar) {
        return !bVar.b() && bVar.f20852e == -1;
    }

    public final boolean z(AbstractC1170I abstractC1170I, InterfaceC2142x.b bVar, boolean z7) {
        int b7 = abstractC1170I.b(bVar.f20848a);
        return !abstractC1170I.n(abstractC1170I.f(b7, this.f15537a).f12399c, this.f15538b).f12428i && abstractC1170I.r(b7, this.f15537a, this.f15538b, this.f15543g, this.f15544h) && z7;
    }
}
