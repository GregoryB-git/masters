// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.RemoteException;
import B2.a;
import A2.n;

public final class O4 implements Runnable
{
    public final /* synthetic */ W5 o;
    public final /* synthetic */ D4 p;
    
    public O4(final D4 p2, final W5 o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final R1 b = D4.B(this.p);
        if (b == null) {
            this.p.j().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            n.i(this.o);
            b.c0(this.o);
            this.p.q().J();
            this.p.F(b, null, this.o);
            D4.m0(this.p);
        }
        catch (RemoteException ex) {
            this.p.j().G().b("Failed to send app launch to the service", ex);
        }
    }
}
