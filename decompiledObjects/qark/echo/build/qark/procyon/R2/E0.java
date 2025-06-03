// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class E0 implements Runnable
{
    public final /* synthetic */ String o;
    public final /* synthetic */ long p;
    public final /* synthetic */ B q;
    
    public E0(final B q, final String o, final long p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        B.C(this.q, this.o, this.p);
    }
}
