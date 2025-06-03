/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import A2.n;
import B2.a;
import R2.D4;
import R2.R1;
import R2.V1;
import R2.W5;
import R2.Y1;
import R2.a2;
import android.os.RemoteException;

public final class O4
implements Runnable {
    public final /* synthetic */ W5 o;
    public final /* synthetic */ D4 p;

    public O4(D4 d42, W5 w52) {
        this.p = d42;
        this.o = w52;
    }

    public final void run() {
        R1 r12 = D4.B(this.p);
        if (r12 == null) {
            this.p.j().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            n.i(this.o);
            r12.c0(this.o);
            this.p.q().J();
            this.p.F(r12, null, this.o);
            D4.m0(this.p);
            return;
        }
        catch (RemoteException remoteException) {
            this.p.j().G().b("Failed to send app launch to the service", (Object)remoteException);
            return;
        }
    }
}

