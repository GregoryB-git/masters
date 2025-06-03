// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.RemoteException;
import A2.n;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

public final class H4 implements Runnable
{
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ Bundle q;
    public final /* synthetic */ D4 r;
    
    public H4(final D4 r, final AtomicReference o, final W5 p4, final Bundle q) {
        this.r = r;
        this.o = o;
        this.p = p4;
        this.q = q;
    }
    
    @Override
    public final void run() {
        final AtomicReference o = this.o;
        // monitorenter(o)
        try {
            try {
                Label_0056: {
                    if (D4.B(this.r) != null) {
                        break Label_0056;
                    }
                    this.r.j().G().a("Failed to get trigger URIs; not connected to service");
                    try {
                        this.o.notify();
                    }
                    // monitorexit(o)
                    finally {
                        // monitorexit(o)
                        final RemoteException ex;
                        this.r.j().G().b("Failed to get trigger URIs; remote exception", ex);
                        AtomicReference atomicReference = this.o;
                        Label_0097: {
                            break Label_0097;
                            this.o.notify();
                            n.i(this.p);
                            final R1 r1;
                            this.o.set(r1.F(this.p, this.q));
                            D4.m0(this.r);
                            atomicReference = this.o;
                        }
                        atomicReference.notify();
                    }
                    // monitorexit(o)
                }
            }
            finally {}
        }
        catch (RemoteException ex2) {}
    }
}
