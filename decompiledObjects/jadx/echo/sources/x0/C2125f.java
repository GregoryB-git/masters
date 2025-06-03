package x0;

import d0.AbstractC1170I;
import g0.AbstractC1297a;
import java.io.IOException;
import java.util.ArrayList;
import x0.InterfaceC2142x;

/* renamed from: x0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2125f extends b0 {

    /* renamed from: m, reason: collision with root package name */
    public final long f20729m;

    /* renamed from: n, reason: collision with root package name */
    public final long f20730n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f20731o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f20732p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f20733q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f20734r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC1170I.c f20735s;

    /* renamed from: t, reason: collision with root package name */
    public a f20736t;

    /* renamed from: u, reason: collision with root package name */
    public b f20737u;

    /* renamed from: v, reason: collision with root package name */
    public long f20738v;

    /* renamed from: w, reason: collision with root package name */
    public long f20739w;

    /* renamed from: x0.f$a */
    public static final class a extends AbstractC2135p {

        /* renamed from: f, reason: collision with root package name */
        public final long f20740f;

        /* renamed from: g, reason: collision with root package name */
        public final long f20741g;

        /* renamed from: h, reason: collision with root package name */
        public final long f20742h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f20743i;

        public a(AbstractC1170I abstractC1170I, long j7, long j8) {
            super(abstractC1170I);
            boolean z7 = false;
            if (abstractC1170I.i() != 1) {
                throw new b(0);
            }
            AbstractC1170I.c n7 = abstractC1170I.n(0, new AbstractC1170I.c());
            long max = Math.max(0L, j7);
            if (!n7.f12430k && max != 0 && !n7.f12427h) {
                throw new b(1);
            }
            long max2 = j8 == Long.MIN_VALUE ? n7.f12432m : Math.max(0L, j8);
            long j9 = n7.f12432m;
            if (j9 != -9223372036854775807L) {
                max2 = max2 > j9 ? j9 : max2;
                if (max > max2) {
                    throw new b(2);
                }
            }
            this.f20740f = max;
            this.f20741g = max2;
            this.f20742h = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
            if (n7.f12428i && (max2 == -9223372036854775807L || (j9 != -9223372036854775807L && max2 == j9))) {
                z7 = true;
            }
            this.f20743i = z7;
        }

        @Override // x0.AbstractC2135p, d0.AbstractC1170I
        public AbstractC1170I.b g(int i7, AbstractC1170I.b bVar, boolean z7) {
            this.f20808e.g(0, bVar, z7);
            long n7 = bVar.n() - this.f20740f;
            long j7 = this.f20742h;
            return bVar.s(bVar.f12397a, bVar.f12398b, 0, j7 == -9223372036854775807L ? -9223372036854775807L : j7 - n7, n7);
        }

        @Override // x0.AbstractC2135p, d0.AbstractC1170I
        public AbstractC1170I.c o(int i7, AbstractC1170I.c cVar, long j7) {
            this.f20808e.o(0, cVar, 0L);
            long j8 = cVar.f12435p;
            long j9 = this.f20740f;
            cVar.f12435p = j8 + j9;
            cVar.f12432m = this.f20742h;
            cVar.f12428i = this.f20743i;
            long j10 = cVar.f12431l;
            if (j10 != -9223372036854775807L) {
                long max = Math.max(j10, j9);
                cVar.f12431l = max;
                long j11 = this.f20741g;
                if (j11 != -9223372036854775807L) {
                    max = Math.min(max, j11);
                }
                cVar.f12431l = max - this.f20740f;
            }
            long i12 = g0.M.i1(this.f20740f);
            long j12 = cVar.f12424e;
            if (j12 != -9223372036854775807L) {
                cVar.f12424e = j12 + i12;
            }
            long j13 = cVar.f12425f;
            if (j13 != -9223372036854775807L) {
                cVar.f12425f = j13 + i12;
            }
            return cVar;
        }
    }

    /* renamed from: x0.f$b */
    public static final class b extends IOException {

        /* renamed from: o, reason: collision with root package name */
        public final int f20744o;

        public b(int i7) {
            super("Illegal clipping: " + a(i7));
            this.f20744o = i7;
        }

        public static String a(int i7) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public C2125f(InterfaceC2142x interfaceC2142x, long j7, long j8) {
        this(interfaceC2142x, j7, j8, true, false, false);
    }

    @Override // x0.AbstractC2127h, x0.AbstractC2120a
    public void B() {
        super.B();
        this.f20737u = null;
        this.f20736t = null;
    }

    @Override // x0.b0
    public void S(AbstractC1170I abstractC1170I) {
        if (this.f20737u != null) {
            return;
        }
        W(abstractC1170I);
    }

    public final void W(AbstractC1170I abstractC1170I) {
        long j7;
        long j8;
        abstractC1170I.n(0, this.f20735s);
        long e7 = this.f20735s.e();
        if (this.f20736t == null || this.f20734r.isEmpty() || this.f20732p) {
            long j9 = this.f20729m;
            long j10 = this.f20730n;
            if (this.f20733q) {
                long c7 = this.f20735s.c();
                j9 += c7;
                j10 += c7;
            }
            this.f20738v = e7 + j9;
            this.f20739w = this.f20730n != Long.MIN_VALUE ? e7 + j10 : Long.MIN_VALUE;
            int size = this.f20734r.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((C2124e) this.f20734r.get(i7)).w(this.f20738v, this.f20739w);
            }
            j7 = j9;
            j8 = j10;
        } else {
            long j11 = this.f20738v - e7;
            j8 = this.f20730n != Long.MIN_VALUE ? this.f20739w - e7 : Long.MIN_VALUE;
            j7 = j11;
        }
        try {
            a aVar = new a(abstractC1170I, j7, j8);
            this.f20736t = aVar;
            A(aVar);
        } catch (b e8) {
            this.f20737u = e8;
            for (int i8 = 0; i8 < this.f20734r.size(); i8++) {
                ((C2124e) this.f20734r.get(i8)).t(this.f20737u);
            }
        }
    }

    @Override // x0.InterfaceC2142x
    public void e(InterfaceC2140v interfaceC2140v) {
        AbstractC1297a.f(this.f20734r.remove(interfaceC2140v));
        this.f20715k.e(((C2124e) interfaceC2140v).f20719o);
        if (!this.f20734r.isEmpty() || this.f20732p) {
            return;
        }
        W(((a) AbstractC1297a.e(this.f20736t)).f20808e);
    }

    @Override // x0.InterfaceC2142x
    public InterfaceC2140v f(InterfaceC2142x.b bVar, B0.b bVar2, long j7) {
        C2124e c2124e = new C2124e(this.f20715k.f(bVar, bVar2, j7), this.f20731o, this.f20738v, this.f20739w);
        this.f20734r.add(c2124e);
        return c2124e;
    }

    @Override // x0.AbstractC2127h, x0.InterfaceC2142x
    public void h() {
        b bVar = this.f20737u;
        if (bVar != null) {
            throw bVar;
        }
        super.h();
    }

    public C2125f(InterfaceC2142x interfaceC2142x, long j7, long j8, boolean z7, boolean z8, boolean z9) {
        super((InterfaceC2142x) AbstractC1297a.e(interfaceC2142x));
        AbstractC1297a.a(j7 >= 0);
        this.f20729m = j7;
        this.f20730n = j8;
        this.f20731o = z7;
        this.f20732p = z8;
        this.f20733q = z9;
        this.f20734r = new ArrayList();
        this.f20735s = new AbstractC1170I.c();
    }
}
