package l1;

import F0.InterfaceC0374t;
import F0.T;
import android.util.SparseArray;
import d0.C1185h;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.AbstractC1300d;
import h0.AbstractC1329d;
import h0.C1330e;
import java.util.ArrayList;
import java.util.Arrays;
import l1.K;

/* loaded from: classes.dex */
public final class p implements InterfaceC1597m {

    /* renamed from: a, reason: collision with root package name */
    public final F f16969a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16970b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16971c;

    /* renamed from: g, reason: collision with root package name */
    public long f16975g;

    /* renamed from: i, reason: collision with root package name */
    public String f16977i;

    /* renamed from: j, reason: collision with root package name */
    public T f16978j;

    /* renamed from: k, reason: collision with root package name */
    public b f16979k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16980l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16982n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f16976h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final w f16972d = new w(7, 128);

    /* renamed from: e, reason: collision with root package name */
    public final w f16973e = new w(8, 128);

    /* renamed from: f, reason: collision with root package name */
    public final w f16974f = new w(6, 128);

    /* renamed from: m, reason: collision with root package name */
    public long f16981m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final g0.z f16983o = new g0.z();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final T f16984a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16985b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16986c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f16987d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f16988e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        public final C1330e f16989f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f16990g;

        /* renamed from: h, reason: collision with root package name */
        public int f16991h;

        /* renamed from: i, reason: collision with root package name */
        public int f16992i;

        /* renamed from: j, reason: collision with root package name */
        public long f16993j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f16994k;

        /* renamed from: l, reason: collision with root package name */
        public long f16995l;

        /* renamed from: m, reason: collision with root package name */
        public a f16996m;

        /* renamed from: n, reason: collision with root package name */
        public a f16997n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f16998o;

        /* renamed from: p, reason: collision with root package name */
        public long f16999p;

        /* renamed from: q, reason: collision with root package name */
        public long f17000q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f17001r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f17002s;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f17003a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f17004b;

            /* renamed from: c, reason: collision with root package name */
            public AbstractC1329d.c f17005c;

            /* renamed from: d, reason: collision with root package name */
            public int f17006d;

            /* renamed from: e, reason: collision with root package name */
            public int f17007e;

            /* renamed from: f, reason: collision with root package name */
            public int f17008f;

            /* renamed from: g, reason: collision with root package name */
            public int f17009g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f17010h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f17011i;

            /* renamed from: j, reason: collision with root package name */
            public boolean f17012j;

            /* renamed from: k, reason: collision with root package name */
            public boolean f17013k;

            /* renamed from: l, reason: collision with root package name */
            public int f17014l;

            /* renamed from: m, reason: collision with root package name */
            public int f17015m;

            /* renamed from: n, reason: collision with root package name */
            public int f17016n;

            /* renamed from: o, reason: collision with root package name */
            public int f17017o;

            /* renamed from: p, reason: collision with root package name */
            public int f17018p;

            public a() {
            }

            public void b() {
                this.f17004b = false;
                this.f17003a = false;
            }

            public final boolean c(a aVar) {
                int i7;
                int i8;
                int i9;
                boolean z7;
                if (!this.f17003a) {
                    return false;
                }
                if (!aVar.f17003a) {
                    return true;
                }
                AbstractC1329d.c cVar = (AbstractC1329d.c) AbstractC1297a.h(this.f17005c);
                AbstractC1329d.c cVar2 = (AbstractC1329d.c) AbstractC1297a.h(aVar.f17005c);
                return (this.f17008f == aVar.f17008f && this.f17009g == aVar.f17009g && this.f17010h == aVar.f17010h && (!this.f17011i || !aVar.f17011i || this.f17012j == aVar.f17012j) && (((i7 = this.f17006d) == (i8 = aVar.f17006d) || (i7 != 0 && i8 != 0)) && (((i9 = cVar.f14561n) != 0 || cVar2.f14561n != 0 || (this.f17015m == aVar.f17015m && this.f17016n == aVar.f17016n)) && ((i9 != 1 || cVar2.f14561n != 1 || (this.f17017o == aVar.f17017o && this.f17018p == aVar.f17018p)) && (z7 = this.f17013k) == aVar.f17013k && (!z7 || this.f17014l == aVar.f17014l))))) ? false : true;
            }

            public boolean d() {
                int i7;
                return this.f17004b && ((i7 = this.f17007e) == 7 || i7 == 2);
            }

            public void e(AbstractC1329d.c cVar, int i7, int i8, int i9, int i10, boolean z7, boolean z8, boolean z9, boolean z10, int i11, int i12, int i13, int i14, int i15) {
                this.f17005c = cVar;
                this.f17006d = i7;
                this.f17007e = i8;
                this.f17008f = i9;
                this.f17009g = i10;
                this.f17010h = z7;
                this.f17011i = z8;
                this.f17012j = z9;
                this.f17013k = z10;
                this.f17014l = i11;
                this.f17015m = i12;
                this.f17016n = i13;
                this.f17017o = i14;
                this.f17018p = i15;
                this.f17003a = true;
                this.f17004b = true;
            }

            public void f(int i7) {
                this.f17007e = i7;
                this.f17004b = true;
            }
        }

        public b(T t7, boolean z7, boolean z8) {
            this.f16984a = t7;
            this.f16985b = z7;
            this.f16986c = z8;
            this.f16996m = new a();
            this.f16997n = new a();
            byte[] bArr = new byte[128];
            this.f16990g = bArr;
            this.f16989f = new C1330e(bArr, 0, 0);
            h();
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l1.p.b.a(byte[], int, int):void");
        }

        public void b(long j7) {
            i();
            this.f16993j = j7;
            e(0);
            this.f16998o = false;
        }

        public boolean c(long j7, int i7, boolean z7) {
            if (this.f16992i == 9 || (this.f16986c && this.f16997n.c(this.f16996m))) {
                if (z7 && this.f16998o) {
                    e(i7 + ((int) (j7 - this.f16993j)));
                }
                this.f16999p = this.f16993j;
                this.f17000q = this.f16995l;
                this.f17001r = false;
                this.f16998o = true;
            }
            i();
            return this.f17001r;
        }

        public boolean d() {
            return this.f16986c;
        }

        public final void e(int i7) {
            long j7 = this.f17000q;
            if (j7 == -9223372036854775807L) {
                return;
            }
            boolean z7 = this.f17001r;
            this.f16984a.b(j7, z7 ? 1 : 0, (int) (this.f16993j - this.f16999p), i7, null);
        }

        public void f(AbstractC1329d.b bVar) {
            this.f16988e.append(bVar.f14545a, bVar);
        }

        public void g(AbstractC1329d.c cVar) {
            this.f16987d.append(cVar.f14551d, cVar);
        }

        public void h() {
            this.f16994k = false;
            this.f16998o = false;
            this.f16997n.b();
        }

        public final void i() {
            boolean d7 = this.f16985b ? this.f16997n.d() : this.f17002s;
            boolean z7 = this.f17001r;
            int i7 = this.f16992i;
            boolean z8 = true;
            if (i7 != 5 && (!d7 || i7 != 1)) {
                z8 = false;
            }
            this.f17001r = z7 | z8;
        }

        public void j(long j7, int i7, long j8, boolean z7) {
            this.f16992i = i7;
            this.f16995l = j8;
            this.f16993j = j7;
            this.f17002s = z7;
            if (!this.f16985b || i7 != 1) {
                if (!this.f16986c) {
                    return;
                }
                if (i7 != 5 && i7 != 1 && i7 != 2) {
                    return;
                }
            }
            a aVar = this.f16996m;
            this.f16996m = this.f16997n;
            this.f16997n = aVar;
            aVar.b();
            this.f16991h = 0;
            this.f16994k = true;
        }
    }

    public p(F f7, boolean z7, boolean z8) {
        this.f16969a = f7;
        this.f16970b = z7;
        this.f16971c = z8;
    }

    private void f() {
        AbstractC1297a.h(this.f16978j);
        g0.M.i(this.f16979k);
    }

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        f();
        int f7 = zVar.f();
        int g7 = zVar.g();
        byte[] e7 = zVar.e();
        this.f16975g += zVar.a();
        this.f16978j.e(zVar, zVar.a());
        while (true) {
            int c7 = AbstractC1329d.c(e7, f7, g7, this.f16976h);
            if (c7 == g7) {
                h(e7, f7, g7);
                return;
            }
            int f8 = AbstractC1329d.f(e7, c7);
            int i7 = c7 - f7;
            if (i7 > 0) {
                h(e7, f7, c7);
            }
            int i8 = g7 - c7;
            long j7 = this.f16975g - i8;
            g(j7, i8, i7 < 0 ? -i7 : 0, this.f16981m);
            i(j7, f8, this.f16981m);
            f7 = c7 + 3;
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        this.f16975g = 0L;
        this.f16982n = false;
        this.f16981m = -9223372036854775807L;
        AbstractC1329d.a(this.f16976h);
        this.f16972d.d();
        this.f16973e.d();
        this.f16974f.d();
        b bVar = this.f16979k;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
        f();
        if (z7) {
            this.f16979k.b(this.f16975g);
        }
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        this.f16981m = j7;
        this.f16982n |= (i7 & 2) != 0;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        this.f16977i = dVar.b();
        T a7 = interfaceC0374t.a(dVar.c(), 2);
        this.f16978j = a7;
        this.f16979k = new b(a7, this.f16970b, this.f16971c);
        this.f16969a.b(interfaceC0374t, dVar);
    }

    public final void g(long j7, int i7, int i8, long j8) {
        w wVar;
        if (!this.f16980l || this.f16979k.d()) {
            this.f16972d.b(i8);
            this.f16973e.b(i8);
            if (this.f16980l) {
                if (this.f16972d.c()) {
                    w wVar2 = this.f16972d;
                    this.f16979k.g(AbstractC1329d.l(wVar2.f17118d, 3, wVar2.f17119e));
                    wVar = this.f16972d;
                } else if (this.f16973e.c()) {
                    w wVar3 = this.f16973e;
                    this.f16979k.f(AbstractC1329d.j(wVar3.f17118d, 3, wVar3.f17119e));
                    wVar = this.f16973e;
                }
            } else if (this.f16972d.c() && this.f16973e.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar4 = this.f16972d;
                arrayList.add(Arrays.copyOf(wVar4.f17118d, wVar4.f17119e));
                w wVar5 = this.f16973e;
                arrayList.add(Arrays.copyOf(wVar5.f17118d, wVar5.f17119e));
                w wVar6 = this.f16972d;
                AbstractC1329d.c l7 = AbstractC1329d.l(wVar6.f17118d, 3, wVar6.f17119e);
                w wVar7 = this.f16973e;
                AbstractC1329d.b j9 = AbstractC1329d.j(wVar7.f17118d, 3, wVar7.f17119e);
                this.f16978j.d(new C1194q.b().a0(this.f16977i).o0("video/avc").O(AbstractC1300d.a(l7.f14548a, l7.f14549b, l7.f14550c)).v0(l7.f14553f).Y(l7.f14554g).P(new C1185h.b().d(l7.f14564q).c(l7.f14565r).e(l7.f14566s).g(l7.f14556i + 8).b(l7.f14557j + 8).a()).k0(l7.f14555h).b0(arrayList).g0(l7.f14567t).K());
                this.f16980l = true;
                this.f16979k.g(l7);
                this.f16979k.f(j9);
                this.f16972d.d();
                wVar = this.f16973e;
            }
            wVar.d();
        }
        if (this.f16974f.b(i8)) {
            w wVar8 = this.f16974f;
            this.f16983o.R(this.f16974f.f17118d, AbstractC1329d.r(wVar8.f17118d, wVar8.f17119e));
            this.f16983o.T(4);
            this.f16969a.a(j8, this.f16983o);
        }
        if (this.f16979k.c(j7, i7, this.f16980l)) {
            this.f16982n = false;
        }
    }

    public final void h(byte[] bArr, int i7, int i8) {
        if (!this.f16980l || this.f16979k.d()) {
            this.f16972d.a(bArr, i7, i8);
            this.f16973e.a(bArr, i7, i8);
        }
        this.f16974f.a(bArr, i7, i8);
        this.f16979k.a(bArr, i7, i8);
    }

    public final void i(long j7, int i7, long j8) {
        if (!this.f16980l || this.f16979k.d()) {
            this.f16972d.e(i7);
            this.f16973e.e(i7);
        }
        this.f16974f.e(i7);
        this.f16979k.j(j7, i7, j8, this.f16982n);
    }
}
