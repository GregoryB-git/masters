/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.MenuItem
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package I;

import C.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

public abstract class i {
    public static void a(MenuItem menuItem, char c8, int n8) {
        if (menuItem instanceof b) {
            ((b)menuItem).setAlphabeticShortcut(c8, n8);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            a.g(menuItem, c8, n8);
        }
    }

    public static void b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof b) {
            ((b)menuItem).setContentDescription(charSequence);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            a.h(menuItem, charSequence);
        }
    }

    public static void c(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof b) {
            ((b)menuItem).setIconTintList(colorStateList);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            a.i(menuItem, colorStateList);
        }
    }

    public static void d(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof b) {
            ((b)menuItem).setIconTintMode(mode);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            a.j(menuItem, mode);
        }
    }

    public static void e(MenuItem menuItem, char c8, int n8) {
        if (menuItem instanceof b) {
            ((b)menuItem).setNumericShortcut(c8, n8);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            a.k(menuItem, c8, n8);
        }
    }

    public static void f(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof b) {
            ((b)menuItem).setTooltipText(charSequence);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            a.m(menuItem, charSequence);
        }
    }

    public static abstract class a {
        public static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        public static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        public static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        public static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        public static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        public static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        public static MenuItem g(MenuItem menuItem, char c8, int n8) {
            return menuItem.setAlphabeticShortcut(c8, n8);
        }

        public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        public static MenuItem k(MenuItem menuItem, char c8, int n8) {
            return menuItem.setNumericShortcut(c8, n8);
        }

        public static MenuItem l(MenuItem menuItem, char c8, char c9, int n8, int n9) {
            return menuItem.setShortcut(c8, c9, n8, n9);
        }

        public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

}

