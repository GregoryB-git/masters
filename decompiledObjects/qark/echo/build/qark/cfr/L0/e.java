/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package L0;

import F0.T;
import d0.A;
import g0.z;

public abstract class e {
    public final T a;

    public e(T t8) {
        this.a = t8;
    }

    public final boolean a(z z8, long l8) {
        if (this.b(z8) && this.c(z8, l8)) {
            return true;
        }
        return false;
    }

    public abstract boolean b(z var1);

    public abstract boolean c(z var1, long var2);

    public static final class a
    extends A {
        public a(String string2) {
            super(string2, null, false, 1);
        }
    }

}

