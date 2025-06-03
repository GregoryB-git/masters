// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L;

import android.view.View;
import android.widget.PopupWindow;

public abstract class g
{
    public static void a(final PopupWindow popupWindow, final boolean b) {
        g.b.c(popupWindow, b);
    }
    
    public static void b(final PopupWindow popupWindow, final int n) {
        b.d(popupWindow, n);
    }
    
    public static void c(final PopupWindow popupWindow, final View view, final int n, final int n2, final int n3) {
        a.a(popupWindow, view, n, n2, n3);
    }
    
    public abstract static class a
    {
        public static void a(final PopupWindow popupWindow, final View view, final int n, final int n2, final int n3) {
            popupWindow.showAsDropDown(view, n, n2, n3);
        }
    }
    
    public abstract static class b
    {
        public static boolean a(final PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }
        
        public static int b(final PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }
        
        public static void c(final PopupWindow popupWindow, final boolean overlapAnchor) {
            popupWindow.setOverlapAnchor(overlapAnchor);
        }
        
        public static void d(final PopupWindow popupWindow, final int windowLayoutType) {
            popupWindow.setWindowLayoutType(windowLayoutType);
        }
    }
}
