/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.D4;
import R2.R1;
import R2.Y1;
import R2.a2;
import R2.w4;
import android.content.Context;
import android.os.RemoteException;

public final class M4
implements Runnable {
    public final /* synthetic */ w4 o;
    public final /* synthetic */ D4 p;

    public M4(D4 d42, w4 w42) {
        this.p = d42;
        this.o = w42;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        R1 r12 = D4.B(this.p);
        if (r12 == null) {
            this.p.j().G().a("Failed to send current screen to service");
            return;
        }
        try {
            w4 w42 = this.o;
            if (w42 == null) {
                r12.I0(0L, null, null, this.p.a().getPackageName());
            } else {
                r12.I0(w42.c, w42.a, w42.b, this.p.a().getPackageName());
            }
            D4.m0(this.p);
            return;
        }
        catch (RemoteException remoteException) {}
        this.p.j().G().b("Failed to send current screen to the service", (Object)remoteException);
    }
}

