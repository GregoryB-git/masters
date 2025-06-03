/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package R2;

import A2.n;
import E2.e;
import R2.Y1;
import R2.a2;
import R2.o3;
import R2.w;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.t0;

public abstract class x {
    public static volatile Handler d;
    public final o3 a;
    public final Runnable b;
    public volatile long c;

    public x(o3 o32) {
        n.i(o32);
        this.a = o32;
        this.b = new w(this, o32);
    }

    public final void a() {
        this.c = 0L;
        this.f().removeCallbacks(this.b);
    }

    public final void b(long l8) {
        this.a();
        if (l8 >= 0L) {
            this.c = this.a.b().a();
            if (!this.f().postDelayed(this.b, l8)) {
                this.a.j().G().b("Failed to schedule delayed post. time", l8);
            }
        }
    }

    public abstract void d();

    public final boolean e() {
        if (this.c != 0L) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Handler f() {
        if (d != null) {
            return d;
        }
        synchronized (x.class) {
            try {
                if (d != null) return d;
                d = new t0(this.a.a().getMainLooper());
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

