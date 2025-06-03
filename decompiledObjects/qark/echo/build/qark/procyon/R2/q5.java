// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class q5
{
    public p5 a;
    public final /* synthetic */ l5 b;
    
    public q5(final l5 b) {
        this.b = b;
    }
    
    public final void a() {
        this.b.n();
        if (this.a != null) {
            l5.B(this.b).removeCallbacks((Runnable)this.a);
        }
        this.b.i().s.a(false);
        this.b.D(false);
    }
    
    public final void b(final long n) {
        this.a = new p5(this, this.b.b().a(), n);
        l5.B(this.b).postDelayed((Runnable)this.a, 2000L);
    }
}
