package y0;

import F0.C0363h;
import F0.C0369n;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.L;
import F0.M;
import F0.S;
import F0.T;
import F0.r;
import android.util.SparseArray;
import b1.C0788a;
import c1.t;
import c1.u;
import d0.AbstractC1203z;
import d0.C1194q;
import d0.InterfaceC1186i;
import g0.AbstractC1297a;
import g0.z;
import java.util.List;
import java.util.Objects;
import l0.y1;
import y0.InterfaceC2227f;

/* renamed from: y0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2225d implements InterfaceC0374t, InterfaceC2227f {

    /* renamed from: x, reason: collision with root package name */
    public static final b f21232x = new b();

    /* renamed from: y, reason: collision with root package name */
    public static final L f21233y = new L();

    /* renamed from: o, reason: collision with root package name */
    public final r f21234o;

    /* renamed from: p, reason: collision with root package name */
    public final int f21235p;

    /* renamed from: q, reason: collision with root package name */
    public final C1194q f21236q;

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f21237r = new SparseArray();

    /* renamed from: s, reason: collision with root package name */
    public boolean f21238s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC2227f.b f21239t;

    /* renamed from: u, reason: collision with root package name */
    public long f21240u;

    /* renamed from: v, reason: collision with root package name */
    public M f21241v;

    /* renamed from: w, reason: collision with root package name */
    public C1194q[] f21242w;

    /* renamed from: y0.d$a */
    public static final class a implements T {

        /* renamed from: a, reason: collision with root package name */
        public final int f21243a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21244b;

        /* renamed from: c, reason: collision with root package name */
        public final C1194q f21245c;

        /* renamed from: d, reason: collision with root package name */
        public final C0369n f21246d = new C0369n();

        /* renamed from: e, reason: collision with root package name */
        public C1194q f21247e;

        /* renamed from: f, reason: collision with root package name */
        public T f21248f;

        /* renamed from: g, reason: collision with root package name */
        public long f21249g;

        public a(int i7, int i8, C1194q c1194q) {
            this.f21243a = i7;
            this.f21244b = i8;
            this.f21245c = c1194q;
        }

        @Override // F0.T
        public void a(z zVar, int i7, int i8) {
            ((T) g0.M.i(this.f21248f)).e(zVar, i7);
        }

        @Override // F0.T
        public void b(long j7, int i7, int i8, int i9, T.a aVar) {
            long j8 = this.f21249g;
            if (j8 != -9223372036854775807L && j7 >= j8) {
                this.f21248f = this.f21246d;
            }
            ((T) g0.M.i(this.f21248f)).b(j7, i7, i8, i9, aVar);
        }

        @Override // F0.T
        public int c(InterfaceC1186i interfaceC1186i, int i7, boolean z7, int i8) {
            return ((T) g0.M.i(this.f21248f)).f(interfaceC1186i, i7, z7);
        }

        @Override // F0.T
        public void d(C1194q c1194q) {
            C1194q c1194q2 = this.f21245c;
            if (c1194q2 != null) {
                c1194q = c1194q.h(c1194q2);
            }
            this.f21247e = c1194q;
            ((T) g0.M.i(this.f21248f)).d(this.f21247e);
        }

        @Override // F0.T
        public /* synthetic */ void e(z zVar, int i7) {
            S.b(this, zVar, i7);
        }

        @Override // F0.T
        public /* synthetic */ int f(InterfaceC1186i interfaceC1186i, int i7, boolean z7) {
            return S.a(this, interfaceC1186i, i7, z7);
        }

        public void g(InterfaceC2227f.b bVar, long j7) {
            if (bVar == null) {
                this.f21248f = this.f21246d;
                return;
            }
            this.f21249g = j7;
            T a7 = bVar.a(this.f21243a, this.f21244b);
            this.f21248f = a7;
            C1194q c1194q = this.f21247e;
            if (c1194q != null) {
                a7.d(c1194q);
            }
        }
    }

    /* renamed from: y0.d$b */
    public static final class b implements InterfaceC2227f.a {

        /* renamed from: a, reason: collision with root package name */
        public t.a f21250a = new c1.h();

        /* renamed from: b, reason: collision with root package name */
        public boolean f21251b;

        @Override // y0.InterfaceC2227f.a
        public C1194q b(C1194q c1194q) {
            String str;
            if (!this.f21251b || !this.f21250a.a(c1194q)) {
                return c1194q;
            }
            C1194q.b S6 = c1194q.a().o0("application/x-media3-cues").S(this.f21250a.c(c1194q));
            StringBuilder sb = new StringBuilder();
            sb.append(c1194q.f12726n);
            if (c1194q.f12722j != null) {
                str = " " + c1194q.f12722j;
            } else {
                str = "";
            }
            sb.append(str);
            return S6.O(sb.toString()).s0(Long.MAX_VALUE).K();
        }

        @Override // y0.InterfaceC2227f.a
        public InterfaceC2227f c(int i7, C1194q c1194q, boolean z7, List list, T t7, y1 y1Var) {
            r hVar;
            String str = c1194q.f12725m;
            if (!AbstractC1203z.r(str)) {
                if (AbstractC1203z.q(str)) {
                    hVar = new X0.e(this.f21250a, this.f21251b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar = new N0.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar = new C0788a();
                } else {
                    int i8 = z7 ? 4 : 0;
                    if (!this.f21251b) {
                        i8 |= 32;
                    }
                    hVar = new Z0.h(this.f21250a, i8, null, null, list, t7);
                }
            } else {
                if (!this.f21251b) {
                    return null;
                }
                hVar = new c1.o(this.f21250a.b(c1194q), c1194q);
            }
            if (this.f21251b && !AbstractC1203z.r(str) && !(hVar.d() instanceof Z0.h) && !(hVar.d() instanceof X0.e)) {
                hVar = new u(hVar, this.f21250a);
            }
            return new C2225d(hVar, i7, c1194q);
        }

        @Override // y0.InterfaceC2227f.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(boolean z7) {
            this.f21251b = z7;
            return this;
        }
    }

    public C2225d(r rVar, int i7, C1194q c1194q) {
        this.f21234o = rVar;
        this.f21235p = i7;
        this.f21236q = c1194q;
    }

    @Override // F0.InterfaceC0374t
    public T a(int i7, int i8) {
        a aVar = (a) this.f21237r.get(i7);
        if (aVar == null) {
            AbstractC1297a.f(this.f21242w == null);
            aVar = new a(i7, i8, i8 == this.f21235p ? this.f21236q : null);
            aVar.g(this.f21239t, this.f21240u);
            this.f21237r.put(i7, aVar);
        }
        return aVar;
    }

    @Override // y0.InterfaceC2227f
    public void b(InterfaceC2227f.b bVar, long j7, long j8) {
        this.f21239t = bVar;
        this.f21240u = j8;
        if (!this.f21238s) {
            this.f21234o.b(this);
            if (j7 != -9223372036854775807L) {
                this.f21234o.a(0L, j7);
            }
            this.f21238s = true;
            return;
        }
        r rVar = this.f21234o;
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        rVar.a(0L, j7);
        for (int i7 = 0; i7 < this.f21237r.size(); i7++) {
            ((a) this.f21237r.valueAt(i7)).g(bVar, j8);
        }
    }

    @Override // y0.InterfaceC2227f
    public boolean c(InterfaceC0373s interfaceC0373s) {
        int i7 = this.f21234o.i(interfaceC0373s, f21233y);
        AbstractC1297a.f(i7 != 1);
        return i7 == 0;
    }

    @Override // y0.InterfaceC2227f
    public C0363h d() {
        M m7 = this.f21241v;
        if (m7 instanceof C0363h) {
            return (C0363h) m7;
        }
        return null;
    }

    @Override // F0.InterfaceC0374t
    public void e(M m7) {
        this.f21241v = m7;
    }

    @Override // y0.InterfaceC2227f
    public C1194q[] f() {
        return this.f21242w;
    }

    @Override // F0.InterfaceC0374t
    public void j() {
        C1194q[] c1194qArr = new C1194q[this.f21237r.size()];
        for (int i7 = 0; i7 < this.f21237r.size(); i7++) {
            c1194qArr[i7] = (C1194q) AbstractC1297a.h(((a) this.f21237r.valueAt(i7)).f21247e);
        }
        this.f21242w = c1194qArr;
    }

    @Override // y0.InterfaceC2227f
    public void release() {
        this.f21234o.release();
    }
}
