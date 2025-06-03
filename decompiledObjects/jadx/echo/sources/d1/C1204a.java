package d1;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c1.k;
import c1.p;
import c1.q;
import f0.C1280a;
import g0.AbstractC1297a;
import g0.o;
import g0.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1204a extends e {

    /* renamed from: i, reason: collision with root package name */
    public final int f13028i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13029j;

    /* renamed from: k, reason: collision with root package name */
    public final int f13030k;

    /* renamed from: l, reason: collision with root package name */
    public final long f13031l;

    /* renamed from: o, reason: collision with root package name */
    public List f13034o;

    /* renamed from: p, reason: collision with root package name */
    public List f13035p;

    /* renamed from: q, reason: collision with root package name */
    public int f13036q;

    /* renamed from: r, reason: collision with root package name */
    public int f13037r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13038s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13039t;

    /* renamed from: u, reason: collision with root package name */
    public byte f13040u;

    /* renamed from: v, reason: collision with root package name */
    public byte f13041v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13043x;

    /* renamed from: y, reason: collision with root package name */
    public long f13044y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f13026z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f13019A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f13020B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f13021C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f13022D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f13023E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f13024F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G, reason: collision with root package name */
    public static final boolean[] f13025G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    public final z f13027h = new z();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f13032m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public C0188a f13033n = new C0188a(0, 4);

    /* renamed from: w, reason: collision with root package name */
    public int f13042w = 0;

    /* renamed from: d1.a$a, reason: collision with other inner class name */
    public static final class C0188a {

        /* renamed from: a, reason: collision with root package name */
        public final List f13045a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final List f13046b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final StringBuilder f13047c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        public int f13048d;

        /* renamed from: e, reason: collision with root package name */
        public int f13049e;

        /* renamed from: f, reason: collision with root package name */
        public int f13050f;

        /* renamed from: g, reason: collision with root package name */
        public int f13051g;

        /* renamed from: h, reason: collision with root package name */
        public int f13052h;

        /* renamed from: d1.a$a$a, reason: collision with other inner class name */
        public static class C0189a {

            /* renamed from: a, reason: collision with root package name */
            public final int f13053a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f13054b;

            /* renamed from: c, reason: collision with root package name */
            public int f13055c;

            public C0189a(int i7, boolean z7, int i8) {
                this.f13053a = i7;
                this.f13054b = z7;
                this.f13055c = i8;
            }
        }

        public C0188a(int i7, int i8) {
            j(i7);
            this.f13052h = i8;
        }

        public static void n(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9) {
            if (i9 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i9), i7, i8, 33);
        }

        public static void o(SpannableStringBuilder spannableStringBuilder, int i7, int i8) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i7, i8, 33);
        }

        public static void q(SpannableStringBuilder spannableStringBuilder, int i7, int i8) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i8, 33);
        }

        public void e(char c7) {
            if (this.f13047c.length() < 32) {
                this.f13047c.append(c7);
            }
        }

        public void f() {
            int length = this.f13047c.length();
            if (length > 0) {
                this.f13047c.delete(length - 1, length);
                for (int size = this.f13045a.size() - 1; size >= 0; size--) {
                    C0189a c0189a = (C0189a) this.f13045a.get(size);
                    int i7 = c0189a.f13055c;
                    if (i7 != length) {
                        return;
                    }
                    c0189a.f13055c = i7 - 1;
                }
            }
        }

        public C1280a g(int i7) {
            float f7;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i8 = 0; i8 < this.f13046b.size(); i8++) {
                spannableStringBuilder.append((CharSequence) this.f13046b.get(i8));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i9 = this.f13049e + this.f13050f;
            int length = (32 - i9) - spannableStringBuilder.length();
            int i10 = i9 - length;
            if (i7 == Integer.MIN_VALUE) {
                i7 = (this.f13051g != 2 || (Math.abs(i10) >= 3 && length >= 0)) ? (this.f13051g != 2 || i10 <= 0) ? 0 : 2 : 1;
            }
            if (i7 != 1) {
                if (i7 == 2) {
                    i9 = 32 - length;
                }
                f7 = ((i9 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f7 = 0.5f;
            }
            int i11 = this.f13048d;
            if (i11 > 7) {
                i11 -= 17;
            } else if (this.f13051g == 1) {
                i11 -= this.f13052h - 1;
            }
            return new C1280a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i11, 1).k(f7).l(i7).a();
        }

        public final SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13047c);
            int length = spannableStringBuilder.length();
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            boolean z7 = false;
            while (i11 < this.f13045a.size()) {
                C0189a c0189a = (C0189a) this.f13045a.get(i11);
                boolean z8 = c0189a.f13054b;
                int i13 = c0189a.f13053a;
                if (i13 != 8) {
                    boolean z9 = i13 == 7;
                    if (i13 != 7) {
                        i10 = C1204a.f13020B[i13];
                    }
                    z7 = z9;
                }
                int i14 = c0189a.f13055c;
                i11++;
                if (i14 != (i11 < this.f13045a.size() ? ((C0189a) this.f13045a.get(i11)).f13055c : length)) {
                    if (i7 != -1 && !z8) {
                        q(spannableStringBuilder, i7, i14);
                        i7 = -1;
                    } else if (i7 == -1 && z8) {
                        i7 = i14;
                    }
                    if (i8 != -1 && !z7) {
                        o(spannableStringBuilder, i8, i14);
                        i8 = -1;
                    } else if (i8 == -1 && z7) {
                        i8 = i14;
                    }
                    if (i10 != i9) {
                        n(spannableStringBuilder, i12, i14, i9);
                        i9 = i10;
                        i12 = i14;
                    }
                }
            }
            if (i7 != -1 && i7 != length) {
                q(spannableStringBuilder, i7, length);
            }
            if (i8 != -1 && i8 != length) {
                o(spannableStringBuilder, i8, length);
            }
            if (i12 != length) {
                n(spannableStringBuilder, i12, length, i9);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean i() {
            return this.f13045a.isEmpty() && this.f13046b.isEmpty() && this.f13047c.length() == 0;
        }

        public void j(int i7) {
            this.f13051g = i7;
            this.f13045a.clear();
            this.f13046b.clear();
            this.f13047c.setLength(0);
            this.f13048d = 15;
            this.f13049e = 0;
            this.f13050f = 0;
        }

        public void k() {
            this.f13046b.add(h());
            this.f13047c.setLength(0);
            this.f13045a.clear();
            int min = Math.min(this.f13052h, this.f13048d);
            while (this.f13046b.size() >= min) {
                this.f13046b.remove(0);
            }
        }

        public void l(int i7) {
            this.f13051g = i7;
        }

        public void m(int i7) {
            this.f13052h = i7;
        }

        public void p(int i7, boolean z7) {
            this.f13045a.add(new C0189a(i7, z7, this.f13047c.length()));
        }
    }

    public C1204a(String str, int i7, long j7) {
        if (j7 != -9223372036854775807L) {
            AbstractC1297a.a(j7 >= 16000);
            this.f13031l = j7 * 1000;
        } else {
            this.f13031l = -9223372036854775807L;
        }
        this.f13028i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i7 != 1) {
            if (i7 == 2) {
                this.f13030k = 1;
                this.f13029j = 0;
                O(0);
                N();
                this.f13043x = true;
                this.f13044y = -9223372036854775807L;
            }
            if (i7 == 3) {
                this.f13030k = 0;
            } else if (i7 != 4) {
                o.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            } else {
                this.f13030k = 1;
            }
            this.f13029j = 1;
            O(0);
            N();
            this.f13043x = true;
            this.f13044y = -9223372036854775807L;
        }
        this.f13030k = 0;
        this.f13029j = 0;
        O(0);
        N();
        this.f13043x = true;
        this.f13044y = -9223372036854775807L;
    }

    public static boolean B(byte b7) {
        return (b7 & 224) == 0;
    }

    public static boolean C(byte b7, byte b8) {
        return (b7 & 246) == 18 && (b8 & 224) == 32;
    }

    public static boolean D(byte b7, byte b8) {
        return (b7 & 247) == 17 && (b8 & 240) == 32;
    }

    public static boolean E(byte b7, byte b8) {
        return (b7 & 246) == 20 && (b8 & 240) == 32;
    }

    public static boolean F(byte b7, byte b8) {
        return (b7 & 240) == 16 && (b8 & 192) == 64;
    }

    public static boolean G(byte b7) {
        return (b7 & 240) == 16;
    }

    public static boolean I(byte b7) {
        return (b7 & 246) == 20;
    }

    public static boolean J(byte b7, byte b8) {
        return (b7 & 247) == 17 && (b8 & 240) == 48;
    }

    public static boolean K(byte b7, byte b8) {
        return (b7 & 247) == 23 && b8 >= 33 && b8 <= 35;
    }

    public static boolean L(byte b7) {
        return 1 <= b7 && b7 <= 15;
    }

    public static char r(byte b7) {
        return (char) f13021C[(b7 & Byte.MAX_VALUE) - 32];
    }

    public static int s(byte b7) {
        return (b7 >> 3) & 1;
    }

    public static char u(byte b7) {
        return (char) f13023E[b7 & 31];
    }

    public static char v(byte b7) {
        return (char) f13024F[b7 & 31];
    }

    public static char w(byte b7, byte b8) {
        return (b7 & 1) == 0 ? u(b8) : v(b8);
    }

    public static char x(byte b7) {
        return (char) f13022D[b7 & 15];
    }

    public final void A(byte b7, byte b8) {
        int i7 = f13026z[b7 & 7];
        if ((b8 & 32) != 0) {
            i7++;
        }
        if (i7 != this.f13033n.f13048d) {
            if (this.f13036q != 1 && !this.f13033n.i()) {
                C0188a c0188a = new C0188a(this.f13036q, this.f13037r);
                this.f13033n = c0188a;
                this.f13032m.add(c0188a);
            }
            this.f13033n.f13048d = i7;
        }
        boolean z7 = (b8 & 16) == 16;
        boolean z8 = (b8 & 1) == 1;
        int i8 = (b8 >> 1) & 7;
        this.f13033n.p(z7 ? 8 : i8, z8);
        if (z7) {
            this.f13033n.f13049e = f13019A[i8];
        }
    }

    public final boolean H(boolean z7, byte b7, byte b8) {
        if (!z7 || !G(b7)) {
            this.f13039t = false;
        } else {
            if (this.f13039t && this.f13040u == b7 && this.f13041v == b8) {
                this.f13039t = false;
                return true;
            }
            this.f13039t = true;
            this.f13040u = b7;
            this.f13041v = b8;
        }
        return false;
    }

    public final void M(byte b7, byte b8) {
        if (!L(b7)) {
            if (I(b7)) {
                if (b8 != 32 && b8 != 47) {
                    switch (b8) {
                        default:
                            switch (b8) {
                            }
                            return;
                        case 37:
                        case 38:
                        case 39:
                            this.f13043x = true;
                            return;
                    }
                }
                this.f13043x = true;
                return;
            }
            return;
        }
        this.f13043x = false;
    }

    public final void N() {
        this.f13033n.j(this.f13036q);
        this.f13032m.clear();
        this.f13032m.add(this.f13033n);
    }

    public final void O(int i7) {
        int i8 = this.f13036q;
        if (i8 == i7) {
            return;
        }
        this.f13036q = i7;
        if (i7 == 3) {
            for (int i9 = 0; i9 < this.f13032m.size(); i9++) {
                ((C0188a) this.f13032m.get(i9)).l(i7);
            }
            return;
        }
        N();
        if (i8 == 3 || i7 == 1 || i7 == 0) {
            this.f13034o = Collections.emptyList();
        }
    }

    public final void P(int i7) {
        this.f13037r = i7;
        this.f13033n.m(i7);
    }

    public final boolean Q() {
        return (this.f13031l == -9223372036854775807L || this.f13044y == -9223372036854775807L || l() - this.f13044y < this.f13031l) ? false : true;
    }

    public final boolean R(byte b7) {
        if (B(b7)) {
            this.f13042w = s(b7);
        }
        return this.f13042w == this.f13030k;
    }

    @Override // d1.e, c1.l
    public /* bridge */ /* synthetic */ void d(long j7) {
        super.d(j7);
    }

    @Override // d1.e, j0.g
    public void flush() {
        super.flush();
        this.f13034o = null;
        this.f13035p = null;
        O(0);
        P(4);
        N();
        this.f13038s = false;
        this.f13039t = false;
        this.f13040u = (byte) 0;
        this.f13041v = (byte) 0;
        this.f13042w = 0;
        this.f13043x = true;
        this.f13044y = -9223372036854775807L;
    }

    @Override // d1.e
    public k g() {
        List list = this.f13034o;
        this.f13035p = list;
        return new f((List) AbstractC1297a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0017 A[SYNTHETIC] */
    @Override // d1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(c1.p r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.C1204a.h(c1.p):void");
    }

    @Override // d1.e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ p f() {
        return super.f();
    }

    @Override // d1.e, j0.g
    /* renamed from: j */
    public q a() {
        q k7;
        q a7 = super.a();
        if (a7 != null) {
            return a7;
        }
        if (!Q() || (k7 = k()) == null) {
            return null;
        }
        this.f13034o = Collections.emptyList();
        this.f13044y = -9223372036854775807L;
        k7.z(l(), g(), Long.MAX_VALUE);
        return k7;
    }

    @Override // d1.e
    public boolean m() {
        return this.f13034o != this.f13035p;
    }

    @Override // d1.e
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void e(p pVar) {
        super.e(pVar);
    }

    public final List t() {
        int size = this.f13032m.size();
        ArrayList arrayList = new ArrayList(size);
        int i7 = 2;
        for (int i8 = 0; i8 < size; i8++) {
            C1280a g7 = ((C0188a) this.f13032m.get(i8)).g(Integer.MIN_VALUE);
            arrayList.add(g7);
            if (g7 != null) {
                i7 = Math.min(i7, g7.f14090i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            C1280a c1280a = (C1280a) arrayList.get(i9);
            if (c1280a != null) {
                if (c1280a.f14090i != i7) {
                    c1280a = (C1280a) AbstractC1297a.e(((C0188a) this.f13032m.get(i9)).g(i7));
                }
                arrayList2.add(c1280a);
            }
        }
        return arrayList2;
    }

    public final void y(byte b7) {
        this.f13033n.e(' ');
        this.f13033n.p((b7 >> 1) & 7, (b7 & 1) == 1);
    }

    public final void z(byte b7) {
        if (b7 == 32) {
            O(2);
            return;
        }
        if (b7 == 41) {
            O(3);
            return;
        }
        switch (b7) {
            case 37:
                O(1);
                P(2);
                break;
            case 38:
                O(1);
                P(3);
                break;
            case 39:
                O(1);
                P(4);
                break;
            default:
                int i7 = this.f13036q;
                if (i7 != 0) {
                    if (b7 == 33) {
                        this.f13033n.f();
                        break;
                    } else {
                        switch (b7) {
                            case 44:
                                this.f13034o = Collections.emptyList();
                                int i8 = this.f13036q;
                                if (i8 != 1 && i8 != 3) {
                                }
                                break;
                            case 45:
                                if (i7 == 1 && !this.f13033n.i()) {
                                    this.f13033n.k();
                                    break;
                                }
                                break;
                            case 47:
                                this.f13034o = t();
                                break;
                        }
                        N();
                        break;
                    }
                }
                break;
        }
    }

    @Override // d1.e, j0.g
    public void release() {
    }
}
