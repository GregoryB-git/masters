package f0;

import W2.k;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import g0.AbstractC1297a;
import g0.M;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1280a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f14082a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f14083b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f14084c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f14085d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14086e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14087f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14088g;

    /* renamed from: h, reason: collision with root package name */
    public final float f14089h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14090i;

    /* renamed from: j, reason: collision with root package name */
    public final float f14091j;

    /* renamed from: k, reason: collision with root package name */
    public final float f14092k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14093l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14094m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14095n;

    /* renamed from: o, reason: collision with root package name */
    public final float f14096o;

    /* renamed from: p, reason: collision with root package name */
    public final int f14097p;

    /* renamed from: q, reason: collision with root package name */
    public final float f14098q;

    /* renamed from: r, reason: collision with root package name */
    public static final C1280a f14073r = new b().o("").a();

    /* renamed from: s, reason: collision with root package name */
    public static final String f14074s = M.w0(0);

    /* renamed from: t, reason: collision with root package name */
    public static final String f14075t = M.w0(17);

    /* renamed from: u, reason: collision with root package name */
    public static final String f14076u = M.w0(1);

    /* renamed from: v, reason: collision with root package name */
    public static final String f14077v = M.w0(2);

    /* renamed from: w, reason: collision with root package name */
    public static final String f14078w = M.w0(3);

    /* renamed from: x, reason: collision with root package name */
    public static final String f14079x = M.w0(18);

    /* renamed from: y, reason: collision with root package name */
    public static final String f14080y = M.w0(4);

    /* renamed from: z, reason: collision with root package name */
    public static final String f14081z = M.w0(5);

    /* renamed from: A, reason: collision with root package name */
    public static final String f14062A = M.w0(6);

    /* renamed from: B, reason: collision with root package name */
    public static final String f14063B = M.w0(7);

    /* renamed from: C, reason: collision with root package name */
    public static final String f14064C = M.w0(8);

    /* renamed from: D, reason: collision with root package name */
    public static final String f14065D = M.w0(9);

    /* renamed from: E, reason: collision with root package name */
    public static final String f14066E = M.w0(10);

    /* renamed from: F, reason: collision with root package name */
    public static final String f14067F = M.w0(11);

    /* renamed from: G, reason: collision with root package name */
    public static final String f14068G = M.w0(12);

    /* renamed from: H, reason: collision with root package name */
    public static final String f14069H = M.w0(13);

    /* renamed from: I, reason: collision with root package name */
    public static final String f14070I = M.w0(14);

    /* renamed from: J, reason: collision with root package name */
    public static final String f14071J = M.w0(15);

    /* renamed from: K, reason: collision with root package name */
    public static final String f14072K = M.w0(16);

    /* renamed from: f0.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f14099a;

        /* renamed from: b, reason: collision with root package name */
        public Bitmap f14100b;

        /* renamed from: c, reason: collision with root package name */
        public Layout.Alignment f14101c;

        /* renamed from: d, reason: collision with root package name */
        public Layout.Alignment f14102d;

        /* renamed from: e, reason: collision with root package name */
        public float f14103e;

        /* renamed from: f, reason: collision with root package name */
        public int f14104f;

        /* renamed from: g, reason: collision with root package name */
        public int f14105g;

        /* renamed from: h, reason: collision with root package name */
        public float f14106h;

        /* renamed from: i, reason: collision with root package name */
        public int f14107i;

        /* renamed from: j, reason: collision with root package name */
        public int f14108j;

        /* renamed from: k, reason: collision with root package name */
        public float f14109k;

        /* renamed from: l, reason: collision with root package name */
        public float f14110l;

        /* renamed from: m, reason: collision with root package name */
        public float f14111m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f14112n;

        /* renamed from: o, reason: collision with root package name */
        public int f14113o;

        /* renamed from: p, reason: collision with root package name */
        public int f14114p;

        /* renamed from: q, reason: collision with root package name */
        public float f14115q;

        public b() {
            this.f14099a = null;
            this.f14100b = null;
            this.f14101c = null;
            this.f14102d = null;
            this.f14103e = -3.4028235E38f;
            this.f14104f = Integer.MIN_VALUE;
            this.f14105g = Integer.MIN_VALUE;
            this.f14106h = -3.4028235E38f;
            this.f14107i = Integer.MIN_VALUE;
            this.f14108j = Integer.MIN_VALUE;
            this.f14109k = -3.4028235E38f;
            this.f14110l = -3.4028235E38f;
            this.f14111m = -3.4028235E38f;
            this.f14112n = false;
            this.f14113o = -16777216;
            this.f14114p = Integer.MIN_VALUE;
        }

        public C1280a a() {
            return new C1280a(this.f14099a, this.f14101c, this.f14102d, this.f14100b, this.f14103e, this.f14104f, this.f14105g, this.f14106h, this.f14107i, this.f14108j, this.f14109k, this.f14110l, this.f14111m, this.f14112n, this.f14113o, this.f14114p, this.f14115q);
        }

        public b b() {
            this.f14112n = false;
            return this;
        }

        public int c() {
            return this.f14105g;
        }

        public int d() {
            return this.f14107i;
        }

        public CharSequence e() {
            return this.f14099a;
        }

        public b f(Bitmap bitmap) {
            this.f14100b = bitmap;
            return this;
        }

        public b g(float f7) {
            this.f14111m = f7;
            return this;
        }

        public b h(float f7, int i7) {
            this.f14103e = f7;
            this.f14104f = i7;
            return this;
        }

        public b i(int i7) {
            this.f14105g = i7;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f14102d = alignment;
            return this;
        }

        public b k(float f7) {
            this.f14106h = f7;
            return this;
        }

        public b l(int i7) {
            this.f14107i = i7;
            return this;
        }

        public b m(float f7) {
            this.f14115q = f7;
            return this;
        }

        public b n(float f7) {
            this.f14110l = f7;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f14099a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f14101c = alignment;
            return this;
        }

        public b q(float f7, int i7) {
            this.f14109k = f7;
            this.f14108j = i7;
            return this;
        }

        public b r(int i7) {
            this.f14114p = i7;
            return this;
        }

        public b s(int i7) {
            this.f14113o = i7;
            this.f14112n = true;
            return this;
        }

        public b(C1280a c1280a) {
            this.f14099a = c1280a.f14082a;
            this.f14100b = c1280a.f14085d;
            this.f14101c = c1280a.f14083b;
            this.f14102d = c1280a.f14084c;
            this.f14103e = c1280a.f14086e;
            this.f14104f = c1280a.f14087f;
            this.f14105g = c1280a.f14088g;
            this.f14106h = c1280a.f14089h;
            this.f14107i = c1280a.f14090i;
            this.f14108j = c1280a.f14095n;
            this.f14109k = c1280a.f14096o;
            this.f14110l = c1280a.f14091j;
            this.f14111m = c1280a.f14092k;
            this.f14112n = c1280a.f14093l;
            this.f14113o = c1280a.f14094m;
            this.f14114p = c1280a.f14097p;
            this.f14115q = c1280a.f14098q;
        }
    }

    public C1280a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f7, int i7, int i8, float f8, int i9, int i10, float f9, float f10, float f11, boolean z7, int i11, int i12, float f12) {
        if (charSequence == null) {
            AbstractC1297a.e(bitmap);
        } else {
            AbstractC1297a.a(bitmap == null);
        }
        this.f14082a = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f14083b = alignment;
        this.f14084c = alignment2;
        this.f14085d = bitmap;
        this.f14086e = f7;
        this.f14087f = i7;
        this.f14088g = i8;
        this.f14089h = f8;
        this.f14090i = i9;
        this.f14091j = f10;
        this.f14092k = f11;
        this.f14093l = z7;
        this.f14094m = i11;
        this.f14095n = i10;
        this.f14096o = f9;
        this.f14097p = i12;
        this.f14098q = f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f0.C1280a b(android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C1280a.b(android.os.Bundle):f0.a");
    }

    public b a() {
        return new b();
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f14082a;
        if (charSequence != null) {
            bundle.putCharSequence(f14074s, charSequence);
            CharSequence charSequence2 = this.f14082a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> a7 = AbstractC1282c.a((Spanned) charSequence2);
                if (!a7.isEmpty()) {
                    bundle.putParcelableArrayList(f14075t, a7);
                }
            }
        }
        bundle.putSerializable(f14076u, this.f14083b);
        bundle.putSerializable(f14077v, this.f14084c);
        bundle.putFloat(f14080y, this.f14086e);
        bundle.putInt(f14081z, this.f14087f);
        bundle.putInt(f14062A, this.f14088g);
        bundle.putFloat(f14063B, this.f14089h);
        bundle.putInt(f14064C, this.f14090i);
        bundle.putInt(f14065D, this.f14095n);
        bundle.putFloat(f14066E, this.f14096o);
        bundle.putFloat(f14067F, this.f14091j);
        bundle.putFloat(f14068G, this.f14092k);
        bundle.putBoolean(f14070I, this.f14093l);
        bundle.putInt(f14069H, this.f14094m);
        bundle.putInt(f14071J, this.f14097p);
        bundle.putFloat(f14072K, this.f14098q);
        return bundle;
    }

    public Bundle d() {
        Bundle c7 = c();
        if (this.f14085d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AbstractC1297a.f(this.f14085d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            c7.putByteArray(f14079x, byteArrayOutputStream.toByteArray());
        }
        return c7;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1280a.class != obj.getClass()) {
            return false;
        }
        C1280a c1280a = (C1280a) obj;
        return TextUtils.equals(this.f14082a, c1280a.f14082a) && this.f14083b == c1280a.f14083b && this.f14084c == c1280a.f14084c && ((bitmap = this.f14085d) != null ? !((bitmap2 = c1280a.f14085d) == null || !bitmap.sameAs(bitmap2)) : c1280a.f14085d == null) && this.f14086e == c1280a.f14086e && this.f14087f == c1280a.f14087f && this.f14088g == c1280a.f14088g && this.f14089h == c1280a.f14089h && this.f14090i == c1280a.f14090i && this.f14091j == c1280a.f14091j && this.f14092k == c1280a.f14092k && this.f14093l == c1280a.f14093l && this.f14094m == c1280a.f14094m && this.f14095n == c1280a.f14095n && this.f14096o == c1280a.f14096o && this.f14097p == c1280a.f14097p && this.f14098q == c1280a.f14098q;
    }

    public int hashCode() {
        return k.b(this.f14082a, this.f14083b, this.f14084c, this.f14085d, Float.valueOf(this.f14086e), Integer.valueOf(this.f14087f), Integer.valueOf(this.f14088g), Float.valueOf(this.f14089h), Integer.valueOf(this.f14090i), Float.valueOf(this.f14091j), Float.valueOf(this.f14092k), Boolean.valueOf(this.f14093l), Integer.valueOf(this.f14094m), Integer.valueOf(this.f14095n), Float.valueOf(this.f14096o), Integer.valueOf(this.f14097p), Float.valueOf(this.f14098q));
    }
}
