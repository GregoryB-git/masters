/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.DrawableContainer
 *  android.graphics.drawable.DrawableContainer$DrawableContainerState
 *  android.graphics.drawable.InsetDrawable
 *  android.util.AttributeSet
 *  java.lang.Object
 *  org.xmlpull.v1.XmlPullParser
 */
package B;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public abstract class a {
    public static void a(Drawable drawable2, Resources.Theme theme) {
        b.a(drawable2, theme);
    }

    public static boolean b(Drawable drawable2) {
        return b.b(drawable2);
    }

    public static int c(Drawable drawable2) {
        return a.a(drawable2);
    }

    public static ColorFilter d(Drawable drawable2) {
        return b.c(drawable2);
    }

    public static int e(Drawable drawable2) {
        return c.a(drawable2);
    }

    public static void f(Drawable drawable2, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b.d(drawable2, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean g(Drawable drawable2) {
        return a.d(drawable2);
    }

    public static void h(Drawable drawable2) {
        drawable2.jumpToCurrentState();
    }

    public static void i(Drawable drawable2, boolean bl) {
        a.e(drawable2, bl);
    }

    public static void j(Drawable drawable2, float f8, float f9) {
        b.e(drawable2, f8, f9);
    }

    public static void k(Drawable drawable2, int n8, int n9, int n10, int n11) {
        b.f(drawable2, n8, n9, n10, n11);
    }

    public static void l(Drawable drawable2, int n8) {
        b.g(drawable2, n8);
    }

    public static void m(Drawable drawable2, ColorStateList colorStateList) {
        b.h(drawable2, colorStateList);
    }

    public static void n(Drawable drawable2, PorterDuff.Mode mode) {
        b.i(drawable2, mode);
    }

    public static Drawable o(Drawable drawable2) {
        return drawable2;
    }

    public static abstract class a {
        public static int a(Drawable drawable2) {
            return drawable2.getAlpha();
        }

        public static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int n8) {
            return drawableContainerState.getChild(n8);
        }

        public static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        public static boolean d(Drawable drawable2) {
            return drawable2.isAutoMirrored();
        }

        public static void e(Drawable drawable2, boolean bl) {
            drawable2.setAutoMirrored(bl);
        }
    }

    public static abstract class b {
        public static void a(Drawable drawable2, Resources.Theme theme) {
            drawable2.applyTheme(theme);
        }

        public static boolean b(Drawable drawable2) {
            return drawable2.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable2) {
            return drawable2.getColorFilter();
        }

        public static void d(Drawable drawable2, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable2.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable2, float f8, float f9) {
            drawable2.setHotspot(f8, f9);
        }

        public static void f(Drawable drawable2, int n8, int n9, int n10, int n11) {
            drawable2.setHotspotBounds(n8, n9, n10, n11);
        }

        public static void g(Drawable drawable2, int n8) {
            drawable2.setTint(n8);
        }

        public static void h(Drawable drawable2, ColorStateList colorStateList) {
            drawable2.setTintList(colorStateList);
        }

        public static void i(Drawable drawable2, PorterDuff.Mode mode) {
            drawable2.setTintMode(mode);
        }
    }

    public static abstract class c {
        public static int a(Drawable drawable2) {
            return drawable2.getLayoutDirection();
        }

        public static boolean b(Drawable drawable2, int n8) {
            return drawable2.setLayoutDirection(n8);
        }
    }

}

