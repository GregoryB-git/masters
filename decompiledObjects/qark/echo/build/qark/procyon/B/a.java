// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B;

import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;

public abstract class a
{
    public static void a(final Drawable drawable, final Resources$Theme resources$Theme) {
        b.a(drawable, resources$Theme);
    }
    
    public static boolean b(final Drawable drawable) {
        return b.b(drawable);
    }
    
    public static int c(final Drawable drawable) {
        return a.a(drawable);
    }
    
    public static ColorFilter d(final Drawable drawable) {
        return b.c(drawable);
    }
    
    public static int e(final Drawable drawable) {
        return c.a(drawable);
    }
    
    public static void f(final Drawable drawable, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        b.d(drawable, resources, xmlPullParser, set, resources$Theme);
    }
    
    public static boolean g(final Drawable drawable) {
        return a.d(drawable);
    }
    
    public static void h(final Drawable drawable) {
        drawable.jumpToCurrentState();
    }
    
    public static void i(final Drawable drawable, final boolean b) {
        a.e(drawable, b);
    }
    
    public static void j(final Drawable drawable, final float n, final float n2) {
        b.e(drawable, n, n2);
    }
    
    public static void k(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
        b.f(drawable, n, n2, n3, n4);
    }
    
    public static void l(final Drawable drawable, final int n) {
        b.g(drawable, n);
    }
    
    public static void m(final Drawable drawable, final ColorStateList list) {
        b.h(drawable, list);
    }
    
    public static void n(final Drawable drawable, final PorterDuff$Mode porterDuff$Mode) {
        b.i(drawable, porterDuff$Mode);
    }
    
    public static Drawable o(final Drawable drawable) {
        return drawable;
    }
    
    public abstract static class a
    {
        public static int a(final Drawable drawable) {
            return drawable.getAlpha();
        }
        
        public static Drawable b(final DrawableContainer$DrawableContainerState drawableContainer$DrawableContainerState, final int n) {
            return drawableContainer$DrawableContainerState.getChild(n);
        }
        
        public static Drawable c(final InsetDrawable insetDrawable) {
            return ((DrawableWrapper)insetDrawable).getDrawable();
        }
        
        public static boolean d(final Drawable drawable) {
            return drawable.isAutoMirrored();
        }
        
        public static void e(final Drawable drawable, final boolean autoMirrored) {
            drawable.setAutoMirrored(autoMirrored);
        }
    }
    
    public abstract static class b
    {
        public static void a(final Drawable drawable, final Resources$Theme resources$Theme) {
            drawable.applyTheme(resources$Theme);
        }
        
        public static boolean b(final Drawable drawable) {
            return drawable.canApplyTheme();
        }
        
        public static ColorFilter c(final Drawable drawable) {
            return drawable.getColorFilter();
        }
        
        public static void d(final Drawable drawable, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            drawable.inflate(resources, xmlPullParser, set, resources$Theme);
        }
        
        public static void e(final Drawable drawable, final float n, final float n2) {
            drawable.setHotspot(n, n2);
        }
        
        public static void f(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
            drawable.setHotspotBounds(n, n2, n3, n4);
        }
        
        public static void g(final Drawable drawable, final int tint) {
            drawable.setTint(tint);
        }
        
        public static void h(final Drawable drawable, final ColorStateList tintList) {
            drawable.setTintList(tintList);
        }
        
        public static void i(final Drawable drawable, final PorterDuff$Mode tintMode) {
            drawable.setTintMode(tintMode);
        }
    }
    
    public abstract static class c
    {
        public static int a(final Drawable drawable) {
            return drawable.getLayoutDirection();
        }
        
        public static boolean b(final Drawable drawable, final int layoutDirection) {
            return drawable.setLayoutDirection(layoutDirection);
        }
    }
}
