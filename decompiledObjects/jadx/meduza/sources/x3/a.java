package x3;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import v3.a1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f16888a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16889b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: x3.a$a, reason: collision with other inner class name */
    public static final class C0259a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16890a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16891b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16892c;

        public C0259a(int i10, int i11, String str) {
            this.f16890a = i10;
            this.f16891b = i11;
            this.f16892c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & R.styleable.AppCompatTheme_windowFixedHeightMajor))};
    }

    public static int b(v5.t tVar) {
        int g10 = tVar.g(4);
        if (g10 == 15) {
            if (tVar.b() >= 24) {
                return tVar.g(24);
            }
            throw a1.a("AAC header insufficient data", null);
        }
        if (g10 < 13) {
            return f16888a[g10];
        }
        throw a1.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static C0259a c(v5.t tVar, boolean z10) {
        int g10 = tVar.g(5);
        if (g10 == 31) {
            g10 = tVar.g(6) + 32;
        }
        int b10 = b(tVar);
        int g11 = tVar.g(4);
        String h10 = defpackage.f.h("mp4a.40.", g10);
        if (g10 == 5 || g10 == 29) {
            b10 = b(tVar);
            int g12 = tVar.g(5);
            if (g12 == 31) {
                g12 = tVar.g(6) + 32;
            }
            g10 = g12;
            if (g10 == 22) {
                g11 = tVar.g(4);
            }
        }
        if (z10) {
            if (g10 != 1 && g10 != 2 && g10 != 3 && g10 != 4 && g10 != 6 && g10 != 7 && g10 != 17) {
                switch (g10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw a1.c("Unsupported audio object type: " + g10);
                }
            }
            if (tVar.f()) {
                v5.m.f("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (tVar.f()) {
                tVar.m(14);
            }
            boolean f = tVar.f();
            if (g11 == 0) {
                throw new UnsupportedOperationException();
            }
            if (g10 == 6 || g10 == 20) {
                tVar.m(3);
            }
            if (f) {
                if (g10 == 22) {
                    tVar.m(16);
                }
                if (g10 == 17 || g10 == 19 || g10 == 20 || g10 == 23) {
                    tVar.m(3);
                }
                tVar.m(1);
            }
            switch (g10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int g13 = tVar.g(2);
                    if (g13 == 2 || g13 == 3) {
                        throw a1.c("Unsupported epConfig: " + g13);
                    }
            }
        }
        int i10 = f16889b[g11];
        if (i10 != -1) {
            return new C0259a(b10, i10, h10);
        }
        throw a1.a(null, null);
    }
}
