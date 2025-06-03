/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  java.lang.Object
 *  java.lang.String
 */
package k0;

import android.content.Context;
import android.os.PowerManager;
import g0.o;

public final class i1 {
    public final Context a;
    public PowerManager.WakeLock b;
    public boolean c;
    public boolean d;

    public i1(Context context) {
        this.a = context.getApplicationContext();
    }

    public void a(boolean bl) {
        if (bl && this.b == null) {
            PowerManager powerManager = (PowerManager)this.a.getSystemService("power");
            if (powerManager == null) {
                o.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            powerManager = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.b = powerManager;
            powerManager.setReferenceCounted(false);
        }
        this.c = bl;
        this.c();
    }

    public void b(boolean bl) {
        this.d = bl;
        this.c();
    }

    public final void c() {
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null) {
            return;
        }
        if (this.c && this.d) {
            wakeLock.acquire();
            return;
        }
        wakeLock.release();
    }
}

