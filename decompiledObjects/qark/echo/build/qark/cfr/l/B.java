/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.DrawableContainer
 *  android.graphics.drawable.DrawableContainer$DrawableContainerState
 *  android.graphics.drawable.ScaleDrawable
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.String
 */
package l;

import B.b;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import h.c;

public abstract class B {
    public static final int[] a;
    public static final int[] b;
    public static final Rect c;
    public static Class d;

    static {
        a = new int[]{16842912};
        b = new int[0];
        c = new Rect();
        try {
            d = Class.forName((String)"android.graphics.Insets");
        }
        catch (ClassNotFoundException classNotFoundException) {}
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Drawable drawable2) {
        if (drawable2 instanceof DrawableContainer) {
            if (!((drawable2 = drawable2.getConstantState()) instanceof DrawableContainer.DrawableContainerState)) return true;
            drawable2 = ((DrawableContainer.DrawableContainerState)drawable2).getChildren();
            int n8 = drawable2.length;
            int n9 = 0;
            while (n9 < n8) {
                if (!B.a(drawable2[n9])) {
                    return false;
                }
                ++n9;
            }
            return true;
        }
        if (drawable2 instanceof b) {
            drawable2 = ((b)drawable2).a();
            do {
                return B.a(drawable2);
                break;
            } while (true);
        }
        if (drawable2 instanceof c) {
            drawable2 = ((c)drawable2).a();
            return B.a(drawable2);
        }
        if (!(drawable2 instanceof ScaleDrawable)) return true;
        drawable2 = ((ScaleDrawable)drawable2).getDrawable();
        return B.a(drawable2);
    }

    public static void b(Drawable drawable2) {
    }

    public static PorterDuff.Mode c(int n8, PorterDuff.Mode mode) {
        if (n8 != 3) {
            if (n8 != 5) {
                if (n8 != 9) {
                    switch (n8) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}

