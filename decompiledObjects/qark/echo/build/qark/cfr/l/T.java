/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Color
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 */
package l;

import A.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import e.i;
import l.X;

public abstract class T {
    public static final ThreadLocal a = new ThreadLocal();
    public static final int[] b = new int[]{-16842910};
    public static final int[] c = new int[]{16842908};
    public static final int[] d = new int[]{16843518};
    public static final int[] e = new int[]{16842919};
    public static final int[] f = new int[]{16842912};
    public static final int[] g = new int[]{16842913};
    public static final int[] h = new int[]{-16842919, -16842908};
    public static final int[] i = new int[0];
    public static final int[] j = new int[1];

    public static void a(View view, Context context) {
        Throwable throwable2;
        block3 : {
            block2 : {
                context = context.obtainStyledAttributes(i.l0);
                try {
                    if (context.hasValue(i.m0)) break block2;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("View ");
                    stringBuilder.append((Object)view.getClass());
                    stringBuilder.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                    Log.e((String)"ThemeUtils", (String)stringBuilder.toString());
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            context.recycle();
            return;
        }
        context.recycle();
        throw throwable2;
    }

    public static int b(Context context, int n8) {
        ColorStateList colorStateList = T.e(context, n8);
        if (colorStateList != null && colorStateList.isStateful()) {
            return colorStateList.getColorForState(b, colorStateList.getDefaultColor());
        }
        colorStateList = T.f();
        context.getTheme().resolveAttribute(16842803, (TypedValue)colorStateList, true);
        return T.d(context, n8, colorStateList.getFloat());
    }

    public static int c(Context object, int n8) {
        int[] arrn = j;
        arrn[0] = n8;
        object = X.r((Context)object, null, arrn);
        try {
            n8 = object.b(0, 0);
            return n8;
        }
        finally {
            object.t();
        }
    }

    public static int d(Context context, int n8, float f8) {
        n8 = T.c(context, n8);
        return a.f(n8, Math.round((float)((float)Color.alpha((int)n8) * f8)));
    }

    public static ColorStateList e(Context object, int n8) {
        ColorStateList colorStateList = j;
        colorStateList[0] = n8;
        object = X.r((Context)object, null, (int[])colorStateList);
        try {
            colorStateList = object.c(0);
            return colorStateList;
        }
        finally {
            object.t();
        }
    }

    public static TypedValue f() {
        TypedValue typedValue;
        ThreadLocal threadLocal = a;
        TypedValue typedValue2 = typedValue = (TypedValue)threadLocal.get();
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set((Object)typedValue2);
        }
        return typedValue2;
    }
}

