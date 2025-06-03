// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.Handler;
import android.os.IInterface;
import android.os.Bundle;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class X implements ServiceConnection
{
    public final int a;
    public final /* synthetic */ c b;
    
    public X(final c b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final c b = this.b;
        if (binder == null) {
            c.d0(b, 16);
            return;
        }
        final Object w = c.W(b);
        // monitorenter(w)
        while (true) {
            try {
                final c b2 = this.b;
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                k k;
                if (queryLocalInterface != null && queryLocalInterface instanceof k) {
                    k = (k)queryLocalInterface;
                }
                else {
                    k = new M(binder);
                }
                c.a0(b2, k);
                // monitorexit(w)
                this.b.e0(0, null, this.a);
                return;
                // monitorexit(w)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName = (ComponentName)c.W(this.b);
        synchronized (componentName) {
            c.a0(this.b, (k)null);
            // monitorexit(componentName)
            componentName = (ComponentName)this.b.l;
            ((Handler)componentName).sendMessage(((Handler)componentName).obtainMessage(6, this.a, 1));
        }
    }
}
