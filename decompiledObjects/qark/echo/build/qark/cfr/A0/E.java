/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package A0;

import A0.y;
import d0.L;
import g0.M;
import g0.a;
import k0.b1;

public final class E {
    public final int a;
    public final b1[] b;
    public final y[] c;
    public final L d;
    public final Object e;

    public E(b1[] arrb1, y[] arry, L l8, Object object) {
        boolean bl = arrb1.length == arry.length;
        a.a(bl);
        this.b = arrb1;
        this.c = (y[])arry.clone();
        this.d = l8;
        this.e = object;
        this.a = arrb1.length;
    }

    public boolean a(E e8) {
        if (e8 != null) {
            if (e8.c.length != this.c.length) {
                return false;
            }
            for (int i8 = 0; i8 < this.c.length; ++i8) {
                if (this.b(e8, i8)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean b(E e8, int n8) {
        boolean bl = false;
        if (e8 == null) {
            return false;
        }
        boolean bl2 = bl;
        if (M.c(this.b[n8], e8.b[n8])) {
            bl2 = bl;
            if (M.c(this.c[n8], e8.c[n8])) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public boolean c(int n8) {
        if (this.b[n8] != null) {
            return true;
        }
        return false;
    }
}

