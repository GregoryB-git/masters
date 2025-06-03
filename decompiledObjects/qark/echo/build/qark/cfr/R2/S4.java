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

import R2.D4;
import R2.I;
import R2.R1;
import R2.S5;
import R2.Y1;
import R2.a2;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.y0;

public final class S4
implements Runnable {
    public final /* synthetic */ I o;
    public final /* synthetic */ String p;
    public final /* synthetic */ y0 q;
    public final /* synthetic */ D4 r;

    public S4(D4 d42, I i8, String string2, y0 y02) {
        this.r = d42;
        this.o = i8;
        this.p = string2;
        this.q = y02;
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
                    var4_1 = null;
                    var5_2 = null;
                    var3_3 = null;
                    var2_5 = var4_1;
                    var1_6 = var5_2;
                    try {
                        var6_8 = D4.B(this.r);
                        if (var6_8 == null) {
                            var2_5 = var4_1;
                            var1_6 = var5_2;
                            this.r.j().G().a("Discarding data. Failed to send event to service to bundle");
                            var1_6 = var3_3;
                            break block6;
                        }
                        var2_5 = var4_1;
                        var1_6 = var5_2;
                        ** try [egrp 2[TRYBLOCK] [4 : 81->108)] { 
lbl17: // 1 sources:
                    }
                    catch (Throwable var1_7) {
                        break block7;
                    }
lbl20: // 2 sources:
                    catch (RemoteException var3_4) {
                        break block8;
                    }
                    var2_5 = var3_3 = var6_8.M0(this.o, this.p);
                    var1_6 = var3_3;
                    D4.m0(this.r);
                    var1_6 = var3_3;
                    break block6;
                }
                var2_5 = var1_6;
                this.r.j().G().b("Failed to send event to the service to bundle", (Object)var3_4);
            }
            this.r.k().Y(this.q, var1_6);
            return;
        }
        this.r.k().Y(this.q, var2_5);
        throw var1_7;
    }
}

