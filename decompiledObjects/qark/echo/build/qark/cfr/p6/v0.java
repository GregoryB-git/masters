/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.CancellationException
 */
package p6;

import X5.g;
import java.util.concurrent.CancellationException;
import p6.q0;
import p6.t0;
import p6.u0;
import p6.x;

public abstract class v0 {
    public static final x a(q0 q02) {
        return new t0(q02);
    }

    public static /* synthetic */ x b(q0 q02, int n8, Object object) {
        if ((n8 & 1) != 0) {
            q02 = null;
        }
        return u0.a(q02);
    }

    public static final void c(g g8, CancellationException cancellationException) {
        if ((g8 = (q0)g8.b(q0.n)) != null) {
            g8.w(cancellationException);
        }
    }

    public static final void d(g g8) {
        if ((g8 = (q0)g8.b(q0.n)) != null) {
            u0.e((q0)g8);
        }
    }

    public static final void e(q0 q02) {
        if (q02.a()) {
            return;
        }
        throw q02.s();
    }
}

