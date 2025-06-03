// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.content.res.TypedArray;
import A.a;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.content.res.ColorStateList;
import android.util.Log;
import e.i;
import android.content.Context;
import android.view.View;

public abstract class T
{
    public static final ThreadLocal a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    
    static {
        a = new ThreadLocal();
        b = new int[] { -16842910 };
        c = new int[] { 16842908 };
        d = new int[] { 16843518 };
        e = new int[] { 16842919 };
        f = new int[] { 16842912 };
        g = new int[] { 16842913 };
        h = new int[] { -16842919, -16842908 };
        i = new int[0];
        j = new int[1];
    }
    
    public static void a(final View view, Context obtainStyledAttributes) {
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(e.i.l0);
        Label_0071: {
            try {
                if (!((TypedArray)obtainStyledAttributes).hasValue(e.i.m0)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("View ");
                    sb.append(view.getClass());
                    sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                    Log.e("ThemeUtils", sb.toString());
                }
            }
            finally {
                break Label_0071;
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            return;
        }
        ((TypedArray)obtainStyledAttributes).recycle();
    }
    
    public static int b(final Context context, final int n) {
        final ColorStateList e = e(context, n);
        if (e != null && e.isStateful()) {
            return e.getColorForState(T.b, e.getDefaultColor());
        }
        final TypedValue f = f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return d(context, n, f.getFloat());
    }
    
    public static int c(Context r, int b) {
        final int[] j = T.j;
        j[0] = b;
        r = (Context)X.r(r, null, j);
        try {
            b = ((X)r).b(0, 0);
            return b;
        }
        finally {
            ((X)r).t();
        }
    }
    
    public static int d(final Context context, int c, final float n) {
        c = c(context, c);
        return A.a.f(c, Math.round(Color.alpha(c) * n));
    }
    
    public static ColorStateList e(Context r, final int n) {
        final int[] j = T.j;
        j[0] = n;
        r = (Context)X.r(r, null, j);
        try {
            return ((X)r).c(0);
        }
        finally {
            ((X)r).t();
        }
    }
    
    public static TypedValue f() {
        final ThreadLocal a = T.a;
        TypedValue value;
        if ((value = a.get()) == null) {
            value = new TypedValue();
            a.set(value);
        }
        return value;
    }
}
