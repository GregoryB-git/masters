package i5;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import h5.a;
import h5.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v5.e0;
import v5.m;
import v5.u;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: h, reason: collision with root package name */
    public final int f7489h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7490i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7491j;

    /* renamed from: n, reason: collision with root package name */
    public List<h5.a> f7495n;

    /* renamed from: o, reason: collision with root package name */
    public List<h5.a> f7496o;

    /* renamed from: p, reason: collision with root package name */
    public int f7497p;

    /* renamed from: q, reason: collision with root package name */
    public int f7498q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7499r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7500s;
    public byte t;

    /* renamed from: u, reason: collision with root package name */
    public byte f7501u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7503w;

    /* renamed from: x, reason: collision with root package name */
    public long f7504x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f7486y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f7487z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, R.styleable.AppCompatTheme_textAppearanceListItem, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, R.styleable.AppCompatTheme_textAppearanceListItemSmall, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, R.styleable.AppCompatTheme_textColorAlertDialogListItem, R.styleable.AppCompatTheme_textColorSearchUrl, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_windowActionBar, R.styleable.AppCompatTheme_windowActionBarOverlay, R.styleable.AppCompatTheme_windowActionModeOverlay, R.styleable.AppCompatTheme_windowFixedHeightMajor, R.styleable.AppCompatTheme_windowFixedHeightMinor, R.styleable.AppCompatTheme_windowFixedWidthMajor, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, R.styleable.AppCompatTheme_windowFixedWidthMinor, R.styleable.AppCompatTheme_windowMinWidthMinor, 92, 94, 95, R.styleable.AppCompatTheme_windowMinWidthMajor, R.styleable.AppCompatTheme_windowNoTitle, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    public final u f7488g = new u();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<C0114a> f7493l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    public C0114a f7494m = new C0114a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    public int f7502v = 0;

    /* renamed from: k, reason: collision with root package name */
    public final long f7492k = 16000000;

    /* renamed from: i5.a$a, reason: collision with other inner class name */
    public static final class C0114a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f7505a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f7506b;

        /* renamed from: c, reason: collision with root package name */
        public final StringBuilder f7507c;

        /* renamed from: d, reason: collision with root package name */
        public int f7508d;

        /* renamed from: e, reason: collision with root package name */
        public int f7509e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f7510g;

        /* renamed from: h, reason: collision with root package name */
        public int f7511h;

        /* renamed from: i5.a$a$a, reason: collision with other inner class name */
        public static class C0115a {

            /* renamed from: a, reason: collision with root package name */
            public final int f7512a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f7513b;

            /* renamed from: c, reason: collision with root package name */
            public int f7514c;

            public C0115a(int i10, int i11, boolean z10) {
                this.f7512a = i10;
                this.f7513b = z10;
                this.f7514c = i11;
            }
        }

        public C0114a(int i10, int i11) {
            ArrayList arrayList = new ArrayList();
            this.f7505a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f7506b = arrayList2;
            StringBuilder sb2 = new StringBuilder();
            this.f7507c = sb2;
            this.f7510g = i10;
            arrayList.clear();
            arrayList2.clear();
            sb2.setLength(0);
            this.f7508d = 15;
            this.f7509e = 0;
            this.f = 0;
            this.f7511h = i11;
        }

        public final void a(char c10) {
            if (this.f7507c.length() < 32) {
                this.f7507c.append(c10);
            }
        }

        public final void b() {
            C0115a c0115a;
            int i10;
            int length = this.f7507c.length();
            if (length <= 0) {
                return;
            }
            this.f7507c.delete(length - 1, length);
            int size = this.f7505a.size();
            while (true) {
                size--;
                if (size < 0 || (i10 = (c0115a = (C0115a) this.f7505a.get(size)).f7514c) != length) {
                    return;
                } else {
                    c0115a.f7514c = i10 - 1;
                }
            }
        }

        public final h5.a c(int i10) {
            float f;
            int i11 = this.f7509e + this.f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f7506b.size(); i13++) {
                CharSequence charSequence = (CharSequence) this.f7506b.get(i13);
                int i14 = e0.f15881a;
                if (charSequence.length() > i12) {
                    charSequence = charSequence.subSequence(0, i12);
                }
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append('\n');
            }
            SpannableString d10 = d();
            int i15 = e0.f15881a;
            int length = d10.length();
            CharSequence charSequence2 = d10;
            if (length > i12) {
                charSequence2 = d10.subSequence(0, i12);
            }
            spannableStringBuilder.append(charSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i12 - spannableStringBuilder.length();
            int i16 = i11 - length2;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f7510g != 2 || (Math.abs(i16) >= 3 && length2 >= 0)) ? (this.f7510g != 2 || i16 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length2;
                }
                f = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i17 = this.f7508d;
            if (i17 > 7) {
                i17 = (i17 - 15) - 2;
            } else if (this.f7510g == 1) {
                i17 -= this.f7511h - 1;
            }
            a.C0105a c0105a = new a.C0105a();
            c0105a.f7110a = spannableStringBuilder;
            c0105a.f7112c = Layout.Alignment.ALIGN_NORMAL;
            c0105a.f7114e = i17;
            c0105a.f = 1;
            c0105a.f7116h = f;
            c0105a.f7117i = i10;
            return c0105a.a();
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7507c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f7505a.size()) {
                C0115a c0115a = (C0115a) this.f7505a.get(i14);
                boolean z11 = c0115a.f7513b;
                int i16 = c0115a.f7512a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0115a.f7514c;
                i14++;
                if (i17 != (i14 < this.f7505a.size() ? ((C0115a) this.f7505a.get(i14)).f7514c : length)) {
                    if (i10 != -1 && !z11) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        if (i12 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                        }
                        i15 = i17;
                        i12 = i13;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
            }
            if (i11 != -1 && i11 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
            }
            if (i15 != length && i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean e() {
            return this.f7505a.isEmpty() && this.f7506b.isEmpty() && this.f7507c.length() == 0;
        }
    }

    public a(String str, int i10) {
        this.f7489h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 != 1) {
            if (i10 == 2) {
                this.f7491j = 1;
                this.f7490i = 0;
                k(0);
                j();
                this.f7503w = true;
                this.f7504x = -9223372036854775807L;
            }
            if (i10 == 3) {
                this.f7491j = 0;
            } else if (i10 != 4) {
                m.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            } else {
                this.f7491j = 1;
            }
            this.f7490i = 1;
            k(0);
            j();
            this.f7503w = true;
            this.f7504x = -9223372036854775807L;
        }
        this.f7491j = 0;
        this.f7490i = 0;
        k(0);
        j();
        this.f7503w = true;
        this.f7504x = -9223372036854775807L;
    }

    @Override // i5.c
    public final d e() {
        List<h5.a> list = this.f7495n;
        this.f7496o = list;
        list.getClass();
        return new d(list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0277, code lost:
    
        if (r1 != 3) goto L203;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7 A[SYNTHETIC] */
    @Override // i5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(i5.c.a r14) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.a.f(i5.c$a):void");
    }

    @Override // i5.c, z3.d
    public final void flush() {
        super.flush();
        this.f7495n = null;
        this.f7496o = null;
        k(0);
        this.f7498q = 4;
        this.f7494m.f7511h = 4;
        j();
        this.f7499r = false;
        this.f7500s = false;
        this.t = (byte) 0;
        this.f7501u = (byte) 0;
        this.f7502v = 0;
        this.f7503w = true;
        this.f7504x = -9223372036854775807L;
    }

    @Override // i5.c, z3.d
    /* renamed from: g */
    public final l b() {
        l pollFirst;
        l b10 = super.b();
        if (b10 != null) {
            return b10;
        }
        long j10 = this.f7492k;
        boolean z10 = false;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f7504x;
            if (j11 != -9223372036854775807L && this.f7560e - j11 >= j10) {
                z10 = true;
            }
        }
        if (!z10 || (pollFirst = this.f7557b.pollFirst()) == null) {
            return null;
        }
        this.f7495n = Collections.emptyList();
        this.f7504x = -9223372036854775807L;
        pollFirst.p(this.f7560e, e(), Long.MAX_VALUE);
        return pollFirst;
    }

    @Override // i5.c
    public final boolean h() {
        return this.f7495n != this.f7496o;
    }

    public final List<h5.a> i() {
        int size = this.f7493l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            h5.a c10 = this.f7493l.get(i11).c(Integer.MIN_VALUE);
            arrayList.add(c10);
            if (c10 != null) {
                i10 = Math.min(i10, c10.f7102q);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            h5.a aVar = (h5.a) arrayList.get(i12);
            if (aVar != null) {
                if (aVar.f7102q != i10) {
                    aVar = this.f7493l.get(i12).c(i10);
                    aVar.getClass();
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    public final void j() {
        C0114a c0114a = this.f7494m;
        c0114a.f7510g = this.f7497p;
        c0114a.f7505a.clear();
        c0114a.f7506b.clear();
        c0114a.f7507c.setLength(0);
        c0114a.f7508d = 15;
        c0114a.f7509e = 0;
        c0114a.f = 0;
        this.f7493l.clear();
        this.f7493l.add(this.f7494m);
    }

    public final void k(int i10) {
        int i11 = this.f7497p;
        if (i11 == i10) {
            return;
        }
        this.f7497p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f7493l.size(); i12++) {
                this.f7493l.get(i12).f7510g = i10;
            }
            return;
        }
        j();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f7495n = Collections.emptyList();
        }
    }

    @Override // i5.c, z3.d
    public final void release() {
    }
}
