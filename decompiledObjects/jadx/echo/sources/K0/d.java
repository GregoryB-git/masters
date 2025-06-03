package K0;

import F0.A;
import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.B;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.L;
import F0.M;
import F0.T;
import F0.r;
import F0.y;
import F0.z;
import android.net.Uri;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.M;
import g0.z;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements r {

    /* renamed from: o, reason: collision with root package name */
    public static final InterfaceC0378x f3134o = new InterfaceC0378x() { // from class: K0.c
        @Override // F0.InterfaceC0378x
        public final r[] a() {
            r[] l7;
            l7 = d.l();
            return l7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3135a;

    /* renamed from: b, reason: collision with root package name */
    public final z f3136b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3137c;

    /* renamed from: d, reason: collision with root package name */
    public final y.a f3138d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0374t f3139e;

    /* renamed from: f, reason: collision with root package name */
    public T f3140f;

    /* renamed from: g, reason: collision with root package name */
    public int f3141g;

    /* renamed from: h, reason: collision with root package name */
    public C1201x f3142h;

    /* renamed from: i, reason: collision with root package name */
    public B f3143i;

    /* renamed from: j, reason: collision with root package name */
    public int f3144j;

    /* renamed from: k, reason: collision with root package name */
    public int f3145k;

    /* renamed from: l, reason: collision with root package name */
    public b f3146l;

    /* renamed from: m, reason: collision with root package name */
    public int f3147m;

    /* renamed from: n, reason: collision with root package name */
    public long f3148n;

    public d() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r[] l() {
        return new r[]{new d()};
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        if (j7 == 0) {
            this.f3141g = 0;
        } else {
            b bVar = this.f3146l;
            if (bVar != null) {
                bVar.h(j8);
            }
        }
        this.f3148n = j8 != 0 ? -1L : 0L;
        this.f3147m = 0;
        this.f3136b.P(0);
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f3139e = interfaceC0374t;
        this.f3140f = interfaceC0374t.a(0, 1);
        interfaceC0374t.j();
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        F0.z.c(interfaceC0373s, false);
        return F0.z.a(interfaceC0373s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r5.T(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return r4.f3138d.f1959a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(g0.z r5, boolean r6) {
        /*
            r4 = this;
            F0.B r0 = r4.f3143i
            g0.AbstractC1297a.e(r0)
            int r0 = r5.f()
        L9:
            int r1 = r5.g()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.T(r0)
            F0.B r1 = r4.f3143i
            int r2 = r4.f3145k
            F0.y$a r3 = r4.f3138d
            boolean r1 = F0.y.d(r5, r1, r2, r3)
            if (r1 == 0) goto L28
        L20:
            r5.T(r0)
            F0.y$a r5 = r4.f3138d
            long r5 = r5.f1959a
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L5e
        L2d:
            int r6 = r5.g()
            int r1 = r4.f3144j
            int r6 = r6 - r1
            if (r0 > r6) goto L56
            r5.T(r0)
            F0.B r6 = r4.f3143i     // Catch: java.lang.IndexOutOfBoundsException -> L44
            int r1 = r4.f3145k     // Catch: java.lang.IndexOutOfBoundsException -> L44
            F0.y$a r2 = r4.f3138d     // Catch: java.lang.IndexOutOfBoundsException -> L44
            boolean r6 = F0.y.d(r5, r6, r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L44
            goto L45
        L44:
            r6 = 0
        L45:
            int r1 = r5.f()
            int r2 = r5.g()
            if (r1 <= r2) goto L50
            goto L53
        L50:
            if (r6 == 0) goto L53
            goto L20
        L53:
            int r0 = r0 + 1
            goto L2d
        L56:
            int r6 = r5.g()
            r5.T(r6)
            goto L61
        L5e:
            r5.T(r0)
        L61:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.d.f(g0.z, boolean):long");
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    public final void h(InterfaceC0373s interfaceC0373s) {
        this.f3145k = F0.z.b(interfaceC0373s);
        ((InterfaceC0374t) M.i(this.f3139e)).e(j(interfaceC0373s.p(), interfaceC0373s.a()));
        this.f3141g = 5;
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        int i7 = this.f3141g;
        if (i7 == 0) {
            o(interfaceC0373s);
            return 0;
        }
        if (i7 == 1) {
            k(interfaceC0373s);
            return 0;
        }
        if (i7 == 2) {
            q(interfaceC0373s);
            return 0;
        }
        if (i7 == 3) {
            p(interfaceC0373s);
            return 0;
        }
        if (i7 == 4) {
            h(interfaceC0373s);
            return 0;
        }
        if (i7 == 5) {
            return n(interfaceC0373s, l7);
        }
        throw new IllegalStateException();
    }

    public final F0.M j(long j7, long j8) {
        AbstractC1297a.e(this.f3143i);
        B b7 = this.f3143i;
        if (b7.f1748k != null) {
            return new A(b7, j7);
        }
        if (j8 == -1 || b7.f1747j <= 0) {
            return new M.b(b7.f());
        }
        b bVar = new b(b7, this.f3145k, j7, j8);
        this.f3146l = bVar;
        return bVar.b();
    }

    public final void k(InterfaceC0373s interfaceC0373s) {
        byte[] bArr = this.f3135a;
        interfaceC0373s.n(bArr, 0, bArr.length);
        interfaceC0373s.h();
        this.f3141g = 2;
    }

    public final void m() {
        ((T) g0.M.i(this.f3140f)).b((this.f3148n * 1000000) / ((B) g0.M.i(this.f3143i)).f1742e, 1, this.f3147m, 0, null);
    }

    public final int n(InterfaceC0373s interfaceC0373s, L l7) {
        boolean z7;
        AbstractC1297a.e(this.f3140f);
        AbstractC1297a.e(this.f3143i);
        b bVar = this.f3146l;
        if (bVar != null && bVar.d()) {
            return this.f3146l.c(interfaceC0373s, l7);
        }
        if (this.f3148n == -1) {
            this.f3148n = y.i(interfaceC0373s, this.f3143i);
            return 0;
        }
        int g7 = this.f3136b.g();
        if (g7 < 32768) {
            int read = interfaceC0373s.read(this.f3136b.e(), g7, 32768 - g7);
            z7 = read == -1;
            if (!z7) {
                this.f3136b.S(g7 + read);
            } else if (this.f3136b.a() == 0) {
                m();
                return -1;
            }
        } else {
            z7 = false;
        }
        int f7 = this.f3136b.f();
        int i7 = this.f3147m;
        int i8 = this.f3144j;
        if (i7 < i8) {
            z zVar = this.f3136b;
            zVar.U(Math.min(i8 - i7, zVar.a()));
        }
        long f8 = f(this.f3136b, z7);
        int f9 = this.f3136b.f() - f7;
        this.f3136b.T(f7);
        this.f3140f.e(this.f3136b, f9);
        this.f3147m += f9;
        if (f8 != -1) {
            m();
            this.f3147m = 0;
            this.f3148n = f8;
        }
        if (this.f3136b.a() < 16) {
            int a7 = this.f3136b.a();
            System.arraycopy(this.f3136b.e(), this.f3136b.f(), this.f3136b.e(), 0, a7);
            this.f3136b.T(0);
            this.f3136b.S(a7);
        }
        return 0;
    }

    public final void o(InterfaceC0373s interfaceC0373s) {
        this.f3142h = F0.z.d(interfaceC0373s, !this.f3137c);
        this.f3141g = 1;
    }

    public final void p(InterfaceC0373s interfaceC0373s) {
        z.a aVar = new z.a(this.f3143i);
        boolean z7 = false;
        while (!z7) {
            z7 = F0.z.e(interfaceC0373s, aVar);
            this.f3143i = (B) g0.M.i(aVar.f1960a);
        }
        AbstractC1297a.e(this.f3143i);
        this.f3144j = Math.max(this.f3143i.f1740c, 6);
        ((T) g0.M.i(this.f3140f)).d(this.f3143i.g(this.f3135a, this.f3142h));
        this.f3141g = 4;
    }

    public final void q(InterfaceC0373s interfaceC0373s) {
        F0.z.i(interfaceC0373s);
        this.f3141g = 3;
    }

    public d(int i7) {
        this.f3135a = new byte[42];
        this.f3136b = new g0.z(new byte[32768], 0);
        this.f3137c = (i7 & 1) != 0;
        this.f3138d = new y.a();
        this.f3141g = 0;
    }

    @Override // F0.r
    public void release() {
    }
}
