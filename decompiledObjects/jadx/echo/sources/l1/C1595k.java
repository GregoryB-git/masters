package l1;

import F0.AbstractC0371p;
import F0.InterfaceC0374t;
import F0.T;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.C1194q;
import g0.AbstractC1297a;
import java.util.concurrent.atomic.AtomicInteger;
import l1.K;

/* renamed from: l1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1595k implements InterfaceC1597m {

    /* renamed from: a, reason: collision with root package name */
    public final g0.z f16899a;

    /* renamed from: c, reason: collision with root package name */
    public final String f16901c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16902d;

    /* renamed from: e, reason: collision with root package name */
    public String f16903e;

    /* renamed from: f, reason: collision with root package name */
    public T f16904f;

    /* renamed from: h, reason: collision with root package name */
    public int f16906h;

    /* renamed from: i, reason: collision with root package name */
    public int f16907i;

    /* renamed from: j, reason: collision with root package name */
    public long f16908j;

    /* renamed from: k, reason: collision with root package name */
    public C1194q f16909k;

    /* renamed from: l, reason: collision with root package name */
    public int f16910l;

    /* renamed from: m, reason: collision with root package name */
    public int f16911m;

    /* renamed from: g, reason: collision with root package name */
    public int f16905g = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f16914p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f16900b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    public int f16912n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f16913o = -1;

    public C1595k(String str, int i7, int i8) {
        this.f16899a = new g0.z(new byte[i8]);
        this.f16901c = str;
        this.f16902d = i7;
    }

    private boolean f(g0.z zVar, byte[] bArr, int i7) {
        int min = Math.min(zVar.a(), i7 - this.f16906h);
        zVar.l(bArr, this.f16906h, min);
        int i8 = this.f16906h + min;
        this.f16906h = i8;
        return i8 == i7;
    }

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        int i7;
        T t7;
        g0.z zVar2;
        int i8;
        AbstractC1297a.h(this.f16904f);
        while (zVar.a() > 0) {
            switch (this.f16905g) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (j(zVar)) {
                        int i9 = this.f16911m;
                        if (i9 == 3 || i9 == 4) {
                            this.f16905g = 4;
                        } else if (i9 == 1) {
                            this.f16905g = 1;
                        } else {
                            i7 = 2;
                            this.f16905g = i7;
                        }
                    }
                    break;
                case 1:
                    if (f(zVar, this.f16899a.e(), 18)) {
                        g();
                        this.f16899a.T(0);
                        this.f16904f.e(this.f16899a, 18);
                        this.f16905g = 6;
                    }
                case 2:
                    if (f(zVar, this.f16899a.e(), 7)) {
                        this.f16912n = AbstractC0371p.j(this.f16899a.e());
                        this.f16905g = 3;
                    }
                case 3:
                    if (f(zVar, this.f16899a.e(), this.f16912n)) {
                        h();
                        this.f16899a.T(0);
                        t7 = this.f16904f;
                        zVar2 = this.f16899a;
                        i8 = this.f16912n;
                        t7.e(zVar2, i8);
                        this.f16905g = 6;
                    }
                case 4:
                    if (f(zVar, this.f16899a.e(), 6)) {
                        int l7 = AbstractC0371p.l(this.f16899a.e());
                        this.f16913o = l7;
                        int i10 = this.f16906h;
                        if (i10 > l7) {
                            int i11 = i10 - l7;
                            this.f16906h = i10 - i11;
                            zVar.T(zVar.f() - i11);
                        }
                        i7 = 5;
                        this.f16905g = i7;
                    }
                case 5:
                    if (f(zVar, this.f16899a.e(), this.f16913o)) {
                        i();
                        this.f16899a.T(0);
                        t7 = this.f16904f;
                        zVar2 = this.f16899a;
                        i8 = this.f16913o;
                        t7.e(zVar2, i8);
                        this.f16905g = 6;
                    }
                case 6:
                    int min = Math.min(zVar.a(), this.f16910l - this.f16906h);
                    this.f16904f.e(zVar, min);
                    int i12 = this.f16906h + min;
                    this.f16906h = i12;
                    if (i12 == this.f16910l) {
                        AbstractC1297a.f(this.f16914p != -9223372036854775807L);
                        this.f16904f.b(this.f16914p, this.f16911m == 4 ? 0 : 1, this.f16910l, 0, null);
                        this.f16914p += this.f16908j;
                        this.f16905g = 0;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        this.f16905g = 0;
        this.f16906h = 0;
        this.f16907i = 0;
        this.f16914p = -9223372036854775807L;
        this.f16900b.set(0);
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        this.f16914p = j7;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        this.f16903e = dVar.b();
        this.f16904f = interfaceC0374t.a(dVar.c(), 1);
    }

    public final void g() {
        byte[] e7 = this.f16899a.e();
        if (this.f16909k == null) {
            C1194q h7 = AbstractC0371p.h(e7, this.f16903e, this.f16901c, this.f16902d, null);
            this.f16909k = h7;
            this.f16904f.d(h7);
        }
        this.f16910l = AbstractC0371p.b(e7);
        this.f16908j = a3.f.d(g0.M.V0(AbstractC0371p.g(e7), this.f16909k.f12703C));
    }

    public final void h() {
        AbstractC0371p.b i7 = AbstractC0371p.i(this.f16899a.e());
        k(i7);
        this.f16910l = i7.f1954d;
        long j7 = i7.f1955e;
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        this.f16908j = j7;
    }

    public final void i() {
        AbstractC0371p.b k7 = AbstractC0371p.k(this.f16899a.e(), this.f16900b);
        if (this.f16911m == 3) {
            k(k7);
        }
        this.f16910l = k7.f1954d;
        long j7 = k7.f1955e;
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        this.f16908j = j7;
    }

    public final boolean j(g0.z zVar) {
        while (zVar.a() > 0) {
            int i7 = this.f16907i << 8;
            this.f16907i = i7;
            int G6 = i7 | zVar.G();
            this.f16907i = G6;
            int c7 = AbstractC0371p.c(G6);
            this.f16911m = c7;
            if (c7 != 0) {
                byte[] e7 = this.f16899a.e();
                int i8 = this.f16907i;
                e7[0] = (byte) ((i8 >> 24) & 255);
                e7[1] = (byte) ((i8 >> 16) & 255);
                e7[2] = (byte) ((i8 >> 8) & 255);
                e7[3] = (byte) (i8 & 255);
                this.f16906h = 4;
                this.f16907i = 0;
                return true;
            }
        }
        return false;
    }

    public final void k(AbstractC0371p.b bVar) {
        int i7;
        int i8 = bVar.f1952b;
        if (i8 == -2147483647 || (i7 = bVar.f1953c) == -1) {
            return;
        }
        C1194q c1194q = this.f16909k;
        if (c1194q != null && i7 == c1194q.f12702B && i8 == c1194q.f12703C && g0.M.c(bVar.f1951a, c1194q.f12726n)) {
            return;
        }
        C1194q c1194q2 = this.f16909k;
        C1194q K6 = (c1194q2 == null ? new C1194q.b() : c1194q2.a()).a0(this.f16903e).o0(bVar.f1951a).N(bVar.f1953c).p0(bVar.f1952b).e0(this.f16901c).m0(this.f16902d).K();
        this.f16909k = K6;
        this.f16904f.d(K6);
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
    }
}
