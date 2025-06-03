// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import x2.b;
import android.os.Bundle;
import android.os.IBinder;

public final class Y extends K
{
    public final IBinder g;
    public final /* synthetic */ c h;
    
    public Y(final c h, final int n, final IBinder g, final Bundle bundle) {
        this.h = h;
        super(h, n, bundle);
        this.g = g;
    }
    
    @Override
    public final void f(final b b) {
        if (A2.c.V(this.h) != null) {
            A2.c.V(this.h).o(b);
        }
        this.h.L(b);
    }
    
    @Override
    public final boolean g() {
        while (true) {
            try {
                final IBinder g = this.g;
                n.i(g);
                final String interfaceDescriptor = g.getInterfaceDescriptor();
                while (true) {
                    if (!this.h.E().equals(interfaceDescriptor)) {
                        final String e = this.h.E();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("service descriptor mismatch: ");
                        sb.append(e);
                        sb.append(" vs. ");
                        sb.append(interfaceDescriptor);
                        final String string = sb.toString();
                        Log.w("GmsClient", string);
                        return false;
                    }
                    final IInterface s = this.h.s(this.g);
                    if (s != null && (A2.c.g0(this.h, 2, 4, s) || A2.c.g0(this.h, 3, 4, s))) {
                        A2.c.Z(this.h, (b)null);
                        final Bundle x = this.h.x();
                        final c h = this.h;
                        if (A2.c.U(h) != null) {
                            A2.c.U(h).v(x);
                        }
                        return true;
                    }
                    return false;
                    final String string = "service probably died";
                    continue;
                }
            }
            catch (RemoteException ex) {
                continue;
            }
            break;
        }
    }
}
