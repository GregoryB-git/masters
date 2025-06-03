// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import A2.n;

public final class A implements Runnable
{
    public final /* synthetic */ j o;
    public final /* synthetic */ B p;
    
    public A(final B p2, final j o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final Object b = B.b(this.p);
        // monitorenter(b)
        while (true) {
            try {
                final B p = this.p;
                if (B.a(p) != null) {
                    B.a(p).d((Exception)n.i(this.o.i()));
                }
                // monitorexit(b)
                return;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
