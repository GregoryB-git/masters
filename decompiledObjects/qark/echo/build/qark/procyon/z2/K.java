// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import T2.l;

public final class K implements Runnable
{
    public final /* synthetic */ l o;
    public final /* synthetic */ M p;
    
    public K(final M p2, final l o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        M.b1(this.p, this.o);
    }
}
