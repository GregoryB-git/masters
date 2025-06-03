// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.y0;

public final class S4 implements Runnable
{
    public final /* synthetic */ I o;
    public final /* synthetic */ String p;
    public final /* synthetic */ y0 q;
    public final /* synthetic */ D4 r;
    
    public S4(final D4 r, final I o, final String p4, final y0 q) {
        this.r = r;
        this.o = o;
        this.p = p4;
        this.q = q;
    }
    
    @Override
    public final void run() {
        final byte[] array = null;
        final byte[] array2 = null;
        byte[] m0 = array;
        while (true) {
            Label_0075: {
                try {
                    try {
                        final R1 b = D4.B(this.r);
                        if (b == null) {
                            m0 = array;
                            this.r.j().G().a("Discarding data. Failed to send event to service to bundle");
                            final byte[] array3 = array2;
                            this.r.k().Y(this.q, array3);
                            return;
                        }
                        break Label_0075;
                    }
                    finally {}
                }
                catch (RemoteException ex) {
                    final byte[] array3;
                    m0 = array3;
                    this.r.j().G().b("Failed to send event to the service to bundle", ex);
                    continue;
                    final R1 b;
                    m0 = b.M0(this.o, this.p);
                    D4.m0(this.r);
                    array3 = m0;
                    continue;
                }
            }
            break;
        }
        this.r.k().Y(this.q, m0);
    }
}
