package F0;

import d0.C1162A;

/* renamed from: F0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0356a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1837a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1838b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: F0.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1839a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1840b;

        /* renamed from: c, reason: collision with root package name */
        public final String f1841c;

        public b(int i7, int i8, String str) {
            this.f1839a = i7;
            this.f1840b = i8;
            this.f1841c = str;
        }
    }

    public static byte[] a(int i7, int i8, int i9) {
        return new byte[]{(byte) (((i7 << 3) & 248) | ((i8 >> 1) & 7)), (byte) (((i8 << 7) & 128) | ((i9 << 3) & 120))};
    }

    public static int b(g0.y yVar) {
        int h7 = yVar.h(5);
        return h7 == 31 ? yVar.h(6) + 32 : h7;
    }

    public static int c(g0.y yVar) {
        int h7 = yVar.h(4);
        if (h7 == 15) {
            if (yVar.b() >= 24) {
                return yVar.h(24);
            }
            throw C1162A.a("AAC header insufficient data", null);
        }
        if (h7 < 13) {
            return f1837a[h7];
        }
        throw C1162A.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(g0.y yVar, boolean z7) {
        int b7 = b(yVar);
        int c7 = c(yVar);
        int h7 = yVar.h(4);
        String str = "mp4a.40." + b7;
        if (b7 == 5 || b7 == 29) {
            c7 = c(yVar);
            b7 = b(yVar);
            if (b7 == 22) {
                h7 = yVar.h(4);
            }
        }
        if (z7) {
            if (b7 != 1 && b7 != 2 && b7 != 3 && b7 != 4 && b7 != 6 && b7 != 7 && b7 != 17) {
                switch (b7) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C1162A.d("Unsupported audio object type: " + b7);
                }
            }
            f(yVar, b7, h7);
            switch (b7) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h8 = yVar.h(2);
                    if (h8 == 2 || h8 == 3) {
                        throw C1162A.d("Unsupported epConfig: " + h8);
                    }
            }
        }
        int i7 = f1838b[h7];
        if (i7 != -1) {
            return new b(c7, i7, str);
        }
        throw C1162A.a(null, null);
    }

    public static b e(byte[] bArr) {
        return d(new g0.y(bArr), false);
    }

    public static void f(g0.y yVar, int i7, int i8) {
        if (yVar.g()) {
            g0.o.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (yVar.g()) {
            yVar.r(14);
        }
        boolean g7 = yVar.g();
        if (i8 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i7 == 6 || i7 == 20) {
            yVar.r(3);
        }
        if (g7) {
            if (i7 == 22) {
                yVar.r(16);
            }
            if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                yVar.r(3);
            }
            yVar.r(1);
        }
    }
}
