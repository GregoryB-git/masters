// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class X2 implements Runnable
{
    public final /* synthetic */ e o;
    public final /* synthetic */ R2 p;
    
    public X2(final R2 p2, final e o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        R2.o(this.p).o0();
        if (this.o.q.a() == null) {
            R2.o(this.p).o(this.o);
            return;
        }
        R2.o(this.p).S(this.o);
    }
}
