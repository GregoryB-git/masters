// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public abstract class w
{
    public static boolean a(final ViewParent obj, final View view, final float n, final float n2, final boolean b) {
        try {
            return a.a(obj, view, n, n2, b);
        }
        catch (AbstractMethodError abstractMethodError) {
            final StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(obj);
            sb.append(" does not implement interface method onNestedFling");
            Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            return false;
        }
    }
    
    public static boolean b(final ViewParent obj, final View view, final float n, final float n2) {
        try {
            return a.b(obj, view, n, n2);
        }
        catch (AbstractMethodError abstractMethodError) {
            final StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(obj);
            sb.append(" does not implement interface method onNestedPreFling");
            Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            return false;
        }
    }
    
    public static void c(final ViewParent obj, final View view, final int n, final int n2, final int[] array, final int n3) {
        if (obj instanceof l) {
            ((l)obj).c(view, n, n2, array, n3);
            return;
        }
        if (n3 == 0) {
            try {
                a.c(obj, view, n, n2, array);
            }
            catch (AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(obj);
                sb.append(" does not implement interface method onNestedPreScroll");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            }
        }
    }
    
    public static void d(final ViewParent obj, final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (obj instanceof m) {
            ((m)obj).d(view, n, n2, n3, n4, n5, array);
            return;
        }
        array[0] += n3;
        array[1] += n4;
        if (obj instanceof l) {
            ((l)obj).e(view, n, n2, n3, n4, n5);
            return;
        }
        if (n5 == 0) {
            try {
                a.d(obj, view, n, n2, n3, n4);
            }
            catch (AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(obj);
                sb.append(" does not implement interface method onNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            }
        }
    }
    
    public static void e(final ViewParent obj, final View view, final View view2, final int n, final int n2) {
        if (obj instanceof l) {
            ((l)obj).a(view, view2, n, n2);
            return;
        }
        if (n2 == 0) {
            try {
                a.e(obj, view, view2, n);
            }
            catch (AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(obj);
                sb.append(" does not implement interface method onNestedScrollAccepted");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            }
        }
    }
    
    public static boolean f(final ViewParent obj, final View view, final View view2, final int n, final int n2) {
        if (obj instanceof l) {
            return ((l)obj).f(view, view2, n, n2);
        }
        if (n2 == 0) {
            try {
                return a.f(obj, view, view2, n);
            }
            catch (AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(obj);
                sb.append(" does not implement interface method onStartNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            }
        }
        return false;
    }
    
    public static void g(final ViewParent obj, final View view, final int n) {
        if (obj instanceof l) {
            ((l)obj).b(view, n);
            return;
        }
        if (n == 0) {
            try {
                a.g(obj, view);
            }
            catch (AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(obj);
                sb.append(" does not implement interface method onStopNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            }
        }
    }
    
    public abstract static class a
    {
        public static boolean a(final ViewParent viewParent, final View view, final float n, final float n2, final boolean b) {
            return viewParent.onNestedFling(view, n, n2, b);
        }
        
        public static boolean b(final ViewParent viewParent, final View view, final float n, final float n2) {
            return viewParent.onNestedPreFling(view, n, n2);
        }
        
        public static void c(final ViewParent viewParent, final View view, final int n, final int n2, final int[] array) {
            viewParent.onNestedPreScroll(view, n, n2, array);
        }
        
        public static void d(final ViewParent viewParent, final View view, final int n, final int n2, final int n3, final int n4) {
            viewParent.onNestedScroll(view, n, n2, n3, n4);
        }
        
        public static void e(final ViewParent viewParent, final View view, final View view2, final int n) {
            viewParent.onNestedScrollAccepted(view, view2, n);
        }
        
        public static boolean f(final ViewParent viewParent, final View view, final View view2, final int n) {
            return viewParent.onStartNestedScroll(view, view2, n);
        }
        
        public static void g(final ViewParent viewParent, final View view) {
            viewParent.onStopNestedScroll(view);
        }
    }
}
