// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.graphics.drawable.DrawableWrapper;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.drawable.ScaleDrawable;
import h.c;
import B.b;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;

public abstract class B
{
    public static final int[] a;
    public static final int[] b;
    public static final Rect c;
    public static Class d;
    
    static {
        a = new int[] { 16842912 };
        b = new int[0];
        c = new Rect();
        try {
            B.d = Class.forName("android.graphics.Insets");
        }
        catch (ClassNotFoundException ex) {}
    }
    
    public static boolean a(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof b) {
                drawable = ((b)drawable).a();
            }
            else if (drawable instanceof c) {
                drawable = ((c)drawable).a();
            }
            else {
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable = ((DrawableWrapper)drawable).getDrawable();
            }
            return a(drawable);
        }
        final Drawable$ConstantState constantState = drawable.getConstantState();
        if (constantState instanceof DrawableContainer$DrawableContainerState) {
            final Drawable[] children = ((DrawableContainer$DrawableContainerState)constantState).getChildren();
            for (int length = children.length, i = 0; i < length; ++i) {
                if (!a(children[i])) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void b(final Drawable drawable) {
    }
    
    public static PorterDuff$Mode c(final int n, final PorterDuff$Mode porterDuff$Mode) {
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
        }
    }
}
