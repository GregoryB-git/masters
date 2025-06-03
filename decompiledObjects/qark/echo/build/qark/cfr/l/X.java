/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import g.a;
import z.h;

public class X {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public X(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static X q(Context context, int n8, int[] arrn) {
        return new X(context, context.obtainStyledAttributes(n8, arrn));
    }

    public static X r(Context context, AttributeSet attributeSet, int[] arrn) {
        return new X(context, context.obtainStyledAttributes(attributeSet, arrn));
    }

    public static X s(Context context, AttributeSet attributeSet, int[] arrn, int n8, int n9) {
        return new X(context, context.obtainStyledAttributes(attributeSet, arrn, n8, n9));
    }

    public boolean a(int n8, boolean bl) {
        return this.b.getBoolean(n8, bl);
    }

    public int b(int n8, int n9) {
        return this.b.getColor(n8, n9);
    }

    public ColorStateList c(int n8) {
        int n9;
        ColorStateList colorStateList;
        if (this.b.hasValue(n8) && (n9 = this.b.getResourceId(n8, 0)) != 0 && (colorStateList = a.a(this.a, n9)) != null) {
            return colorStateList;
        }
        return this.b.getColorStateList(n8);
    }

    public int d(int n8, int n9) {
        return this.b.getDimensionPixelOffset(n8, n9);
    }

    public int e(int n8, int n9) {
        return this.b.getDimensionPixelSize(n8, n9);
    }

    public Drawable f(int n8) {
        int n9;
        if (this.b.hasValue(n8) && (n9 = this.b.getResourceId(n8, 0)) != 0) {
            return a.b(this.a, n9);
        }
        return this.b.getDrawable(n8);
    }

    public float g(int n8, float f8) {
        return this.b.getFloat(n8, f8);
    }

    public Typeface h(int n8, int n9, h.b b8) {
        if ((n8 = this.b.getResourceId(n8, 0)) == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return h.b(this.a, n8, this.c, n9, b8);
    }

    public int i(int n8, int n9) {
        return this.b.getInt(n8, n9);
    }

    public int j(int n8, int n9) {
        return this.b.getInteger(n8, n9);
    }

    public int k(int n8, int n9) {
        return this.b.getLayoutDimension(n8, n9);
    }

    public int l(int n8, int n9) {
        return this.b.getResourceId(n8, n9);
    }

    public String m(int n8) {
        return this.b.getString(n8);
    }

    public CharSequence n(int n8) {
        return this.b.getText(n8);
    }

    public TypedArray o() {
        return this.b;
    }

    public boolean p(int n8) {
        return this.b.hasValue(n8);
    }

    public void t() {
        this.b.recycle();
    }
}

