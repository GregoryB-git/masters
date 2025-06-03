/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package H0;

import H0.a;
import g0.z;

public final class c
implements a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public c(int n8, int n9, int n10, int n11) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
    }

    public static c c(z z8) {
        int n8 = z8.t();
        z8.U(8);
        int n9 = z8.t();
        int n10 = z8.t();
        z8.U(4);
        int n11 = z8.t();
        z8.U(12);
        return new c(n8, n9, n10, n11);
    }

    @Override
    public int a() {
        return 1751742049;
    }

    public boolean b() {
        if ((this.b & 16) == 16) {
            return true;
        }
        return false;
    }
}

