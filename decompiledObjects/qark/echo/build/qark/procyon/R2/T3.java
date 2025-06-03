// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class T3 implements Runnable
{
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ long r;
    public final /* synthetic */ C3 s;
    
    public T3(final C3 s, final String o, final String p5, final Object q, final long r) {
        this.s = s;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final void run() {
        this.s.a0(this.o, this.p, this.q, this.r);
    }
}
