// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.internal.measurement.t0;
import A2.n;
import android.os.Handler;

public abstract class x
{
    public static volatile Handler d;
    public final o3 a;
    public final Runnable b;
    public volatile long c;
    
    public x(final o3 a) {
        n.i(a);
        this.a = a;
        this.b = new w(this, a);
    }
    
    public final void a() {
        this.c = 0L;
        this.f().removeCallbacks(this.b);
    }
    
    public final void b(final long l) {
        this.a();
        if (l >= 0L) {
            this.c = this.a.b().a();
            if (!this.f().postDelayed(this.b, l)) {
                this.a.j().G().b("Failed to schedule delayed post. time", l);
            }
        }
    }
    
    public abstract void d();
    
    public final boolean e() {
        return this.c != 0L;
    }
    
    public final Handler f() {
        if (x.d != null) {
            return x.d;
        }
        // monitorenter(x.class)
        while (true) {
            try {
                if (x.d == null) {
                    x.d = new t0(this.a.a().getMainLooper());
                }
                // monitorexit(x.class)
                return x.d;
                // monitorexit(x.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
