package h5;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import v5.e0;

/* loaded from: classes.dex */
public final class a implements v3.g {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final e0.e R;

    /* renamed from: z, reason: collision with root package name */
    public static final a f7094z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f7095a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f7096b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f7097c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f7098d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7099e;
    public final int f;

    /* renamed from: o, reason: collision with root package name */
    public final int f7100o;

    /* renamed from: p, reason: collision with root package name */
    public final float f7101p;

    /* renamed from: q, reason: collision with root package name */
    public final int f7102q;

    /* renamed from: r, reason: collision with root package name */
    public final float f7103r;

    /* renamed from: s, reason: collision with root package name */
    public final float f7104s;
    public final boolean t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7105u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7106v;

    /* renamed from: w, reason: collision with root package name */
    public final float f7107w;

    /* renamed from: x, reason: collision with root package name */
    public final int f7108x;

    /* renamed from: y, reason: collision with root package name */
    public final float f7109y;

    /* renamed from: h5.a$a, reason: collision with other inner class name */
    public static final class C0105a {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f7110a;

        /* renamed from: b, reason: collision with root package name */
        public Bitmap f7111b;

        /* renamed from: c, reason: collision with root package name */
        public Layout.Alignment f7112c;

        /* renamed from: d, reason: collision with root package name */
        public Layout.Alignment f7113d;

        /* renamed from: e, reason: collision with root package name */
        public float f7114e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f7115g;

        /* renamed from: h, reason: collision with root package name */
        public float f7116h;

        /* renamed from: i, reason: collision with root package name */
        public int f7117i;

        /* renamed from: j, reason: collision with root package name */
        public int f7118j;

        /* renamed from: k, reason: collision with root package name */
        public float f7119k;

        /* renamed from: l, reason: collision with root package name */
        public float f7120l;

        /* renamed from: m, reason: collision with root package name */
        public float f7121m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f7122n;

        /* renamed from: o, reason: collision with root package name */
        public int f7123o;

        /* renamed from: p, reason: collision with root package name */
        public int f7124p;

        /* renamed from: q, reason: collision with root package name */
        public float f7125q;

        public C0105a() {
            this.f7110a = null;
            this.f7111b = null;
            this.f7112c = null;
            this.f7113d = null;
            this.f7114e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.f7115g = Integer.MIN_VALUE;
            this.f7116h = -3.4028235E38f;
            this.f7117i = Integer.MIN_VALUE;
            this.f7118j = Integer.MIN_VALUE;
            this.f7119k = -3.4028235E38f;
            this.f7120l = -3.4028235E38f;
            this.f7121m = -3.4028235E38f;
            this.f7122n = false;
            this.f7123o = -16777216;
            this.f7124p = Integer.MIN_VALUE;
        }

        public C0105a(a aVar) {
            this.f7110a = aVar.f7095a;
            this.f7111b = aVar.f7098d;
            this.f7112c = aVar.f7096b;
            this.f7113d = aVar.f7097c;
            this.f7114e = aVar.f7099e;
            this.f = aVar.f;
            this.f7115g = aVar.f7100o;
            this.f7116h = aVar.f7101p;
            this.f7117i = aVar.f7102q;
            this.f7118j = aVar.f7106v;
            this.f7119k = aVar.f7107w;
            this.f7120l = aVar.f7103r;
            this.f7121m = aVar.f7104s;
            this.f7122n = aVar.t;
            this.f7123o = aVar.f7105u;
            this.f7124p = aVar.f7108x;
            this.f7125q = aVar.f7109y;
        }

        public final a a() {
            return new a(this.f7110a, this.f7112c, this.f7113d, this.f7111b, this.f7114e, this.f, this.f7115g, this.f7116h, this.f7117i, this.f7118j, this.f7119k, this.f7120l, this.f7121m, this.f7122n, this.f7123o, this.f7124p, this.f7125q);
        }
    }

    static {
        C0105a c0105a = new C0105a();
        c0105a.f7110a = "";
        f7094z = c0105a.a();
        A = e0.E(0);
        B = e0.E(1);
        C = e0.E(2);
        D = e0.E(3);
        E = e0.E(4);
        F = e0.E(5);
        G = e0.E(6);
        H = e0.E(7);
        I = e0.E(8);
        J = e0.E(9);
        K = e0.E(10);
        L = e0.E(11);
        M = e0.E(12);
        N = e0.E(13);
        O = e0.E(14);
        P = e0.E(15);
        Q = e0.E(16);
        R = new e0.e(16);
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i10, int i11, float f10, int i12, int i13, float f11, float f12, float f13, boolean z10, int i14, int i15, float f14) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            x6.b.q(bitmap == null);
        }
        this.f7095a = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f7096b = alignment;
        this.f7097c = alignment2;
        this.f7098d = bitmap;
        this.f7099e = f;
        this.f = i10;
        this.f7100o = i11;
        this.f7101p = f10;
        this.f7102q = i12;
        this.f7103r = f12;
        this.f7104s = f13;
        this.t = z10;
        this.f7105u = i14;
        this.f7106v = i13;
        this.f7107w = f11;
        this.f7108x = i15;
        this.f7109y = f14;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return TextUtils.equals(this.f7095a, aVar.f7095a) && this.f7096b == aVar.f7096b && this.f7097c == aVar.f7097c && ((bitmap = this.f7098d) != null ? !((bitmap2 = aVar.f7098d) == null || !bitmap.sameAs(bitmap2)) : aVar.f7098d == null) && this.f7099e == aVar.f7099e && this.f == aVar.f && this.f7100o == aVar.f7100o && this.f7101p == aVar.f7101p && this.f7102q == aVar.f7102q && this.f7103r == aVar.f7103r && this.f7104s == aVar.f7104s && this.t == aVar.t && this.f7105u == aVar.f7105u && this.f7106v == aVar.f7106v && this.f7107w == aVar.f7107w && this.f7108x == aVar.f7108x && this.f7109y == aVar.f7109y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7095a, this.f7096b, this.f7097c, this.f7098d, Float.valueOf(this.f7099e), Integer.valueOf(this.f), Integer.valueOf(this.f7100o), Float.valueOf(this.f7101p), Integer.valueOf(this.f7102q), Float.valueOf(this.f7103r), Float.valueOf(this.f7104s), Boolean.valueOf(this.t), Integer.valueOf(this.f7105u), Integer.valueOf(this.f7106v), Float.valueOf(this.f7107w), Integer.valueOf(this.f7108x), Float.valueOf(this.f7109y)});
    }
}
