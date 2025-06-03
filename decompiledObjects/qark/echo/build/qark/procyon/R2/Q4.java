// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.RemoteException;
import A2.n;
import android.os.Bundle;

public final class Q4 implements Runnable
{
    public final /* synthetic */ W5 o;
    public final /* synthetic */ Bundle p;
    public final /* synthetic */ D4 q;
    
    public Q4(final D4 q, final W5 o, final Bundle p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        final R1 b = D4.B(this.q);
        if (b == null) {
            this.q.j().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            n.i(this.o);
            b.O0(this.p, this.o);
        }
        catch (RemoteException ex) {
            this.q.j().G().b("Failed to send default event parameters to service", ex);
        }
    }
}
