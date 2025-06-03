package F0;

import d0.C1162A;
import d0.C1190m;
import d0.C1194q;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: F0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0371p {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1942a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1943b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1944c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1945d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1946e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1947f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1948g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f1949h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f1950i = {5, 8, 10, 12};

    /* renamed from: F0.p$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f1951a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1952b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1953c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1954d;

        /* renamed from: e, reason: collision with root package name */
        public final long f1955e;

        /* renamed from: f, reason: collision with root package name */
        public final int f1956f;

        public b(String str, int i7, int i8, int i9, long j7, int i10) {
            this.f1951a = str;
            this.f1953c = i7;
            this.f1952b = i8;
            this.f1954d = i9;
            this.f1955e = j7;
            this.f1956f = i10;
        }
    }

    public static void a(byte[] bArr, int i7) {
        int i8 = i7 - 2;
        if (((bArr[i7 - 1] & 255) | ((bArr[i8] << 8) & 65535)) != g0.M.v(bArr, 0, i8, 65535)) {
            throw C1162A.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.AbstractC0371p.b(byte[]):int");
    }

    public static int c(int i7) {
        if (i7 == 2147385345 || i7 == -25230976 || i7 == 536864768 || i7 == -14745368) {
            return 1;
        }
        if (i7 == 1683496997 || i7 == 622876772) {
            return 2;
        }
        if (i7 == 1078008818 || i7 == -233094848) {
            return 3;
        }
        return (i7 == 1908687592 || i7 == -398277519) ? 4 : 0;
    }

    public static g0.y d(byte[] bArr) {
        byte b7 = bArr[0];
        if (b7 == Byte.MAX_VALUE || b7 == 100 || b7 == 64 || b7 == 113) {
            return new g0.y(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(copyOf)) {
            for (int i7 = 0; i7 < copyOf.length - 1; i7 += 2) {
                byte b8 = copyOf[i7];
                int i8 = i7 + 1;
                copyOf[i7] = copyOf[i8];
                copyOf[i8] = b8;
            }
        }
        g0.y yVar = new g0.y(copyOf);
        if (copyOf[0] == 31) {
            g0.y yVar2 = new g0.y(copyOf);
            while (yVar2.b() >= 16) {
                yVar2.r(2);
                yVar.f(yVar2.h(14), 14);
            }
        }
        yVar.n(copyOf);
        return yVar;
    }

    public static boolean e(byte[] bArr) {
        byte b7 = bArr[0];
        return b7 == -2 || b7 == -1 || b7 == 37 || b7 == -14 || b7 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position = byteBuffer.position();
        byte b7 = byteBuffer.get(position);
        if (b7 != -2) {
            if (b7 == -1) {
                i7 = (byteBuffer.get(position + 4) & 7) << 4;
                i10 = position + 7;
            } else if (b7 != 31) {
                i7 = (byteBuffer.get(position + 4) & 1) << 6;
                i8 = position + 5;
            } else {
                i7 = (byteBuffer.get(position + 5) & 7) << 4;
                i10 = position + 6;
            }
            i9 = byteBuffer.get(i10) & 60;
            return (((i9 >> 2) | i7) + 1) * 32;
        }
        i7 = (byteBuffer.get(position + 5) & 1) << 6;
        i8 = position + 4;
        i9 = byteBuffer.get(i8) & 252;
        return (((i9 >> 2) | i7) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i7;
        byte b7;
        int i8;
        byte b8;
        byte b9 = bArr[0];
        if (b9 != -2) {
            if (b9 == -1) {
                i7 = (bArr[4] & 7) << 4;
                b8 = bArr[7];
            } else if (b9 != 31) {
                i7 = (bArr[4] & 1) << 6;
                b7 = bArr[5];
            } else {
                i7 = (bArr[5] & 7) << 4;
                b8 = bArr[6];
            }
            i8 = b8 & 60;
            return (((i8 >> 2) | i7) + 1) * 32;
        }
        i7 = (bArr[5] & 1) << 6;
        b7 = bArr[4];
        i8 = b7 & 252;
        return (((i8 >> 2) | i7) + 1) * 32;
    }

    public static C1194q h(byte[] bArr, String str, String str2, int i7, C1190m c1190m) {
        g0.y d7 = d(bArr);
        d7.r(60);
        int i8 = f1942a[d7.h(6)];
        int i9 = f1943b[d7.h(4)];
        int h7 = d7.h(5);
        int[] iArr = f1944c;
        int i10 = h7 >= iArr.length ? -1 : (iArr[h7] * 1000) / 2;
        d7.r(10);
        return new C1194q.b().a0(str).o0("audio/vnd.dts").M(i10).N(i8 + (d7.h(2) > 0 ? 1 : 0)).p0(i9).U(c1190m).e0(str2).m0(i7).K();
    }

    public static b i(byte[] bArr) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j7;
        int i12;
        g0.y d7 = d(bArr);
        d7.r(40);
        int h7 = d7.h(2);
        if (d7.g()) {
            i7 = 20;
            i8 = 12;
        } else {
            i7 = 16;
            i8 = 8;
        }
        d7.r(i8);
        int h8 = d7.h(i7) + 1;
        boolean g7 = d7.g();
        int i13 = 0;
        if (g7) {
            i9 = d7.h(2);
            int h9 = (d7.h(3) + 1) * 512;
            if (d7.g()) {
                d7.r(36);
            }
            int h10 = d7.h(3) + 1;
            int h11 = d7.h(3) + 1;
            if (h10 != 1 || h11 != 1) {
                throw C1162A.d("Multiple audio presentations or assets not supported");
            }
            int i14 = h7 + 1;
            int h12 = d7.h(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                if (((h12 >> i15) & 1) == 1) {
                    d7.r(8);
                }
            }
            if (d7.g()) {
                d7.r(2);
                int h13 = (d7.h(2) + 1) << 2;
                int h14 = d7.h(2) + 1;
                while (i13 < h14) {
                    d7.r(h13);
                    i13++;
                }
            }
            i13 = h9;
        } else {
            i9 = -1;
        }
        d7.r(i7);
        d7.r(12);
        if (g7) {
            if (d7.g()) {
                d7.r(4);
            }
            if (d7.g()) {
                d7.r(24);
            }
            if (d7.g()) {
                d7.s(d7.h(10) + 1);
            }
            d7.r(5);
            int i16 = f1945d[d7.h(4)];
            i11 = d7.h(8) + 1;
            i10 = i16;
        } else {
            i10 = -2147483647;
            i11 = -1;
        }
        if (g7) {
            if (i9 == 0) {
                i12 = 32000;
            } else if (i9 == 1) {
                i12 = 44100;
            } else {
                if (i9 != 2) {
                    throw C1162A.a("Unsupported reference clock code in DTS HD header: " + i9, null);
                }
                i12 = 48000;
            }
            j7 = g0.M.W0(i13, 1000000L, i12);
        } else {
            j7 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", i11, i10, h8, j7, 0);
    }

    public static int j(byte[] bArr) {
        g0.y d7 = d(bArr);
        d7.r(42);
        return d7.h(d7.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) {
        int i7;
        long j7;
        int i8;
        int i9;
        g0.y d7 = d(bArr);
        int i10 = d7.h(32) == 1078008818 ? 1 : 0;
        int m7 = m(d7, f1946e, true) + 1;
        if (i10 == 0) {
            i7 = -2147483647;
            j7 = -9223372036854775807L;
        } else {
            if (!d7.g()) {
                throw C1162A.d("Only supports full channel mask-based audio presentation");
            }
            a(bArr, m7);
            int h7 = d7.h(2);
            if (h7 == 0) {
                i8 = 512;
            } else if (h7 == 1) {
                i8 = 480;
            } else {
                if (h7 != 2) {
                    throw C1162A.a("Unsupported base duration index in DTS UHD header: " + h7, null);
                }
                i8 = 384;
            }
            int h8 = i8 * (d7.h(3) + 1);
            int h9 = d7.h(2);
            if (h9 == 0) {
                i9 = 32000;
            } else if (h9 == 1) {
                i9 = 44100;
            } else {
                if (h9 != 2) {
                    throw C1162A.a("Unsupported clock rate index in DTS UHD header: " + h9, null);
                }
                i9 = 48000;
            }
            if (d7.g()) {
                d7.r(36);
            }
            i7 = (1 << d7.h(2)) * i9;
            j7 = g0.M.W0(h8, 1000000L, i9);
        }
        int i11 = i7;
        long j8 = j7;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += m(d7, f1947f, true);
        }
        if (i10 != 0) {
            atomicInteger.set(m(d7, f1948g, true));
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i11, m7 + i12 + (atomicInteger.get() != 0 ? m(d7, f1949h, true) : 0), j8, 0);
    }

    public static int l(byte[] bArr) {
        g0.y d7 = d(bArr);
        d7.r(32);
        return m(d7, f1950i, true) + 1;
    }

    public static int m(g0.y yVar, int[] iArr, boolean z7) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < 3 && yVar.g(); i9++) {
            i8++;
        }
        if (z7) {
            int i10 = 0;
            while (i7 < i8) {
                i10 += 1 << iArr[i7];
                i7++;
            }
            i7 = i10;
        }
        return i7 + yVar.h(iArr[i8]);
    }
}
