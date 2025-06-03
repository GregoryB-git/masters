// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.content.ComponentName;

public final class c5 implements Runnable
{
    public final /* synthetic */ ComponentName o;
    public final /* synthetic */ a5 p;
    
    public c5(final a5 p2, final ComponentName o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        D4.I(this.p.c, this.o);
    }
}
