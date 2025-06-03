// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.content.Intent;
import android.content.Context;
import android.content.IntentFilter;
import A2.n;
import android.content.BroadcastReceiver;

public class j2 extends BroadcastReceiver
{
    public final D5 a;
    public boolean b;
    public boolean c;
    
    public j2(final D5 a) {
        n.i(a);
        this.a = a;
    }
    
    public final void b() {
        this.a.p0();
        this.a.e().n();
        if (this.b) {
            return;
        }
        this.a.a().registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.g0().A();
        this.a.j().K().b("Registering connectivity change receiver. Network connected", this.c);
        this.b = true;
    }
    
    public final void c() {
        this.a.p0();
        this.a.e().n();
        this.a.e().n();
        if (!this.b) {
            return;
        }
        this.a.j().K().a("Unregistering connectivity change receiver");
        this.b = false;
        this.c = false;
        final Context a = this.a.a();
        try {
            a.unregisterReceiver((BroadcastReceiver)this);
        }
        catch (IllegalArgumentException ex) {
            this.a.j().G().b("Failed to unregister the network broadcast receiver", ex);
        }
    }
    
    public void onReceive(final Context context, final Intent intent) {
        this.a.p0();
        final String action = intent.getAction();
        this.a.j().K().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            final boolean a = this.a.g0().A();
            if (this.c != a) {
                this.c = a;
                this.a.e().D(new m2(this, a));
            }
            return;
        }
        this.a.j().L().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
