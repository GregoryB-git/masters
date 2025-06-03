/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  java.lang.Object
 */
package I;

import android.view.ViewGroup;

public abstract class v {
    public static boolean a(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }

    public static abstract class a {
        public static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        public static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        public static void c(ViewGroup viewGroup, boolean bl) {
            viewGroup.setTransitionGroup(bl);
        }
    }

}

