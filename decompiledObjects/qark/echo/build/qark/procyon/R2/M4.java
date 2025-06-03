// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.RemoteException;

public final class M4 implements Runnable
{
    public final /* synthetic */ w4 o;
    public final /* synthetic */ D4 p;
    
    public M4(final D4 p2, final w4 o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        final R1 b = D4.B(this.p);
        if (b == null) {
            this.p.j().G().a("Failed to send current screen to service");
            return;
        }
        while (true) {
            try {
                final w4 o = this.o;
                if (o == null) {
                    b.I0(0L, null, null, this.p.a().getPackageName());
                }
                else {
                    b.I0(o.c, o.a, o.b, this.p.a().getPackageName());
                }
                D4.m0(this.p);
                return;
                final RemoteException ex;
                this.p.j().G().b("Failed to send current screen to the service", ex);
            }
            catch (RemoteException ex) {
                continue;
            }
            break;
        }
    }
}
