/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  android.view.ViewGroup$MarginLayoutParams
 *  java.lang.Object
 */
package I;

import android.view.ViewGroup;

public abstract class h {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static abstract class a {
        public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        public static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        public static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int n8) {
            marginLayoutParams.resolveLayoutDirection(n8);
        }

        public static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int n8) {
            marginLayoutParams.setLayoutDirection(n8);
        }

        public static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int n8) {
            marginLayoutParams.setMarginEnd(n8);
        }

        public static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int n8) {
            marginLayoutParams.setMarginStart(n8);
        }
    }

}

