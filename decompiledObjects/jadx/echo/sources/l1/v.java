package l1;

import com.android.installreferrer.api.InstallReferrerClient;
import d0.C1162A;
import g0.AbstractC1297a;

/* loaded from: classes.dex */
public abstract class v {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f17108a;

        /* renamed from: b, reason: collision with root package name */
        public long f17109b;

        /* renamed from: c, reason: collision with root package name */
        public int f17110c;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f17111a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17112b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17113c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f17114d;

        public c(int i7, int i8, int i9, byte[] bArr) {
            this.f17111a = i7;
            this.f17112b = i8;
            this.f17113c = i9;
            this.f17114d = bArr;
        }
    }

    public static int a(int i7) {
        if (i7 == 0) {
            return 768;
        }
        if (i7 == 1) {
            return 1024;
        }
        if (i7 == 2 || i7 == 3) {
            return 2048;
        }
        if (i7 == 4) {
            return 4096;
        }
        throw C1162A.d("Unsupported coreSbrFrameLengthIndex " + i7);
    }

    public static double b(int i7) {
        switch (i7) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw C1162A.d("Unsupported sampling rate " + i7);
        }
    }

    public static int c(int i7) {
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return 7350;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            default:
                throw C1162A.d("Unsupported sampling rate index " + i7);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    public static int d(int i7) {
        if (i7 == 0 || i7 == 1) {
            return 0;
        }
        int i8 = 2;
        if (i7 != 2) {
            i8 = 3;
            if (i7 != 3) {
                if (i7 == 4) {
                    return 1;
                }
                throw C1162A.d("Unsupported coreSbrFrameLengthIndex " + i7);
            }
        }
        return i8;
    }

    public static boolean e(int i7) {
        return (i7 & 16777215) == 12583333;
    }

    public static int f(g0.y yVar) {
        if (!yVar.g()) {
            return 0;
        }
        yVar.r(2);
        return yVar.h(13);
    }

    public static boolean g(g0.y yVar, b bVar) {
        yVar.d();
        int k7 = k(yVar, 3, 8, 8);
        bVar.f17108a = k7;
        if (k7 == -1) {
            return false;
        }
        long l7 = l(yVar, 2, 8, 32);
        bVar.f17109b = l7;
        if (l7 == -1) {
            return false;
        }
        if (l7 > 16) {
            throw C1162A.d("Contains sub-stream with an invalid packet label " + bVar.f17109b);
        }
        if (l7 == 0) {
            int i7 = bVar.f17108a;
            if (i7 == 1) {
                throw C1162A.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i7 == 2) {
                throw C1162A.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i7 == 17) {
                throw C1162A.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int k8 = k(yVar, 11, 24, 24);
        bVar.f17110c = k8;
        return k8 != -1;
    }

    public static c h(g0.y yVar) {
        int h7 = yVar.h(8);
        int h8 = yVar.h(5);
        int h9 = h8 == 31 ? yVar.h(24) : c(h8);
        int h10 = yVar.h(3);
        int a7 = a(h10);
        int d7 = d(h10);
        yVar.r(2);
        p(yVar);
        m(yVar, j(yVar), d7);
        byte[] bArr = null;
        if (yVar.g()) {
            int k7 = k(yVar, 2, 4, 8) + 1;
            for (int i7 = 0; i7 < k7; i7++) {
                int k8 = k(yVar, 4, 8, 16);
                int k9 = k(yVar, 4, 8, 16);
                if (k8 == 7) {
                    int h11 = yVar.h(4) + 1;
                    yVar.r(4);
                    byte[] bArr2 = new byte[h11];
                    for (int i8 = 0; i8 < h11; i8++) {
                        bArr2[i8] = (byte) yVar.h(8);
                    }
                    bArr = bArr2;
                } else {
                    yVar.r(k9 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double b7 = b(h9);
        return new c(h7, (int) (h9 * b7), (int) (a7 * b7), bArr3);
    }

    public static boolean i(g0.y yVar) {
        yVar.r(3);
        boolean g7 = yVar.g();
        if (g7) {
            yVar.r(13);
        }
        return g7;
    }

    public static int j(g0.y yVar) {
        int h7 = yVar.h(5);
        int i7 = 0;
        for (int i8 = 0; i8 < h7 + 1; i8++) {
            int h8 = yVar.h(3);
            i7 += k(yVar, 5, 8, 16) + 1;
            if ((h8 == 0 || h8 == 2) && yVar.g()) {
                p(yVar);
            }
        }
        return i7;
    }

    public static int k(g0.y yVar, int i7, int i8, int i9) {
        AbstractC1297a.a(Math.max(Math.max(i7, i8), i9) <= 31);
        int i10 = (1 << i7) - 1;
        int i11 = (1 << i8) - 1;
        Z2.d.a(Z2.d.a(i10, i11), 1 << i9);
        if (yVar.b() < i7) {
            return -1;
        }
        int h7 = yVar.h(i7);
        if (h7 != i10) {
            return h7;
        }
        if (yVar.b() < i8) {
            return -1;
        }
        int h8 = yVar.h(i8);
        int i12 = h7 + h8;
        if (h8 != i11) {
            return i12;
        }
        if (yVar.b() < i9) {
            return -1;
        }
        return i12 + yVar.h(i9);
    }

    public static long l(g0.y yVar, int i7, int i8, int i9) {
        AbstractC1297a.a(Math.max(Math.max(i7, i8), i9) <= 63);
        long j7 = (1 << i7) - 1;
        long j8 = (1 << i8) - 1;
        Z2.e.a(Z2.e.a(j7, j8), 1 << i9);
        if (yVar.b() < i7) {
            return -1L;
        }
        long j9 = yVar.j(i7);
        if (j9 != j7) {
            return j9;
        }
        if (yVar.b() < i8) {
            return -1L;
        }
        long j10 = yVar.j(i8);
        long j11 = j9 + j10;
        if (j10 != j8) {
            return j11;
        }
        if (yVar.b() < i9) {
            return -1L;
        }
        return j11 + yVar.j(i9);
    }

    public static void m(g0.y yVar, int i7, int i8) {
        int i9;
        int k7 = k(yVar, 4, 8, 16) + 1;
        yVar.q();
        for (int i10 = 0; i10 < k7; i10++) {
            int h7 = yVar.h(2);
            if (h7 == 0) {
                i(yVar);
                if (i8 > 0) {
                    o(yVar);
                }
            } else if (h7 == 1) {
                if (i(yVar)) {
                    yVar.q();
                }
                if (i8 > 0) {
                    o(yVar);
                    i9 = yVar.h(2);
                } else {
                    i9 = 0;
                }
                if (i9 > 0) {
                    yVar.r(6);
                    int h8 = yVar.h(2);
                    yVar.r(4);
                    if (yVar.g()) {
                        yVar.r(5);
                    }
                    if (i9 == 2 || i9 == 3) {
                        yVar.r(6);
                    }
                    if (h8 == 2) {
                        yVar.q();
                    }
                }
                int floor = ((int) Math.floor(Math.log(i7 - 1) / Math.log(2.0d))) + 1;
                int h9 = yVar.h(2);
                if (h9 > 0 && yVar.g()) {
                    yVar.r(floor);
                }
                if (yVar.g()) {
                    yVar.r(floor);
                }
                if (i8 == 0 && h9 == 0) {
                    yVar.q();
                }
            } else if (h7 == 3) {
                k(yVar, 4, 8, 16);
                int k8 = k(yVar, 4, 8, 16);
                if (yVar.g()) {
                    k(yVar, 8, 16, 0);
                }
                yVar.q();
                if (k8 > 0) {
                    yVar.r(k8 * 8);
                }
            }
        }
    }

    public static void n(g0.y yVar, int i7) {
        int h7;
        boolean g7 = yVar.g();
        int i8 = g7 ? 1 : 5;
        int i9 = g7 ? 7 : 5;
        int i10 = g7 ? 8 : 6;
        int i11 = 0;
        while (i11 < i7) {
            if (yVar.g()) {
                yVar.r(7);
                h7 = 0;
            } else {
                if (yVar.h(2) == 3 && yVar.h(i9) * i8 != 0) {
                    yVar.q();
                }
                h7 = yVar.h(i10) * i8;
                if (h7 != 0 && h7 != 180) {
                    yVar.q();
                }
                yVar.q();
            }
            if (h7 != 0 && h7 != 180 && yVar.g()) {
                i11++;
            }
            i11++;
        }
    }

    public static void o(g0.y yVar) {
        yVar.r(3);
        yVar.r(8);
        boolean g7 = yVar.g();
        boolean g8 = yVar.g();
        if (g7) {
            yVar.r(5);
        }
        if (g8) {
            yVar.r(6);
        }
    }

    public static void p(g0.y yVar) {
        int h7 = yVar.h(2);
        if (h7 == 0) {
            yVar.r(6);
            return;
        }
        int k7 = k(yVar, 5, 8, 16) + 1;
        if (h7 == 1) {
            yVar.r(k7 * 7);
        } else if (h7 == 2) {
            n(yVar, k7);
        }
    }
}
