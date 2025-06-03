// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class E extends BroadcastReceiver
{
    public Context a;
    public final D b;
    
    public E(final D b) {
        this.b = b;
    }
    
    public final void a(final Context a) {
        this.a = a;
    }
    
    public final void b() {
        // monitorenter(this)
        while (true) {
            try {
                final Context a = this.a;
                if (a != null) {
                    a.unregisterReceiver((BroadcastReceiver)this);
                }
                this.a = null;
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final Uri data = intent.getData();
        String schemeSpecificPart;
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        }
        else {
            schemeSpecificPart = null;
        }
        if ("com.google.android.gms".equals(schemeSpecificPart)) {
            this.b.a();
            this.b();
        }
    }
}
