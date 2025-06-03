package k0;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15812a;

    /* renamed from: b, reason: collision with root package name */
    public WifiManager.WifiLock f15813b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15814c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15815d;

    public j1(Context context) {
        this.f15812a = context.getApplicationContext();
    }

    public void a(boolean z7) {
        if (z7 && this.f15813b == null) {
            WifiManager wifiManager = (WifiManager) this.f15812a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                g0.o.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f15813b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f15814c = z7;
        c();
    }

    public void b(boolean z7) {
        this.f15815d = z7;
        c();
    }

    public final void c() {
        WifiManager.WifiLock wifiLock = this.f15813b;
        if (wifiLock == null) {
            return;
        }
        if (this.f15814c && this.f15815d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
