package l1;

import F0.InterfaceC0374t;
import F0.T;
import d0.C1185h;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.AbstractC1300d;
import h0.AbstractC1329d;
import java.util.Collections;
import l1.K;

/* loaded from: classes.dex */
public final class q implements InterfaceC1597m {

    /* renamed from: a, reason: collision with root package name */
    public final F f17019a;

    /* renamed from: b, reason: collision with root package name */
    public String f17020b;

    /* renamed from: c, reason: collision with root package name */
    public T f17021c;

    /* renamed from: d, reason: collision with root package name */
    public a f17022d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17023e;

    /* renamed from: l, reason: collision with root package name */
    public long f17030l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f17024f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final w f17025g = new w(32, 128);

    /* renamed from: h, reason: collision with root package name */
    public final w f17026h = new w(33, 128);

    /* renamed from: i, reason: collision with root package name */
    public final w f17027i = new w(34, 128);

    /* renamed from: j, reason: collision with root package name */
    public final w f17028j = new w(39, 128);

    /* renamed from: k, reason: collision with root package name */
    public final w f17029k = new w(40, 128);

    /* renamed from: m, reason: collision with root package name */
    public long f17031m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final g0.z f17032n = new g0.z();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final T f17033a;

        /* renamed from: b, reason: collision with root package name */
        public long f17034b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f17035c;

        /* renamed from: d, reason: collision with root package name */
        public int f17036d;

        /* renamed from: e, reason: collision with root package name */
        public long f17037e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f17038f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f17039g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f17040h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f17041i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f17042j;

        /* renamed from: k, reason: collision with root package name */
        public long f17043k;

        /* renamed from: l, reason: collision with root package name */
        public long f17044l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f17045m;

        public a(T t7) {
            this.f17033a = t7;
        }

        public static boolean c(int i7) {
            return (32 <= i7 && i7 <= 35) || i7 == 39;
        }

        public static boolean d(int i7) {
            return i7 < 32 || i7 == 40;
        }

        public void a(long j7) {
            this.f17045m = this.f17035c;
            e((int) (j7 - this.f17034b));
            this.f17043k = this.f17034b;
            this.f17034b = j7;
            e(0);
            this.f17041i = false;
        }

        public void b(long j7, int i7, boolean z7) {
            if (this.f17042j && this.f17039g) {
                this.f17045m = this.f17035c;
                this.f17042j = false;
            } else if (this.f17040h || this.f17039g) {
                if (z7 && this.f17041i) {
                    e(i7 + ((int) (j7 - this.f17034b)));
                }
                this.f17043k = this.f17034b;
                this.f17044l = this.f17037e;
                this.f17045m = this.f17035c;
                this.f17041i = true;
            }
        }

        public final void e(int i7) {
            long j7 = this.f17044l;
            if (j7 == -9223372036854775807L) {
                return;
            }
            boolean z7 = this.f17045m;
            this.f17033a.b(j7, z7 ? 1 : 0, (int) (this.f17034b - this.f17043k), i7, null);
        }

        public void f(byte[] bArr, int i7, int i8) {
            if (this.f17038f) {
                int i9 = this.f17036d;
                int i10 = (i7 + 2) - i9;
                if (i10 >= i8) {
                    this.f17036d = i9 + (i8 - i7);
                } else {
                    this.f17039g = (bArr[i10] & 128) != 0;
                    this.f17038f = false;
                }
            }
        }

        public void g() {
            this.f17038f = false;
            this.f17039g = false;
            this.f17040h = false;
            this.f17041i = false;
            this.f17042j = false;
        }

        public void h(long j7, int i7, int i8, long j8, boolean z7) {
            this.f17039g = false;
            this.f17040h = false;
            this.f17037e = j8;
            this.f17036d = 0;
            this.f17034b = j7;
            if (!d(i8)) {
                if (this.f17041i && !this.f17042j) {
                    if (z7) {
                        e(i7);
                    }
                    this.f17041i = false;
                }
                if (c(i8)) {
                    this.f17040h = !this.f17042j;
                    this.f17042j = true;
                }
            }
            boolean z8 = i8 >= 16 && i8 <= 21;
            this.f17035c = z8;
            this.f17038f = z8 || i8 <= 9;
        }
    }

    public q(F f7) {
        this.f17019a = f7;
    }

    private void f() {
        AbstractC1297a.h(this.f17021c);
        g0.M.i(this.f17022d);
    }

    private void g(long j7, int i7, int i8, long j8) {
        this.f17022d.b(j7, i7, this.f17023e);
        if (!this.f17023e) {
            this.f17025g.b(i8);
            this.f17026h.b(i8);
            this.f17027i.b(i8);
            if (this.f17025g.c() && this.f17026h.c() && this.f17027i.c()) {
                this.f17021c.d(i(this.f17020b, this.f17025g, this.f17026h, this.f17027i));
                this.f17023e = true;
            }
        }
        if (this.f17028j.b(i8)) {
            w wVar = this.f17028j;
            this.f17032n.R(this.f17028j.f17118d, AbstractC1329d.r(wVar.f17118d, wVar.f17119e));
            this.f17032n.U(5);
            this.f17019a.a(j8, this.f17032n);
        }
        if (this.f17029k.b(i8)) {
            w wVar2 = this.f17029k;
            this.f17032n.R(this.f17029k.f17118d, AbstractC1329d.r(wVar2.f17118d, wVar2.f17119e));
            this.f17032n.U(5);
            this.f17019a.a(j8, this.f17032n);
        }
    }

    private void h(byte[] bArr, int i7, int i8) {
        this.f17022d.f(bArr, i7, i8);
        if (!this.f17023e) {
            this.f17025g.a(bArr, i7, i8);
            this.f17026h.a(bArr, i7, i8);
            this.f17027i.a(bArr, i7, i8);
        }
        this.f17028j.a(bArr, i7, i8);
        this.f17029k.a(bArr, i7, i8);
    }

    public static C1194q i(String str, w wVar, w wVar2, w wVar3) {
        int i7 = wVar.f17119e;
        byte[] bArr = new byte[wVar2.f17119e + i7 + wVar3.f17119e];
        System.arraycopy(wVar.f17118d, 0, bArr, 0, i7);
        System.arraycopy(wVar2.f17118d, 0, bArr, wVar.f17119e, wVar2.f17119e);
        System.arraycopy(wVar3.f17118d, 0, bArr, wVar.f17119e + wVar2.f17119e, wVar3.f17119e);
        AbstractC1329d.a h7 = AbstractC1329d.h(wVar2.f17118d, 3, wVar2.f17119e);
        return new C1194q.b().a0(str).o0("video/hevc").O(AbstractC1300d.c(h7.f14528a, h7.f14529b, h7.f14530c, h7.f14531d, h7.f14535h, h7.f14536i)).v0(h7.f14538k).Y(h7.f14539l).P(new C1185h.b().d(h7.f14542o).c(h7.f14543p).e(h7.f14544q).g(h7.f14533f + 8).b(h7.f14534g + 8).a()).k0(h7.f14540m).g0(h7.f14541n).b0(Collections.singletonList(bArr)).K();
    }

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        f();
        while (zVar.a() > 0) {
            int f7 = zVar.f();
            int g7 = zVar.g();
            byte[] e7 = zVar.e();
            this.f17030l += zVar.a();
            this.f17021c.e(zVar, zVar.a());
            while (f7 < g7) {
                int c7 = AbstractC1329d.c(e7, f7, g7, this.f17024f);
                if (c7 == g7) {
                    h(e7, f7, g7);
                    return;
                }
                int e8 = AbstractC1329d.e(e7, c7);
                int i7 = c7 - f7;
                if (i7 > 0) {
                    h(e7, f7, c7);
                }
                int i8 = g7 - c7;
                long j7 = this.f17030l - i8;
                g(j7, i8, i7 < 0 ? -i7 : 0, this.f17031m);
                j(j7, i8, e8, this.f17031m);
                f7 = c7 + 3;
            }
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        this.f17030l = 0L;
        this.f17031m = -9223372036854775807L;
        AbstractC1329d.a(this.f17024f);
        this.f17025g.d();
        this.f17026h.d();
        this.f17027i.d();
        this.f17028j.d();
        this.f17029k.d();
        a aVar = this.f17022d;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
        f();
        if (z7) {
            this.f17022d.a(this.f17030l);
        }
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        this.f17031m = j7;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        this.f17020b = dVar.b();
        T a7 = interfaceC0374t.a(dVar.c(), 2);
        this.f17021c = a7;
        this.f17022d = new a(a7);
        this.f17019a.b(interfaceC0374t, dVar);
    }

    public final void j(long j7, int i7, int i8, long j8) {
        this.f17022d.h(j7, i7, i8, j8, this.f17023e);
        if (!this.f17023e) {
            this.f17025g.e(i8);
            this.f17026h.e(i8);
            this.f17027i.e(i8);
        }
        this.f17028j.e(i8);
        this.f17029k.e(i8);
    }
}
