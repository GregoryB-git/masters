package m1;

import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.L;
import F0.T;
import F0.X;
import F0.r;
import android.net.Uri;
import android.util.Pair;
import d0.C1162A;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.M;
import g0.o;
import g0.z;
import java.util.List;
import java.util.Map;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1661b implements r {

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC0378x f17625h = new InterfaceC0378x() { // from class: m1.a
        @Override // F0.InterfaceC0378x
        public final r[] a() {
            r[] h7;
            h7 = C1661b.h();
            return h7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0374t f17626a;

    /* renamed from: b, reason: collision with root package name */
    public T f17627b;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0236b f17630e;

    /* renamed from: c, reason: collision with root package name */
    public int f17628c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f17629d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f17631f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f17632g = -1;

    /* renamed from: m1.b$a */
    public static final class a implements InterfaceC0236b {

        /* renamed from: m, reason: collision with root package name */
        public static final int[] f17633m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        public static final int[] f17634n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0374t f17635a;

        /* renamed from: b, reason: collision with root package name */
        public final T f17636b;

        /* renamed from: c, reason: collision with root package name */
        public final C1662c f17637c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17638d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f17639e;

        /* renamed from: f, reason: collision with root package name */
        public final z f17640f;

        /* renamed from: g, reason: collision with root package name */
        public final int f17641g;

        /* renamed from: h, reason: collision with root package name */
        public final C1194q f17642h;

        /* renamed from: i, reason: collision with root package name */
        public int f17643i;

        /* renamed from: j, reason: collision with root package name */
        public long f17644j;

        /* renamed from: k, reason: collision with root package name */
        public int f17645k;

        /* renamed from: l, reason: collision with root package name */
        public long f17646l;

        public a(InterfaceC0374t interfaceC0374t, T t7, C1662c c1662c) {
            this.f17635a = interfaceC0374t;
            this.f17636b = t7;
            this.f17637c = c1662c;
            int max = Math.max(1, c1662c.f17657c / 10);
            this.f17641g = max;
            z zVar = new z(c1662c.f17661g);
            zVar.y();
            int y7 = zVar.y();
            this.f17638d = y7;
            int i7 = c1662c.f17656b;
            int i8 = (((c1662c.f17659e - (i7 * 4)) * 8) / (c1662c.f17660f * i7)) + 1;
            if (y7 == i8) {
                int k7 = M.k(max, y7);
                this.f17639e = new byte[c1662c.f17659e * k7];
                this.f17640f = new z(k7 * h(y7, i7));
                int i9 = ((c1662c.f17657c * c1662c.f17659e) * 8) / y7;
                this.f17642h = new C1194q.b().o0("audio/raw").M(i9).j0(i9).f0(h(max, i7)).N(c1662c.f17656b).p0(c1662c.f17657c).i0(2).K();
                return;
            }
            throw C1162A.a("Expected frames per block: " + i8 + "; got: " + y7, null);
        }

        public static int h(int i7, int i8) {
            return i7 * 2 * i8;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:3:0x001b). Please report as a decompilation issue!!! */
        @Override // m1.C1661b.InterfaceC0236b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(F0.InterfaceC0373s r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f17641g
                int r1 = r6.f17645k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f17638d
                int r0 = g0.M.k(r0, r1)
                m1.c r1 = r6.f17637c
                int r1 = r1.f17659e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f17643i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f17639e
                int r5 = r6.f17643i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f17643i
                int r4 = r4 + r3
                r6.f17643i = r4
                goto L1e
            L3e:
                int r7 = r6.f17643i
                m1.c r8 = r6.f17637c
                int r8 = r8.f17659e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f17639e
                g0.z r9 = r6.f17640f
                r6.d(r8, r7, r9)
                int r8 = r6.f17643i
                m1.c r9 = r6.f17637c
                int r9 = r9.f17659e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f17643i = r8
                g0.z r7 = r6.f17640f
                int r7 = r7.g()
                F0.T r8 = r6.f17636b
                g0.z r9 = r6.f17640f
                r8.e(r9, r7)
                int r8 = r6.f17645k
                int r8 = r8 + r7
                r6.f17645k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f17641g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f17645k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: m1.C1661b.a.a(F0.s, long):boolean");
        }

        @Override // m1.C1661b.InterfaceC0236b
        public void b(int i7, long j7) {
            this.f17635a.e(new C1664e(this.f17637c, this.f17638d, i7, j7));
            this.f17636b.d(this.f17642h);
        }

        @Override // m1.C1661b.InterfaceC0236b
        public void c(long j7) {
            this.f17643i = 0;
            this.f17644j = j7;
            this.f17645k = 0;
            this.f17646l = 0L;
        }

        public final void d(byte[] bArr, int i7, z zVar) {
            for (int i8 = 0; i8 < i7; i8++) {
                for (int i9 = 0; i9 < this.f17637c.f17656b; i9++) {
                    e(bArr, i8, i9, zVar.e());
                }
            }
            int g7 = g(this.f17638d * i7);
            zVar.T(0);
            zVar.S(g7);
        }

        public final void e(byte[] bArr, int i7, int i8, byte[] bArr2) {
            C1662c c1662c = this.f17637c;
            int i9 = c1662c.f17659e;
            int i10 = c1662c.f17656b;
            int i11 = (i7 * i9) + (i8 * 4);
            int i12 = (i10 * 4) + i11;
            int i13 = (i9 / i10) - 4;
            int i14 = (short) (((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255));
            int min = Math.min(bArr[i11 + 2] & 255, 88);
            int i15 = f17634n[min];
            int i16 = ((i7 * this.f17638d * i10) + i8) * 2;
            bArr2[i16] = (byte) (i14 & 255);
            bArr2[i16 + 1] = (byte) (i14 >> 8);
            for (int i17 = 0; i17 < i13 * 2; i17++) {
                byte b7 = bArr[((i17 / 8) * i10 * 4) + i12 + ((i17 / 2) % 4)];
                int i18 = i17 % 2 == 0 ? b7 & 15 : (b7 & 255) >> 4;
                int i19 = ((((i18 & 7) * 2) + 1) * i15) >> 3;
                if ((i18 & 8) != 0) {
                    i19 = -i19;
                }
                i14 = M.p(i14 + i19, -32768, 32767);
                i16 += i10 * 2;
                bArr2[i16] = (byte) (i14 & 255);
                bArr2[i16 + 1] = (byte) (i14 >> 8);
                int i20 = min + f17633m[i18];
                int[] iArr = f17634n;
                min = M.p(i20, 0, iArr.length - 1);
                i15 = iArr[min];
            }
        }

        public final int f(int i7) {
            return i7 / (this.f17637c.f17656b * 2);
        }

        public final int g(int i7) {
            return h(i7, this.f17637c.f17656b);
        }

        public final void i(int i7) {
            long W02 = this.f17644j + M.W0(this.f17646l, 1000000L, this.f17637c.f17657c);
            int g7 = g(i7);
            this.f17636b.b(W02, 1, g7, this.f17645k - g7, null);
            this.f17646l += i7;
            this.f17645k -= g7;
        }
    }

    /* renamed from: m1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0236b {
        boolean a(InterfaceC0373s interfaceC0373s, long j7);

        void b(int i7, long j7);

        void c(long j7);
    }

    /* renamed from: m1.b$c */
    public static final class c implements InterfaceC0236b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0374t f17647a;

        /* renamed from: b, reason: collision with root package name */
        public final T f17648b;

        /* renamed from: c, reason: collision with root package name */
        public final C1662c f17649c;

        /* renamed from: d, reason: collision with root package name */
        public final C1194q f17650d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17651e;

        /* renamed from: f, reason: collision with root package name */
        public long f17652f;

        /* renamed from: g, reason: collision with root package name */
        public int f17653g;

        /* renamed from: h, reason: collision with root package name */
        public long f17654h;

        public c(InterfaceC0374t interfaceC0374t, T t7, C1662c c1662c, String str, int i7) {
            this.f17647a = interfaceC0374t;
            this.f17648b = t7;
            this.f17649c = c1662c;
            int i8 = (c1662c.f17656b * c1662c.f17660f) / 8;
            if (c1662c.f17659e == i8) {
                int i9 = c1662c.f17657c;
                int i10 = i9 * i8 * 8;
                int max = Math.max(i8, (i9 * i8) / 10);
                this.f17651e = max;
                this.f17650d = new C1194q.b().o0(str).M(i10).j0(i10).f0(max).N(c1662c.f17656b).p0(c1662c.f17657c).i0(i7).K();
                return;
            }
            throw C1162A.a("Expected block size: " + i8 + "; got: " + c1662c.f17659e, null);
        }

        @Override // m1.C1661b.InterfaceC0236b
        public boolean a(InterfaceC0373s interfaceC0373s, long j7) {
            int i7;
            int i8;
            long j8 = j7;
            while (j8 > 0 && (i7 = this.f17653g) < (i8 = this.f17651e)) {
                int f7 = this.f17648b.f(interfaceC0373s, (int) Math.min(i8 - i7, j8), true);
                if (f7 == -1) {
                    j8 = 0;
                } else {
                    this.f17653g += f7;
                    j8 -= f7;
                }
            }
            int i9 = this.f17649c.f17659e;
            int i10 = this.f17653g / i9;
            if (i10 > 0) {
                long W02 = this.f17652f + M.W0(this.f17654h, 1000000L, r1.f17657c);
                int i11 = i10 * i9;
                int i12 = this.f17653g - i11;
                this.f17648b.b(W02, 1, i11, i12, null);
                this.f17654h += i10;
                this.f17653g = i12;
            }
            return j8 <= 0;
        }

        @Override // m1.C1661b.InterfaceC0236b
        public void b(int i7, long j7) {
            this.f17647a.e(new C1664e(this.f17649c, 1, i7, j7));
            this.f17648b.d(this.f17650d);
        }

        @Override // m1.C1661b.InterfaceC0236b
        public void c(long j7) {
            this.f17652f = j7;
            this.f17653g = 0;
            this.f17654h = 0L;
        }
    }

    private void f() {
        AbstractC1297a.h(this.f17627b);
        M.i(this.f17626a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r[] h() {
        return new r[]{new C1661b()};
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f17628c = j7 == 0 ? 0 : 4;
        InterfaceC0236b interfaceC0236b = this.f17630e;
        if (interfaceC0236b != null) {
            interfaceC0236b.c(j8);
        }
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f17626a = interfaceC0374t;
        this.f17627b = interfaceC0374t.a(0, 1);
        interfaceC0374t.j();
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        return AbstractC1663d.a(interfaceC0373s);
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        f();
        int i7 = this.f17628c;
        if (i7 == 0) {
            j(interfaceC0373s);
            return 0;
        }
        if (i7 == 1) {
            l(interfaceC0373s);
            return 0;
        }
        if (i7 == 2) {
            k(interfaceC0373s);
            return 0;
        }
        if (i7 == 3) {
            n(interfaceC0373s);
            return 0;
        }
        if (i7 == 4) {
            return m(interfaceC0373s);
        }
        throw new IllegalStateException();
    }

    public final void j(InterfaceC0373s interfaceC0373s) {
        AbstractC1297a.f(interfaceC0373s.p() == 0);
        int i7 = this.f17631f;
        if (i7 != -1) {
            interfaceC0373s.i(i7);
            this.f17628c = 4;
        } else {
            if (!AbstractC1663d.a(interfaceC0373s)) {
                throw C1162A.a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC0373s.i((int) (interfaceC0373s.m() - interfaceC0373s.p()));
            this.f17628c = 1;
        }
    }

    public final void k(InterfaceC0373s interfaceC0373s) {
        InterfaceC0236b cVar;
        C1662c b7 = AbstractC1663d.b(interfaceC0373s);
        int i7 = b7.f17655a;
        if (i7 == 17) {
            cVar = new a(this.f17626a, this.f17627b, b7);
        } else if (i7 == 6) {
            cVar = new c(this.f17626a, this.f17627b, b7, "audio/g711-alaw", -1);
        } else if (i7 == 7) {
            cVar = new c(this.f17626a, this.f17627b, b7, "audio/g711-mlaw", -1);
        } else {
            int a7 = X.a(i7, b7.f17660f);
            if (a7 == 0) {
                throw C1162A.d("Unsupported WAV format type: " + b7.f17655a);
            }
            cVar = new c(this.f17626a, this.f17627b, b7, "audio/raw", a7);
        }
        this.f17630e = cVar;
        this.f17628c = 3;
    }

    public final void l(InterfaceC0373s interfaceC0373s) {
        this.f17629d = AbstractC1663d.c(interfaceC0373s);
        this.f17628c = 2;
    }

    public final int m(InterfaceC0373s interfaceC0373s) {
        AbstractC1297a.f(this.f17632g != -1);
        return ((InterfaceC0236b) AbstractC1297a.e(this.f17630e)).a(interfaceC0373s, this.f17632g - interfaceC0373s.p()) ? -1 : 0;
    }

    public final void n(InterfaceC0373s interfaceC0373s) {
        Pair e7 = AbstractC1663d.e(interfaceC0373s);
        this.f17631f = ((Long) e7.first).intValue();
        long longValue = ((Long) e7.second).longValue();
        long j7 = this.f17629d;
        if (j7 != -1 && longValue == 4294967295L) {
            longValue = j7;
        }
        this.f17632g = this.f17631f + longValue;
        long a7 = interfaceC0373s.a();
        if (a7 != -1 && this.f17632g > a7) {
            o.h("WavExtractor", "Data exceeds input length: " + this.f17632g + ", " + a7);
            this.f17632g = a7;
        }
        ((InterfaceC0236b) AbstractC1297a.e(this.f17630e)).b(this.f17631f, this.f17632g);
        this.f17628c = 4;
    }

    @Override // F0.r
    public void release() {
    }
}
