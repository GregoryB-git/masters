// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.RemoteException;
import A2.n;

public final class R4 implements Runnable
{
    public final /* synthetic */ W5 o;
    public final /* synthetic */ D4 p;
    
    public R4(final D4 p2, final W5 o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final R1 b = D4.B(this.p);
        if (b == null) {
            this.p.j().G().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            n.i(this.o);
            b.N(this.o);
            D4.m0(this.p);
        }
        catch (RemoteException ex) {
            this.p.j().G().b("Failed to send measurementEnabled to the service", ex);
        }
    }
}
