// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import B2.a;
import android.os.RemoteException;
import android.text.TextUtils;
import A2.n;

public final class W4 implements Runnable
{
    public final /* synthetic */ boolean o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ e r;
    public final /* synthetic */ e s;
    public final /* synthetic */ D4 t;
    
    public W4(final D4 t, final boolean b, final W5 p6, final boolean q, final e r, final e s) {
        this.t = t;
        this.o = true;
        this.p = p6;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public final void run() {
        final R1 b = D4.B(this.t);
        if (b == null) {
            this.t.j().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        while (true) {
            while (true) {
                if (this.o) {
                    n.i(this.p);
                    final D4 t = this.t;
                    a r;
                    if (this.q) {
                        r = null;
                    }
                    else {
                        r = this.r;
                    }
                    t.F(b, r, this.p);
                    break Label_0145;
                }
                try {
                    if (TextUtils.isEmpty((CharSequence)this.s.o)) {
                        n.i(this.p);
                        b.m0(this.r, this.p);
                    }
                    else {
                        b.n0(this.r);
                    }
                    D4.m0(this.t);
                    return;
                    final RemoteException ex;
                    this.t.j().G().b("Failed to send conditional user property to the service", ex);
                    continue;
                }
                catch (RemoteException ex2) {}
                break;
            }
            final RemoteException ex2;
            final RemoteException ex = ex2;
            continue;
        }
    }
}
