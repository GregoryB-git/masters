// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class U2 implements Runnable
{
    public final /* synthetic */ e o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ R2 q;
    
    public U2(final R2 q, final e o, final W5 p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    @Override
    public final void run() {
        R2.o(this.q).o0();
        if (this.o.q.a() == null) {
            R2.o(this.q).p(this.o, this.p);
            return;
        }
        R2.o(this.q).T(this.o, this.p);
    }
}
