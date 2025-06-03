/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 */
package u6;

import V5.n;
import V5.o;
import V5.t;
import X5.d;
import X5.g;
import g6.l;
import java.util.concurrent.CancellationException;
import p6.D;
import p6.E;
import p6.L0;
import p6.U;
import p6.a0;
import p6.q0;
import u6.F;
import u6.J;
import u6.j;

public abstract class k {
    public static final F a = new F("UNDEFINED");
    public static final F b = new F("REUSABLE_CLAIMED");

    public static final /* synthetic */ F a() {
        return a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void b(d var0, Object var1_3, l var2_5) {
        block17 : {
            block16 : {
                if (!(var0 instanceof j)) {
                    var0.resumeWith(var1_3);
                    return;
                }
                var4_6 = (j)var0;
                var0 = D.b(var1_3, (l)var2_5);
                if (var4_6.r.F(var4_6.getContext())) {
                    var4_6.t = var0;
                    var4_6.q = 1;
                    var4_6.r.E(var4_6.getContext(), var4_6);
                    return;
                }
                var2_5 = L0.a.b();
                if (var2_5.O()) {
                    var4_6.t = var0;
                    var4_6.q = 1;
                    var2_5.K(var4_6);
                    return;
                }
                var2_5.M(true);
                var5_7 = (q0)var4_6.getContext().b(q0.n);
                if (var5_7 == null || var5_7.a()) break block16;
                var1_3 = var5_7.s();
                var4_6.b(var0, (Throwable)var1_3);
                var0 = n.o;
                var4_6.resumeWith(n.a(o.a((Throwable)var1_3)));
                ** GOTO lbl39
            }
            var0 = var4_6.s;
            var6_10 = var4_6.u;
            var5_8 = var0.getContext();
            var6_10 = J.c(var5_8, var6_10);
            var0 = var6_10 != J.a ? E.g((d)var0, var5_8, var6_10) : null;
            var4_6.s.resumeWith(var1_3);
            var1_3 = t.a;
            if (var0 == null) ** GOTO lbl38
            if (!var0.K0()) break block17;
lbl38: // 2 sources:
            J.a(var5_8, var6_10);
        }
        while (var3_11 = var2_5.R()) {
        }
        return;
        {
            catch (Throwable var0_1) {}
        }
        catch (Throwable var1_4) {
            if (var0 == null) ** GOTO lbl48
            if (var0.K0() == false) throw var1_4;
lbl48: // 2 sources:
            J.a(var5_8, var6_10);
            throw var1_4;
        }
        try {
            var4_6.h(var0_1, null);
            return;
        }
        finally {
            var2_5.H(true);
        }
    }

    public static /* synthetic */ void c(d d8, Object object, l l8, int n8, Object object2) {
        if ((n8 & 2) != 0) {
            l8 = null;
        }
        k.b(d8, object, l8);
    }
}

