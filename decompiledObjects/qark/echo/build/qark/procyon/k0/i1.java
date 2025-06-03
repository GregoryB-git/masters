// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import g0.o;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import android.content.Context;

public final class i1
{
    public final Context a;
    public PowerManager$WakeLock b;
    public boolean c;
    public boolean d;
    
    public i1(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public void a(final boolean c) {
        if (c && this.b == null) {
            final PowerManager powerManager = (PowerManager)this.a.getSystemService("power");
            if (powerManager == null) {
                o.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            (this.b = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager")).setReferenceCounted(false);
        }
        this.c = c;
        this.c();
    }
    
    public void b(final boolean d) {
        this.d = d;
        this.c();
    }
    
    public final void c() {
        final PowerManager$WakeLock b = this.b;
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
