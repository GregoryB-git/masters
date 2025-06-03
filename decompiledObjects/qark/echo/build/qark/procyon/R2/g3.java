// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class g3 implements Runnable
{
    public final /* synthetic */ R5 o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ R2 q;
    
    public g3(final R2 q, final R5 o, final W5 p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        R2.o(this.q).o0();
        if (this.o.a() == null) {
            R2.o(this.q).D(this.o.p, this.p);
            return;
        }
        R2.o(this.q).u(this.o, this.p);
    }
}
