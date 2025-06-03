package h0;

import d0.C1185h;
import g0.AbstractC1297a;
import g0.o;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1329d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f14524a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f14525b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14526c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f14527d = new int[10];

    /* renamed from: h0.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14528a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14529b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14530c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14531d;

        /* renamed from: e, reason: collision with root package name */
        public final int f14532e;

        /* renamed from: f, reason: collision with root package name */
        public final int f14533f;

        /* renamed from: g, reason: collision with root package name */
        public final int f14534g;

        /* renamed from: h, reason: collision with root package name */
        public final int[] f14535h;

        /* renamed from: i, reason: collision with root package name */
        public final int f14536i;

        /* renamed from: j, reason: collision with root package name */
        public final int f14537j;

        /* renamed from: k, reason: collision with root package name */
        public final int f14538k;

        /* renamed from: l, reason: collision with root package name */
        public final int f14539l;

        /* renamed from: m, reason: collision with root package name */
        public final float f14540m;

        /* renamed from: n, reason: collision with root package name */
        public final int f14541n;

        /* renamed from: o, reason: collision with root package name */
        public final int f14542o;

        /* renamed from: p, reason: collision with root package name */
        public final int f14543p;

        /* renamed from: q, reason: collision with root package name */
        public final int f14544q;

        public a(int i7, boolean z7, int i8, int i9, int i10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f7, int i17, int i18, int i19, int i20) {
            this.f14528a = i7;
            this.f14529b = z7;
            this.f14530c = i8;
            this.f14531d = i9;
            this.f14532e = i10;
            this.f14533f = i11;
            this.f14534g = i12;
            this.f14535h = iArr;
            this.f14536i = i13;
            this.f14537j = i14;
            this.f14538k = i15;
            this.f14539l = i16;
            this.f14540m = f7;
            this.f14541n = i17;
            this.f14542o = i18;
            this.f14543p = i19;
            this.f14544q = i20;
        }
    }

    /* renamed from: h0.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f14545a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14546b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f14547c;

        public b(int i7, int i8, boolean z7) {
            this.f14545a = i7;
            this.f14546b = i8;
            this.f14547c = z7;
        }
    }

    /* renamed from: h0.d$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f14548a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14549b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14550c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14551d;

        /* renamed from: e, reason: collision with root package name */
        public final int f14552e;

        /* renamed from: f, reason: collision with root package name */
        public final int f14553f;

        /* renamed from: g, reason: collision with root package name */
        public final int f14554g;

        /* renamed from: h, reason: collision with root package name */
        public final float f14555h;

        /* renamed from: i, reason: collision with root package name */
        public final int f14556i;

        /* renamed from: j, reason: collision with root package name */
        public final int f14557j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f14558k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f14559l;

        /* renamed from: m, reason: collision with root package name */
        public final int f14560m;

        /* renamed from: n, reason: collision with root package name */
        public final int f14561n;

        /* renamed from: o, reason: collision with root package name */
        public final int f14562o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f14563p;

        /* renamed from: q, reason: collision with root package name */
        public final int f14564q;

        /* renamed from: r, reason: collision with root package name */
        public final int f14565r;

        /* renamed from: s, reason: collision with root package name */
        public final int f14566s;

        /* renamed from: t, reason: collision with root package name */
        public final int f14567t;

        public c(int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f7, int i14, int i15, boolean z7, boolean z8, int i16, int i17, int i18, boolean z9, int i19, int i20, int i21, int i22) {
            this.f14548a = i7;
            this.f14549b = i8;
            this.f14550c = i9;
            this.f14551d = i10;
            this.f14552e = i11;
            this.f14553f = i12;
            this.f14554g = i13;
            this.f14555h = f7;
            this.f14556i = i14;
            this.f14557j = i15;
            this.f14558k = z7;
            this.f14559l = z8;
            this.f14560m = i16;
            this.f14561n = i17;
            this.f14562o = i18;
            this.f14563p = z9;
            this.f14564q = i19;
            this.f14565r = i20;
            this.f14566s = i21;
            this.f14567t = i22;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = i7 + 1;
            if (i9 >= position) {
                byteBuffer.clear();
                return;
            }
            int i10 = byteBuffer.get(i7) & 255;
            if (i8 == 3) {
                if (i10 == 1 && (byteBuffer.get(i9) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i7 - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i10 == 0) {
                i8++;
            }
            if (i10 != 0) {
                i8 = 0;
            }
            i7 = i9;
        }
    }

    public static int c(byte[] bArr, int i7, int i8, boolean[] zArr) {
        int i9 = i8 - i7;
        AbstractC1297a.f(i9 >= 0);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            a(zArr);
            return i7 - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            a(zArr);
            return i7 - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            a(zArr);
            return i7 - 1;
        }
        int i10 = i8 - 1;
        int i11 = i7 + 2;
        while (i11 < i10) {
            byte b7 = bArr[i11];
            if ((b7 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b7 == 1) {
                    a(zArr);
                    return i12;
                }
                i11 -= 2;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i8 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i8 + (-3)] == 0 && bArr[i8 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i8 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i8;
    }

    public static int d(byte[] bArr, int i7, int i8) {
        while (i7 < i8 - 2) {
            if (bArr[i7] == 0 && bArr[i7 + 1] == 0 && bArr[i7 + 2] == 3) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static int e(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i7) {
        return bArr[i7 + 3] & 31;
    }

    public static boolean g(String str, byte b7) {
        if ("video/avc".equals(str) && (b7 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b7 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i7, int i8) {
        return i(bArr, i7 + 2, i8);
    }

    public static a i(byte[] bArr, int i7, int i8) {
        float f7;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C1330e c1330e = new C1330e(bArr, i7, i8);
        c1330e.l(4);
        int e7 = c1330e.e(3);
        c1330e.k();
        int e8 = c1330e.e(2);
        boolean d7 = c1330e.d();
        int e9 = c1330e.e(5);
        int i14 = 0;
        for (int i15 = 0; i15 < 32; i15++) {
            if (c1330e.d()) {
                i14 |= 1 << i15;
            }
        }
        int[] iArr = new int[6];
        for (int i16 = 0; i16 < 6; i16++) {
            iArr[i16] = c1330e.e(8);
        }
        int e10 = c1330e.e(8);
        int i17 = 0;
        for (int i18 = 0; i18 < e7; i18++) {
            if (c1330e.d()) {
                i17 += 89;
            }
            if (c1330e.d()) {
                i17 += 8;
            }
        }
        c1330e.l(i17);
        if (e7 > 0) {
            c1330e.l((8 - e7) * 2);
        }
        int h7 = c1330e.h();
        int h8 = c1330e.h();
        if (h8 == 3) {
            c1330e.k();
        }
        int h9 = c1330e.h();
        int h10 = c1330e.h();
        if (c1330e.d()) {
            int h11 = c1330e.h();
            int h12 = c1330e.h();
            int h13 = c1330e.h();
            int h14 = c1330e.h();
            h9 -= ((h8 == 1 || h8 == 2) ? 2 : 1) * (h11 + h12);
            h10 -= (h8 == 1 ? 2 : 1) * (h13 + h14);
        }
        int i19 = h10;
        int i20 = h9;
        int i21 = i19;
        int h15 = c1330e.h();
        int h16 = c1330e.h();
        int h17 = c1330e.h();
        int i22 = -1;
        int i23 = c1330e.d() ? 0 : e7;
        int i24 = -1;
        while (true) {
            c1330e.h();
            if (i23 > e7) {
                break;
            }
            i24 = Math.max(c1330e.h(), i24);
            c1330e.h();
            i23++;
        }
        c1330e.h();
        c1330e.h();
        c1330e.h();
        c1330e.h();
        c1330e.h();
        if (c1330e.d() && c1330e.d()) {
            n(c1330e);
        }
        c1330e.l(2);
        if (c1330e.d()) {
            c1330e.l(8);
            c1330e.h();
            c1330e.h();
            c1330e.k();
        }
        q(c1330e);
        if (c1330e.d()) {
            int h18 = c1330e.h();
            for (int i25 = 0; i25 < h18; i25++) {
                c1330e.l(h17 + 5);
            }
        }
        c1330e.l(2);
        float f8 = 1.0f;
        if (c1330e.d()) {
            if (c1330e.d()) {
                int e11 = c1330e.e(8);
                if (e11 == 255) {
                    int e12 = c1330e.e(16);
                    int e13 = c1330e.e(16);
                    if (e12 != 0 && e13 != 0) {
                        f8 = e12 / e13;
                    }
                } else {
                    float[] fArr = f14525b;
                    if (e11 < fArr.length) {
                        f8 = fArr[e11];
                    } else {
                        o.h("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e11);
                    }
                }
            }
            if (c1330e.d()) {
                c1330e.k();
            }
            if (c1330e.d()) {
                c1330e.l(3);
                i13 = c1330e.d() ? 1 : 2;
                if (c1330e.d()) {
                    int e14 = c1330e.e(8);
                    int e15 = c1330e.e(8);
                    c1330e.l(8);
                    i22 = C1185h.j(e14);
                    i12 = C1185h.k(e15);
                } else {
                    i12 = -1;
                }
            } else {
                i12 = -1;
                i13 = -1;
            }
            if (c1330e.d()) {
                c1330e.h();
                c1330e.h();
            }
            c1330e.k();
            if (c1330e.d()) {
                i21 *= 2;
            }
            i11 = i12;
            i10 = i13;
            f7 = f8;
            i9 = i21;
        } else {
            f7 = 1.0f;
            i9 = i21;
            i10 = -1;
            i11 = -1;
        }
        return new a(e8, d7, e9, i14, h8, h15, h16, iArr, e10, h7, i20, i9, f7, i24, i22, i10, i11);
    }

    public static b j(byte[] bArr, int i7, int i8) {
        return k(bArr, i7 + 1, i8);
    }

    public static b k(byte[] bArr, int i7, int i8) {
        C1330e c1330e = new C1330e(bArr, i7, i8);
        int h7 = c1330e.h();
        int h8 = c1330e.h();
        c1330e.k();
        return new b(h7, h8, c1330e.d());
    }

    public static c l(byte[] bArr, int i7, int i8) {
        return m(bArr, i7 + 1, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h0.AbstractC1329d.c m(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.AbstractC1329d.m(byte[], int, int):h0.d$c");
    }

    public static void n(C1330e c1330e) {
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = 0;
            while (i8 < 6) {
                int i9 = 1;
                if (c1330e.d()) {
                    int min = Math.min(64, 1 << ((i7 << 1) + 4));
                    if (i7 > 1) {
                        c1330e.g();
                    }
                    for (int i10 = 0; i10 < min; i10++) {
                        c1330e.g();
                    }
                } else {
                    c1330e.h();
                }
                if (i7 == 3) {
                    i9 = 3;
                }
                i8 += i9;
            }
        }
    }

    public static void o(C1330e c1330e) {
        int h7 = c1330e.h() + 1;
        c1330e.l(8);
        for (int i7 = 0; i7 < h7; i7++) {
            c1330e.h();
            c1330e.h();
            c1330e.k();
        }
        c1330e.l(20);
    }

    public static void p(C1330e c1330e, int i7) {
        int i8 = 8;
        int i9 = 8;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i8 != 0) {
                i8 = ((c1330e.g() + i9) + 256) % 256;
            }
            if (i8 != 0) {
                i9 = i8;
            }
        }
    }

    public static void q(C1330e c1330e) {
        int h7 = c1330e.h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < h7; i9++) {
            if (i9 == 0 || !c1330e.d()) {
                int h8 = c1330e.h();
                int h9 = c1330e.h();
                int[] iArr3 = new int[h8];
                int i10 = 0;
                while (i10 < h8) {
                    iArr3[i10] = (i10 > 0 ? iArr3[i10 - 1] : 0) - (c1330e.h() + 1);
                    c1330e.k();
                    i10++;
                }
                int[] iArr4 = new int[h9];
                int i11 = 0;
                while (i11 < h9) {
                    iArr4[i11] = (i11 > 0 ? iArr4[i11 - 1] : 0) + c1330e.h() + 1;
                    c1330e.k();
                    i11++;
                }
                i7 = h8;
                iArr = iArr3;
                i8 = h9;
                iArr2 = iArr4;
            } else {
                int i12 = i7 + i8;
                int h10 = (1 - ((c1330e.d() ? 1 : 0) * 2)) * (c1330e.h() + 1);
                int i13 = i12 + 1;
                boolean[] zArr = new boolean[i13];
                for (int i14 = 0; i14 <= i12; i14++) {
                    if (c1330e.d()) {
                        zArr[i14] = true;
                    } else {
                        zArr[i14] = c1330e.d();
                    }
                }
                int[] iArr5 = new int[i13];
                int[] iArr6 = new int[i13];
                int i15 = 0;
                for (int i16 = i8 - 1; i16 >= 0; i16--) {
                    int i17 = iArr2[i16] + h10;
                    if (i17 < 0 && zArr[i7 + i16]) {
                        iArr5[i15] = i17;
                        i15++;
                    }
                }
                if (h10 < 0 && zArr[i12]) {
                    iArr5[i15] = h10;
                    i15++;
                }
                for (int i18 = 0; i18 < i7; i18++) {
                    int i19 = iArr[i18] + h10;
                    if (i19 < 0 && zArr[i18]) {
                        iArr5[i15] = i19;
                        i15++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i15);
                int i20 = 0;
                for (int i21 = i7 - 1; i21 >= 0; i21--) {
                    int i22 = iArr[i21] + h10;
                    if (i22 > 0 && zArr[i21]) {
                        iArr6[i20] = i22;
                        i20++;
                    }
                }
                if (h10 > 0 && zArr[i12]) {
                    iArr6[i20] = h10;
                    i20++;
                }
                for (int i23 = 0; i23 < i8; i23++) {
                    int i24 = iArr2[i23] + h10;
                    if (i24 > 0 && zArr[i7 + i23]) {
                        iArr6[i20] = i24;
                        i20++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr6, i20);
                iArr = copyOf;
                i7 = i15;
                i8 = i20;
            }
        }
    }

    public static int r(byte[] bArr, int i7) {
        int i8;
        synchronized (f14526c) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                try {
                    i9 = d(bArr, i9, i7);
                    if (i9 < i7) {
                        int[] iArr = f14527d;
                        if (iArr.length <= i10) {
                            f14527d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f14527d[i10] = i9;
                        i9 += 3;
                        i10++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i8 = i7 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = f14527d[i13] - i12;
                System.arraycopy(bArr, i12, bArr, i11, i14);
                int i15 = i11 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i11 = i15 + 2;
                bArr[i16] = 0;
                i12 += i14 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i11, i8 - i11);
        }
        return i8;
    }
}
