/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.PopupWindow
 *  java.lang.Object
 */
package L;

import android.view.View;
import android.widget.PopupWindow;

public abstract class g {
    public static void a(PopupWindow popupWindow, boolean bl) {
        b.c(popupWindow, bl);
    }

    public static void b(PopupWindow popupWindow, int n8) {
        b.d(popupWindow, n8);
    }

    public static void c(PopupWindow popupWindow, View view, int n8, int n9, int n10) {
        a.a(popupWindow, view, n8, n9, n10);
    }

    public static abstract class a {
        public static void a(PopupWindow popupWindow, View view, int n8, int n9, int n10) {
            popupWindow.showAsDropDown(view, n8, n9, n10);
        }
    }

    public static abstract class b {
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static void c(PopupWindow popupWindow, boolean bl) {
            popupWindow.setOverlapAnchor(bl);
        }

        public static void d(PopupWindow popupWindow, int n8) {
            popupWindow.setWindowLayoutType(n8);
        }
    }

}

