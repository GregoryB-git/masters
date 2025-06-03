// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import g0.o;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager$WifiLock;
import android.content.Context;

public final class j1
{
    public final Context a;
    public WifiManager$WifiLock b;
    public boolean c;
    public boolean d;
    
    public j1(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public void a(final boolean c) {
        if (c && this.b == null) {
            final WifiManager wifiManager = (WifiManager)this.a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                o.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            (this.b = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager")).setReferenceCounted(false);
        }
        this.c = c;
        this.c();
    }
    
    public void b(final boolean d) {
        this.d = d;
        this.c();
    }
    
    public final void c() {
        final WifiManager$WifiLock b = this.b;
        if (b == null) {
            return;
        }
        if (this.c && this.d) {
            b.acquire();
            return;
        }
        b.release();
    }
}
