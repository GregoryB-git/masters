/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.wifi.WifiManager
 *  android.net.wifi.WifiManager$WifiLock
 *  java.lang.Object
 *  java.lang.String
 */
package k0;

import android.content.Context;
import android.net.wifi.WifiManager;
import g0.o;

public final class j1 {
    public final Context a;
    public WifiManager.WifiLock b;
    public boolean c;
    public boolean d;

    public j1(Context context) {
        this.a = context.getApplicationContext();
    }

    public void a(boolean bl) {
        if (bl && this.b == null) {
            WifiManager wifiManager = (WifiManager)this.a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                o.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            wifiManager = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.b = wifiManager;
            wifiManager.setReferenceCounted(false);
        }
        this.c = bl;
        this.c();
    }

    public void b(boolean bl) {
        this.d = bl;
        this.c();
    }

    public final void c() {
        WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.d) {
            wifiLock.acquire();
            return;
        }
        wifiLock.release();
    }
}

