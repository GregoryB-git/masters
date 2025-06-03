// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.util.Log;
import android.os.Bundle;
import android.os.IBinder;

public final class W extends L
{
    public c b;
    public final int c;
    
    public W(final c b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void F0(final int n, final IBinder binder, final a0 a0) {
        final c b = this.b;
        n.j(b, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        n.i(a0);
        A2.c.c0(b, a0);
        this.W0(n, binder, a0.o);
    }
    
    @Override
    public final void W0(final int n, final IBinder binder, final Bundle bundle) {
        n.j(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
        this.b.N(n, binder, bundle, this.c);
        this.b = null;
    }
    
    @Override
    public final void q0(final int n, final Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", (Throwable)new Exception());
    }
}
