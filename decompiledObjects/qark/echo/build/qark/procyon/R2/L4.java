// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.RemoteException;
import A2.n;
import java.util.concurrent.atomic.AtomicReference;

public final class L4 implements Runnable
{
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ D4 q;
    
    public L4(final D4 q, final AtomicReference o, final W5 p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        final AtomicReference o = this.o;
        // monitorenter(o)
        try {
            try {
                Label_0093: {
                    if (this.q.i().J().y()) {
                        break Label_0093;
                    }
                    this.q.j().M().a("Analytics storage consent denied; will not get app instance id");
                    this.q.r().T(null);
                    this.q.i().g.b(null);
                    this.o.set(null);
                    try {
                        this.o.notify();
                    }
                    // monitorexit(o)
                    finally {
                        // monitorexit(o)
                        final R1 b = D4.B(this.q);
                        // iftrue(Label_0130:, b != null)
                        // monitorexit(o)
                        // monitorexit(o)
                        while (true) {
                            Block_10: {
                                break Block_10;
                                this.o.notify();
                                final AtomicReference atomicReference;
                                atomicReference.notify();
                                return;
                                final RemoteException ex;
                                this.q.j().G().b("Failed to get app instance id", ex);
                                atomicReference = this.o;
                                continue;
                            }
                            this.q.j().G().a("Failed to get app instance id");
                            this.o.notify();
                            return;
                            final String s;
                            this.q.r().T(s);
                            this.q.i().g.b(s);
                            Label_0195: {
                                D4.m0(this.q);
                            }
                            AtomicReference atomicReference = this.o;
                            continue;
                        }
                        Label_0130: {
                            n.i(this.p);
                        }
                        this.o.set(b.G(this.p));
                        final String s = this.o.get();
                    }
                    // iftrue(Label_0195:, s == null)
                }
            }
            finally {}
        }
        catch (RemoteException ex2) {}
    }
}
