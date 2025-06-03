/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
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
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.y0;
import java.util.ArrayList;
import java.util.List;

public final class Y4
implements Runnable {
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ W5 q;
    public final /* synthetic */ y0 r;
    public final /* synthetic */ D4 s;

    public Y4(D4 d42, String string2, String string3, W5 w52, y0 y02) {
        this.s = d42;
        this.o = string2;
        this.p = string3;
        this.q = w52;
        this.r = y02;
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
                    var2_3 = var3_1 = new ArrayList();
                    var1_4 = var3_1;
                    try {
                        var4_6 = D4.B(this.s);
                        if (var4_6 == null) {
                            var2_3 = var3_1;
                            var1_4 = var3_1;
                            this.s.j().G().c("Failed to get conditional properties; not connected to service", this.o, this.p);
                            var1_4 = var3_1;
                            break block6;
                        }
                        var2_3 = var3_1;
                        var1_4 = var3_1;
                        ** try [egrp 2[TRYBLOCK] [4 : 83->129)] { 
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
                    var2_3 = var3_1 = S5.t0(var4_6.V0(this.o, this.p, this.q));
                    var1_4 = var3_1;
                    D4.m0(this.s);
                    var1_4 = var3_1;
                    break block6;
                }
                var2_3 = var1_4;
                this.s.j().G().d("Failed to get conditional properties; remote exception", this.o, this.p, (Object)var3_2);
            }
            this.s.k().W(this.r, var1_4);
            return;
        }
        this.s.k().W(this.r, var2_3);
        throw var1_5;
    }
}

