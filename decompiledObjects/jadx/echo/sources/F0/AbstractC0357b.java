package F0;

import d0.C1190m;
import d0.C1194q;
import java.nio.ByteBuffer;

/* renamed from: F0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0357b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1842a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1843b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1844c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1845d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1846e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1847f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: F0.b$b, reason: collision with other inner class name */
    public static final class C0029b {

        /* renamed from: a, reason: collision with root package name */
        public final String f1848a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1849b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1850c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1851d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1852e;

        /* renamed from: f, reason: collision with root package name */
        public final int f1853f;

        /* renamed from: g, reason: collision with root package name */
        public final int f1854g;

        public C0029b(String str, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f1848a = str;
            this.f1849b = i7;
            this.f1851d = i8;
            this.f1850c = i9;
            this.f1852e = i10;
            this.f1853f = i11;
            this.f1854g = i12;
        }
    }

    public static int a(int i7, int i8, int i9) {
        return (i7 * i8) / (i9 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i7 = position; i7 <= limit; i7++) {
            if ((g0.M.O(byteBuffer, i7 + 4) & (-2)) == -126718022) {
                return i7 - position;
            }
        }
        return -1;
    }

    public static int c(int i7, int i8) {
        int i9 = i8 / 2;
        if (i7 < 0) {
            return -1;
        }
        int[] iArr = f1843b;
        if (i7 >= iArr.length || i8 < 0) {
            return -1;
        }
        int[] iArr2 = f1847f;
        if (i9 >= iArr2.length) {
            return -1;
        }
        int i10 = iArr[i7];
        if (i10 == 44100) {
            return (iArr2[i9] + (i8 % 2)) * 2;
        }
        int i11 = f1846e[i9];
        return i10 == 32000 ? i11 * 6 : i11 * 4;
    }

    public static C1194q d(g0.z zVar, String str, String str2, C1190m c1190m) {
        g0.y yVar = new g0.y();
        yVar.m(zVar);
        int i7 = f1843b[yVar.h(2)];
        yVar.r(8);
        int i8 = f1845d[yVar.h(3)];
        if (yVar.h(1) != 0) {
            i8++;
        }
        int i9 = f1846e[yVar.h(5)] * 1000;
        yVar.c();
        zVar.T(yVar.d());
        return new C1194q.b().a0(str).o0("audio/ac3").N(i8).p0(i7).U(c1190m).e0(str2).M(i9).j0(i9).K();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f1842a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0029b f(g0.y yVar) {
        int i7;
        int i8;
        String str;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int e7 = yVar.e();
        yVar.r(40);
        boolean z7 = yVar.h(5) > 10;
        yVar.p(e7);
        int i19 = -1;
        if (z7) {
            yVar.r(16);
            int h7 = yVar.h(2);
            if (h7 == 0) {
                i19 = 0;
            } else if (h7 == 1) {
                i19 = 1;
            } else if (h7 == 2) {
                i19 = 2;
            }
            yVar.r(3);
            int h8 = (yVar.h(11) + 1) * 2;
            int h9 = yVar.h(2);
            if (h9 == 3) {
                i14 = f1844c[yVar.h(2)];
                i13 = 3;
                i15 = 6;
            } else {
                int h10 = yVar.h(2);
                int i20 = f1842a[h10];
                i13 = h10;
                i14 = f1843b[h9];
                i15 = i20;
            }
            int i21 = i15 * 256;
            int a7 = a(h8, i14, i15);
            int h11 = yVar.h(3);
            boolean g7 = yVar.g();
            i7 = f1845d[h11] + (g7 ? 1 : 0);
            yVar.r(10);
            if (yVar.g()) {
                yVar.r(8);
            }
            if (h11 == 0) {
                yVar.r(5);
                if (yVar.g()) {
                    yVar.r(8);
                }
            }
            if (i19 == 1 && yVar.g()) {
                yVar.r(16);
            }
            if (yVar.g()) {
                if (h11 > 2) {
                    yVar.r(2);
                }
                if ((h11 & 1) == 0 || h11 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    yVar.r(6);
                }
                if ((h11 & 4) != 0) {
                    yVar.r(i17);
                }
                if (g7 && yVar.g()) {
                    yVar.r(5);
                }
                if (i19 == 0) {
                    if (yVar.g()) {
                        i18 = 6;
                        yVar.r(6);
                    } else {
                        i18 = 6;
                    }
                    if (h11 == 0 && yVar.g()) {
                        yVar.r(i18);
                    }
                    if (yVar.g()) {
                        yVar.r(i18);
                    }
                    int h12 = yVar.h(2);
                    if (h12 == 1) {
                        yVar.r(5);
                    } else if (h12 == 2) {
                        yVar.r(12);
                    } else if (h12 == 3) {
                        int h13 = yVar.h(5);
                        if (yVar.g()) {
                            yVar.r(5);
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                if (yVar.g()) {
                                    yVar.r(4);
                                }
                                if (yVar.g()) {
                                    yVar.r(4);
                                }
                            }
                        }
                        if (yVar.g()) {
                            yVar.r(5);
                            if (yVar.g()) {
                                yVar.r(7);
                                if (yVar.g()) {
                                    yVar.r(8);
                                }
                            }
                        }
                        yVar.r((h13 + 2) * 8);
                        yVar.c();
                    }
                    if (h11 < 2) {
                        if (yVar.g()) {
                            yVar.r(14);
                        }
                        if (h11 == 0 && yVar.g()) {
                            yVar.r(14);
                        }
                    }
                    if (yVar.g()) {
                        if (i13 == 0) {
                            yVar.r(5);
                        } else {
                            for (int i22 = 0; i22 < i15; i22++) {
                                if (yVar.g()) {
                                    yVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (yVar.g()) {
                yVar.r(5);
                if (h11 == 2) {
                    yVar.r(4);
                }
                if (h11 >= 6) {
                    yVar.r(2);
                }
                if (yVar.g()) {
                    yVar.r(8);
                }
                if (h11 == 0 && yVar.g()) {
                    yVar.r(8);
                }
                if (h9 < 3) {
                    yVar.q();
                }
            }
            if (i19 == 0 && i13 != 3) {
                yVar.q();
            }
            if (i19 == 2 && (i13 == 3 || yVar.g())) {
                i16 = 6;
                yVar.r(6);
            } else {
                i16 = 6;
            }
            str = (yVar.g() && yVar.h(i16) == 1 && yVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i8 = i19;
            i9 = i21;
            i11 = h8;
            i12 = i14;
            i10 = a7;
        } else {
            yVar.r(32);
            int h14 = yVar.h(2);
            String str2 = h14 == 3 ? null : "audio/ac3";
            int h15 = yVar.h(6);
            int i23 = f1846e[h15 / 2] * 1000;
            int c7 = c(h14, h15);
            yVar.r(8);
            int h16 = yVar.h(3);
            if ((h16 & 1) != 0 && h16 != 1) {
                yVar.r(2);
            }
            if ((h16 & 4) != 0) {
                yVar.r(2);
            }
            if (h16 == 2) {
                yVar.r(2);
            }
            int[] iArr = f1843b;
            int i24 = h14 < iArr.length ? iArr[h14] : -1;
            i7 = f1845d[h16] + (yVar.g() ? 1 : 0);
            i8 = -1;
            str = str2;
            i9 = 1536;
            i10 = i23;
            i11 = c7;
            i12 = i24;
        }
        return new C0029b(str, i8, i7, i12, i11, i9, i10);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b7 = bArr[4];
        return c((b7 & 192) >> 6, b7 & 63);
    }

    public static C1194q h(g0.z zVar, String str, String str2, C1190m c1190m) {
        String str3;
        g0.y yVar = new g0.y();
        yVar.m(zVar);
        int h7 = yVar.h(13) * 1000;
        yVar.r(3);
        int i7 = f1843b[yVar.h(2)];
        yVar.r(10);
        int i8 = f1845d[yVar.h(3)];
        if (yVar.h(1) != 0) {
            i8++;
        }
        yVar.r(3);
        int h8 = yVar.h(4);
        yVar.r(1);
        if (h8 > 0) {
            yVar.r(6);
            if (yVar.h(1) != 0) {
                i8 += 2;
            }
            yVar.r(1);
        }
        if (yVar.b() > 7) {
            yVar.r(7);
            if (yVar.h(1) != 0) {
                str3 = "audio/eac3-joc";
                yVar.c();
                zVar.T(yVar.d());
                return new C1194q.b().a0(str).o0(str3).N(i8).p0(i7).U(c1190m).e0(str2).j0(h7).K();
            }
        }
        str3 = "audio/eac3";
        yVar.c();
        zVar.T(yVar.d());
        return new C1194q.b().a0(str).o0(str3).N(i8).p0(i7).U(c1190m).e0(str2).j0(h7).K();
    }

    public static int i(ByteBuffer byteBuffer, int i7) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i7) + ((byteBuffer.get((byteBuffer.position() + i7) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b7 = bArr[7];
            if ((b7 & 254) == 186) {
                return 40 << ((bArr[(b7 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
