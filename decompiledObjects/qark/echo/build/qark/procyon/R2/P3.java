// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class P3 implements Runnable
{
    public final /* synthetic */ boolean o;
    public final /* synthetic */ C3 p;
    
    public P3(final C3 p2, final boolean o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final boolean p = this.p.a.p();
        final boolean o = this.p.a.o();
        this.p.a.m(this.o);
        if (o == this.o) {
            this.p.a.j().K().b("Default data collection state already set to", this.o);
        }
        if (this.p.a.p() == p || this.p.a.p() != this.p.a.o()) {
            this.p.a.j().M().c("Default data collection is different than actual status", this.o, p);
        }
        C3.v0(this.p);
    }
}
