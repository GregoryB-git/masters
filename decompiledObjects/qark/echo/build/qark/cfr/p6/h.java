/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Thread
 */
package p6;

import X5.e;
import X5.g;
import g6.p;
import p6.E;
import p6.I;
import p6.K;
import p6.L0;
import p6.a0;
import p6.e;
import p6.g;
import p6.j0;

public abstract class h {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static final Object a(X5.g var0, p var1_1) {
        block4 : {
            block3 : {
                var5_2 = Thread.currentThread();
                var3_3 = (X5.e)var0.b(X5.e.c);
                if (var3_3 != null) break block3;
                var3_3 = L0.a.b();
                var4_4 = j0.o;
                var0 = var0.k((X5.g)var3_3);
                break block4;
            }
            var2_5 = var3_3 instanceof a0;
            var4_4 = null;
            var3_3 = var2_5 != false ? (a0)var3_3 : null;
            if (var3_3 == null) ** GOTO lbl-1000
            if (var3_3.S()) {
                var4_4 = var3_3;
            }
            if (var4_4 != null) {
                var3_3 = var4_4;
            } else lbl-1000: // 2 sources:
            {
                var3_3 = L0.a.a();
            }
            var4_4 = j0.o;
        }
        var0 = E.e((I)var4_4, var0);
        var0 = new e(var0, var5_2, (a0)var3_3);
        var0.J0(K.o, var0, var1_1);
        return var0.K0();
    }

    public static /* synthetic */ Object b(X5.g g8, p p8, int n8, Object object) {
        if ((n8 & 1) != 0) {
            g8 = X5.h.o;
        }
        return g.e(g8, p8);
    }
}

