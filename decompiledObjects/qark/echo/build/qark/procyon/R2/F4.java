// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.RemoteException;
import A2.n;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.y0;

public final class F4 implements Runnable
{
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ W5 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ y0 s;
    public final /* synthetic */ D4 t;
    
    public F4(final D4 t, final String o, final String p6, final W5 q, final boolean r, final y0 s) {
        this.t = t;
        this.o = o;
        this.p = p6;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public final void run() {
        Bundle g;
        Bundle bundle = g = new Bundle();
        while (true) {
            Label_0079: {
                try {
                    try {
                        final R1 b = D4.B(this.t);
                        if (b == null) {
                            g = bundle;
                            this.t.j().G().c("Failed to get user properties; not connected to service", this.o, this.p);
                            final Bundle bundle2 = bundle;
                            this.t.k().U(this.s, bundle2);
                            return;
                        }
                        break Label_0079;
                    }
                    finally {}
                }
                catch (RemoteException bundle) {
                    final Bundle bundle2;
                    g = bundle2;
                    this.t.j().G().c("Failed to get user properties; remote exception", this.o, bundle);
                    continue;
                    n.i(this.q);
                    final R1 b;
                    bundle = (g = S5.G(b.x0(this.o, this.p, this.r, this.q)));
                    D4.m0(this.t);
                    bundle2 = bundle;
                    continue;
                }
            }
            break;
        }
        this.t.k().U(this.s, g);
    }
}
