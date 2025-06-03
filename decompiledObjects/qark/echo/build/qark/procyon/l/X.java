// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.graphics.Typeface;
import z.h;
import android.graphics.drawable.Drawable;
import g.a;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.content.Context;

public class X
{
    public final Context a;
    public final TypedArray b;
    public TypedValue c;
    
    public X(final Context a, final TypedArray b) {
        this.a = a;
        this.b = b;
    }
    
    public static X q(final Context context, final int n, final int[] array) {
        return new X(context, context.obtainStyledAttributes(n, array));
    }
    
    public static X r(final Context context, final AttributeSet set, final int[] array) {
        return new X(context, context.obtainStyledAttributes(set, array));
    }
    
    public static X s(final Context context, final AttributeSet set, final int[] array, final int n, final int n2) {
        return new X(context, context.obtainStyledAttributes(set, array, n, n2));
    }
    
    public boolean a(final int n, final boolean b) {
        return this.b.getBoolean(n, b);
    }
    
    public int b(final int n, final int n2) {
        return this.b.getColor(n, n2);
    }
    
    public ColorStateList c(final int n) {
        if (this.b.hasValue(n)) {
            final int resourceId = this.b.getResourceId(n, 0);
            if (resourceId != 0) {
                final ColorStateList a = g.a.a(this.a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.b.getColorStateList(n);
    }
    
    public int d(final int n, final int n2) {
        return this.b.getDimensionPixelOffset(n, n2);
    }
    
    public int e(final int n, final int n2) {
        return this.b.getDimensionPixelSize(n, n2);
    }
    
    public Drawable f(final int n) {
        if (this.b.hasValue(n)) {
            final int resourceId = this.b.getResourceId(n, 0);
            if (resourceId != 0) {
                return g.a.b(this.a, resourceId);
            }
        }
        return this.b.getDrawable(n);
    }
    
    public float g(final int n, final float n2) {
        return this.b.getFloat(n, n2);
    }
    
    public Typeface h(int resourceId, final int n, final h.b b) {
        resourceId = this.b.getResourceId(resourceId, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return h.b(this.a, resourceId, this.c, n, b);
    }
    
    public int i(final int n, final int n2) {
        return this.b.getInt(n, n2);
    }
    
    public int j(final int n, final int n2) {
        return this.b.getInteger(n, n2);
    }
    
    public int k(final int n, final int n2) {
        return this.b.getLayoutDimension(n, n2);
    }
    
    public int l(final int n, final int n2) {
        return this.b.getResourceId(n, n2);
    }
    
    public String m(final int n) {
        return this.b.getString(n);
    }
    
    public CharSequence n(final int n) {
        return this.b.getText(n);
    }
    
    public TypedArray o() {
        return this.b;
    }
    
    public boolean p(final int n) {
        return this.b.hasValue(n);
    }
    
    public void t() {
        this.b.recycle();
    }
}
