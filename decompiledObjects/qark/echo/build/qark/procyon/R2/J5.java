// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import A2.n;
import android.os.Bundle;

public final class J5 implements Runnable
{
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Bundle q;
    public final /* synthetic */ K5 r;
    
    public J5(final K5 r, final String o, final String p4, final Bundle q) {
        this.r = r;
        this.o = o;
        this.p = p4;
        this.q = q;
    }
    
    @Override
    public final void run() {
        this.r.a.r((I)n.i(this.r.a.n0().C(this.o, this.p, this.q, "auto", this.r.a.b().a(), false, true)), this.o);
    }
}
