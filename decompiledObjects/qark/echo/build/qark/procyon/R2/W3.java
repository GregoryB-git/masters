// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.concurrent.atomic.AtomicReference;

public final class W3 implements Runnable
{
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ C3 p;
    
    public W3(final C3 p2, final AtomicReference o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final AtomicReference o = this.o;
        // monitorenter(o)
        try {
            this.o.set(this.p.f().H(this.p.p().F()));
            final W3 w3 = this;
            final AtomicReference atomicReference = w3.o;
            atomicReference.notify();
            final AtomicReference atomicReference2 = o;
            // monitorexit(atomicReference2)
            return;
        }
        finally {
            this.o.notify();
        }
        while (true) {
            try {
                final W3 w3 = this;
                final AtomicReference atomicReference = w3.o;
                atomicReference.notify();
                final AtomicReference atomicReference2 = o;
                // monitorexit(atomicReference2)
                return;
                // monitorexit(o)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
