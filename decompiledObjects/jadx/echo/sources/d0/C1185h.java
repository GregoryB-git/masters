package d0;

import java.util.Arrays;

/* renamed from: d0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1185h {

    /* renamed from: h, reason: collision with root package name */
    public static final C1185h f12620h = new b().d(1).c(2).e(3).a();

    /* renamed from: i, reason: collision with root package name */
    public static final C1185h f12621i = new b().d(1).c(1).e(2).a();

    /* renamed from: j, reason: collision with root package name */
    public static final String f12622j = g0.M.w0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f12623k = g0.M.w0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f12624l = g0.M.w0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f12625m = g0.M.w0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f12626n = g0.M.w0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final String f12627o = g0.M.w0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f12628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12629b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12630c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f12631d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12632e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12633f;

    /* renamed from: g, reason: collision with root package name */
    public int f12634g;

    /* renamed from: d0.h$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f12635a;

        /* renamed from: b, reason: collision with root package name */
        public int f12636b;

        /* renamed from: c, reason: collision with root package name */
        public int f12637c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f12638d;

        /* renamed from: e, reason: collision with root package name */
        public int f12639e;

        /* renamed from: f, reason: collision with root package name */
        public int f12640f;

        public b() {
            this.f12635a = -1;
            this.f12636b = -1;
            this.f12637c = -1;
            this.f12639e = -1;
            this.f12640f = -1;
        }

        public C1185h a() {
            return new C1185h(this.f12635a, this.f12636b, this.f12637c, this.f12638d, this.f12639e, this.f12640f);
        }

        public b b(int i7) {
            this.f12640f = i7;
            return this;
        }

        public b c(int i7) {
            this.f12636b = i7;
            return this;
        }

        public b d(int i7) {
            this.f12635a = i7;
            return this;
        }

        public b e(int i7) {
            this.f12637c = i7;
            return this;
        }

        public b f(byte[] bArr) {
            this.f12638d = bArr;
            return this;
        }

        public b g(int i7) {
            this.f12639e = i7;
            return this;
        }

        public b(C1185h c1185h) {
            this.f12635a = c1185h.f12628a;
            this.f12636b = c1185h.f12629b;
            this.f12637c = c1185h.f12630c;
            this.f12638d = c1185h.f12631d;
            this.f12639e = c1185h.f12632e;
            this.f12640f = c1185h.f12633f;
        }
    }

    public C1185h(int i7, int i8, int i9, byte[] bArr, int i10, int i11) {
        this.f12628a = i7;
        this.f12629b = i8;
        this.f12630c = i9;
        this.f12631d = bArr;
        this.f12632e = i10;
        this.f12633f = i11;
    }

    public static String b(int i7) {
        if (i7 == -1) {
            return "NA";
        }
        return i7 + "bit Chroma";
    }

    public static String c(int i7) {
        if (i7 == -1) {
            return "Unset color range";
        }
        if (i7 == 1) {
            return "Full range";
        }
        if (i7 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i7;
    }

    public static String d(int i7) {
        if (i7 == -1) {
            return "Unset color space";
        }
        if (i7 == 6) {
            return "BT2020";
        }
        if (i7 == 1) {
            return "BT709";
        }
        if (i7 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i7;
    }

    public static String e(int i7) {
        if (i7 == -1) {
            return "Unset color transfer";
        }
        if (i7 == 10) {
            return "Gamma 2.2";
        }
        if (i7 == 1) {
            return "Linear";
        }
        if (i7 == 2) {
            return "sRGB";
        }
        if (i7 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i7 == 6) {
            return "ST2084 PQ";
        }
        if (i7 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i7;
    }

    public static boolean h(C1185h c1185h) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (c1185h == null) {
            return true;
        }
        int i11 = c1185h.f12628a;
        return (i11 == -1 || i11 == 1 || i11 == 2) && ((i7 = c1185h.f12629b) == -1 || i7 == 2) && (((i8 = c1185h.f12630c) == -1 || i8 == 3) && c1185h.f12631d == null && (((i9 = c1185h.f12633f) == -1 || i9 == 8) && ((i10 = c1185h.f12632e) == -1 || i10 == 8)));
    }

    public static int j(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 4) {
            return 10;
        }
        if (i7 == 13) {
            return 2;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String l(int i7) {
        if (i7 == -1) {
            return "NA";
        }
        return i7 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1185h.class != obj.getClass()) {
            return false;
        }
        C1185h c1185h = (C1185h) obj;
        return this.f12628a == c1185h.f12628a && this.f12629b == c1185h.f12629b && this.f12630c == c1185h.f12630c && Arrays.equals(this.f12631d, c1185h.f12631d) && this.f12632e == c1185h.f12632e && this.f12633f == c1185h.f12633f;
    }

    public boolean f() {
        return (this.f12632e == -1 || this.f12633f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f12628a == -1 || this.f12629b == -1 || this.f12630c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f12634g == 0) {
            this.f12634g = ((((((((((527 + this.f12628a) * 31) + this.f12629b) * 31) + this.f12630c) * 31) + Arrays.hashCode(this.f12631d)) * 31) + this.f12632e) * 31) + this.f12633f;
        }
        return this.f12634g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String G6 = g() ? g0.M.G("%s/%s/%s", d(this.f12628a), c(this.f12629b), e(this.f12630c)) : "NA/NA/NA";
        if (f()) {
            str = this.f12632e + "/" + this.f12633f;
        } else {
            str = "NA/NA";
        }
        return G6 + "/" + str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(d(this.f12628a));
        sb.append(", ");
        sb.append(c(this.f12629b));
        sb.append(", ");
        sb.append(e(this.f12630c));
        sb.append(", ");
        sb.append(this.f12631d != null);
        sb.append(", ");
        sb.append(l(this.f12632e));
        sb.append(", ");
        sb.append(b(this.f12633f));
        sb.append(")");
        return sb.toString();
    }
}
