package l1;

import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.M;
import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c1.t;
import d0.C1162A;
import g0.AbstractC1297a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l1.K;

/* loaded from: classes.dex */
public final class J implements F0.r {

    /* renamed from: v, reason: collision with root package name */
    public static final InterfaceC0378x f16782v = new InterfaceC0378x() { // from class: l1.I
        @Override // F0.InterfaceC0378x
        public final F0.r[] a() {
            F0.r[] y7;
            y7 = J.y();
            return y7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ F0.r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f16783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16784b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16785c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16786d;

    /* renamed from: e, reason: collision with root package name */
    public final g0.z f16787e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f16788f;

    /* renamed from: g, reason: collision with root package name */
    public final K.c f16789g;

    /* renamed from: h, reason: collision with root package name */
    public final t.a f16790h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f16791i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f16792j;

    /* renamed from: k, reason: collision with root package name */
    public final SparseBooleanArray f16793k;

    /* renamed from: l, reason: collision with root package name */
    public final H f16794l;

    /* renamed from: m, reason: collision with root package name */
    public G f16795m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0374t f16796n;

    /* renamed from: o, reason: collision with root package name */
    public int f16797o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16798p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16799q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16800r;

    /* renamed from: s, reason: collision with root package name */
    public K f16801s;

    /* renamed from: t, reason: collision with root package name */
    public int f16802t;

    /* renamed from: u, reason: collision with root package name */
    public int f16803u;

    public J(int i7, int i8, t.a aVar, g0.E e7, K.c cVar, int i9) {
        this.f16789g = (K.c) AbstractC1297a.e(cVar);
        this.f16785c = i9;
        this.f16783a = i7;
        this.f16784b = i8;
        this.f16790h = aVar;
        if (i7 == 1 || i7 == 2) {
            this.f16786d = Collections.singletonList(e7);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f16786d = arrayList;
            arrayList.add(e7);
        }
        this.f16787e = new g0.z(new byte[9400], 0);
        this.f16792j = new SparseBooleanArray();
        this.f16793k = new SparseBooleanArray();
        this.f16791i = new SparseArray();
        this.f16788f = new SparseIntArray();
        this.f16794l = new H(i9);
        this.f16796n = InterfaceC0374t.f1957a;
        this.f16803u = -1;
        A();
    }

    public static /* synthetic */ int m(J j7) {
        int i7 = j7.f16797o;
        j7.f16797o = i7 + 1;
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ F0.r[] y() {
        return new F0.r[]{new J(1, t.a.f10046a)};
    }

    private void z(long j7) {
        InterfaceC0374t interfaceC0374t;
        F0.M bVar;
        if (this.f16799q) {
            return;
        }
        this.f16799q = true;
        if (this.f16794l.b() != -9223372036854775807L) {
            G g7 = new G(this.f16794l.c(), this.f16794l.b(), j7, this.f16803u, this.f16785c);
            this.f16795m = g7;
            interfaceC0374t = this.f16796n;
            bVar = g7.b();
        } else {
            interfaceC0374t = this.f16796n;
            bVar = new M.b(this.f16794l.b());
        }
        interfaceC0374t.e(bVar);
    }

    public final void A() {
        this.f16792j.clear();
        this.f16791i.clear();
        SparseArray a7 = this.f16789g.a();
        int size = a7.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f16791i.put(a7.keyAt(i7), (K) a7.valueAt(i7));
        }
        this.f16791i.put(0, new E(new a()));
        this.f16801s = null;
    }

    public final boolean B(int i7) {
        return this.f16783a == 2 || this.f16798p || !this.f16793k.get(i7, false);
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        int i7;
        G g7;
        AbstractC1297a.f(this.f16783a != 2);
        int size = this.f16786d.size();
        for (0; i7 < size; i7 + 1) {
            g0.E e7 = (g0.E) this.f16786d.get(i7);
            boolean z7 = e7.f() == -9223372036854775807L;
            if (z7) {
                i7 = z7 ? 0 : i7 + 1;
                e7.i(j8);
            } else {
                long d7 = e7.d();
                if (d7 != -9223372036854775807L) {
                    if (d7 != 0) {
                        if (d7 == j8) {
                        }
                        e7.i(j8);
                    }
                }
            }
        }
        if (j8 != 0 && (g7 = this.f16795m) != null) {
            g7.h(j8);
        }
        this.f16787e.P(0);
        this.f16788f.clear();
        for (int i8 = 0; i8 < this.f16791i.size(); i8++) {
            ((K) this.f16791i.valueAt(i8)).b();
        }
        this.f16802t = 0;
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        if ((this.f16784b & 1) == 0) {
            interfaceC0374t = new c1.v(interfaceC0374t, this.f16790h);
        }
        this.f16796n = interfaceC0374t;
    }

    @Override // F0.r
    public /* synthetic */ F0.r d() {
        return AbstractC0372q.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // F0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(F0.InterfaceC0373s r7) {
        /*
            r6 = this;
            g0.z r0 = r6.f16787e
            byte[] r0 = r0.e()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.n(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.i(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.J.e(F0.s):boolean");
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, F0.L l7) {
        long a7 = interfaceC0373s.a();
        boolean z7 = this.f16783a == 2;
        if (this.f16798p) {
            if (a7 != -1 && !z7 && !this.f16794l.d()) {
                return this.f16794l.e(interfaceC0373s, l7, this.f16803u);
            }
            z(a7);
            if (this.f16800r) {
                this.f16800r = false;
                a(0L, 0L);
                if (interfaceC0373s.p() != 0) {
                    l7.f1788a = 0L;
                    return 1;
                }
            }
            G g7 = this.f16795m;
            if (g7 != null && g7.d()) {
                return this.f16795m.c(interfaceC0373s, l7);
            }
        }
        if (!w(interfaceC0373s)) {
            for (int i7 = 0; i7 < this.f16791i.size(); i7++) {
                K k7 = (K) this.f16791i.valueAt(i7);
                if (k7 instanceof y) {
                    y yVar = (y) k7;
                    if (yVar.d(z7)) {
                        yVar.a(new g0.z(), 1);
                    }
                }
            }
            return -1;
        }
        int x7 = x();
        int g8 = this.f16787e.g();
        if (x7 > g8) {
            return 0;
        }
        int p7 = this.f16787e.p();
        if ((8388608 & p7) == 0) {
            int i8 = (4194304 & p7) != 0 ? 1 : 0;
            int i9 = (2096896 & p7) >> 8;
            boolean z8 = (p7 & 32) != 0;
            K k8 = (p7 & 16) != 0 ? (K) this.f16791i.get(i9) : null;
            if (k8 != null) {
                if (this.f16783a != 2) {
                    int i10 = p7 & 15;
                    int i11 = this.f16788f.get(i9, i10 - 1);
                    this.f16788f.put(i9, i10);
                    if (i11 != i10) {
                        if (i10 != ((i11 + 1) & 15)) {
                            k8.b();
                        }
                    }
                }
                if (z8) {
                    int G6 = this.f16787e.G();
                    i8 |= (this.f16787e.G() & 64) != 0 ? 2 : 0;
                    this.f16787e.U(G6 - 1);
                }
                boolean z9 = this.f16798p;
                if (B(i9)) {
                    this.f16787e.S(x7);
                    k8.a(this.f16787e, i8);
                    this.f16787e.S(g8);
                }
                if (this.f16783a != 2 && !z9 && this.f16798p && a7 != -1) {
                    this.f16800r = true;
                }
            }
        }
        this.f16787e.T(x7);
        return 0;
    }

    public final boolean w(InterfaceC0373s interfaceC0373s) {
        byte[] e7 = this.f16787e.e();
        if (9400 - this.f16787e.f() < 188) {
            int a7 = this.f16787e.a();
            if (a7 > 0) {
                System.arraycopy(e7, this.f16787e.f(), e7, 0, a7);
            }
            this.f16787e.R(e7, a7);
        }
        while (this.f16787e.a() < 188) {
            int g7 = this.f16787e.g();
            int read = interfaceC0373s.read(e7, g7, 9400 - g7);
            if (read == -1) {
                return false;
            }
            this.f16787e.S(g7 + read);
        }
        return true;
    }

    public final int x() {
        int f7 = this.f16787e.f();
        int g7 = this.f16787e.g();
        int a7 = L.a(this.f16787e.e(), f7, g7);
        this.f16787e.T(a7);
        int i7 = a7 + 188;
        if (i7 > g7) {
            int i8 = this.f16802t + (a7 - f7);
            this.f16802t = i8;
            if (this.f16783a == 2 && i8 > 376) {
                throw C1162A.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f16802t = 0;
        }
        return i7;
    }

    public J(int i7, t.a aVar) {
        this(1, i7, aVar, new g0.E(0L), new C1594j(0), 112800);
    }

    @Override // F0.r
    public void release() {
    }

    public class a implements D {

        /* renamed from: a, reason: collision with root package name */
        public final g0.y f16804a = new g0.y(new byte[4]);

        public a() {
        }

        @Override // l1.D
        public void a(g0.z zVar) {
            if (zVar.G() == 0 && (zVar.G() & 128) != 0) {
                zVar.U(6);
                int a7 = zVar.a() / 4;
                for (int i7 = 0; i7 < a7; i7++) {
                    zVar.k(this.f16804a, 4);
                    int h7 = this.f16804a.h(16);
                    this.f16804a.r(3);
                    if (h7 == 0) {
                        this.f16804a.r(13);
                    } else {
                        int h8 = this.f16804a.h(13);
                        if (J.this.f16791i.get(h8) == null) {
                            J.this.f16791i.put(h8, new E(J.this.new b(h8)));
                            J.m(J.this);
                        }
                    }
                }
                if (J.this.f16783a != 2) {
                    J.this.f16791i.remove(0);
                }
            }
        }

        @Override // l1.D
        public void c(g0.E e7, InterfaceC0374t interfaceC0374t, K.d dVar) {
        }
    }

    public class b implements D {

        /* renamed from: a, reason: collision with root package name */
        public final g0.y f16806a = new g0.y(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray f16807b = new SparseArray();

        /* renamed from: c, reason: collision with root package name */
        public final SparseIntArray f16808c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        public final int f16809d;

        public b(int i7) {
            this.f16809d = i7;
        }

        @Override // l1.D
        public void a(g0.z zVar) {
            g0.E e7;
            if (zVar.G() != 2) {
                return;
            }
            if (J.this.f16783a == 1 || J.this.f16783a == 2 || J.this.f16797o == 1) {
                e7 = (g0.E) J.this.f16786d.get(0);
            } else {
                e7 = new g0.E(((g0.E) J.this.f16786d.get(0)).d());
                J.this.f16786d.add(e7);
            }
            if ((zVar.G() & 128) == 0) {
                return;
            }
            zVar.U(1);
            int M6 = zVar.M();
            int i7 = 3;
            zVar.U(3);
            zVar.k(this.f16806a, 2);
            this.f16806a.r(3);
            int i8 = 13;
            J.this.f16803u = this.f16806a.h(13);
            zVar.k(this.f16806a, 2);
            int i9 = 4;
            this.f16806a.r(4);
            zVar.U(this.f16806a.h(12));
            if (J.this.f16783a == 2 && J.this.f16801s == null) {
                K.b bVar = new K.b(21, null, 0, null, g0.M.f14266f);
                J j7 = J.this;
                j7.f16801s = j7.f16789g.b(21, bVar);
                if (J.this.f16801s != null) {
                    J.this.f16801s.c(e7, J.this.f16796n, new K.d(M6, 21, 8192));
                }
            }
            this.f16807b.clear();
            this.f16808c.clear();
            int a7 = zVar.a();
            while (a7 > 0) {
                zVar.k(this.f16806a, 5);
                int h7 = this.f16806a.h(8);
                this.f16806a.r(i7);
                int h8 = this.f16806a.h(i8);
                this.f16806a.r(i9);
                int h9 = this.f16806a.h(12);
                K.b b7 = b(zVar, h9);
                if (h7 == 6 || h7 == 5) {
                    h7 = b7.f16814a;
                }
                a7 -= h9 + 5;
                int i10 = J.this.f16783a == 2 ? h7 : h8;
                if (!J.this.f16792j.get(i10)) {
                    K b8 = (J.this.f16783a == 2 && h7 == 21) ? J.this.f16801s : J.this.f16789g.b(h7, b7);
                    if (J.this.f16783a != 2 || h8 < this.f16808c.get(i10, 8192)) {
                        this.f16808c.put(i10, h8);
                        this.f16807b.put(i10, b8);
                    }
                }
                i7 = 3;
                i9 = 4;
                i8 = 13;
            }
            int size = this.f16808c.size();
            for (int i11 = 0; i11 < size; i11++) {
                int keyAt = this.f16808c.keyAt(i11);
                int valueAt = this.f16808c.valueAt(i11);
                J.this.f16792j.put(keyAt, true);
                J.this.f16793k.put(valueAt, true);
                K k7 = (K) this.f16807b.valueAt(i11);
                if (k7 != null) {
                    if (k7 != J.this.f16801s) {
                        k7.c(e7, J.this.f16796n, new K.d(M6, keyAt, 8192));
                    }
                    J.this.f16791i.put(valueAt, k7);
                }
            }
            if (J.this.f16783a != 2) {
                J.this.f16791i.remove(this.f16809d);
                J j8 = J.this;
                j8.f16797o = j8.f16783a == 1 ? 0 : J.this.f16797o - 1;
                if (J.this.f16797o != 0) {
                    return;
                } else {
                    J.this.f16796n.j();
                }
            } else {
                if (J.this.f16798p) {
                    return;
                }
                J.this.f16796n.j();
                J.this.f16797o = 0;
            }
            J.this.f16798p = true;
        }

        public final K.b b(g0.z zVar, int i7) {
            int i8;
            int f7 = zVar.f();
            int i9 = f7 + i7;
            int i10 = -1;
            String str = null;
            ArrayList arrayList = null;
            int i11 = 0;
            while (zVar.f() < i9) {
                int G6 = zVar.G();
                int f8 = zVar.f() + zVar.G();
                if (f8 > i9) {
                    break;
                }
                if (G6 == 5) {
                    long I6 = zVar.I();
                    if (I6 != 1094921523) {
                        if (I6 != 1161904947) {
                            if (I6 != 1094921524) {
                                if (I6 == 1212503619) {
                                    i10 = 36;
                                }
                            }
                            i10 = 172;
                        }
                        i10 = 135;
                    }
                    i10 = 129;
                } else {
                    if (G6 != 106) {
                        if (G6 != 122) {
                            if (G6 == 127) {
                                int G7 = zVar.G();
                                if (G7 != 21) {
                                    if (G7 == 14) {
                                        i10 = 136;
                                    } else if (G7 == 33) {
                                        i10 = 139;
                                    }
                                }
                                i10 = 172;
                            } else {
                                if (G6 == 123) {
                                    i8 = 138;
                                } else if (G6 == 10) {
                                    String trim = zVar.D(3).trim();
                                    i11 = zVar.G();
                                    str = trim;
                                } else if (G6 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zVar.f() < f8) {
                                        String trim2 = zVar.D(3).trim();
                                        int G8 = zVar.G();
                                        byte[] bArr = new byte[4];
                                        zVar.l(bArr, 0, 4);
                                        arrayList2.add(new K.a(trim2, G8, bArr));
                                    }
                                    arrayList = arrayList2;
                                    i10 = 89;
                                } else if (G6 == 111) {
                                    i8 = 257;
                                }
                                i10 = i8;
                            }
                        }
                        i10 = 135;
                    }
                    i10 = 129;
                }
                zVar.U(f8 - zVar.f());
            }
            zVar.T(i9);
            return new K.b(i10, str, i11, arrayList, Arrays.copyOfRange(zVar.e(), f7, i9));
        }

        @Override // l1.D
        public void c(g0.E e7, InterfaceC0374t interfaceC0374t, K.d dVar) {
        }
    }
}
