// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.Bundle;

public final class x4 implements Runnable
{
    public final /* synthetic */ Bundle o;
    public final /* synthetic */ w4 p;
    public final /* synthetic */ w4 q;
    public final /* synthetic */ long r;
    public final /* synthetic */ v4 s;
    
    public x4(final v4 s, final Bundle o, final w4 p5, final w4 q, final long r) {
        this.s = s;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final void run() {
        v4.H(this.s, this.o, this.p, this.q, this.r);
    }
}
