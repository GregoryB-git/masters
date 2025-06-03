/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package X4;

import X4.b;
import X4.e;
import Y4.a;

public abstract class g {
    public static final g b = new e(null, 0, 0);
    public final g a;

    public g(g g8) {
        this.a = g8;
    }

    public final g a(int n8, int n9) {
        return new e(this, n8, n9);
    }

    public final g b(int n8, int n9) {
        return new b(this, n8, n9);
    }

    public abstract void c(a var1, byte[] var2);

    public final g d() {
        return this.a;
    }
}

