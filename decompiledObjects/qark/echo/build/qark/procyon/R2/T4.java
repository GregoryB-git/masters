// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import B2.a;
import android.os.RemoteException;
import android.text.TextUtils;
import A2.n;

public final class T4 implements Runnable
{
    public final /* synthetic */ boolean o;
    public final /* synthetic */ W5 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ I r;
    public final /* synthetic */ String s;
    public final /* synthetic */ D4 t;
    
    public T4(final D4 t, final boolean o, final W5 p6, final boolean q, final I r, final String s) {
        this.t = t;
        this.o = o;
        this.p = p6;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public final void run() {
        final R1 b = D4.B(this.t);
        if (b == null) {
            this.t.j().G().a("Discarding data. Failed to send event to service");
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
                    break Label_0156;
                }
                try {
                    if (TextUtils.isEmpty((CharSequence)this.s)) {
                        n.i(this.p);
                        b.R0(this.r, this.p);
                    }
                    else {
                        b.S0(this.r, this.s, this.t.j().O());
                    }
                    D4.m0(this.t);
                    return;
                    final RemoteException ex;
                    this.t.j().G().b("Failed to send event to the service", ex);
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
