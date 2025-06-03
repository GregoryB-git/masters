// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class m2 implements Runnable
{
    public final /* synthetic */ boolean o;
    public final /* synthetic */ j2 p;
    
    public m2(final j2 p2, final boolean o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        j2.a(this.p).H(this.o);
    }
}
