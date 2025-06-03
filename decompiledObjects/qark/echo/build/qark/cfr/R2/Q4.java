/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import A2.n;
import R2.D4;
import R2.R1;
import R2.W5;
import R2.Y1;
import R2.a2;
import android.os.Bundle;
import android.os.RemoteException;

public final class Q4
implements Runnable {
    public final /* synthetic */ W5 o;
    public final /* synthetic */ Bundle p;
    public final /* synthetic */ D4 q;

    public Q4(D4 d42, W5 w52, Bundle bundle) {
        this.q = d42;
        this.o = w52;
        this.p = bundle;
    }

    public final void run() {
        R1 r12 = D4.B(this.q);
        if (r12 == null) {
            this.q.j().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            n.i(this.o);
            r12.O0(this.p, this.o);
            return;
        }
        catch (RemoteException remoteException) {
            this.q.j().G().b("Failed to send default event parameters to service", (Object)remoteException);
            return;
        }
    }
}

