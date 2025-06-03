/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 *  java.lang.Object
 */
package I;

import I.s;
import I.w;
import android.view.View;
import android.view.ViewParent;

public class k {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public k(View view) {
        this.c = view;
    }

    public boolean a(float f8, float f9, boolean bl) {
        ViewParent viewParent;
        if (this.j() && (viewParent = this.g(0)) != null) {
            return w.a(viewParent, this.c, f8, f9, bl);
        }
        return false;
    }

    public boolean b(float f8, float f9) {
        ViewParent viewParent;
        if (this.j() && (viewParent = this.g(0)) != null) {
            return w.b(viewParent, this.c, f8, f9);
        }
        return false;
    }

    public boolean c(int n8, int n9, int[] arrn, int[] arrn2, int n10) {
        boolean bl;
        block10 : {
            block12 : {
                int n11;
                ViewParent viewParent;
                boolean bl2;
                int n12;
                block11 : {
                    boolean bl3 = this.j();
                    bl = bl2 = false;
                    if (!bl3) break block10;
                    viewParent = this.g(n10);
                    if (viewParent == null) {
                        return false;
                    }
                    if (n8 != 0 || n9 != 0) break block11;
                    bl = bl2;
                    if (arrn2 != null) {
                        arrn2[0] = 0;
                        arrn2[1] = 0;
                        return false;
                    }
                    break block10;
                }
                if (arrn2 != null) {
                    this.c.getLocationInWindow(arrn2);
                    n11 = arrn2[0];
                    n12 = arrn2[1];
                } else {
                    n12 = n11 = 0;
                }
                int[] arrn3 = arrn;
                if (arrn == null) {
                    arrn3 = this.h();
                }
                arrn3[0] = 0;
                arrn3[1] = 0;
                w.c(viewParent, this.c, n8, n9, arrn3, n10);
                if (arrn2 != null) {
                    this.c.getLocationInWindow(arrn2);
                    arrn2[0] = arrn2[0] - n11;
                    arrn2[1] = arrn2[1] - n12;
                }
                if (arrn3[0] != 0) break block12;
                bl = bl2;
                if (arrn3[1] == 0) break block10;
            }
            bl = true;
        }
        return bl;
    }

    public void d(int n8, int n9, int n10, int n11, int[] arrn, int n12, int[] arrn2) {
        this.f(n8, n9, n10, n11, arrn, n12, arrn2);
    }

    public boolean e(int n8, int n9, int n10, int n11, int[] arrn) {
        return this.f(n8, n9, n10, n11, arrn, 0, null);
    }

    public final boolean f(int n8, int n9, int n10, int n11, int[] arrn, int n12, int[] arrn2) {
        if (this.j()) {
            ViewParent viewParent = this.g(n12);
            if (viewParent == null) {
                return false;
            }
            if (n8 == 0 && n9 == 0 && n10 == 0 && n11 == 0) {
                if (arrn != null) {
                    arrn[0] = 0;
                    arrn[1] = 0;
                    return false;
                }
            } else {
                int n13;
                int n14;
                if (arrn != null) {
                    this.c.getLocationInWindow(arrn);
                    n14 = arrn[0];
                    n13 = arrn[1];
                } else {
                    n13 = n14 = 0;
                }
                if (arrn2 == null) {
                    arrn2 = this.h();
                    arrn2[0] = 0;
                    arrn2[1] = 0;
                }
                w.d(viewParent, this.c, n8, n9, n10, n11, n12, arrn2);
                if (arrn != null) {
                    this.c.getLocationInWindow(arrn);
                    arrn[0] = arrn[0] - n14;
                    arrn[1] = arrn[1] - n13;
                }
                return true;
            }
        }
        return false;
    }

    public final ViewParent g(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    public final int[] h() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public boolean i(int n8) {
        if (this.g(n8) != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        return this.d;
    }

    public void k(boolean bl) {
        if (this.d) {
            s.L(this.c);
        }
        this.d = bl;
    }

    public final void l(int n8, ViewParent viewParent) {
        if (n8 != 0) {
            if (n8 != 1) {
                return;
            }
            this.b = viewParent;
            return;
        }
        this.a = viewParent;
    }

    public boolean m(int n8, int n9) {
        if (this.i(n9)) {
            return true;
        }
        if (this.j()) {
            View view = this.c;
            for (ViewParent viewParent = this.c.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
                if (w.f(viewParent, view, this.c, n8, n9)) {
                    this.l(n9, viewParent);
                    w.e(viewParent, view, this.c, n8, n9);
                    return true;
                }
                if (!(viewParent instanceof View)) continue;
                view = (View)viewParent;
            }
        }
        return false;
    }

    public void n(int n8) {
        ViewParent viewParent = this.g(n8);
        if (viewParent != null) {
            w.g(viewParent, this.c, n8);
            this.l(n8, null);
        }
    }
}

