/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package u6;

import X5.g;
import kotlin.jvm.internal.Intrinsics;
import p6.K0;

public final class N {
    public final g a;
    public final Object[] b;
    public final K0[] c;
    public int d;

    public N(g g8, int n8) {
        this.a = g8;
        this.b = new Object[n8];
        this.c = new K0[n8];
    }

    public final void a(K0 k02, Object arrk0) {
        Object[] arrobject = this.b;
        int n8 = this.d;
        arrobject[n8] = arrk0;
        arrk0 = this.c;
        this.d = n8 + 1;
        Intrinsics.c(k02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        arrk0[n8] = k02;
    }

    public final void b(g g8) {
        int n8 = this.c.length - 1;
        if (n8 >= 0) {
            do {
                int n9 = n8 - 1;
                K0 k02 = this.c[n8];
                Intrinsics.b(k02);
                k02.D(g8, this.b[n8]);
                if (n9 < 0) {
                    return;
                }
                n8 = n9;
            } while (true);
        }
    }
}

