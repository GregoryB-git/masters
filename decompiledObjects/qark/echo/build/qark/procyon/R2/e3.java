// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class e3 implements Runnable
{
    public final /* synthetic */ I o;
    public final /* synthetic */ String p;
    public final /* synthetic */ R2 q;
    
    public e3(final R2 q, final I o, final String p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        R2.o(this.q).o0();
        R2.o(this.q).r(this.o, this.p);
    }
}
