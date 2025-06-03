/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.BitmapFactory
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.Spannable
 *  android.text.SpannableString
 *  android.text.Spanned
 *  android.text.SpannedString
 *  android.text.TextUtils
 *  java.io.ByteArrayOutputStream
 *  java.io.OutputStream
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package f0;

import W2.k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import f0.c;
import g0.M;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public final class a {
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
    public static final a r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;

    static {
        r = new b().o("").a();
        s = M.w0(0);
        t = M.w0(17);
        u = M.w0(1);
        v = M.w0(2);
        w = M.w0(3);
        x = M.w0(18);
        y = M.w0(4);
        z = M.w0(5);
        A = M.w0(6);
        B = M.w0(7);
        C = M.w0(8);
        D = M.w0(9);
        E = M.w0(10);
        F = M.w0(11);
        G = M.w0(12);
        H = M.w0(13);
        I = M.w0(14);
        J = M.w0(15);
        K = M.w0(16);
    }

    /*
     * Enabled aggressive block sorting
     */
    public a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f8, int n8, int n9, float f9, int n10, int n11, float f10, float f11, float f12, boolean bl, int n12, int n13, float f13) {
        if (charSequence == null) {
            g0.a.e((Object)bitmap);
        } else {
            boolean bl2 = bitmap == null;
            g0.a.a(bl2);
        }
        charSequence = charSequence instanceof Spanned ? SpannedString.valueOf((CharSequence)charSequence) : (charSequence != null ? charSequence.toString() : null);
        this.a = charSequence;
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f8;
        this.f = n8;
        this.g = n9;
        this.h = f9;
        this.i = n10;
        this.j = f11;
        this.k = f12;
        this.l = bl;
        this.m = n12;
        this.n = n11;
        this.o = f10;
        this.p = n13;
        this.q = f13;
    }

    public /* synthetic */ a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f8, int n8, int n9, float f9, int n10, int n11, float f10, float f11, float f12, boolean bl, int n12, int n13, float f13,  a8) {
        this(charSequence, alignment, alignment2, bitmap, f8, n8, n9, f9, n10, n11, f10, f11, f12, bl, n12, n13, f13);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static a b(Bundle bundle) {
        b b8;
        byte[] arrby;
        CharSequence charSequence;
        block20 : {
            block19 : {
                b8 = new b();
                charSequence = bundle.getCharSequence(s);
                if (charSequence != null) {
                    b8.o(charSequence);
                    arrby = bundle.getParcelableArrayList(t);
                    if (arrby != null) {
                        charSequence = SpannableString.valueOf((CharSequence)charSequence);
                        arrby = arrby.iterator();
                        while (arrby.hasNext()) {
                            c.c((Bundle)arrby.next(), (Spannable)charSequence);
                        }
                        b8.o(charSequence);
                    }
                }
                if ((arrby = (byte[])bundle.getSerializable(u)) != null) {
                    b8.p((Layout.Alignment)arrby);
                }
                if ((arrby = (Layout.Alignment)bundle.getSerializable(v)) != null) {
                    b8.j((Layout.Alignment)arrby);
                }
                if ((arrby = (Bitmap)bundle.getParcelable(w)) != null) break block19;
                arrby = bundle.getByteArray(x);
                if (arrby == null) break block20;
                arrby = BitmapFactory.decodeByteArray((byte[])arrby, (int)0, (int)arrby.length);
            }
            b8.f((Bitmap)arrby);
        }
        if (bundle.containsKey((String)(arrby = y)) && bundle.containsKey((String)(charSequence = z))) {
            b8.h(bundle.getFloat((String)arrby), bundle.getInt((String)charSequence));
        }
        if (bundle.containsKey((String)(arrby = A))) {
            b8.i(bundle.getInt((String)arrby));
        }
        if (bundle.containsKey((String)(arrby = B))) {
            b8.k(bundle.getFloat((String)arrby));
        }
        if (bundle.containsKey((String)(arrby = C))) {
            b8.l(bundle.getInt((String)arrby));
        }
        if (bundle.containsKey((String)(arrby = E)) && bundle.containsKey((String)(charSequence = D))) {
            b8.q(bundle.getFloat((String)arrby), bundle.getInt((String)charSequence));
        }
        if (bundle.containsKey((String)(arrby = F))) {
            b8.n(bundle.getFloat((String)arrby));
        }
        if (bundle.containsKey((String)(arrby = G))) {
            b8.g(bundle.getFloat((String)arrby));
        }
        if (bundle.containsKey((String)(arrby = H))) {
            b8.s(bundle.getInt((String)arrby));
        }
        if (!bundle.getBoolean(I, false)) {
            b8.b();
        }
        if (bundle.containsKey((String)(arrby = J))) {
            b8.r(bundle.getInt((String)arrby));
        }
        if (bundle.containsKey((String)(arrby = K))) {
            b8.m(bundle.getFloat((String)arrby));
        }
        return b8.a();
    }

    public b a() {
        return new b(this, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            charSequence = this.a;
            if (charSequence instanceof Spanned && !(charSequence = c.a((Spanned)charSequence)).isEmpty()) {
                bundle.putParcelableArrayList(t, (ArrayList)charSequence);
            }
        }
        bundle.putSerializable(u, (Serializable)this.b);
        bundle.putSerializable(v, (Serializable)this.c);
        bundle.putFloat(y, this.e);
        bundle.putInt(z, this.f);
        bundle.putInt(A, this.g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.i);
        bundle.putInt(D, this.n);
        bundle.putFloat(E, this.o);
        bundle.putFloat(F, this.j);
        bundle.putFloat(G, this.k);
        bundle.putBoolean(I, this.l);
        bundle.putInt(H, this.m);
        bundle.putInt(J, this.p);
        bundle.putFloat(K, this.q);
        return bundle;
    }

    public Bundle d() {
        Bundle bundle = this.c();
        if (this.d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            g0.a.f(this.d.compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)byteArrayOutputStream));
            bundle.putByteArray(x, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            Bitmap bitmap;
            Bitmap bitmap2;
            if (a.class != object.getClass()) {
                return false;
            }
            object = (a)object;
            if (TextUtils.equals((CharSequence)this.a, (CharSequence)object.a) && this.b == object.b && this.c == object.c && ((bitmap = this.d) == null ? object.d == null : (bitmap2 = object.d) != null && bitmap.sameAs(bitmap2)) && this.e == object.e && this.f == object.f && this.g == object.g && this.h == object.h && this.i == object.i && this.j == object.j && this.k == object.k && this.l == object.l && this.m == object.m && this.n == object.n && this.o == object.o && this.p == object.p && this.q == object.q) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return k.b(new Object[]{this.a, this.b, this.c, this.d, Float.valueOf((float)this.e), this.f, this.g, Float.valueOf((float)this.h), this.i, Float.valueOf((float)this.j), Float.valueOf((float)this.k), this.l, this.m, this.n, Float.valueOf((float)this.o), this.p, Float.valueOf((float)this.q)});
    }

    public static final class b {
        public CharSequence a;
        public Bitmap b;
        public Layout.Alignment c;
        public Layout.Alignment d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        public int o;
        public int p;
        public float q;

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = -16777216;
            this.p = Integer.MIN_VALUE;
        }

        public b(a a8) {
            this.a = a8.a;
            this.b = a8.d;
            this.c = a8.b;
            this.d = a8.c;
            this.e = a8.e;
            this.f = a8.f;
            this.g = a8.g;
            this.h = a8.h;
            this.i = a8.i;
            this.j = a8.n;
            this.k = a8.o;
            this.l = a8.j;
            this.m = a8.k;
            this.n = a8.l;
            this.o = a8.m;
            this.p = a8.p;
            this.q = a8.q;
        }

        public /* synthetic */ b(a a8,  a9) {
            this(a8);
        }

        public a a() {
            return new a(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, null);
        }

        public b b() {
            this.n = false;
            return this;
        }

        public int c() {
            return this.g;
        }

        public int d() {
            return this.i;
        }

        public CharSequence e() {
            return this.a;
        }

        public b f(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        public b g(float f8) {
            this.m = f8;
            return this;
        }

        public b h(float f8, int n8) {
            this.e = f8;
            this.f = n8;
            return this;
        }

        public b i(int n8) {
            this.g = n8;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b k(float f8) {
            this.h = f8;
            return this;
        }

        public b l(int n8) {
            this.i = n8;
            return this;
        }

        public b m(float f8) {
            this.q = f8;
            return this;
        }

        public b n(float f8) {
            this.l = f8;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.c = alignment;
            return this;
        }

        public b q(float f8, int n8) {
            this.k = f8;
            this.j = n8;
            return this;
        }

        public b r(int n8) {
            this.p = n8;
            return this;
        }

        public b s(int n8) {
            this.o = n8;
            this.n = true;
            return this;
        }
    }

}

