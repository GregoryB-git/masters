/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 */
package n5;

import n5.l;

public final class m {
    public final l a;
    public final Runnable b;

    public m(l l8, Runnable runnable) {
        this.a = l8;
        this.b = runnable;
    }

    public Integer a() {
        l l8 = this.a;
        if (l8 != null) {
            return l8.a();
        }
        return null;
    }

    public boolean b() {
        l l8 = this.a;
        if (l8 != null && l8.b()) {
            return true;
        }
        return false;
    }
}

