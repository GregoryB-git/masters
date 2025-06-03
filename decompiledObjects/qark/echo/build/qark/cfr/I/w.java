/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewParent
 *  java.lang.AbstractMethodError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package I;

import I.l;
import I.m;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public abstract class w {
    public static boolean a(ViewParent viewParent, View view, float f8, float f9, boolean bl) {
        try {
            bl = a.a(viewParent, view, f8, f9, bl);
            return bl;
        }
        catch (AbstractMethodError abstractMethodError) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append((Object)viewParent);
            stringBuilder.append(" does not implement interface method onNestedFling");
            Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f8, float f9) {
        try {
            boolean bl = a.b(viewParent, view, f8, f9);
            return bl;
        }
        catch (AbstractMethodError abstractMethodError) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append((Object)viewParent);
            stringBuilder.append(" does not implement interface method onNestedPreFling");
            Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int n8, int n9, int[] stringBuilder, int n10) {
        if (viewParent instanceof l) {
            ((l)viewParent).c(view, n8, n9, (int[])stringBuilder, n10);
            return;
        }
        if (n10 == 0) {
            try {
                a.c(viewParent, view, n8, n9, (int[])stringBuilder);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface method onNestedPreScroll");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int n8, int n9, int n10, int n11, int n12, int[] stringBuilder) {
        if (viewParent instanceof m) {
            ((m)viewParent).d(view, n8, n9, n10, n11, n12, (int[])stringBuilder);
            return;
        }
        stringBuilder[0] = stringBuilder[0] + n10;
        stringBuilder[1] = stringBuilder[1] + n11;
        if (viewParent instanceof l) {
            ((l)viewParent).e(view, n8, n9, n10, n11, n12);
            return;
        }
        if (n12 == 0) {
            try {
                a.d(viewParent, view, n8, n9, n10, n11);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface method onNestedScroll");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int n8, int n9) {
        if (viewParent instanceof l) {
            ((l)viewParent).a(view, view2, n8, n9);
            return;
        }
        if (n9 == 0) {
            try {
                a.e(viewParent, view, view2, n8);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                view2 = new StringBuilder();
                view2.append("ViewParent ");
                view2.append((Object)viewParent);
                view2.append(" does not implement interface method onNestedScrollAccepted");
                Log.e((String)"ViewParentCompat", (String)view2.toString(), (Throwable)abstractMethodError);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int n8, int n9) {
        if (viewParent instanceof l) {
            return ((l)viewParent).f(view, view2, n8, n9);
        }
        if (n9 == 0) {
            try {
                boolean bl = a.f(viewParent, view, view2, n8);
                return bl;
            }
            catch (AbstractMethodError abstractMethodError) {
                view2 = new StringBuilder();
                view2.append("ViewParent ");
                view2.append((Object)viewParent);
                view2.append(" does not implement interface method onStartNestedScroll");
                Log.e((String)"ViewParentCompat", (String)view2.toString(), (Throwable)abstractMethodError);
            }
        }
        return false;
    }

    public static void g(ViewParent viewParent, View view, int n8) {
        if (viewParent instanceof l) {
            ((l)viewParent).b(view, n8);
            return;
        }
        if (n8 == 0) {
            try {
                a.g(viewParent, view);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface method onStopNestedScroll");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
            }
        }
    }

    public static abstract class a {
        public static boolean a(ViewParent viewParent, View view, float f8, float f9, boolean bl) {
            return viewParent.onNestedFling(view, f8, f9, bl);
        }

        public static boolean b(ViewParent viewParent, View view, float f8, float f9) {
            return viewParent.onNestedPreFling(view, f8, f9);
        }

        public static void c(ViewParent viewParent, View view, int n8, int n9, int[] arrn) {
            viewParent.onNestedPreScroll(view, n8, n9, arrn);
        }

        public static void d(ViewParent viewParent, View view, int n8, int n9, int n10, int n11) {
            viewParent.onNestedScroll(view, n8, n9, n10, n11);
        }

        public static void e(ViewParent viewParent, View view, View view2, int n8) {
            viewParent.onNestedScrollAccepted(view, view2, n8);
        }

        public static boolean f(ViewParent viewParent, View view, View view2, int n8) {
            return viewParent.onStartNestedScroll(view, view2, n8);
        }

        public static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

}

