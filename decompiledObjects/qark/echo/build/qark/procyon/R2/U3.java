// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.Bundle;

public final class U3 implements Runnable
{
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ long q;
    public final /* synthetic */ Bundle r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ String v;
    public final /* synthetic */ C3 w;
    
    public U3(final C3 w, final String o, final String p9, final long q, final Bundle r, final boolean s, final boolean t, final boolean u, final String v) {
        this.w = w;
        this.o = o;
        this.p = p9;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
    }
    
    @Override
    public final void run() {
        this.w.V(this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
    }
}
