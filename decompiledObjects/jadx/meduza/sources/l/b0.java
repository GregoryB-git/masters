package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import j0.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import w.f;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f9265a;

    /* renamed from: b, reason: collision with root package name */
    public x0 f9266b;

    /* renamed from: c, reason: collision with root package name */
    public x0 f9267c;

    /* renamed from: d, reason: collision with root package name */
    public x0 f9268d;

    /* renamed from: e, reason: collision with root package name */
    public x0 f9269e;
    public x0 f;

    /* renamed from: g, reason: collision with root package name */
    public x0 f9270g;

    /* renamed from: h, reason: collision with root package name */
    public x0 f9271h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f9272i;

    /* renamed from: j, reason: collision with root package name */
    public int f9273j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f9274k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f9275l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9276m;

    public class a extends f.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f9277a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9278b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f9279c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f9277a = i10;
            this.f9278b = i11;
            this.f9279c = weakReference;
        }

        @Override // w.f.e
        public final void c(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f9277a) != -1) {
                typeface = f.a(typeface, i10, (this.f9278b & 2) != 0);
            }
            b0 b0Var = b0.this;
            WeakReference weakReference = this.f9279c;
            if (b0Var.f9276m) {
                b0Var.f9275l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
                    if (textView.isAttachedToWindow()) {
                        textView.post(new c0(textView, typeface, b0Var.f9273j));
                    } else {
                        textView.setTypeface(typeface, b0Var.f9273j);
                    }
                }
            }
        }
    }

    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    public static class c {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static class d {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class e {
        public static int a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    public static class f {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            Typeface create;
            create = Typeface.create(typeface, i10, z10);
            return create;
        }
    }

    public b0(TextView textView) {
        this.f9265a = textView;
        this.f9272i = new e0(textView);
    }

    public static x0 c(Context context, j jVar, int i10) {
        ColorStateList i11;
        synchronized (jVar) {
            i11 = jVar.f9360a.i(context, i10);
        }
        if (i11 == null) {
            return null;
        }
        x0 x0Var = new x0();
        x0Var.f9495d = true;
        x0Var.f9492a = i11;
        return x0Var;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i10 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        text.getClass();
        if (i10 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 + 0 : i11 + 0;
        int i14 = i11 > i12 ? i11 - 0 : i12 + 0;
        int length = text.length();
        if (i13 >= 0 && i14 <= length) {
            int i15 = editorInfo.inputType & 4095;
            if (!(i15 == 129 || i15 == 225 || i15 == 18)) {
                if (length <= 2048) {
                    i0.a.c(editorInfo, text, i13, i14);
                    return;
                }
                int i16 = i14 - i13;
                int i17 = i16 > 1024 ? 0 : i16;
                int i18 = 2048 - i17;
                int min = Math.min(text.length() - i14, i18 - Math.min(i13, (int) (i18 * 0.8d)));
                int min2 = Math.min(i13, i18 - min);
                int i19 = i13 - min2;
                if (Character.isLowSurrogate(text.charAt(i19))) {
                    i19++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i14 + min) - 1))) {
                    min--;
                }
                CharSequence concat = i17 != i16 ? TextUtils.concat(text.subSequence(i19, i19 + min2), text.subSequence(i14, min + i14)) : text.subSequence(i19, min2 + i17 + min + i19);
                int i20 = min2 + 0;
                i0.a.c(editorInfo, concat, i20, i17 + i20);
                return;
            }
        }
        i0.a.c(editorInfo, null, 0, 0);
    }

    public final void a(Drawable drawable, x0 x0Var) {
        if (drawable == null || x0Var == null) {
            return;
        }
        j.d(drawable, x0Var, this.f9265a.getDrawableState());
    }

    public final void b() {
        if (this.f9266b != null || this.f9267c != null || this.f9268d != null || this.f9269e != null) {
            Drawable[] compoundDrawables = this.f9265a.getCompoundDrawables();
            a(compoundDrawables[0], this.f9266b);
            a(compoundDrawables[1], this.f9267c);
            a(compoundDrawables[2], this.f9268d);
            a(compoundDrawables[3], this.f9269e);
        }
        if (this.f == null && this.f9270g == null) {
            return;
        }
        Drawable[] a10 = b.a(this.f9265a);
        a(a10[0], this.f);
        a(a10[2], this.f9270g);
    }

    public final ColorStateList d() {
        x0 x0Var = this.f9271h;
        if (x0Var != null) {
            return x0Var.f9492a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        x0 x0Var = this.f9271h;
        if (x0Var != null) {
            return x0Var.f9493b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        int i11;
        int resourceId;
        Context context = this.f9265a.getContext();
        j a10 = j.a();
        int[] iArr = b.a0.f1579u;
        z0 m10 = z0.m(context, attributeSet, iArr, i10);
        TextView textView = this.f9265a;
        e0.d0.g(textView, textView.getContext(), iArr, attributeSet, m10.f9519b, i10);
        int i12 = m10.i(0, -1);
        if (m10.l(3)) {
            this.f9266b = c(context, a10, m10.i(3, 0));
        }
        if (m10.l(1)) {
            this.f9267c = c(context, a10, m10.i(1, 0));
        }
        if (m10.l(4)) {
            this.f9268d = c(context, a10, m10.i(4, 0));
        }
        if (m10.l(2)) {
            this.f9269e = c(context, a10, m10.i(2, 0));
        }
        int i13 = Build.VERSION.SDK_INT;
        if (m10.l(5)) {
            this.f = c(context, a10, m10.i(5, 0));
        }
        if (m10.l(6)) {
            this.f9270g = c(context, a10, m10.i(6, 0));
        }
        m10.n();
        boolean z12 = this.f9265a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (i12 != -1) {
            z0 z0Var = new z0(context, context.obtainStyledAttributes(i12, b.a0.J));
            if (z12 || !z0Var.l(14)) {
                z10 = false;
                z11 = false;
            } else {
                z10 = z0Var.a(14, false);
                z11 = true;
            }
            n(context, z0Var);
            str = z0Var.l(15) ? z0Var.j(15) : null;
            str2 = (i13 < 26 || !z0Var.l(13)) ? null : z0Var.j(13);
            z0Var.n();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        z0 z0Var2 = new z0(context, context.obtainStyledAttributes(attributeSet, b.a0.J, i10, 0));
        if (!z12 && z0Var2.l(14)) {
            z10 = z0Var2.a(14, false);
            z11 = true;
        }
        if (z0Var2.l(15)) {
            str = z0Var2.j(15);
        }
        String str3 = str;
        if (i13 >= 26 && z0Var2.l(13)) {
            str2 = z0Var2.j(13);
        }
        String str4 = str2;
        if (i13 >= 28 && z0Var2.l(0) && z0Var2.d(0, -1) == 0) {
            this.f9265a.setTextSize(0, 0.0f);
        }
        n(context, z0Var2);
        z0Var2.n();
        if (!z12 && z11) {
            this.f9265a.setAllCaps(z10);
        }
        Typeface typeface = this.f9275l;
        if (typeface != null) {
            if (this.f9274k == -1) {
                this.f9265a.setTypeface(typeface, this.f9273j);
            } else {
                this.f9265a.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            e.d(this.f9265a, str4);
        }
        if (str3 != null) {
            if (i13 >= 24) {
                d.b(this.f9265a, d.a(str3));
            } else {
                b.c(this.f9265a, c.a(str3.split(",")[0]));
            }
        }
        e0 e0Var = this.f9272i;
        Context context2 = e0Var.f9330j;
        int[] iArr2 = b.a0.f1580v;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        TextView textView2 = e0Var.f9329i;
        e0.d0.g(textView2, textView2.getContext(), iArr2, attributeSet, obtainStyledAttributes, i10);
        if (obtainStyledAttributes.hasValue(5)) {
            e0Var.f9322a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i14 = 0; i14 < length; i14++) {
                    iArr3[i14] = obtainTypedArray.getDimensionPixelSize(i14, -1);
                }
                e0Var.f = e0.b(iArr3);
                e0Var.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!e0Var.i()) {
            e0Var.f9322a = 0;
        } else if (e0Var.f9322a == 1) {
            if (!e0Var.f9327g) {
                DisplayMetrics displayMetrics = e0Var.f9330j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i11 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i11 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                e0Var.j(dimension2, dimension3, dimension);
            }
            e0Var.g();
        }
        if (f1.f9341b) {
            e0 e0Var2 = this.f9272i;
            if (e0Var2.f9322a != 0) {
                int[] iArr4 = e0Var2.f;
                if (iArr4.length > 0) {
                    if (e.a(this.f9265a) != -1.0f) {
                        e.b(this.f9265a, Math.round(this.f9272i.f9325d), Math.round(this.f9272i.f9326e), Math.round(this.f9272i.f9324c), 0);
                    } else {
                        e.c(this.f9265a, iArr4, 0);
                    }
                }
            }
        }
        z0 z0Var3 = new z0(context, context.obtainStyledAttributes(attributeSet, b.a0.f1580v));
        int i15 = z0Var3.i(8, -1);
        Drawable b10 = i15 != -1 ? a10.b(context, i15) : null;
        int i16 = z0Var3.i(13, -1);
        Drawable b11 = i16 != -1 ? a10.b(context, i16) : null;
        int i17 = z0Var3.i(9, -1);
        Drawable b12 = i17 != -1 ? a10.b(context, i17) : null;
        int i18 = z0Var3.i(6, -1);
        Drawable b13 = i18 != -1 ? a10.b(context, i18) : null;
        int i19 = z0Var3.i(10, -1);
        Drawable b14 = i19 != -1 ? a10.b(context, i19) : null;
        int i20 = z0Var3.i(7, -1);
        Drawable b15 = i20 != -1 ? a10.b(context, i20) : null;
        if (b14 != null || b15 != null) {
            Drawable[] a11 = b.a(this.f9265a);
            TextView textView3 = this.f9265a;
            if (b14 == null) {
                b14 = a11[0];
            }
            if (b11 == null) {
                b11 = a11[1];
            }
            if (b15 == null) {
                b15 = a11[2];
            }
            if (b13 == null) {
                b13 = a11[3];
            }
            b.b(textView3, b14, b11, b15, b13);
        } else if (b10 != null || b11 != null || b12 != null || b13 != null) {
            Drawable[] a12 = b.a(this.f9265a);
            Drawable drawable = a12[0];
            if (drawable == null && a12[2] == null) {
                Drawable[] compoundDrawables = this.f9265a.getCompoundDrawables();
                TextView textView4 = this.f9265a;
                if (b10 == null) {
                    b10 = compoundDrawables[0];
                }
                if (b11 == null) {
                    b11 = compoundDrawables[1];
                }
                if (b12 == null) {
                    b12 = compoundDrawables[2];
                }
                if (b13 == null) {
                    b13 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, b13);
            } else {
                TextView textView5 = this.f9265a;
                if (b11 == null) {
                    b11 = a12[1];
                }
                Drawable drawable2 = a12[2];
                if (b13 == null) {
                    b13 = a12[3];
                }
                b.b(textView5, drawable, b11, drawable2, b13);
            }
        }
        if (z0Var3.l(11)) {
            ColorStateList b16 = z0Var3.b(11);
            TextView textView6 = this.f9265a;
            textView6.getClass();
            if (Build.VERSION.SDK_INT >= 24) {
                h.a.f(textView6, b16);
            } else if (textView6 instanceof j0.j) {
                ((j0.j) textView6).setSupportCompoundDrawablesTintList(b16);
            }
        }
        if (z0Var3.l(12)) {
            PorterDuff.Mode b17 = i0.b(z0Var3.h(12, -1), null);
            TextView textView7 = this.f9265a;
            textView7.getClass();
            if (Build.VERSION.SDK_INT >= 24) {
                h.a.g(textView7, b17);
            } else if (textView7 instanceof j0.j) {
                ((j0.j) textView7).setSupportCompoundDrawablesTintMode(b17);
            }
        }
        int d10 = z0Var3.d(15, -1);
        int d11 = z0Var3.d(18, -1);
        int d12 = z0Var3.d(19, -1);
        z0Var3.n();
        if (d10 != -1) {
            j0.h.b(this.f9265a, d10);
        }
        if (d11 != -1) {
            j0.h.c(this.f9265a, d11);
        }
        if (d12 != -1) {
            TextView textView8 = this.f9265a;
            if (d12 < 0) {
                throw new IllegalArgumentException();
            }
            if (d12 != textView8.getPaint().getFontMetricsInt(null)) {
                textView8.setLineSpacing(d12 - r2, 1.0f);
            }
        }
    }

    public final void g(Context context, int i10) {
        String j10;
        z0 z0Var = new z0(context, context.obtainStyledAttributes(i10, b.a0.J));
        if (z0Var.l(14)) {
            this.f9265a.setAllCaps(z0Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (z0Var.l(0) && z0Var.d(0, -1) == 0) {
            this.f9265a.setTextSize(0, 0.0f);
        }
        n(context, z0Var);
        if (i11 >= 26 && z0Var.l(13) && (j10 = z0Var.j(13)) != null) {
            e.d(this.f9265a, j10);
        }
        z0Var.n();
        Typeface typeface = this.f9275l;
        if (typeface != null) {
            this.f9265a.setTypeface(typeface, this.f9273j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        e0 e0Var = this.f9272i;
        if (e0Var.i()) {
            DisplayMetrics displayMetrics = e0Var.f9330j.getResources().getDisplayMetrics();
            e0Var.j(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (e0Var.g()) {
                e0Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        e0 e0Var = this.f9272i;
        if (e0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = e0Var.f9330j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                e0Var.f = e0.b(iArr2);
                if (!e0Var.h()) {
                    StringBuilder l10 = defpackage.f.l("None of the preset sizes is valid: ");
                    l10.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(l10.toString());
                }
            } else {
                e0Var.f9327g = false;
            }
            if (e0Var.g()) {
                e0Var.a();
            }
        }
    }

    public final void k(int i10) {
        e0 e0Var = this.f9272i;
        if (e0Var.i()) {
            if (i10 == 0) {
                e0Var.f9322a = 0;
                e0Var.f9325d = -1.0f;
                e0Var.f9326e = -1.0f;
                e0Var.f9324c = -1.0f;
                e0Var.f = new int[0];
                e0Var.f9323b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(defpackage.f.h("Unknown auto-size text type: ", i10));
            }
            DisplayMetrics displayMetrics = e0Var.f9330j.getResources().getDisplayMetrics();
            e0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (e0Var.g()) {
                e0Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f9271h == null) {
            this.f9271h = new x0();
        }
        x0 x0Var = this.f9271h;
        x0Var.f9492a = colorStateList;
        x0Var.f9495d = colorStateList != null;
        this.f9266b = x0Var;
        this.f9267c = x0Var;
        this.f9268d = x0Var;
        this.f9269e = x0Var;
        this.f = x0Var;
        this.f9270g = x0Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f9271h == null) {
            this.f9271h = new x0();
        }
        x0 x0Var = this.f9271h;
        x0Var.f9493b = mode;
        x0Var.f9494c = mode != null;
        this.f9266b = x0Var;
        this.f9267c = x0Var;
        this.f9268d = x0Var;
        this.f9269e = x0Var;
        this.f = x0Var;
        this.f9270g = x0Var;
    }

    public final void n(Context context, z0 z0Var) {
        String j10;
        Typeface create;
        Typeface typeface;
        this.f9273j = z0Var.h(2, this.f9273j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int h10 = z0Var.h(11, -1);
            this.f9274k = h10;
            if (h10 != -1) {
                this.f9273j = (this.f9273j & 2) | 0;
            }
        }
        if (!z0Var.l(10) && !z0Var.l(12)) {
            if (z0Var.l(1)) {
                this.f9276m = false;
                int h11 = z0Var.h(1, 1);
                if (h11 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (h11 == 2) {
                    typeface = Typeface.SERIF;
                } else if (h11 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f9275l = typeface;
                return;
            }
            return;
        }
        this.f9275l = null;
        int i11 = z0Var.l(12) ? 12 : 10;
        int i12 = this.f9274k;
        int i13 = this.f9273j;
        if (!context.isRestricted()) {
            try {
                Typeface g10 = z0Var.g(i11, this.f9273j, new a(i12, i13, new WeakReference(this.f9265a)));
                if (g10 != null) {
                    if (i10 >= 28 && this.f9274k != -1) {
                        g10 = f.a(Typeface.create(g10, 0), this.f9274k, (this.f9273j & 2) != 0);
                    }
                    this.f9275l = g10;
                }
                this.f9276m = this.f9275l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f9275l != null || (j10 = z0Var.j(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f9274k == -1) {
            create = Typeface.create(j10, this.f9273j);
        } else {
            create = f.a(Typeface.create(j10, 0), this.f9274k, (this.f9273j & 2) != 0);
        }
        this.f9275l = create;
    }
}
