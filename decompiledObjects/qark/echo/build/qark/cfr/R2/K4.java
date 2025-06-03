/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package R2;

import A2.n;
import R2.C3;
import R2.D4;
import R2.R1;
import R2.S5;
import R2.W5;
import R2.Y1;
import R2.a2;
import R2.l2;
import R2.q3;
import R2.r2;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.y0;

public final class K4
implements Runnable {
    public final /* synthetic */ W5 o;
    public final /* synthetic */ y0 p;
    public final /* synthetic */ D4 q;

    public K4(D4 d42, W5 w52, y0 y02) {
        this.q = d42;
        this.o = w52;
        this.p = y02;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        block10 : {
            block9 : {
                block11 : {
                    var4_1 = null;
                    var5_2 = null;
                    var3_3 = null;
                    var2_5 = var4_1;
                    var1_6 = var5_2;
                    try {
                        if (!this.q.i().J().y()) {
                            var2_5 = var4_1;
                            var1_6 = var5_2;
                            this.q.j().M().a("Analytics storage consent denied; will not get app instance id");
                            var2_5 = var4_1;
                            var1_6 = var5_2;
                            this.q.r().T(null);
                            var2_5 = var4_1;
                            var1_6 = var5_2;
                            this.q.i().g.b(null);
                            var1_6 = var3_3;
                            break block9;
                        }
                        var2_5 = var4_1;
                        var1_6 = var5_2;
                        ** try [egrp 2[TRYBLOCK] [8 : 120->240)] { 
lbl22: // 1 sources:
                    }
                    catch (Throwable var1_7) {
                        break block10;
                    }
lbl25: // 2 sources:
                    catch (RemoteException var3_4) {
                        break block11;
                    }
                    var6_8 = D4.B(this.q);
                    if (var6_8 == null) {
                        var2_5 = var4_1;
                        var1_6 = var5_2;
                        this.q.j().G().a("Failed to get app instance id");
                        var1_6 = var3_3;
                    } else {
                        var2_5 = var4_1;
                        var1_6 = var5_2;
                        n.i(this.o);
                        var2_5 = var4_1;
                        var1_6 = var5_2;
                        var3_3 = var6_8.G(this.o);
                        if (var3_3 != null) {
                            var2_5 = var3_3;
                            var1_6 = var3_3;
                            this.q.r().T(var3_3);
                            var2_5 = var3_3;
                            var1_6 = var3_3;
                            this.q.i().g.b(var3_3);
                        }
                        var2_5 = var3_3;
                        var1_6 = var3_3;
                        D4.m0(this.q);
                        var1_6 = var3_3;
                    }
                    break block9;
                }
                var2_5 = var1_6;
                this.q.j().G().b("Failed to get app instance id", (Object)var3_4);
            }
            this.q.k().V(this.p, var1_6);
            return;
        }
        this.q.k().V(this.p, var2_5);
        throw var1_7;
    }
}

