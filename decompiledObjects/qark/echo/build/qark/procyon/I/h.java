// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.view.ViewGroup$MarginLayoutParams;

public abstract class h
{
    public static int a(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        return a.b(viewGroup$MarginLayoutParams);
    }
    
    public static int b(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        return a.c(viewGroup$MarginLayoutParams);
    }
    
    public abstract static class a
    {
        public static int a(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            return viewGroup$MarginLayoutParams.getLayoutDirection();
        }
        
        public static int b(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            return viewGroup$MarginLayoutParams.getMarginEnd();
        }
        
        public static int c(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            return viewGroup$MarginLayoutParams.getMarginStart();
        }
        
        public static boolean d(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            return viewGroup$MarginLayoutParams.isMarginRelative();
        }
        
        public static void e(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, final int n) {
            viewGroup$MarginLayoutParams.resolveLayoutDirection(n);
        }
        
        public static void f(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, final int layoutDirection) {
            viewGroup$MarginLayoutParams.setLayoutDirection(layoutDirection);
        }
        
        public static void g(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, final int marginEnd) {
            viewGroup$MarginLayoutParams.setMarginEnd(marginEnd);
        }
        
        public static void h(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, final int marginStart) {
            viewGroup$MarginLayoutParams.setMarginStart(marginStart);
        }
    }
}
