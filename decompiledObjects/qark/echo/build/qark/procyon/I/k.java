// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.view.View;
import android.view.ViewParent;

public class k
{
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;
    
    public k(final View c) {
        this.c = c;
    }
    
    public boolean a(final float n, final float n2, final boolean b) {
        if (this.j()) {
            final ViewParent g = this.g(0);
            if (g != null) {
                return w.a(g, this.c, n, n2, b);
            }
        }
        return false;
    }
    
    public boolean b(final float n, final float n2) {
        if (this.j()) {
            final ViewParent g = this.g(0);
            if (g != null) {
                return w.b(g, this.c, n, n2);
            }
        }
        return false;
    }
    
    public boolean c(final int n, final int n2, final int[] array, final int[] array2, final int n3) {
        final boolean j = this.j();
        boolean b2;
        final boolean b = b2 = false;
        if (j) {
            final ViewParent g = this.g(n3);
            if (g == null) {
                return false;
            }
            if (n == 0 && n2 == 0) {
                b2 = b;
                if (array2 != null) {
                    array2[1] = (array2[0] = 0);
                    return false;
                }
            }
            else {
                int n4;
                int n5;
                if (array2 != null) {
                    this.c.getLocationInWindow(array2);
                    n4 = array2[0];
                    n5 = array2[1];
                }
                else {
                    n4 = (n5 = 0);
                }
                int[] h = array;
                if (array == null) {
                    h = this.h();
                }
                h[1] = (h[0] = 0);
                w.c(g, this.c, n, n2, h, n3);
                if (array2 != null) {
                    this.c.getLocationInWindow(array2);
                    array2[0] -= n4;
                    array2[1] -= n5;
                }
                if (h[0] == 0) {
                    b2 = b;
                    if (h[1] == 0) {
                        return b2;
                    }
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    public void d(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5, final int[] array2) {
        this.f(n, n2, n3, n4, array, n5, array2);
    }
    
    public boolean e(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.f(n, n2, n3, n4, array, 0, null);
    }
    
    public final boolean f(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5, int[] h) {
        if (this.j()) {
            final ViewParent g = this.g(n5);
            if (g == null) {
                return false;
            }
            if (n != 0 || n2 != 0 || n3 != 0 || n4 != 0) {
                int n6;
                int n7;
                if (array != null) {
                    this.c.getLocationInWindow(array);
                    n6 = array[0];
                    n7 = array[1];
                }
                else {
                    n6 = (n7 = 0);
                }
                if (h == null) {
                    h = this.h();
                    h[1] = (h[0] = 0);
                }
                w.d(g, this.c, n, n2, n3, n4, n5, h);
                if (array != null) {
                    this.c.getLocationInWindow(array);
                    array[0] -= n6;
                    array[1] -= n7;
                }
                return true;
            }
            if (array != null) {
                array[1] = (array[0] = 0);
                return false;
            }
        }
        return false;
    }
    
    public final ViewParent g(final int n) {
        if (n == 0) {
            return this.a;
        }
        if (n != 1) {
            return null;
        }
        return this.b;
    }
    
    public final int[] h() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }
    
    public boolean i(final int n) {
        return this.g(n) != null;
    }
    
    public boolean j() {
        return this.d;
    }
    
    public void k(final boolean d) {
        if (this.d) {
            s.L(this.c);
        }
        this.d = d;
    }
    
    public final void l(final int n, final ViewParent viewParent) {
        if (n == 0) {
            this.a = viewParent;
            return;
        }
        if (n != 1) {
            return;
        }
        this.b = viewParent;
    }
    
    public boolean m(final int n, final int n2) {
        if (this.i(n2)) {
            return true;
        }
        if (this.j()) {
            ViewParent viewParent = this.c.getParent();
            View c = this.c;
            while (viewParent != null) {
                if (w.f(viewParent, c, this.c, n, n2)) {
                    this.l(n2, viewParent);
                    w.e(viewParent, c, this.c, n, n2);
                    return true;
                }
                if (viewParent instanceof View) {
                    c = (View)viewParent;
                }
                viewParent = viewParent.getParent();
            }
        }
        return false;
    }
    
    public void n(final int n) {
        final ViewParent g = this.g(n);
        if (g != null) {
            w.g(g, this.c, n);
            this.l(n, null);
        }
    }
}
