// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.Bundle;

public final class A4 implements Runnable
{
    public final /* synthetic */ w4 o;
    public final /* synthetic */ w4 p;
    public final /* synthetic */ long q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ v4 s;
    
    public A4(final v4 s, final w4 o, final w4 p5, final long q, final boolean r) {
        this.s = s;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final void run() {
        v4.F(this.s, this.o, this.p, this.q, this.r, (Bundle)null);
    }
}
