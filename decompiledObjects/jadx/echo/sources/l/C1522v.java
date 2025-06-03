package l;

import I.AbstractC0421s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import e.AbstractC1238i;
import java.lang.ref.WeakReference;
import java.util.Locale;
import z.h;

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1522v {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f16467a;

    /* renamed from: b, reason: collision with root package name */
    public V f16468b;

    /* renamed from: c, reason: collision with root package name */
    public V f16469c;

    /* renamed from: d, reason: collision with root package name */
    public V f16470d;

    /* renamed from: e, reason: collision with root package name */
    public V f16471e;

    /* renamed from: f, reason: collision with root package name */
    public V f16472f;

    /* renamed from: g, reason: collision with root package name */
    public V f16473g;

    /* renamed from: h, reason: collision with root package name */
    public V f16474h;

    /* renamed from: i, reason: collision with root package name */
    public final C1524x f16475i;

    /* renamed from: j, reason: collision with root package name */
    public int f16476j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f16477k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f16478l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16479m;

    public C1522v(TextView textView) {
        this.f16467a = textView;
        this.f16475i = new C1524x(textView);
    }

    public static V d(Context context, C1506e c1506e, int i7) {
        ColorStateList e7 = c1506e.e(context, i7);
        if (e7 == null) {
            return null;
        }
        V v7 = new V();
        v7.f16401d = true;
        v7.f16398a = e7;
        return v7;
    }

    public final void A(int i7, float f7) {
        this.f16475i.u(i7, f7);
    }

    public final void B(Context context, X x7) {
        String m7;
        Typeface create;
        Typeface typeface;
        this.f16476j = x7.i(AbstractC1238i.f13576c2, this.f16476j);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            int i8 = x7.i(AbstractC1238i.f13584e2, -1);
            this.f16477k = i8;
            if (i8 != -1) {
                this.f16476j &= 2;
            }
        }
        if (!x7.p(AbstractC1238i.f13580d2) && !x7.p(AbstractC1238i.f13588f2)) {
            if (x7.p(AbstractC1238i.f13572b2)) {
                this.f16479m = false;
                int i9 = x7.i(AbstractC1238i.f13572b2, 1);
                if (i9 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (i9 == 2) {
                    typeface = Typeface.SERIF;
                } else if (i9 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f16478l = typeface;
                return;
            }
            return;
        }
        this.f16478l = null;
        int i10 = x7.p(AbstractC1238i.f13588f2) ? AbstractC1238i.f13588f2 : AbstractC1238i.f13580d2;
        int i11 = this.f16477k;
        int i12 = this.f16476j;
        if (!context.isRestricted()) {
            try {
                Typeface h7 = x7.h(i10, this.f16476j, new a(i11, i12, new WeakReference(this.f16467a)));
                if (h7 != null) {
                    if (i7 >= 28 && this.f16477k != -1) {
                        h7 = Typeface.create(Typeface.create(h7, 0), this.f16477k, (this.f16476j & 2) != 0);
                    }
                    this.f16478l = h7;
                }
                this.f16479m = this.f16478l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f16478l != null || (m7 = x7.m(i10)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f16477k == -1) {
            create = Typeface.create(m7, this.f16476j);
        } else {
            create = Typeface.create(Typeface.create(m7, 0), this.f16477k, (this.f16476j & 2) != 0);
        }
        this.f16478l = create;
    }

    public final void a(Drawable drawable, V v7) {
        if (drawable == null || v7 == null) {
            return;
        }
        C1506e.g(drawable, v7, this.f16467a.getDrawableState());
    }

    public void b() {
        if (this.f16468b != null || this.f16469c != null || this.f16470d != null || this.f16471e != null) {
            Drawable[] compoundDrawables = this.f16467a.getCompoundDrawables();
            a(compoundDrawables[0], this.f16468b);
            a(compoundDrawables[1], this.f16469c);
            a(compoundDrawables[2], this.f16470d);
            a(compoundDrawables[3], this.f16471e);
        }
        if (this.f16472f == null && this.f16473g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f16467a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f16472f);
        a(compoundDrawablesRelative[2], this.f16473g);
    }

    public void c() {
        this.f16475i.a();
    }

    public int e() {
        return this.f16475i.g();
    }

    public int f() {
        return this.f16475i.h();
    }

    public int g() {
        return this.f16475i.i();
    }

    public int[] h() {
        return this.f16475i.j();
    }

    public int i() {
        return this.f16475i.k();
    }

    public ColorStateList j() {
        V v7 = this.f16474h;
        if (v7 != null) {
            return v7.f16398a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        V v7 = this.f16474h;
        if (v7 != null) {
            return v7.f16399b;
        }
        return null;
    }

    public boolean l() {
        return this.f16475i.o();
    }

    public void m(AttributeSet attributeSet, int i7) {
        boolean z7;
        boolean z8;
        String str;
        String str2;
        boolean z9;
        int autoSizeStepGranularity;
        LocaleList forLanguageTags;
        Context context = this.f16467a.getContext();
        C1506e b7 = C1506e.b();
        X s7 = X.s(context, attributeSet, AbstractC1238i.f13513M, i7, 0);
        TextView textView = this.f16467a;
        AbstractC0421s.B(textView, textView.getContext(), AbstractC1238i.f13513M, attributeSet, s7.o(), i7, 0);
        int l7 = s7.l(AbstractC1238i.f13517N, -1);
        if (s7.p(AbstractC1238i.f13529Q)) {
            this.f16468b = d(context, b7, s7.l(AbstractC1238i.f13529Q, 0));
        }
        if (s7.p(AbstractC1238i.f13521O)) {
            this.f16469c = d(context, b7, s7.l(AbstractC1238i.f13521O, 0));
        }
        if (s7.p(AbstractC1238i.f13533R)) {
            this.f16470d = d(context, b7, s7.l(AbstractC1238i.f13533R, 0));
        }
        if (s7.p(AbstractC1238i.f13525P)) {
            this.f16471e = d(context, b7, s7.l(AbstractC1238i.f13525P, 0));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (s7.p(AbstractC1238i.f13537S)) {
            this.f16472f = d(context, b7, s7.l(AbstractC1238i.f13537S, 0));
        }
        if (s7.p(AbstractC1238i.f13541T)) {
            this.f16473g = d(context, b7, s7.l(AbstractC1238i.f13541T, 0));
        }
        s7.t();
        boolean z10 = this.f16467a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (l7 != -1) {
            X q7 = X.q(context, l7, AbstractC1238i.f13564Z1);
            if (z10 || !q7.p(AbstractC1238i.f13596h2)) {
                z7 = false;
                z8 = false;
            } else {
                z7 = q7.a(AbstractC1238i.f13596h2, false);
                z8 = true;
            }
            B(context, q7);
            str2 = q7.p(AbstractC1238i.f13600i2) ? q7.m(AbstractC1238i.f13600i2) : null;
            str = (i8 < 26 || !q7.p(AbstractC1238i.f13592g2)) ? null : q7.m(AbstractC1238i.f13592g2);
            q7.t();
        } else {
            z7 = false;
            z8 = false;
            str = null;
            str2 = null;
        }
        X s8 = X.s(context, attributeSet, AbstractC1238i.f13564Z1, i7, 0);
        if (z10 || !s8.p(AbstractC1238i.f13596h2)) {
            z9 = z8;
        } else {
            z7 = s8.a(AbstractC1238i.f13596h2, false);
            z9 = true;
        }
        if (s8.p(AbstractC1238i.f13600i2)) {
            str2 = s8.m(AbstractC1238i.f13600i2);
        }
        if (i8 >= 26 && s8.p(AbstractC1238i.f13592g2)) {
            str = s8.m(AbstractC1238i.f13592g2);
        }
        if (i8 >= 28 && s8.p(AbstractC1238i.f13568a2) && s8.e(AbstractC1238i.f13568a2, -1) == 0) {
            this.f16467a.setTextSize(0, 0.0f);
        }
        B(context, s8);
        s8.t();
        if (!z10 && z9) {
            r(z7);
        }
        Typeface typeface = this.f16478l;
        if (typeface != null) {
            if (this.f16477k == -1) {
                this.f16467a.setTypeface(typeface, this.f16476j);
            } else {
                this.f16467a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f16467a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            if (i8 >= 24) {
                TextView textView2 = this.f16467a;
                forLanguageTags = LocaleList.forLanguageTags(str2);
                textView2.setTextLocales(forLanguageTags);
            } else {
                this.f16467a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        this.f16475i.p(attributeSet, i7);
        if (L.b.f3284b && this.f16475i.k() != 0) {
            int[] j7 = this.f16475i.j();
            if (j7.length > 0) {
                autoSizeStepGranularity = this.f16467a.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != -1.0f) {
                    this.f16467a.setAutoSizeTextTypeUniformWithConfiguration(this.f16475i.h(), this.f16475i.g(), this.f16475i.i(), 0);
                } else {
                    this.f16467a.setAutoSizeTextTypeUniformWithPresetSizes(j7, 0);
                }
            }
        }
        X r7 = X.r(context, attributeSet, AbstractC1238i.f13545U);
        int l8 = r7.l(AbstractC1238i.f13574c0, -1);
        Drawable c7 = l8 != -1 ? b7.c(context, l8) : null;
        int l9 = r7.l(AbstractC1238i.f13594h0, -1);
        Drawable c8 = l9 != -1 ? b7.c(context, l9) : null;
        int l10 = r7.l(AbstractC1238i.f13578d0, -1);
        Drawable c9 = l10 != -1 ? b7.c(context, l10) : null;
        int l11 = r7.l(AbstractC1238i.f13566a0, -1);
        Drawable c10 = l11 != -1 ? b7.c(context, l11) : null;
        int l12 = r7.l(AbstractC1238i.f13582e0, -1);
        Drawable c11 = l12 != -1 ? b7.c(context, l12) : null;
        int l13 = r7.l(AbstractC1238i.f13570b0, -1);
        x(c7, c8, c9, c10, c11, l13 != -1 ? b7.c(context, l13) : null);
        if (r7.p(AbstractC1238i.f13586f0)) {
            L.h.f(this.f16467a, r7.c(AbstractC1238i.f13586f0));
        }
        if (r7.p(AbstractC1238i.f13590g0)) {
            L.h.g(this.f16467a, AbstractC1494B.c(r7.i(AbstractC1238i.f13590g0, -1), null));
        }
        int e7 = r7.e(AbstractC1238i.f13598i0, -1);
        int e8 = r7.e(AbstractC1238i.f13602j0, -1);
        int e9 = r7.e(AbstractC1238i.f13606k0, -1);
        r7.t();
        if (e7 != -1) {
            L.h.h(this.f16467a, e7);
        }
        if (e8 != -1) {
            L.h.i(this.f16467a, e8);
        }
        if (e9 != -1) {
            L.h.j(this.f16467a, e9);
        }
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f16479m) {
            this.f16478l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f16476j);
            }
        }
    }

    public void o(boolean z7, int i7, int i8, int i9, int i10) {
        if (L.b.f3284b) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i7) {
        String m7;
        X q7 = X.q(context, i7, AbstractC1238i.f13564Z1);
        if (q7.p(AbstractC1238i.f13596h2)) {
            r(q7.a(AbstractC1238i.f13596h2, false));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (q7.p(AbstractC1238i.f13568a2) && q7.e(AbstractC1238i.f13568a2, -1) == 0) {
            this.f16467a.setTextSize(0, 0.0f);
        }
        B(context, q7);
        if (i8 >= 26 && q7.p(AbstractC1238i.f13592g2) && (m7 = q7.m(AbstractC1238i.f13592g2)) != null) {
            this.f16467a.setFontVariationSettings(m7);
        }
        q7.t();
        Typeface typeface = this.f16478l;
        if (typeface != null) {
            this.f16467a.setTypeface(typeface, this.f16476j);
        }
    }

    public void r(boolean z7) {
        this.f16467a.setAllCaps(z7);
    }

    public void s(int i7, int i8, int i9, int i10) {
        this.f16475i.q(i7, i8, i9, i10);
    }

    public void t(int[] iArr, int i7) {
        this.f16475i.r(iArr, i7);
    }

    public void u(int i7) {
        this.f16475i.s(i7);
    }

    public void v(ColorStateList colorStateList) {
        if (this.f16474h == null) {
            this.f16474h = new V();
        }
        V v7 = this.f16474h;
        v7.f16398a = colorStateList;
        v7.f16401d = colorStateList != null;
        y();
    }

    public void w(PorterDuff.Mode mode) {
        if (this.f16474h == null) {
            this.f16474h = new V();
        }
        V v7 = this.f16474h;
        v7.f16399b = mode;
        v7.f16400c = mode != null;
        y();
    }

    public final void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f16467a.getCompoundDrawablesRelative();
            TextView textView = this.f16467a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f16467a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f16467a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f16467a.getCompoundDrawables();
        TextView textView3 = this.f16467a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void y() {
        V v7 = this.f16474h;
        this.f16468b = v7;
        this.f16469c = v7;
        this.f16470d = v7;
        this.f16471e = v7;
        this.f16472f = v7;
        this.f16473g = v7;
    }

    public void z(int i7, float f7) {
        if (L.b.f3284b || l()) {
            return;
        }
        A(i7, f7);
    }

    /* renamed from: l.v$a */
    public class a extends h.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f16480a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f16481b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f16482c;

        public a(int i7, int i8, WeakReference weakReference) {
            this.f16480a = i7;
            this.f16481b = i8;
            this.f16482c = weakReference;
        }

        @Override // z.h.b
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i7;
            if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f16480a) != -1) {
                typeface = Typeface.create(typeface, i7, (this.f16481b & 2) != 0);
            }
            C1522v.this.n(this.f16482c, typeface);
        }

        @Override // z.h.b
        /* renamed from: h */
        public void f(int i7) {
        }
    }
}
