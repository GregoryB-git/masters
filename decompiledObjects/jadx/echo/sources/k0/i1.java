package k0;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15807a;

    /* renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f15808b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15809c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15810d;

    public i1(Context context) {
        this.f15807a = context.getApplicationContext();
    }

    public void a(boolean z7) {
        if (z7 && this.f15808b == null) {
            PowerManager powerManager = (PowerManager) this.f15807a.getSystemService("power");
            if (powerManager == null) {
                g0.o.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f15808b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f15809c = z7;
        c();
    }

    public void b(boolean z7) {
        this.f15810d = z7;
        c();
    }

    public final void c() {
        PowerManager.WakeLock wakeLock = this.f15808b;
        if (wakeLock == null) {
            return;
        }
        if (this.f15809c && this.f15810d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
