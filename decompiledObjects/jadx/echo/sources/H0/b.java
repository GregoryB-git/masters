package H0;

import F0.AbstractC0372q;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.J;
import F0.L;
import F0.M;
import F0.T;
import F0.r;
import X2.g0;
import c1.t;
import c1.v;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.AbstractC1203z;
import d0.C1162A;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.o;
import g0.z;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final z f2116a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2117b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2118c;

    /* renamed from: d, reason: collision with root package name */
    public final t.a f2119d;

    /* renamed from: e, reason: collision with root package name */
    public int f2120e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0374t f2121f;

    /* renamed from: g, reason: collision with root package name */
    public H0.c f2122g;

    /* renamed from: h, reason: collision with root package name */
    public long f2123h;

    /* renamed from: i, reason: collision with root package name */
    public e[] f2124i;

    /* renamed from: j, reason: collision with root package name */
    public long f2125j;

    /* renamed from: k, reason: collision with root package name */
    public e f2126k;

    /* renamed from: l, reason: collision with root package name */
    public int f2127l;

    /* renamed from: m, reason: collision with root package name */
    public long f2128m;

    /* renamed from: n, reason: collision with root package name */
    public long f2129n;

    /* renamed from: o, reason: collision with root package name */
    public int f2130o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2131p;

    /* renamed from: H0.b$b, reason: collision with other inner class name */
    public class C0034b implements M {

        /* renamed from: a, reason: collision with root package name */
        public final long f2132a;

        public C0034b(long j7) {
            this.f2132a = j7;
        }

        @Override // F0.M
        public boolean h() {
            return true;
        }

        @Override // F0.M
        public M.a j(long j7) {
            M.a i7 = b.this.f2124i[0].i(j7);
            for (int i8 = 1; i8 < b.this.f2124i.length; i8++) {
                M.a i9 = b.this.f2124i[i8].i(j7);
                if (i9.f1789a.f1795b < i7.f1789a.f1795b) {
                    i7 = i9;
                }
            }
            return i7;
        }

        @Override // F0.M
        public long l() {
            return this.f2132a;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f2134a;

        /* renamed from: b, reason: collision with root package name */
        public int f2135b;

        /* renamed from: c, reason: collision with root package name */
        public int f2136c;

        public c() {
        }

        public void a(z zVar) {
            this.f2134a = zVar.t();
            this.f2135b = zVar.t();
            this.f2136c = 0;
        }

        public void b(z zVar) {
            a(zVar);
            if (this.f2134a == 1414744396) {
                this.f2136c = zVar.t();
                return;
            }
            throw C1162A.a("LIST expected, found: " + this.f2134a, null);
        }
    }

    public b(int i7, t.a aVar) {
        this.f2119d = aVar;
        this.f2118c = (i7 & 1) == 0;
        this.f2116a = new z(12);
        this.f2117b = new c();
        this.f2121f = new J();
        this.f2124i = new e[0];
        this.f2128m = -1L;
        this.f2129n = -1L;
        this.f2127l = -1;
        this.f2123h = -9223372036854775807L;
    }

    public static void f(InterfaceC0373s interfaceC0373s) {
        if ((interfaceC0373s.p() & 1) == 1) {
            interfaceC0373s.i(1);
        }
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f2125j = -1L;
        this.f2126k = null;
        for (e eVar : this.f2124i) {
            eVar.o(j7);
        }
        if (j7 != 0) {
            this.f2120e = 6;
        } else if (this.f2124i.length == 0) {
            this.f2120e = 0;
        } else {
            this.f2120e = 3;
        }
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f2120e = 0;
        if (this.f2118c) {
            interfaceC0374t = new v(interfaceC0374t, this.f2119d);
        }
        this.f2121f = interfaceC0374t;
        this.f2125j = -1L;
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.n(this.f2116a.e(), 0, 12);
        this.f2116a.T(0);
        if (this.f2116a.t() != 1179011410) {
            return false;
        }
        this.f2116a.U(4);
        return this.f2116a.t() == 541677121;
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    public final e h(int i7) {
        for (e eVar : this.f2124i) {
            if (eVar.j(i7)) {
                return eVar;
            }
        }
        return null;
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        if (o(interfaceC0373s, l7)) {
            return 1;
        }
        switch (this.f2120e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!e(interfaceC0373s)) {
                    throw C1162A.a("AVI Header List not found", null);
                }
                interfaceC0373s.i(12);
                this.f2120e = 1;
                return 0;
            case 1:
                interfaceC0373s.readFully(this.f2116a.e(), 0, 12);
                this.f2116a.T(0);
                this.f2117b.b(this.f2116a);
                c cVar = this.f2117b;
                if (cVar.f2136c == 1819436136) {
                    this.f2127l = cVar.f2135b;
                    this.f2120e = 2;
                    return 0;
                }
                throw C1162A.a("hdrl expected, found: " + this.f2117b.f2136c, null);
            case 2:
                int i7 = this.f2127l - 4;
                z zVar = new z(i7);
                interfaceC0373s.readFully(zVar.e(), 0, i7);
                j(zVar);
                this.f2120e = 3;
                return 0;
            case 3:
                if (this.f2128m != -1) {
                    long p7 = interfaceC0373s.p();
                    long j7 = this.f2128m;
                    if (p7 != j7) {
                        this.f2125j = j7;
                        return 0;
                    }
                }
                interfaceC0373s.n(this.f2116a.e(), 0, 12);
                interfaceC0373s.h();
                this.f2116a.T(0);
                this.f2117b.a(this.f2116a);
                int t7 = this.f2116a.t();
                int i8 = this.f2117b.f2134a;
                if (i8 == 1179011410) {
                    interfaceC0373s.i(12);
                    return 0;
                }
                if (i8 != 1414744396 || t7 != 1769369453) {
                    this.f2125j = interfaceC0373s.p() + this.f2117b.f2135b + 8;
                    return 0;
                }
                long p8 = interfaceC0373s.p();
                this.f2128m = p8;
                this.f2129n = p8 + this.f2117b.f2135b + 8;
                if (!this.f2131p) {
                    if (((H0.c) AbstractC1297a.e(this.f2122g)).b()) {
                        this.f2120e = 4;
                        this.f2125j = this.f2129n;
                        return 0;
                    }
                    this.f2121f.e(new M.b(this.f2123h));
                    this.f2131p = true;
                }
                this.f2125j = interfaceC0373s.p() + 12;
                this.f2120e = 6;
                return 0;
            case 4:
                interfaceC0373s.readFully(this.f2116a.e(), 0, 8);
                this.f2116a.T(0);
                int t8 = this.f2116a.t();
                int t9 = this.f2116a.t();
                if (t8 == 829973609) {
                    this.f2120e = 5;
                    this.f2130o = t9;
                } else {
                    this.f2125j = interfaceC0373s.p() + t9;
                }
                return 0;
            case 5:
                z zVar2 = new z(this.f2130o);
                interfaceC0373s.readFully(zVar2.e(), 0, this.f2130o);
                k(zVar2);
                this.f2120e = 6;
                this.f2125j = this.f2128m;
                return 0;
            case 6:
                return n(interfaceC0373s);
            default:
                throw new AssertionError();
        }
    }

    public final void j(z zVar) {
        f d7 = f.d(1819436136, zVar);
        if (d7.a() != 1819436136) {
            throw C1162A.a("Unexpected header list type " + d7.a(), null);
        }
        H0.c cVar = (H0.c) d7.c(H0.c.class);
        if (cVar == null) {
            throw C1162A.a("AviHeader not found", null);
        }
        this.f2122g = cVar;
        this.f2123h = cVar.f2139c * cVar.f2137a;
        ArrayList arrayList = new ArrayList();
        g0 it = d7.f2159a.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            H0.a aVar = (H0.a) it.next();
            if (aVar.a() == 1819440243) {
                int i8 = i7 + 1;
                e m7 = m((f) aVar, i7);
                if (m7 != null) {
                    arrayList.add(m7);
                }
                i7 = i8;
            }
        }
        this.f2124i = (e[]) arrayList.toArray(new e[0]);
        this.f2121f.j();
    }

    public final void k(z zVar) {
        long l7 = l(zVar);
        while (zVar.a() >= 16) {
            int t7 = zVar.t();
            int t8 = zVar.t();
            long t9 = zVar.t() + l7;
            zVar.t();
            e h7 = h(t7);
            if (h7 != null) {
                if ((t8 & 16) == 16) {
                    h7.b(t9);
                }
                h7.k();
            }
        }
        for (e eVar : this.f2124i) {
            eVar.c();
        }
        this.f2131p = true;
        this.f2121f.e(new C0034b(this.f2123h));
    }

    public final long l(z zVar) {
        if (zVar.a() < 16) {
            return 0L;
        }
        int f7 = zVar.f();
        zVar.U(8);
        long t7 = zVar.t();
        long j7 = this.f2128m;
        long j8 = t7 <= j7 ? j7 + 8 : 0L;
        zVar.T(f7);
        return j8;
    }

    public final e m(f fVar, int i7) {
        String str;
        d dVar = (d) fVar.c(d.class);
        g gVar = (g) fVar.c(g.class);
        if (dVar == null) {
            str = "Missing Stream Header";
        } else {
            if (gVar != null) {
                long b7 = dVar.b();
                C1194q c1194q = gVar.f2161a;
                C1194q.b a7 = c1194q.a();
                a7.Z(i7);
                int i8 = dVar.f2146f;
                if (i8 != 0) {
                    a7.f0(i8);
                }
                h hVar = (h) fVar.c(h.class);
                if (hVar != null) {
                    a7.c0(hVar.f2162a);
                }
                int k7 = AbstractC1203z.k(c1194q.f12726n);
                if (k7 != 1 && k7 != 2) {
                    return null;
                }
                T a8 = this.f2121f.a(i7, k7);
                a8.d(a7.K());
                e eVar = new e(i7, k7, b7, dVar.f2145e, a8);
                this.f2123h = b7;
                return eVar;
            }
            str = "Missing Stream Format";
        }
        o.h("AviExtractor", str);
        return null;
    }

    public final int n(InterfaceC0373s interfaceC0373s) {
        if (interfaceC0373s.p() >= this.f2129n) {
            return -1;
        }
        e eVar = this.f2126k;
        if (eVar == null) {
            f(interfaceC0373s);
            interfaceC0373s.n(this.f2116a.e(), 0, 12);
            this.f2116a.T(0);
            int t7 = this.f2116a.t();
            if (t7 == 1414744396) {
                this.f2116a.T(8);
                interfaceC0373s.i(this.f2116a.t() != 1769369453 ? 8 : 12);
                interfaceC0373s.h();
                return 0;
            }
            int t8 = this.f2116a.t();
            if (t7 == 1263424842) {
                this.f2125j = interfaceC0373s.p() + t8 + 8;
                return 0;
            }
            interfaceC0373s.i(8);
            interfaceC0373s.h();
            e h7 = h(t7);
            if (h7 == null) {
                this.f2125j = interfaceC0373s.p() + t8;
                return 0;
            }
            h7.n(t8);
            this.f2126k = h7;
        } else if (eVar.m(interfaceC0373s)) {
            this.f2126k = null;
        }
        return 0;
    }

    public final boolean o(InterfaceC0373s interfaceC0373s, L l7) {
        boolean z7;
        if (this.f2125j != -1) {
            long p7 = interfaceC0373s.p();
            long j7 = this.f2125j;
            if (j7 < p7 || j7 > 262144 + p7) {
                l7.f1788a = j7;
                z7 = true;
                this.f2125j = -1L;
                return z7;
            }
            interfaceC0373s.i((int) (j7 - p7));
        }
        z7 = false;
        this.f2125j = -1L;
        return z7;
    }

    @Override // F0.r
    public void release() {
    }
}
