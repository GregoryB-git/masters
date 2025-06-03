package G0;

import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.C0364i;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.L;
import F0.M;
import F0.T;
import F0.r;
import android.net.Uri;
import d0.C1162A;
import d0.C1194q;
import g0.AbstractC1297a;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f2003r;

    /* renamed from: u, reason: collision with root package name */
    public static final int f2006u;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2007a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2008b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2009c;

    /* renamed from: d, reason: collision with root package name */
    public long f2010d;

    /* renamed from: e, reason: collision with root package name */
    public int f2011e;

    /* renamed from: f, reason: collision with root package name */
    public int f2012f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2013g;

    /* renamed from: h, reason: collision with root package name */
    public long f2014h;

    /* renamed from: i, reason: collision with root package name */
    public int f2015i;

    /* renamed from: j, reason: collision with root package name */
    public int f2016j;

    /* renamed from: k, reason: collision with root package name */
    public long f2017k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0374t f2018l;

    /* renamed from: m, reason: collision with root package name */
    public T f2019m;

    /* renamed from: n, reason: collision with root package name */
    public M f2020n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2021o;

    /* renamed from: p, reason: collision with root package name */
    public static final InterfaceC0378x f2001p = new InterfaceC0378x() { // from class: G0.a
        @Override // F0.InterfaceC0378x
        public final r[] a() {
            r[] o7;
            o7 = b.o();
            return o7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f2002q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f2004s = g0.M.r0("#!AMR\n");

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f2005t = g0.M.r0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f2003r = iArr;
        f2006u = iArr[8];
    }

    public b() {
        this(0);
    }

    public static int h(int i7, long j7) {
        return (int) ((i7 * 8000000) / j7);
    }

    public static /* synthetic */ r[] o() {
        return new r[]{new b()};
    }

    public static boolean r(InterfaceC0373s interfaceC0373s, byte[] bArr) {
        interfaceC0373s.h();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC0373s.n(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f2010d = 0L;
        this.f2011e = 0;
        this.f2012f = 0;
        if (j7 != 0) {
            M m7 = this.f2020n;
            if (m7 instanceof C0364i) {
                this.f2017k = ((C0364i) m7).b(j7);
                return;
            }
        }
        this.f2017k = 0L;
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f2018l = interfaceC0374t;
        this.f2019m = interfaceC0374t.a(0, 1);
        interfaceC0374t.j();
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        return t(interfaceC0373s);
    }

    public final void f() {
        AbstractC1297a.h(this.f2019m);
        g0.M.i(this.f2018l);
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        f();
        if (interfaceC0373s.p() == 0 && !t(interfaceC0373s)) {
            throw C1162A.a("Could not find AMR header.", null);
        }
        p();
        int u7 = u(interfaceC0373s);
        q(interfaceC0373s.a(), u7);
        return u7;
    }

    public final M j(long j7, boolean z7) {
        return new C0364i(j7, this.f2014h, h(this.f2015i, 20000L), this.f2015i, z7);
    }

    public final int k(int i7) {
        if (m(i7)) {
            return this.f2009c ? f2003r[i7] : f2002q[i7];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f2009c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i7);
        throw C1162A.a(sb.toString(), null);
    }

    public final boolean l(int i7) {
        return !this.f2009c && (i7 < 12 || i7 > 14);
    }

    public final boolean m(int i7) {
        return i7 >= 0 && i7 <= 15 && (n(i7) || l(i7));
    }

    public final boolean n(int i7) {
        return this.f2009c && (i7 < 10 || i7 > 13);
    }

    public final void p() {
        if (this.f2021o) {
            return;
        }
        this.f2021o = true;
        boolean z7 = this.f2009c;
        this.f2019m.d(new C1194q.b().o0(z7 ? "audio/amr-wb" : "audio/3gpp").f0(f2006u).N(1).p0(z7 ? 16000 : 8000).K());
    }

    public final void q(long j7, int i7) {
        M bVar;
        int i8;
        if (this.f2013g) {
            return;
        }
        int i9 = this.f2008b;
        if ((i9 & 1) == 0 || j7 == -1 || !((i8 = this.f2015i) == -1 || i8 == this.f2011e)) {
            bVar = new M.b(-9223372036854775807L);
        } else if (this.f2016j < 20 && i7 != -1) {
            return;
        } else {
            bVar = j(j7, (i9 & 2) != 0);
        }
        this.f2020n = bVar;
        this.f2018l.e(bVar);
        this.f2013g = true;
    }

    public final int s(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.h();
        interfaceC0373s.n(this.f2007a, 0, 1);
        byte b7 = this.f2007a[0];
        if ((b7 & 131) <= 0) {
            return k((b7 >> 3) & 15);
        }
        throw C1162A.a("Invalid padding bits for frame header " + ((int) b7), null);
    }

    public final boolean t(InterfaceC0373s interfaceC0373s) {
        int length;
        byte[] bArr = f2004s;
        if (r(interfaceC0373s, bArr)) {
            this.f2009c = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f2005t;
            if (!r(interfaceC0373s, bArr2)) {
                return false;
            }
            this.f2009c = true;
            length = bArr2.length;
        }
        interfaceC0373s.i(length);
        return true;
    }

    public final int u(InterfaceC0373s interfaceC0373s) {
        if (this.f2012f == 0) {
            try {
                int s7 = s(interfaceC0373s);
                this.f2011e = s7;
                this.f2012f = s7;
                if (this.f2015i == -1) {
                    this.f2014h = interfaceC0373s.p();
                    this.f2015i = this.f2011e;
                }
                if (this.f2015i == this.f2011e) {
                    this.f2016j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int f7 = this.f2019m.f(interfaceC0373s, this.f2012f, true);
        if (f7 == -1) {
            return -1;
        }
        int i7 = this.f2012f - f7;
        this.f2012f = i7;
        if (i7 > 0) {
            return 0;
        }
        this.f2019m.b(this.f2017k + this.f2010d, 1, this.f2011e, 0, null);
        this.f2010d += 20000;
        return 0;
    }

    public b(int i7) {
        this.f2008b = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f2007a = new byte[1];
        this.f2015i = -1;
    }

    @Override // F0.r
    public void release() {
    }
}
