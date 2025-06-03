// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f0;

import android.os.BaseBundle;
import W2.k;
import android.text.TextUtils;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.ArrayList;
import android.graphics.BitmapFactory;
import android.text.Spannable;
import android.text.SpannableString;
import android.os.Bundle;
import android.text.SpannedString;
import android.text.Spanned;
import g0.M;
import android.graphics.Bitmap;
import android.text.Layout$Alignment;

public final class a
{
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
    public final Layout$Alignment b;
    public final Layout$Alignment c;
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
    
    public a(final CharSequence charSequence, final Layout$Alignment b, final Layout$Alignment c, final Bitmap d, final float e, final int f, final int g, final float h, final int i, final int n, final float o, final float j, final float k, final boolean l, final int m, final int p17, final float q) {
        if (charSequence == null) {
            g0.a.e(d);
        }
        else {
            g0.a.a(d == null);
        }
        Object a;
        if (charSequence instanceof Spanned) {
            a = SpannedString.valueOf(charSequence);
        }
        else if (charSequence != null) {
            a = charSequence.toString();
        }
        else {
            a = null;
        }
        this.a = (CharSequence)a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p17;
        this.q = q;
    }
    
    public static a b(final Bundle bundle) {
        final b b = new b();
        final CharSequence charSequence = bundle.getCharSequence(a.s);
        if (charSequence != null) {
            b.o(charSequence);
            final ArrayList parcelableArrayList = bundle.getParcelableArrayList(a.t);
            if (parcelableArrayList != null) {
                final SpannableString value = SpannableString.valueOf(charSequence);
                final Iterator<Bundle> iterator = parcelableArrayList.iterator();
                while (iterator.hasNext()) {
                    c.c(iterator.next(), (Spannable)value);
                }
                b.o((CharSequence)value);
            }
        }
        final Layout$Alignment layout$Alignment = (Layout$Alignment)bundle.getSerializable(a.u);
        if (layout$Alignment != null) {
            b.p(layout$Alignment);
        }
        final Layout$Alignment layout$Alignment2 = (Layout$Alignment)bundle.getSerializable(a.v);
        if (layout$Alignment2 != null) {
            b.j(layout$Alignment2);
        }
        Bitmap decodeByteArray = (Bitmap)bundle.getParcelable(a.w);
        Label_0168: {
            if (decodeByteArray == null) {
                final byte[] byteArray = bundle.getByteArray(a.x);
                if (byteArray == null) {
                    break Label_0168;
                }
                decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
            b.f(decodeByteArray);
        }
        final String y = a.y;
        if (((BaseBundle)bundle).containsKey(y)) {
            final String z = a.z;
            if (((BaseBundle)bundle).containsKey(z)) {
                b.h(bundle.getFloat(y), ((BaseBundle)bundle).getInt(z));
            }
        }
        final String a = f0.a.A;
        if (((BaseBundle)bundle).containsKey(a)) {
            b.i(((BaseBundle)bundle).getInt(a));
        }
        final String b2 = f0.a.B;
        if (((BaseBundle)bundle).containsKey(b2)) {
            b.k(bundle.getFloat(b2));
        }
        final String c = f0.a.C;
        if (((BaseBundle)bundle).containsKey(c)) {
            b.l(((BaseBundle)bundle).getInt(c));
        }
        final String e = f0.a.E;
        if (((BaseBundle)bundle).containsKey(e)) {
            final String d = f0.a.D;
            if (((BaseBundle)bundle).containsKey(d)) {
                b.q(bundle.getFloat(e), ((BaseBundle)bundle).getInt(d));
            }
        }
        final String f = f0.a.F;
        if (((BaseBundle)bundle).containsKey(f)) {
            b.n(bundle.getFloat(f));
        }
        final String g = f0.a.G;
        if (((BaseBundle)bundle).containsKey(g)) {
            b.g(bundle.getFloat(g));
        }
        final String h = f0.a.H;
        if (((BaseBundle)bundle).containsKey(h)) {
            b.s(((BaseBundle)bundle).getInt(h));
        }
        if (!((BaseBundle)bundle).getBoolean(f0.a.I, false)) {
            b.b();
        }
        final String j = f0.a.J;
        if (((BaseBundle)bundle).containsKey(j)) {
            b.r(((BaseBundle)bundle).getInt(j));
        }
        final String k = f0.a.K;
        if (((BaseBundle)bundle).containsKey(k)) {
            b.m(bundle.getFloat(k));
        }
        return b.a();
    }
    
    public b a() {
        return new b(this, null);
    }
    
    public final Bundle c() {
        final Bundle bundle = new Bundle();
        final CharSequence a = this.a;
        if (a != null) {
            bundle.putCharSequence(f0.a.s, a);
            final CharSequence a2 = this.a;
            if (a2 instanceof Spanned) {
                final ArrayList a3 = f0.c.a((Spanned)a2);
                if (!a3.isEmpty()) {
                    bundle.putParcelableArrayList(f0.a.t, a3);
                }
            }
        }
        bundle.putSerializable(f0.a.u, (Serializable)this.b);
        bundle.putSerializable(f0.a.v, (Serializable)this.c);
        bundle.putFloat(f0.a.y, this.e);
        ((BaseBundle)bundle).putInt(f0.a.z, this.f);
        ((BaseBundle)bundle).putInt(f0.a.A, this.g);
        bundle.putFloat(f0.a.B, this.h);
        ((BaseBundle)bundle).putInt(f0.a.C, this.i);
        ((BaseBundle)bundle).putInt(f0.a.D, this.n);
        bundle.putFloat(f0.a.E, this.o);
        bundle.putFloat(f0.a.F, this.j);
        bundle.putFloat(f0.a.G, this.k);
        ((BaseBundle)bundle).putBoolean(f0.a.I, this.l);
        ((BaseBundle)bundle).putInt(f0.a.H, this.m);
        ((BaseBundle)bundle).putInt(f0.a.J, this.p);
        bundle.putFloat(f0.a.K, this.q);
        return bundle;
    }
    
    public Bundle d() {
        final Bundle c = this.c();
        if (this.d != null) {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            g0.a.f(this.d.compress(Bitmap$CompressFormat.PNG, 0, (OutputStream)byteArrayOutputStream));
            c.putByteArray(f0.a.x, byteArrayOutputStream.toByteArray());
        }
        return c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (a.class != o.getClass()) {
            return false;
        }
        final a a = (a)o;
        if (TextUtils.equals(this.a, a.a) && this.b == a.b && this.c == a.c) {
            final Bitmap d = this.d;
            if (d == null) {
                if (a.d != null) {
                    return false;
                }
            }
            else {
                final Bitmap d2 = a.d;
                if (d2 == null || !d.sameAs(d2)) {
                    return false;
                }
            }
            if (this.e == a.e && this.f == a.f && this.g == a.g && this.h == a.h && this.i == a.i && this.j == a.j && this.k == a.k && this.l == a.l && this.m == a.m && this.n == a.n && this.o == a.o && this.p == a.p && this.q == a.q) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return W2.k.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }
    
    public static final class b
    {
        public CharSequence a;
        public Bitmap b;
        public Layout$Alignment c;
        public Layout$Alignment d;
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
        
        public b(final a a) {
            this.a = a.a;
            this.b = a.d;
            this.c = a.b;
            this.d = a.c;
            this.e = a.e;
            this.f = a.f;
            this.g = a.g;
            this.h = a.h;
            this.i = a.i;
            this.j = a.n;
            this.k = a.o;
            this.l = a.j;
            this.m = a.k;
            this.n = a.l;
            this.o = a.m;
            this.p = a.p;
            this.q = a.q;
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
        
        public b f(final Bitmap b) {
            this.b = b;
            return this;
        }
        
        public b g(final float m) {
            this.m = m;
            return this;
        }
        
        public b h(final float e, final int f) {
            this.e = e;
            this.f = f;
            return this;
        }
        
        public b i(final int g) {
            this.g = g;
            return this;
        }
        
        public b j(final Layout$Alignment d) {
            this.d = d;
            return this;
        }
        
        public b k(final float h) {
            this.h = h;
            return this;
        }
        
        public b l(final int i) {
            this.i = i;
            return this;
        }
        
        public b m(final float q) {
            this.q = q;
            return this;
        }
        
        public b n(final float l) {
            this.l = l;
            return this;
        }
        
        public b o(final CharSequence a) {
            this.a = a;
            return this;
        }
        
        public b p(final Layout$Alignment c) {
            this.c = c;
            return this;
        }
        
        public b q(final float k, final int j) {
            this.k = k;
            this.j = j;
            return this;
        }
        
        public b r(final int p) {
            this.p = p;
            return this;
        }
        
        public b s(final int o) {
            this.o = o;
            this.n = true;
            return this;
        }
    }
}
