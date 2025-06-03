package Z0;

import F0.AbstractC0358c;
import F0.AbstractC0362g;
import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.C0363h;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.L;
import F0.Q;
import F0.T;
import X2.AbstractC0703v;
import Z0.a;
import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import c1.t;
import d0.C1162A;
import d0.C1190m;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.E;
import g0.M;
import g0.z;
import h0.AbstractC1329d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class h implements F0.r {

    /* renamed from: K, reason: collision with root package name */
    public static final InterfaceC0378x f7681K = new InterfaceC0378x() { // from class: Z0.f
        @Override // F0.InterfaceC0378x
        public final F0.r[] a() {
            F0.r[] p7;
            p7 = h.p();
            return p7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ F0.r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: L, reason: collision with root package name */
    public static final byte[] f7682L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: M, reason: collision with root package name */
    public static final C1194q f7683M = new C1194q.b().o0("application/x-emsg").K();

    /* renamed from: A, reason: collision with root package name */
    public long f7684A;

    /* renamed from: B, reason: collision with root package name */
    public b f7685B;

    /* renamed from: C, reason: collision with root package name */
    public int f7686C;

    /* renamed from: D, reason: collision with root package name */
    public int f7687D;

    /* renamed from: E, reason: collision with root package name */
    public int f7688E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7689F;

    /* renamed from: G, reason: collision with root package name */
    public InterfaceC0374t f7690G;

    /* renamed from: H, reason: collision with root package name */
    public T[] f7691H;

    /* renamed from: I, reason: collision with root package name */
    public T[] f7692I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f7693J;

    /* renamed from: a, reason: collision with root package name */
    public final t.a f7694a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7695b;

    /* renamed from: c, reason: collision with root package name */
    public final s f7696c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7697d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f7698e;

    /* renamed from: f, reason: collision with root package name */
    public final z f7699f;

    /* renamed from: g, reason: collision with root package name */
    public final z f7700g;

    /* renamed from: h, reason: collision with root package name */
    public final z f7701h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f7702i;

    /* renamed from: j, reason: collision with root package name */
    public final z f7703j;

    /* renamed from: k, reason: collision with root package name */
    public final E f7704k;

    /* renamed from: l, reason: collision with root package name */
    public final Q0.c f7705l;

    /* renamed from: m, reason: collision with root package name */
    public final z f7706m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f7707n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f7708o;

    /* renamed from: p, reason: collision with root package name */
    public final T f7709p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0703v f7710q;

    /* renamed from: r, reason: collision with root package name */
    public int f7711r;

    /* renamed from: s, reason: collision with root package name */
    public int f7712s;

    /* renamed from: t, reason: collision with root package name */
    public long f7713t;

    /* renamed from: u, reason: collision with root package name */
    public int f7714u;

    /* renamed from: v, reason: collision with root package name */
    public z f7715v;

    /* renamed from: w, reason: collision with root package name */
    public long f7716w;

    /* renamed from: x, reason: collision with root package name */
    public int f7717x;

    /* renamed from: y, reason: collision with root package name */
    public long f7718y;

    /* renamed from: z, reason: collision with root package name */
    public long f7719z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f7720a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7721b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7722c;

        public a(long j7, boolean z7, int i7) {
            this.f7720a = j7;
            this.f7721b = z7;
            this.f7722c = i7;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final T f7723a;

        /* renamed from: d, reason: collision with root package name */
        public v f7726d;

        /* renamed from: e, reason: collision with root package name */
        public d f7727e;

        /* renamed from: f, reason: collision with root package name */
        public int f7728f;

        /* renamed from: g, reason: collision with root package name */
        public int f7729g;

        /* renamed from: h, reason: collision with root package name */
        public int f7730h;

        /* renamed from: i, reason: collision with root package name */
        public int f7731i;

        /* renamed from: l, reason: collision with root package name */
        public boolean f7734l;

        /* renamed from: b, reason: collision with root package name */
        public final u f7724b = new u();

        /* renamed from: c, reason: collision with root package name */
        public final z f7725c = new z();

        /* renamed from: j, reason: collision with root package name */
        public final z f7732j = new z(1);

        /* renamed from: k, reason: collision with root package name */
        public final z f7733k = new z();

        public b(T t7, v vVar, d dVar) {
            this.f7723a = t7;
            this.f7726d = vVar;
            this.f7727e = dVar;
            j(vVar, dVar);
        }

        public int c() {
            int i7 = !this.f7734l ? this.f7726d.f7825g[this.f7728f] : this.f7724b.f7811k[this.f7728f] ? 1 : 0;
            return g() != null ? i7 | 1073741824 : i7;
        }

        public long d() {
            return !this.f7734l ? this.f7726d.f7821c[this.f7728f] : this.f7724b.f7807g[this.f7730h];
        }

        public long e() {
            return !this.f7734l ? this.f7726d.f7824f[this.f7728f] : this.f7724b.c(this.f7728f);
        }

        public int f() {
            return !this.f7734l ? this.f7726d.f7822d[this.f7728f] : this.f7724b.f7809i[this.f7728f];
        }

        public t g() {
            if (!this.f7734l) {
                return null;
            }
            int i7 = ((d) M.i(this.f7724b.f7801a)).f7670a;
            t tVar = this.f7724b.f7814n;
            if (tVar == null) {
                tVar = this.f7726d.f7819a.a(i7);
            }
            if (tVar == null || !tVar.f7796a) {
                return null;
            }
            return tVar;
        }

        public boolean h() {
            this.f7728f++;
            if (!this.f7734l) {
                return false;
            }
            int i7 = this.f7729g + 1;
            this.f7729g = i7;
            int[] iArr = this.f7724b.f7808h;
            int i8 = this.f7730h;
            if (i7 != iArr[i8]) {
                return true;
            }
            this.f7730h = i8 + 1;
            this.f7729g = 0;
            return false;
        }

        public int i(int i7, int i8) {
            z zVar;
            t g7 = g();
            if (g7 == null) {
                return 0;
            }
            int i9 = g7.f7799d;
            if (i9 != 0) {
                zVar = this.f7724b.f7815o;
            } else {
                byte[] bArr = (byte[]) M.i(g7.f7800e);
                this.f7733k.R(bArr, bArr.length);
                z zVar2 = this.f7733k;
                i9 = bArr.length;
                zVar = zVar2;
            }
            boolean g8 = this.f7724b.g(this.f7728f);
            boolean z7 = g8 || i8 != 0;
            this.f7732j.e()[0] = (byte) ((z7 ? 128 : 0) | i9);
            this.f7732j.T(0);
            this.f7723a.a(this.f7732j, 1, 1);
            this.f7723a.a(zVar, i9, 1);
            if (!z7) {
                return i9 + 1;
            }
            if (!g8) {
                this.f7725c.P(8);
                byte[] e7 = this.f7725c.e();
                e7[0] = 0;
                e7[1] = 1;
                e7[2] = (byte) ((i8 >> 8) & 255);
                e7[3] = (byte) (i8 & 255);
                e7[4] = (byte) ((i7 >> 24) & 255);
                e7[5] = (byte) ((i7 >> 16) & 255);
                e7[6] = (byte) ((i7 >> 8) & 255);
                e7[7] = (byte) (i7 & 255);
                this.f7723a.a(this.f7725c, 8, 1);
                return i9 + 9;
            }
            z zVar3 = this.f7724b.f7815o;
            int M6 = zVar3.M();
            zVar3.U(-2);
            int i10 = (M6 * 6) + 2;
            if (i8 != 0) {
                this.f7725c.P(i10);
                byte[] e8 = this.f7725c.e();
                zVar3.l(e8, 0, i10);
                int i11 = (((e8[2] & 255) << 8) | (e8[3] & 255)) + i8;
                e8[2] = (byte) ((i11 >> 8) & 255);
                e8[3] = (byte) (i11 & 255);
                zVar3 = this.f7725c;
            }
            this.f7723a.a(zVar3, i10, 1);
            return i9 + 1 + i10;
        }

        public void j(v vVar, d dVar) {
            this.f7726d = vVar;
            this.f7727e = dVar;
            this.f7723a.d(vVar.f7819a.f7790f);
            k();
        }

        public void k() {
            this.f7724b.f();
            this.f7728f = 0;
            this.f7730h = 0;
            this.f7729g = 0;
            this.f7731i = 0;
            this.f7734l = false;
        }

        public void l(long j7) {
            int i7 = this.f7728f;
            while (true) {
                u uVar = this.f7724b;
                if (i7 >= uVar.f7806f || uVar.c(i7) > j7) {
                    return;
                }
                if (this.f7724b.f7811k[i7]) {
                    this.f7731i = i7;
                }
                i7++;
            }
        }

        public void m() {
            t g7 = g();
            if (g7 == null) {
                return;
            }
            z zVar = this.f7724b.f7815o;
            int i7 = g7.f7799d;
            if (i7 != 0) {
                zVar.U(i7);
            }
            if (this.f7724b.g(this.f7728f)) {
                zVar.U(zVar.M() * 6);
            }
        }

        public void n(C1190m c1190m) {
            t a7 = this.f7726d.f7819a.a(((d) M.i(this.f7724b.f7801a)).f7670a);
            this.f7723a.d(this.f7726d.f7819a.f7790f.a().U(c1190m.c(a7 != null ? a7.f7797b : null)).K());
        }
    }

    public h(t.a aVar, int i7) {
        this(aVar, i7, null, null, AbstractC0703v.Y(), null);
    }

    public static void A(t tVar, z zVar, u uVar) {
        int i7;
        int i8 = tVar.f7799d;
        zVar.T(8);
        if ((Z0.a.b(zVar.p()) & 1) == 1) {
            zVar.U(8);
        }
        int G6 = zVar.G();
        int K6 = zVar.K();
        if (K6 > uVar.f7806f) {
            throw C1162A.a("Saiz sample count " + K6 + " is greater than fragment sample count" + uVar.f7806f, null);
        }
        if (G6 == 0) {
            boolean[] zArr = uVar.f7813m;
            i7 = 0;
            for (int i9 = 0; i9 < K6; i9++) {
                int G7 = zVar.G();
                i7 += G7;
                zArr[i9] = G7 > i8;
            }
        } else {
            i7 = G6 * K6;
            Arrays.fill(uVar.f7813m, 0, K6, G6 > i8);
        }
        Arrays.fill(uVar.f7813m, K6, uVar.f7806f, false);
        if (i7 > 0) {
            uVar.d(i7);
        }
    }

    public static void B(a.C0134a c0134a, String str, u uVar) {
        byte[] bArr = null;
        z zVar = null;
        z zVar2 = null;
        for (int i7 = 0; i7 < c0134a.f7635c.size(); i7++) {
            a.b bVar = (a.b) c0134a.f7635c.get(i7);
            z zVar3 = bVar.f7637b;
            int i8 = bVar.f7633a;
            if (i8 == 1935828848) {
                zVar3.T(12);
                if (zVar3.p() == 1936025959) {
                    zVar = zVar3;
                }
            } else if (i8 == 1936158820) {
                zVar3.T(12);
                if (zVar3.p() == 1936025959) {
                    zVar2 = zVar3;
                }
            }
        }
        if (zVar == null || zVar2 == null) {
            return;
        }
        zVar.T(8);
        int c7 = Z0.a.c(zVar.p());
        zVar.U(4);
        if (c7 == 1) {
            zVar.U(4);
        }
        if (zVar.p() != 1) {
            throw C1162A.d("Entry count in sbgp != 1 (unsupported).");
        }
        zVar2.T(8);
        int c8 = Z0.a.c(zVar2.p());
        zVar2.U(4);
        if (c8 == 1) {
            if (zVar2.I() == 0) {
                throw C1162A.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (c8 >= 2) {
            zVar2.U(4);
        }
        if (zVar2.I() != 1) {
            throw C1162A.d("Entry count in sgpd != 1 (unsupported).");
        }
        zVar2.U(1);
        int G6 = zVar2.G();
        int i9 = (G6 & 240) >> 4;
        int i10 = G6 & 15;
        boolean z7 = zVar2.G() == 1;
        if (z7) {
            int G7 = zVar2.G();
            byte[] bArr2 = new byte[16];
            zVar2.l(bArr2, 0, 16);
            if (G7 == 0) {
                int G8 = zVar2.G();
                bArr = new byte[G8];
                zVar2.l(bArr, 0, G8);
            }
            uVar.f7812l = true;
            uVar.f7814n = new t(z7, str, G7, bArr2, i9, i10, bArr);
        }
    }

    public static void C(z zVar, int i7, u uVar) {
        zVar.T(i7 + 8);
        int b7 = Z0.a.b(zVar.p());
        if ((b7 & 1) != 0) {
            throw C1162A.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z7 = (b7 & 2) != 0;
        int K6 = zVar.K();
        if (K6 == 0) {
            Arrays.fill(uVar.f7813m, 0, uVar.f7806f, false);
            return;
        }
        if (K6 == uVar.f7806f) {
            Arrays.fill(uVar.f7813m, 0, K6, z7);
            uVar.d(zVar.a());
            uVar.b(zVar);
        } else {
            throw C1162A.a("Senc sample count " + K6 + " is different from fragment sample count" + uVar.f7806f, null);
        }
    }

    public static void D(z zVar, u uVar) {
        C(zVar, 0, uVar);
    }

    public static Pair E(z zVar, long j7) {
        long L6;
        long L7;
        zVar.T(8);
        int c7 = Z0.a.c(zVar.p());
        zVar.U(4);
        long I6 = zVar.I();
        if (c7 == 0) {
            L6 = zVar.I();
            L7 = zVar.I();
        } else {
            L6 = zVar.L();
            L7 = zVar.L();
        }
        long j8 = L6;
        long j9 = j7 + L7;
        long W02 = M.W0(j8, 1000000L, I6);
        zVar.U(2);
        int M6 = zVar.M();
        int[] iArr = new int[M6];
        long[] jArr = new long[M6];
        long[] jArr2 = new long[M6];
        long[] jArr3 = new long[M6];
        long j10 = W02;
        int i7 = 0;
        long j11 = j8;
        while (i7 < M6) {
            int p7 = zVar.p();
            if ((p7 & Integer.MIN_VALUE) != 0) {
                throw C1162A.a("Unhandled indirect reference", null);
            }
            long I7 = zVar.I();
            iArr[i7] = p7 & Integer.MAX_VALUE;
            jArr[i7] = j9;
            jArr3[i7] = j10;
            long j12 = j11 + I7;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i8 = M6;
            long W03 = M.W0(j12, 1000000L, I6);
            jArr4[i7] = W03 - jArr5[i7];
            zVar.U(4);
            j9 += r1[i7];
            i7++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            M6 = i8;
            j11 = j12;
            j10 = W03;
        }
        return Pair.create(Long.valueOf(W02), new C0363h(iArr, jArr, jArr2, jArr3));
    }

    public static long F(z zVar) {
        zVar.T(8);
        return Z0.a.c(zVar.p()) == 1 ? zVar.L() : zVar.I();
    }

    public static b G(z zVar, SparseArray sparseArray, boolean z7) {
        zVar.T(8);
        int b7 = Z0.a.b(zVar.p());
        b bVar = (b) (z7 ? sparseArray.valueAt(0) : sparseArray.get(zVar.p()));
        if (bVar == null) {
            return null;
        }
        if ((b7 & 1) != 0) {
            long L6 = zVar.L();
            u uVar = bVar.f7724b;
            uVar.f7803c = L6;
            uVar.f7804d = L6;
        }
        d dVar = bVar.f7727e;
        bVar.f7724b.f7801a = new d((b7 & 2) != 0 ? zVar.p() - 1 : dVar.f7670a, (b7 & 8) != 0 ? zVar.p() : dVar.f7671b, (b7 & 16) != 0 ? zVar.p() : dVar.f7672c, (b7 & 32) != 0 ? zVar.p() : dVar.f7673d);
        return bVar;
    }

    public static void H(a.C0134a c0134a, SparseArray sparseArray, boolean z7, int i7, byte[] bArr) {
        b G6 = G(((a.b) AbstractC1297a.e(c0134a.g(1952868452))).f7637b, sparseArray, z7);
        if (G6 == null) {
            return;
        }
        u uVar = G6.f7724b;
        long j7 = uVar.f7817q;
        boolean z8 = uVar.f7818r;
        G6.k();
        G6.f7734l = true;
        a.b g7 = c0134a.g(1952867444);
        if (g7 == null || (i7 & 2) != 0) {
            uVar.f7817q = j7;
            uVar.f7818r = z8;
        } else {
            uVar.f7817q = F(g7.f7637b);
            uVar.f7818r = true;
        }
        K(c0134a, G6, i7);
        t a7 = G6.f7726d.f7819a.a(((d) AbstractC1297a.e(uVar.f7801a)).f7670a);
        a.b g8 = c0134a.g(1935763834);
        if (g8 != null) {
            A((t) AbstractC1297a.e(a7), g8.f7637b, uVar);
        }
        a.b g9 = c0134a.g(1935763823);
        if (g9 != null) {
            z(g9.f7637b, uVar);
        }
        a.b g10 = c0134a.g(1936027235);
        if (g10 != null) {
            D(g10.f7637b, uVar);
        }
        B(c0134a, a7 != null ? a7.f7797b : null, uVar);
        int size = c0134a.f7635c.size();
        for (int i8 = 0; i8 < size; i8++) {
            a.b bVar = (a.b) c0134a.f7635c.get(i8);
            if (bVar.f7633a == 1970628964) {
                L(bVar.f7637b, uVar, bArr);
            }
        }
    }

    public static Pair I(z zVar) {
        zVar.T(12);
        return Pair.create(Integer.valueOf(zVar.p()), new d(zVar.p() - 1, zVar.p(), zVar.p(), zVar.p()));
    }

    public static int J(b bVar, int i7, int i8, z zVar, int i9) {
        boolean z7;
        int i10;
        boolean z8;
        int i11;
        boolean z9;
        boolean z10;
        boolean z11;
        int i12;
        b bVar2 = bVar;
        zVar.T(8);
        int b7 = Z0.a.b(zVar.p());
        s sVar = bVar2.f7726d.f7819a;
        u uVar = bVar2.f7724b;
        d dVar = (d) M.i(uVar.f7801a);
        uVar.f7808h[i7] = zVar.K();
        long[] jArr = uVar.f7807g;
        long j7 = uVar.f7803c;
        jArr[i7] = j7;
        if ((b7 & 1) != 0) {
            jArr[i7] = j7 + zVar.p();
        }
        boolean z12 = (b7 & 4) != 0;
        int i13 = dVar.f7673d;
        if (z12) {
            i13 = zVar.p();
        }
        boolean z13 = (b7 & 256) != 0;
        boolean z14 = (b7 & 512) != 0;
        boolean z15 = (b7 & 1024) != 0;
        boolean z16 = (b7 & 2048) != 0;
        long j8 = o(sVar) ? ((long[]) M.i(sVar.f7793i))[0] : 0L;
        int[] iArr = uVar.f7809i;
        long[] jArr2 = uVar.f7810j;
        boolean[] zArr = uVar.f7811k;
        int i14 = i13;
        boolean z17 = sVar.f7786b == 2 && (i8 & 1) != 0;
        int i15 = i9 + uVar.f7808h[i7];
        boolean z18 = z17;
        long j9 = sVar.f7787c;
        long j10 = uVar.f7817q;
        int i16 = i9;
        while (i16 < i15) {
            int f7 = f(z13 ? zVar.p() : dVar.f7671b);
            if (z14) {
                i10 = zVar.p();
                z7 = z13;
            } else {
                z7 = z13;
                i10 = dVar.f7672c;
            }
            int f8 = f(i10);
            if (z15) {
                z8 = z12;
                i11 = zVar.p();
            } else if (i16 == 0 && z12) {
                z8 = z12;
                i11 = i14;
            } else {
                z8 = z12;
                i11 = dVar.f7673d;
            }
            if (z16) {
                z9 = z16;
                z10 = z14;
                z11 = z15;
                i12 = zVar.p();
            } else {
                z9 = z16;
                z10 = z14;
                z11 = z15;
                i12 = 0;
            }
            long W02 = M.W0((i12 + j10) - j8, 1000000L, j9);
            jArr2[i16] = W02;
            if (!uVar.f7818r) {
                jArr2[i16] = W02 + bVar2.f7726d.f7826h;
            }
            iArr[i16] = f8;
            zArr[i16] = ((i11 >> 16) & 1) == 0 && (!z18 || i16 == 0);
            j10 += f7;
            i16++;
            bVar2 = bVar;
            z13 = z7;
            z12 = z8;
            z16 = z9;
            z14 = z10;
            z15 = z11;
        }
        uVar.f7817q = j10;
        return i15;
    }

    public static void K(a.C0134a c0134a, b bVar, int i7) {
        List list = c0134a.f7635c;
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar2 = (a.b) list.get(i10);
            if (bVar2.f7633a == 1953658222) {
                z zVar = bVar2.f7637b;
                zVar.T(12);
                int K6 = zVar.K();
                if (K6 > 0) {
                    i9 += K6;
                    i8++;
                }
            }
        }
        bVar.f7730h = 0;
        bVar.f7729g = 0;
        bVar.f7728f = 0;
        bVar.f7724b.e(i8, i9);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar3 = (a.b) list.get(i13);
            if (bVar3.f7633a == 1953658222) {
                i12 = J(bVar, i11, i7, bVar3.f7637b, i12);
                i11++;
            }
        }
    }

    public static void L(z zVar, u uVar, byte[] bArr) {
        zVar.T(8);
        zVar.l(bArr, 0, 16);
        if (Arrays.equals(bArr, f7682L)) {
            C(zVar, 16, uVar);
        }
    }

    private void M(long j7) {
        while (!this.f7707n.isEmpty() && ((a.C0134a) this.f7707n.peek()).f7634b == j7) {
            r((a.C0134a) this.f7707n.pop());
        }
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean N(F0.InterfaceC0373s r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.h.N(F0.s):boolean");
    }

    private static boolean R(int i7) {
        return i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1836019558 || i7 == 1953653094 || i7 == 1836475768 || i7 == 1701082227;
    }

    private static boolean S(int i7) {
        return i7 == 1751411826 || i7 == 1835296868 || i7 == 1836476516 || i7 == 1936286840 || i7 == 1937011556 || i7 == 1937011827 || i7 == 1668576371 || i7 == 1937011555 || i7 == 1937011578 || i7 == 1937013298 || i7 == 1937007471 || i7 == 1668232756 || i7 == 1937011571 || i7 == 1952867444 || i7 == 1952868452 || i7 == 1953196132 || i7 == 1953654136 || i7 == 1953658222 || i7 == 1886614376 || i7 == 1935763834 || i7 == 1935763823 || i7 == 1936027235 || i7 == 1970628964 || i7 == 1935828848 || i7 == 1936158820 || i7 == 1701606260 || i7 == 1835362404 || i7 == 1701671783;
    }

    public static int f(int i7) {
        if (i7 >= 0) {
            return i7;
        }
        throw C1162A.a("Unexpected negative value: " + i7, null);
    }

    private void h() {
        this.f7711r = 0;
        this.f7714u = 0;
    }

    public static C1190m k(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            a.b bVar = (a.b) list.get(i7);
            if (bVar.f7633a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] e7 = bVar.f7637b.e();
                UUID f7 = o.f(e7);
                if (f7 == null) {
                    g0.o.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C1190m.b(f7, "video/mp4", e7));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C1190m(arrayList);
    }

    public static b l(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j7 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < size; i7++) {
            b bVar2 = (b) sparseArray.valueAt(i7);
            if ((bVar2.f7734l || bVar2.f7728f != bVar2.f7726d.f7820b) && (!bVar2.f7734l || bVar2.f7730h != bVar2.f7724b.f7805e)) {
                long d7 = bVar2.d();
                if (d7 < j7) {
                    bVar = bVar2;
                    j7 = d7;
                }
            }
        }
        return bVar;
    }

    public static boolean o(s sVar) {
        long[] jArr;
        long[] jArr2 = sVar.f7792h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = sVar.f7793i) == null) {
            return false;
        }
        long j7 = jArr2[0];
        return j7 == 0 || M.W0(j7 + jArr[0], 1000000L, sVar.f7788d) >= sVar.f7789e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ F0.r[] p() {
        return new F0.r[]{new h(t.a.f10046a, 32)};
    }

    public static long x(z zVar) {
        zVar.T(8);
        return Z0.a.c(zVar.p()) == 0 ? zVar.I() : zVar.L();
    }

    public static void y(a.C0134a c0134a, SparseArray sparseArray, boolean z7, int i7, byte[] bArr) {
        int size = c0134a.f7636d.size();
        for (int i8 = 0; i8 < size; i8++) {
            a.C0134a c0134a2 = (a.C0134a) c0134a.f7636d.get(i8);
            if (c0134a2.f7633a == 1953653094) {
                H(c0134a2, sparseArray, z7, i7, bArr);
            }
        }
    }

    public static void z(z zVar, u uVar) {
        zVar.T(8);
        int p7 = zVar.p();
        if ((Z0.a.b(p7) & 1) == 1) {
            zVar.U(8);
        }
        int K6 = zVar.K();
        if (K6 == 1) {
            uVar.f7804d += Z0.a.c(p7) == 0 ? zVar.I() : zVar.L();
        } else {
            throw C1162A.a("Unexpected saio entry count: " + K6, null);
        }
    }

    public final void O(InterfaceC0373s interfaceC0373s) {
        int i7 = ((int) this.f7713t) - this.f7714u;
        z zVar = this.f7715v;
        if (zVar != null) {
            interfaceC0373s.readFully(zVar.e(), 8, i7);
            t(new a.b(this.f7712s, zVar), interfaceC0373s.p());
        } else {
            interfaceC0373s.i(i7);
        }
        M(interfaceC0373s.p());
    }

    public final void P(InterfaceC0373s interfaceC0373s) {
        int size = this.f7698e.size();
        long j7 = Long.MAX_VALUE;
        b bVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            u uVar = ((b) this.f7698e.valueAt(i7)).f7724b;
            if (uVar.f7816p) {
                long j8 = uVar.f7804d;
                if (j8 < j7) {
                    bVar = (b) this.f7698e.valueAt(i7);
                    j7 = j8;
                }
            }
        }
        if (bVar == null) {
            this.f7711r = 3;
            return;
        }
        int p7 = (int) (j7 - interfaceC0373s.p());
        if (p7 < 0) {
            throw C1162A.a("Offset to encryption data was negative.", null);
        }
        interfaceC0373s.i(p7);
        bVar.f7724b.a(interfaceC0373s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Q(InterfaceC0373s interfaceC0373s) {
        int f7;
        int i7;
        b bVar = this.f7685B;
        Throwable th = null;
        if (bVar == null) {
            bVar = l(this.f7698e);
            if (bVar == null) {
                int p7 = (int) (this.f7716w - interfaceC0373s.p());
                if (p7 < 0) {
                    throw C1162A.a("Offset to end of mdat was negative.", null);
                }
                interfaceC0373s.i(p7);
                h();
                return false;
            }
            int d7 = (int) (bVar.d() - interfaceC0373s.p());
            if (d7 < 0) {
                g0.o.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d7 = 0;
            }
            interfaceC0373s.i(d7);
            this.f7685B = bVar;
        }
        int i8 = 4;
        int i9 = 1;
        if (this.f7711r == 3) {
            int f8 = bVar.f();
            this.f7686C = f8;
            if (bVar.f7728f < bVar.f7731i) {
                interfaceC0373s.i(f8);
                bVar.m();
                if (!bVar.h()) {
                    this.f7685B = null;
                }
                this.f7711r = 3;
                return true;
            }
            if (bVar.f7726d.f7819a.f7791g == 1) {
                this.f7686C = f8 - 8;
                interfaceC0373s.i(8);
            }
            if ("audio/ac4".equals(bVar.f7726d.f7819a.f7790f.f12726n)) {
                this.f7687D = bVar.i(this.f7686C, 7);
                AbstractC0358c.a(this.f7686C, this.f7703j);
                bVar.f7723a.e(this.f7703j, 7);
                i7 = this.f7687D + 7;
            } else {
                i7 = bVar.i(this.f7686C, 0);
            }
            this.f7687D = i7;
            this.f7686C += this.f7687D;
            this.f7711r = 4;
            this.f7688E = 0;
        }
        s sVar = bVar.f7726d.f7819a;
        T t7 = bVar.f7723a;
        long e7 = bVar.e();
        E e8 = this.f7704k;
        if (e8 != null) {
            e7 = e8.a(e7);
        }
        long j7 = e7;
        if (sVar.f7794j == 0) {
            while (true) {
                int i10 = this.f7687D;
                int i11 = this.f7686C;
                if (i10 >= i11) {
                    break;
                }
                this.f7687D += t7.f(interfaceC0373s, i11 - i10, false);
            }
        } else {
            byte[] e9 = this.f7700g.e();
            e9[0] = 0;
            e9[1] = 0;
            e9[2] = 0;
            int i12 = sVar.f7794j;
            int i13 = i12 + 1;
            int i14 = 4 - i12;
            while (this.f7687D < this.f7686C) {
                int i15 = this.f7688E;
                if (i15 == 0) {
                    interfaceC0373s.readFully(e9, i14, i13);
                    this.f7700g.T(0);
                    int p8 = this.f7700g.p();
                    if (p8 < i9) {
                        throw C1162A.a("Invalid NAL length", th);
                    }
                    this.f7688E = p8 - 1;
                    this.f7699f.T(0);
                    t7.e(this.f7699f, i8);
                    t7.e(this.f7700g, i9);
                    this.f7689F = (this.f7692I.length <= 0 || !AbstractC1329d.g(sVar.f7790f.f12726n, e9[i8])) ? 0 : i9;
                    this.f7687D += 5;
                    this.f7686C += i14;
                } else {
                    if (this.f7689F) {
                        this.f7701h.P(i15);
                        interfaceC0373s.readFully(this.f7701h.e(), 0, this.f7688E);
                        t7.e(this.f7701h, this.f7688E);
                        f7 = this.f7688E;
                        int r7 = AbstractC1329d.r(this.f7701h.e(), this.f7701h.g());
                        this.f7701h.T("video/hevc".equals(sVar.f7790f.f12726n) ? 1 : 0);
                        this.f7701h.S(r7);
                        AbstractC0362g.a(j7, this.f7701h, this.f7692I);
                    } else {
                        f7 = t7.f(interfaceC0373s, i15, false);
                    }
                    this.f7687D += f7;
                    this.f7688E -= f7;
                    th = null;
                    i8 = 4;
                    i9 = 1;
                }
            }
        }
        int c7 = bVar.c();
        t g7 = bVar.g();
        t7.b(j7, c7, this.f7686C, 0, g7 != null ? g7.f7798c : null);
        w(j7);
        if (!bVar.h()) {
            this.f7685B = null;
        }
        this.f7711r = 3;
        return true;
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        int size = this.f7698e.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((b) this.f7698e.valueAt(i7)).k();
        }
        this.f7708o.clear();
        this.f7717x = 0;
        this.f7718y = j8;
        this.f7707n.clear();
        h();
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f7690G = (this.f7695b & 32) == 0 ? new c1.v(interfaceC0374t, this.f7694a) : interfaceC0374t;
        h();
        n();
        s sVar = this.f7696c;
        if (sVar != null) {
            this.f7698e.put(0, new b(interfaceC0374t.a(0, sVar.f7786b), new v(this.f7696c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new d(0, 0, 0, 0)));
            this.f7690G.j();
        }
    }

    @Override // F0.r
    public /* synthetic */ F0.r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        Q b7 = r.b(interfaceC0373s);
        this.f7710q = b7 != null ? AbstractC0703v.Z(b7) : AbstractC0703v.Y();
        return b7 == null;
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        while (true) {
            int i7 = this.f7711r;
            if (i7 != 0) {
                if (i7 == 1) {
                    O(interfaceC0373s);
                } else if (i7 == 2) {
                    P(interfaceC0373s);
                } else if (Q(interfaceC0373s)) {
                    return 0;
                }
            } else if (!N(interfaceC0373s)) {
                return -1;
            }
        }
    }

    public final d j(SparseArray sparseArray, int i7) {
        return (d) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : AbstractC1297a.e((d) sparseArray.get(i7)));
    }

    @Override // F0.r
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC0703v g() {
        return this.f7710q;
    }

    public final void n() {
        int i7;
        T[] tArr = new T[2];
        this.f7691H = tArr;
        T t7 = this.f7709p;
        int i8 = 0;
        if (t7 != null) {
            tArr[0] = t7;
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i9 = 100;
        if ((this.f7695b & 4) != 0) {
            tArr[i7] = this.f7690G.a(100, 5);
            i9 = 101;
            i7++;
        }
        T[] tArr2 = (T[]) M.O0(this.f7691H, i7);
        this.f7691H = tArr2;
        for (T t8 : tArr2) {
            t8.d(f7683M);
        }
        this.f7692I = new T[this.f7697d.size()];
        while (i8 < this.f7692I.length) {
            T a7 = this.f7690G.a(i9, 3);
            a7.d((C1194q) this.f7697d.get(i8));
            this.f7692I[i8] = a7;
            i8++;
            i9++;
        }
    }

    public final void r(a.C0134a c0134a) {
        int i7 = c0134a.f7633a;
        if (i7 == 1836019574) {
            v(c0134a);
        } else if (i7 == 1836019558) {
            u(c0134a);
        } else {
            if (this.f7707n.isEmpty()) {
                return;
            }
            ((a.C0134a) this.f7707n.peek()).d(c0134a);
        }
    }

    public final void s(z zVar) {
        long W02;
        String str;
        long W03;
        String str2;
        long I6;
        long j7;
        ArrayDeque arrayDeque;
        a aVar;
        if (this.f7691H.length == 0) {
            return;
        }
        zVar.T(8);
        int c7 = Z0.a.c(zVar.p());
        if (c7 == 0) {
            String str3 = (String) AbstractC1297a.e(zVar.A());
            String str4 = (String) AbstractC1297a.e(zVar.A());
            long I7 = zVar.I();
            W02 = M.W0(zVar.I(), 1000000L, I7);
            long j8 = this.f7684A;
            long j9 = j8 != -9223372036854775807L ? j8 + W02 : -9223372036854775807L;
            str = str3;
            W03 = M.W0(zVar.I(), 1000L, I7);
            str2 = str4;
            I6 = zVar.I();
            j7 = j9;
        } else {
            if (c7 != 1) {
                g0.o.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + c7);
                return;
            }
            long I8 = zVar.I();
            j7 = M.W0(zVar.L(), 1000000L, I8);
            long W04 = M.W0(zVar.I(), 1000L, I8);
            long I9 = zVar.I();
            str = (String) AbstractC1297a.e(zVar.A());
            W03 = W04;
            I6 = I9;
            str2 = (String) AbstractC1297a.e(zVar.A());
            W02 = -9223372036854775807L;
        }
        byte[] bArr = new byte[zVar.a()];
        zVar.l(bArr, 0, zVar.a());
        z zVar2 = new z(this.f7705l.a(new Q0.a(str, str2, W03, I6, bArr)));
        int a7 = zVar2.a();
        for (T t7 : this.f7691H) {
            zVar2.T(0);
            t7.e(zVar2, a7);
        }
        if (j7 == -9223372036854775807L) {
            this.f7708o.addLast(new a(W02, true, a7));
        } else {
            if (this.f7708o.isEmpty()) {
                E e7 = this.f7704k;
                if (e7 == null || e7.g()) {
                    E e8 = this.f7704k;
                    if (e8 != null) {
                        j7 = e8.a(j7);
                    }
                    for (T t8 : this.f7691H) {
                        t8.b(j7, 1, a7, 0, null);
                    }
                    return;
                }
                arrayDeque = this.f7708o;
                aVar = new a(j7, false, a7);
            } else {
                arrayDeque = this.f7708o;
                aVar = new a(j7, false, a7);
            }
            arrayDeque.addLast(aVar);
        }
        this.f7717x += a7;
    }

    public final void t(a.b bVar, long j7) {
        if (!this.f7707n.isEmpty()) {
            ((a.C0134a) this.f7707n.peek()).e(bVar);
            return;
        }
        int i7 = bVar.f7633a;
        if (i7 != 1936286840) {
            if (i7 == 1701671783) {
                s(bVar.f7637b);
            }
        } else {
            Pair E6 = E(bVar.f7637b, j7);
            this.f7684A = ((Long) E6.first).longValue();
            this.f7690G.e((F0.M) E6.second);
            this.f7693J = true;
        }
    }

    public final void u(a.C0134a c0134a) {
        y(c0134a, this.f7698e, this.f7696c != null, this.f7695b, this.f7702i);
        C1190m k7 = k(c0134a.f7635c);
        if (k7 != null) {
            int size = this.f7698e.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((b) this.f7698e.valueAt(i7)).n(k7);
            }
        }
        if (this.f7718y != -9223372036854775807L) {
            int size2 = this.f7698e.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((b) this.f7698e.valueAt(i8)).l(this.f7718y);
            }
            this.f7718y = -9223372036854775807L;
        }
    }

    public final void v(a.C0134a c0134a) {
        int i7 = 0;
        AbstractC1297a.g(this.f7696c == null, "Unexpected moov box.");
        C1190m k7 = k(c0134a.f7635c);
        a.C0134a c0134a2 = (a.C0134a) AbstractC1297a.e(c0134a.f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = c0134a2.f7635c.size();
        long j7 = -9223372036854775807L;
        for (int i8 = 0; i8 < size; i8++) {
            a.b bVar = (a.b) c0134a2.f7635c.get(i8);
            int i9 = bVar.f7633a;
            if (i9 == 1953654136) {
                Pair I6 = I(bVar.f7637b);
                sparseArray.put(((Integer) I6.first).intValue(), (d) I6.second);
            } else if (i9 == 1835362404) {
                j7 = x(bVar.f7637b);
            }
        }
        List B7 = Z0.b.B(c0134a, new F0.E(), j7, k7, (this.f7695b & 16) != 0, false, new W2.g() { // from class: Z0.g
            @Override // W2.g
            public final Object apply(Object obj) {
                return h.this.q((s) obj);
            }
        });
        int size2 = B7.size();
        if (this.f7698e.size() != 0) {
            AbstractC1297a.f(this.f7698e.size() == size2);
            while (i7 < size2) {
                v vVar = (v) B7.get(i7);
                s sVar = vVar.f7819a;
                ((b) this.f7698e.get(sVar.f7785a)).j(vVar, j(sparseArray, sVar.f7785a));
                i7++;
            }
            return;
        }
        while (i7 < size2) {
            v vVar2 = (v) B7.get(i7);
            s sVar2 = vVar2.f7819a;
            this.f7698e.put(sVar2.f7785a, new b(this.f7690G.a(i7, sVar2.f7786b), vVar2, j(sparseArray, sVar2.f7785a)));
            this.f7719z = Math.max(this.f7719z, sVar2.f7789e);
            i7++;
        }
        this.f7690G.j();
    }

    public final void w(long j7) {
        while (!this.f7708o.isEmpty()) {
            a aVar = (a) this.f7708o.removeFirst();
            this.f7717x -= aVar.f7722c;
            long j8 = aVar.f7720a;
            if (aVar.f7721b) {
                j8 += j7;
            }
            E e7 = this.f7704k;
            if (e7 != null) {
                j8 = e7.a(j8);
            }
            for (T t7 : this.f7691H) {
                t7.b(j8, 1, aVar.f7722c, this.f7717x, null);
            }
        }
    }

    public h(t.a aVar, int i7, E e7, s sVar, List list, T t7) {
        this.f7694a = aVar;
        this.f7695b = i7;
        this.f7704k = e7;
        this.f7696c = sVar;
        this.f7697d = Collections.unmodifiableList(list);
        this.f7709p = t7;
        this.f7705l = new Q0.c();
        this.f7706m = new z(16);
        this.f7699f = new z(AbstractC1329d.f14524a);
        this.f7700g = new z(5);
        this.f7701h = new z();
        byte[] bArr = new byte[16];
        this.f7702i = bArr;
        this.f7703j = new z(bArr);
        this.f7707n = new ArrayDeque();
        this.f7708o = new ArrayDeque();
        this.f7698e = new SparseArray();
        this.f7710q = AbstractC0703v.Y();
        this.f7719z = -9223372036854775807L;
        this.f7718y = -9223372036854775807L;
        this.f7684A = -9223372036854775807L;
        this.f7690G = InterfaceC0374t.f1957a;
        this.f7691H = new T[0];
        this.f7692I = new T[0];
    }

    @Override // F0.r
    public void release() {
    }

    public s q(s sVar) {
        return sVar;
    }
}
