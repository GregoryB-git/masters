package l1;

import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.C0364i;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.M;
import android.net.Uri;
import d0.C1162A;
import g0.AbstractC1297a;
import java.io.EOFException;
import java.util.List;
import java.util.Map;
import l1.K;

/* renamed from: l1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1592h implements F0.r {

    /* renamed from: m, reason: collision with root package name */
    public static final InterfaceC0378x f16861m = new InterfaceC0378x() { // from class: l1.g
        @Override // F0.InterfaceC0378x
        public final F0.r[] a() {
            F0.r[] k7;
            k7 = C1592h.k();
            return k7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ F0.r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f16862a;

    /* renamed from: b, reason: collision with root package name */
    public final C1593i f16863b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.z f16864c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.z f16865d;

    /* renamed from: e, reason: collision with root package name */
    public final g0.y f16866e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0374t f16867f;

    /* renamed from: g, reason: collision with root package name */
    public long f16868g;

    /* renamed from: h, reason: collision with root package name */
    public long f16869h;

    /* renamed from: i, reason: collision with root package name */
    public int f16870i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16871j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16872k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16873l;

    public C1592h() {
        this(0);
    }

    private static int h(int i7, long j7) {
        return (int) ((i7 * 8000000) / j7);
    }

    private F0.M j(long j7, boolean z7) {
        return new C0364i(j7, this.f16869h, h(this.f16870i, this.f16863b.k()), this.f16870i, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ F0.r[] k() {
        return new F0.r[]{new C1592h()};
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f16872k = false;
        this.f16863b.b();
        this.f16868g = j8;
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f16867f = interfaceC0374t;
        this.f16863b.e(interfaceC0374t, new K.d(0, 1));
        interfaceC0374t.j();
    }

    @Override // F0.r
    public /* synthetic */ F0.r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        int m7 = m(interfaceC0373s);
        int i7 = m7;
        int i8 = 0;
        int i9 = 0;
        do {
            interfaceC0373s.n(this.f16865d.e(), 0, 2);
            this.f16865d.T(0);
            if (C1593i.m(this.f16865d.M())) {
                i8++;
                if (i8 >= 4 && i9 > 188) {
                    return true;
                }
                interfaceC0373s.n(this.f16865d.e(), 0, 4);
                this.f16866e.p(14);
                int h7 = this.f16866e.h(13);
                if (h7 > 6) {
                    interfaceC0373s.o(h7 - 6);
                    i9 += h7;
                }
            }
            i7++;
            interfaceC0373s.h();
            interfaceC0373s.o(i7);
            i8 = 0;
            i9 = 0;
        } while (i7 - m7 < 8192);
        return false;
    }

    public final void f(InterfaceC0373s interfaceC0373s) {
        if (this.f16871j) {
            return;
        }
        this.f16870i = -1;
        interfaceC0373s.h();
        long j7 = 0;
        if (interfaceC0373s.p() == 0) {
            m(interfaceC0373s);
        }
        int i7 = 0;
        int i8 = 0;
        while (interfaceC0373s.l(this.f16865d.e(), 0, 2, true)) {
            try {
                this.f16865d.T(0);
                if (!C1593i.m(this.f16865d.M())) {
                    break;
                }
                if (!interfaceC0373s.l(this.f16865d.e(), 0, 4, true)) {
                    break;
                }
                this.f16866e.p(14);
                int h7 = this.f16866e.h(13);
                if (h7 <= 6) {
                    this.f16871j = true;
                    throw C1162A.a("Malformed ADTS stream", null);
                }
                j7 += h7;
                i8++;
                if (i8 != 1000 && interfaceC0373s.j(h7 - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i7 = i8;
        interfaceC0373s.h();
        if (i7 > 0) {
            this.f16870i = (int) (j7 / i7);
        } else {
            this.f16870i = -1;
        }
        this.f16871j = true;
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, F0.L l7) {
        AbstractC1297a.h(this.f16867f);
        long a7 = interfaceC0373s.a();
        int i7 = this.f16862a;
        if ((i7 & 2) != 0 || ((i7 & 1) != 0 && a7 != -1)) {
            f(interfaceC0373s);
        }
        int read = interfaceC0373s.read(this.f16864c.e(), 0, 2048);
        boolean z7 = read == -1;
        l(a7, z7);
        if (z7) {
            return -1;
        }
        this.f16864c.T(0);
        this.f16864c.S(read);
        if (!this.f16872k) {
            this.f16863b.d(this.f16868g, 4);
            this.f16872k = true;
        }
        this.f16863b.a(this.f16864c);
        return 0;
    }

    public final void l(long j7, boolean z7) {
        if (this.f16873l) {
            return;
        }
        boolean z8 = (this.f16862a & 1) != 0 && this.f16870i > 0;
        if (z8 && this.f16863b.k() == -9223372036854775807L && !z7) {
            return;
        }
        if (!z8 || this.f16863b.k() == -9223372036854775807L) {
            this.f16867f.e(new M.b(-9223372036854775807L));
        } else {
            this.f16867f.e(j(j7, (this.f16862a & 2) != 0));
        }
        this.f16873l = true;
    }

    public final int m(InterfaceC0373s interfaceC0373s) {
        int i7 = 0;
        while (true) {
            interfaceC0373s.n(this.f16865d.e(), 0, 10);
            this.f16865d.T(0);
            if (this.f16865d.J() != 4801587) {
                break;
            }
            this.f16865d.U(3);
            int F6 = this.f16865d.F();
            i7 += F6 + 10;
            interfaceC0373s.o(F6);
        }
        interfaceC0373s.h();
        interfaceC0373s.o(i7);
        if (this.f16869h == -1) {
            this.f16869h = i7;
        }
        return i7;
    }

    public C1592h(int i7) {
        this.f16862a = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f16863b = new C1593i(true);
        this.f16864c = new g0.z(2048);
        this.f16870i = -1;
        this.f16869h = -1L;
        g0.z zVar = new g0.z(10);
        this.f16865d = zVar;
        this.f16866e = new g0.y(zVar.e());
    }

    @Override // F0.r
    public void release() {
    }
}
