/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package p6;

import V5.n;
import p6.q0;
import p6.u;
import p6.v;

public abstract class w {
    public static final u a(q0 q02) {
        return new v(q02);
    }

    public static /* synthetic */ u b(q0 q02, int n8, Object object) {
        if ((n8 & 1) != 0) {
            q02 = null;
        }
        return w.a(q02);
    }

    public static final boolean c(u u8, Object object) {
        Throwable throwable = n.b(object);
        if (throwable == null) {
            return u8.n(object);
        }
        return u8.l(throwable);
    }
}

