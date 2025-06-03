// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.concurrent.atomic.AtomicReference;

public final class b4 implements Runnable
{
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ C3 s;
    
    public b4(final C3 s, final AtomicReference o, final String s2, final String q, final String r) {
        this.s = s;
        this.o = o;
        this.p = null;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final void run() {
        this.s.a.J().S(this.o, null, this.q, this.r);
    }
}
