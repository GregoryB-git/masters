// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import C.b;
import android.view.MenuItem;

public abstract class i
{
    public static void a(final MenuItem menuItem, final char c, final int n) {
        if (menuItem instanceof b) {
            ((b)menuItem).setAlphabeticShortcut(c, n);
            return;
        }
        if (Build$VERSION.SDK_INT >= 26) {
            a.g(menuItem, c, n);
        }
    }
    
    public static void b(final MenuItem menuItem, final CharSequence contentDescription) {
        if (menuItem instanceof b) {
            ((b)menuItem).setContentDescription(contentDescription);
            return;
        }
        if (Build$VERSION.SDK_INT >= 26) {
            a.h(menuItem, contentDescription);
        }
    }
    
    public static void c(final MenuItem menuItem, final ColorStateList iconTintList) {
        if (menuItem instanceof b) {
            ((b)menuItem).setIconTintList(iconTintList);
            return;
        }
        if (Build$VERSION.SDK_INT >= 26) {
            a.i(menuItem, iconTintList);
        }
    }
    
    public static void d(final MenuItem menuItem, final PorterDuff$Mode iconTintMode) {
        if (menuItem instanceof b) {
            ((b)menuItem).setIconTintMode(iconTintMode);
            return;
        }
        if (Build$VERSION.SDK_INT >= 26) {
            a.j(menuItem, iconTintMode);
        }
    }
    
    public static void e(final MenuItem menuItem, final char c, final int n) {
        if (menuItem instanceof b) {
            ((b)menuItem).setNumericShortcut(c, n);
            return;
        }
        if (Build$VERSION.SDK_INT >= 26) {
            a.k(menuItem, c, n);
        }
    }
    
    public static void f(final MenuItem menuItem, final CharSequence tooltipText) {
        if (menuItem instanceof b) {
            ((b)menuItem).setTooltipText(tooltipText);
            return;
        }
        if (Build$VERSION.SDK_INT >= 26) {
            a.m(menuItem, tooltipText);
        }
    }
    
    public abstract static class a
    {
        public static int a(final MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }
        
        public static CharSequence b(final MenuItem menuItem) {
            return menuItem.getContentDescription();
        }
        
        public static ColorStateList c(final MenuItem menuItem) {
            return menuItem.getIconTintList();
        }
        
        public static PorterDuff$Mode d(final MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }
        
        public static int e(final MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }
        
        public static CharSequence f(final MenuItem menuItem) {
            return menuItem.getTooltipText();
        }
        
        public static MenuItem g(final MenuItem menuItem, final char c, final int n) {
            return menuItem.setAlphabeticShortcut(c, n);
        }
        
        public static MenuItem h(final MenuItem menuItem, final CharSequence contentDescription) {
            return menuItem.setContentDescription(contentDescription);
        }
        
        public static MenuItem i(final MenuItem menuItem, final ColorStateList iconTintList) {
            return menuItem.setIconTintList(iconTintList);
        }
        
        public static MenuItem j(final MenuItem menuItem, final PorterDuff$Mode iconTintMode) {
            return menuItem.setIconTintMode(iconTintMode);
        }
        
        public static MenuItem k(final MenuItem menuItem, final char c, final int n) {
            return menuItem.setNumericShortcut(c, n);
        }
        
        public static MenuItem l(final MenuItem menuItem, final char c, final char c2, final int n, final int n2) {
            return menuItem.setShortcut(c, c2, n, n2);
        }
        
        public static MenuItem m(final MenuItem menuItem, final CharSequence tooltipText) {
            return menuItem.setTooltipText(tooltipText);
        }
    }
}
