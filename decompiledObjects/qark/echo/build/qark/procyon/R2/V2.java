// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public final class V2 implements Runnable
{
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ long r;
    public final /* synthetic */ R2 s;
    
    public V2(final R2 s, final String o, final String p5, final String q, final long r) {
        this.s = s;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final void run() {
        final String o = this.o;
        if (o == null) {
            R2.o(this.s).C(this.p, null);
            return;
        }
        R2.o(this.s).C(this.p, new w4(this.q, o, this.r));
    }
}
