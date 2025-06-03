/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 */
package R2;

import A2.n;
import R2.D4;
import R2.R1;
import R2.S5;
import R2.W5;
import R2.Y1;
import R2.a2;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.y0;
import java.util.List;

public final class F4
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ W5 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ y0 s;
    public final /* synthetic */ D4 t;

    public F4(D4 d42, String string2, String string3, W5 w52, boolean bl, y0 y02) {
        this.t = d42;
        this.o = string2;
        this.p = string3;
        this.q = w52;
        this.r = bl;
        this.s = y02;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        block7 : {
            block6 : {
                block8 : {
                    var2_3 = var3_1 = new Bundle();
                    var1_4 = var3_1;
                    try {
                        var4_6 = D4.B(this.t);
                        if (var4_6 == null) {
                            var2_3 = var3_1;
                            var1_4 = var3_1;
                            this.t.j().G().c("Failed to get user properties; not connected to service", this.o, this.p);
                            var1_4 = var3_1;
                            break block6;
                        }
                        var2_3 = var3_1;
                        var1_4 = var3_1;
                        ** try [egrp 2[TRYBLOCK] [4 : 83->133)] { 
lbl14: // 1 sources:
                    }
                    catch (Throwable var1_5) {
                        break block7;
                    }
lbl17: // 2 sources:
                    catch (RemoteException var3_2) {
                        break block8;
                    }
                    n.i(this.q);
                    var2_3 = var3_1;
                    var1_4 = var3_1;
                    var2_3 = var3_1 = S5.G(var4_6.x0(this.o, this.p, this.r, this.q));
                    var1_4 = var3_1;
                    D4.m0(this.t);
                    var1_4 = var3_1;
                    break block6;
                }
                var2_3 = var1_4;
                this.t.j().G().c("Failed to get user properties; remote exception", this.o, (Object)var3_2);
            }
            this.t.k().U(this.s, var1_4);
            return;
        }
        this.t.k().U(this.s, var2_3);
        throw var1_5;
    }
}

