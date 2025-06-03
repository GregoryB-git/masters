package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import e.AbstractC1238i;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f16384a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16385b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f16386c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f16387d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f16388e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f16389f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f16390g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f16391h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f16392i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f16393j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1238i.f13610l0);
        try {
            if (!obtainStyledAttributes.hasValue(AbstractC1238i.f13614m0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i7) {
        ColorStateList e7 = e(context, i7);
        if (e7 != null && e7.isStateful()) {
            return e7.getColorForState(f16385b, e7.getDefaultColor());
        }
        TypedValue f7 = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, f7, true);
        return d(context, i7, f7.getFloat());
    }

    public static int c(Context context, int i7) {
        int[] iArr = f16393j;
        iArr[0] = i7;
        X r7 = X.r(context, null, iArr);
        try {
            return r7.b(0, 0);
        } finally {
            r7.t();
        }
    }

    public static int d(Context context, int i7, float f7) {
        return A.a.f(c(context, i7), Math.round(Color.alpha(r0) * f7));
    }

    public static ColorStateList e(Context context, int i7) {
        int[] iArr = f16393j;
        iArr[0] = i7;
        X r7 = X.r(context, null, iArr);
        try {
            return r7.c(0);
        } finally {
            r7.t();
        }
    }

    public static TypedValue f() {
        ThreadLocal threadLocal = f16384a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
