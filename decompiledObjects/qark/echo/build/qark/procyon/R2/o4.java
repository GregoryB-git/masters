// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.net.Uri;

public final class o4 implements Runnable
{
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Uri p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ k4 s;
    
    public o4(final k4 s, final boolean o, final Uri p5, final String q, final String r) {
        this.s = s;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final void run() {
        k4.a(this.s, this.o, this.p, this.q, this.r);
    }
}
