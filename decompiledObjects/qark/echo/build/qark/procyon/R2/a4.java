// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.concurrent.atomic.AtomicReference;

public final class a4 implements Runnable
{
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ C3 t;
    
    public a4(final C3 t, final AtomicReference o, final String s, final String q, final String r, final boolean s2) {
        this.t = t;
        this.o = o;
        this.p = null;
        this.q = q;
        this.r = r;
        this.s = s2;
    }
    
    @Override
    public final void run() {
        this.t.a.J().T(this.o, null, this.q, this.r, this.s);
    }
}
