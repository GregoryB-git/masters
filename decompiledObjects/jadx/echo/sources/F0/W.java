package F0;

import X2.AbstractC0703v;
import android.util.Base64;
import d0.C1162A;
import d0.C1201x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class W {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f1820a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f1821b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1822c;

        public a(String str, String[] strArr, int i7) {
            this.f1820a = str;
            this.f1821b = strArr;
            this.f1822c = i7;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1823a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1824b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1825c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1826d;

        public b(boolean z7, int i7, int i8, int i9) {
            this.f1823a = z7;
            this.f1824b = i7;
            this.f1825c = i8;
            this.f1826d = i9;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f1827a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1828b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1829c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1830d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1831e;

        /* renamed from: f, reason: collision with root package name */
        public final int f1832f;

        /* renamed from: g, reason: collision with root package name */
        public final int f1833g;

        /* renamed from: h, reason: collision with root package name */
        public final int f1834h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f1835i;

        /* renamed from: j, reason: collision with root package name */
        public final byte[] f1836j;

        public c(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7, byte[] bArr) {
            this.f1827a = i7;
            this.f1828b = i8;
            this.f1829c = i9;
            this.f1830d = i10;
            this.f1831e = i11;
            this.f1832f = i12;
            this.f1833g = i13;
            this.f1834h = i14;
            this.f1835i = z7;
            this.f1836j = bArr;
        }
    }

    public static int[] a(int i7) {
        if (i7 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i7 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i7 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i7 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i7 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i8++;
            i7 >>>= 1;
        }
        return i8;
    }

    public static long c(long j7, long j8) {
        return (long) Math.floor(Math.pow(j7, 1.0d / j8));
    }

    public static C1201x d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            String[] c12 = g0.M.c1(str, "=");
            if (c12.length != 2) {
                g0.o.h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (c12[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(R0.a.a(new g0.z(Base64.decode(c12[1], 0))));
                } catch (RuntimeException e7) {
                    g0.o.i("VorbisUtil", "Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new W0.a(c12[0], c12[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1201x(arrayList);
    }

    public static AbstractC0703v e(byte[] bArr) {
        g0.z zVar = new g0.z(bArr);
        zVar.U(1);
        int i7 = 0;
        while (zVar.a() > 0 && zVar.j() == 255) {
            i7 += 255;
            zVar.U(1);
        }
        int G6 = i7 + zVar.G();
        int i8 = 0;
        while (zVar.a() > 0 && zVar.j() == 255) {
            i8 += 255;
            zVar.U(1);
        }
        int G7 = i8 + zVar.G();
        byte[] bArr2 = new byte[G6];
        int f7 = zVar.f();
        System.arraycopy(bArr, f7, bArr2, 0, G6);
        int i9 = f7 + G6 + G7;
        int length = bArr.length - i9;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i9, bArr3, 0, length);
        return AbstractC0703v.a0(bArr2, bArr3);
    }

    public static void f(V v7) {
        int d7 = v7.d(6) + 1;
        for (int i7 = 0; i7 < d7; i7++) {
            int d8 = v7.d(16);
            if (d8 == 0) {
                v7.e(8);
                v7.e(16);
                v7.e(16);
                v7.e(6);
                v7.e(8);
                int d9 = v7.d(4) + 1;
                for (int i8 = 0; i8 < d9; i8++) {
                    v7.e(8);
                }
            } else {
                if (d8 != 1) {
                    throw C1162A.a("floor type greater than 1 not decodable: " + d8, null);
                }
                int d10 = v7.d(5);
                int[] iArr = new int[d10];
                int i9 = -1;
                for (int i10 = 0; i10 < d10; i10++) {
                    int d11 = v7.d(4);
                    iArr[i10] = d11;
                    if (d11 > i9) {
                        i9 = d11;
                    }
                }
                int i11 = i9 + 1;
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr2[i12] = v7.d(3) + 1;
                    int d12 = v7.d(2);
                    if (d12 > 0) {
                        v7.e(8);
                    }
                    for (int i13 = 0; i13 < (1 << d12); i13++) {
                        v7.e(8);
                    }
                }
                v7.e(2);
                int d13 = v7.d(4);
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < d10; i16++) {
                    i14 += iArr2[iArr[i16]];
                    while (i15 < i14) {
                        v7.e(d13);
                        i15++;
                    }
                }
            }
        }
    }

    public static void g(int i7, V v7) {
        int d7 = v7.d(6) + 1;
        for (int i8 = 0; i8 < d7; i8++) {
            int d8 = v7.d(16);
            if (d8 != 0) {
                g0.o.c("VorbisUtil", "mapping type other than 0 not supported: " + d8);
            } else {
                int d9 = v7.c() ? v7.d(4) + 1 : 1;
                if (v7.c()) {
                    int d10 = v7.d(8) + 1;
                    for (int i9 = 0; i9 < d10; i9++) {
                        int i10 = i7 - 1;
                        v7.e(b(i10));
                        v7.e(b(i10));
                    }
                }
                if (v7.d(2) != 0) {
                    throw C1162A.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (d9 > 1) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        v7.e(4);
                    }
                }
                for (int i12 = 0; i12 < d9; i12++) {
                    v7.e(8);
                    v7.e(8);
                    v7.e(8);
                }
            }
        }
    }

    public static b[] h(V v7) {
        int d7 = v7.d(6) + 1;
        b[] bVarArr = new b[d7];
        for (int i7 = 0; i7 < d7; i7++) {
            bVarArr[i7] = new b(v7.c(), v7.d(16), v7.d(16), v7.d(8));
        }
        return bVarArr;
    }

    public static void i(V v7) {
        int d7 = v7.d(6) + 1;
        for (int i7 = 0; i7 < d7; i7++) {
            if (v7.d(16) > 2) {
                throw C1162A.a("residueType greater than 2 is not decodable", null);
            }
            v7.e(24);
            v7.e(24);
            v7.e(24);
            int d8 = v7.d(6) + 1;
            v7.e(8);
            int[] iArr = new int[d8];
            for (int i8 = 0; i8 < d8; i8++) {
                iArr[i8] = ((v7.c() ? v7.d(5) : 0) * 8) + v7.d(3);
            }
            for (int i9 = 0; i9 < d8; i9++) {
                for (int i10 = 0; i10 < 8; i10++) {
                    if ((iArr[i9] & (1 << i10)) != 0) {
                        v7.e(8);
                    }
                }
            }
        }
    }

    public static a j(g0.z zVar) {
        return k(zVar, true, true);
    }

    public static a k(g0.z zVar, boolean z7, boolean z8) {
        if (z7) {
            o(3, zVar, false);
        }
        String D7 = zVar.D((int) zVar.w());
        int length = D7.length();
        long w7 = zVar.w();
        String[] strArr = new String[(int) w7];
        int i7 = length + 15;
        for (int i8 = 0; i8 < w7; i8++) {
            String D8 = zVar.D((int) zVar.w());
            strArr[i8] = D8;
            i7 = i7 + 4 + D8.length();
        }
        if (z8 && (zVar.G() & 1) == 0) {
            throw C1162A.a("framing bit expected to be set", null);
        }
        return new a(D7, strArr, i7 + 1);
    }

    public static c l(g0.z zVar) {
        o(1, zVar, false);
        int x7 = zVar.x();
        int G6 = zVar.G();
        int x8 = zVar.x();
        int t7 = zVar.t();
        if (t7 <= 0) {
            t7 = -1;
        }
        int t8 = zVar.t();
        if (t8 <= 0) {
            t8 = -1;
        }
        int t9 = zVar.t();
        if (t9 <= 0) {
            t9 = -1;
        }
        int G7 = zVar.G();
        return new c(x7, G6, x8, t7, t8, t9, (int) Math.pow(2.0d, G7 & 15), (int) Math.pow(2.0d, (G7 & 240) >> 4), (zVar.G() & 1) > 0, Arrays.copyOf(zVar.e(), zVar.g()));
    }

    public static b[] m(g0.z zVar, int i7) {
        o(5, zVar, false);
        int G6 = zVar.G() + 1;
        V v7 = new V(zVar.e());
        v7.e(zVar.f() * 8);
        for (int i8 = 0; i8 < G6; i8++) {
            n(v7);
        }
        int d7 = v7.d(6) + 1;
        for (int i9 = 0; i9 < d7; i9++) {
            if (v7.d(16) != 0) {
                throw C1162A.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(v7);
        i(v7);
        g(i7, v7);
        b[] h7 = h(v7);
        if (v7.c()) {
            return h7;
        }
        throw C1162A.a("framing bit after modes not set as expected", null);
    }

    public static void n(V v7) {
        if (v7.d(24) != 5653314) {
            throw C1162A.a("expected code book to start with [0x56, 0x43, 0x42] at " + v7.b(), null);
        }
        int d7 = v7.d(16);
        int d8 = v7.d(24);
        int i7 = 0;
        if (v7.c()) {
            v7.e(5);
            while (i7 < d8) {
                i7 += v7.d(b(d8 - i7));
            }
        } else {
            boolean c7 = v7.c();
            while (i7 < d8) {
                if (!c7 || v7.c()) {
                    v7.e(5);
                }
                i7++;
            }
        }
        int d9 = v7.d(4);
        if (d9 > 2) {
            throw C1162A.a("lookup type greater than 2 not decodable: " + d9, null);
        }
        if (d9 == 1 || d9 == 2) {
            v7.e(32);
            v7.e(32);
            int d10 = v7.d(4) + 1;
            v7.e(1);
            v7.e((int) ((d9 == 1 ? d7 != 0 ? c(d8, d7) : 0L : d7 * d8) * d10));
        }
    }

    public static boolean o(int i7, g0.z zVar, boolean z7) {
        if (zVar.a() < 7) {
            if (z7) {
                return false;
            }
            throw C1162A.a("too short header: " + zVar.a(), null);
        }
        if (zVar.G() != i7) {
            if (z7) {
                return false;
            }
            throw C1162A.a("expected header type " + Integer.toHexString(i7), null);
        }
        if (zVar.G() == 118 && zVar.G() == 111 && zVar.G() == 114 && zVar.G() == 98 && zVar.G() == 105 && zVar.G() == 115) {
            return true;
        }
        if (z7) {
            return false;
        }
        throw C1162A.a("expected characters 'vorbis'", null);
    }
}
