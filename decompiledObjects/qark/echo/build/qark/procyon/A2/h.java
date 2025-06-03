// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import java.util.concurrent.Executor;
import android.content.ServiceConnection;
import android.os.Looper;
import android.content.Context;
import android.os.HandlerThread;

public abstract class h
{
    public static int a = 4225;
    public static final Object b;
    public static j0 c;
    public static HandlerThread d;
    public static boolean e = false;
    
    static {
        b = new Object();
    }
    
    public static int a() {
        return h.a;
    }
    
    public static h b(final Context context) {
        final Object b = h.b;
        // monitorenter(b)
        while (true) {
            try {
                if (h.c == null) {
                    final Context applicationContext = context.getApplicationContext();
                    Looper looper;
                    if (h.e) {
                        looper = c().getLooper();
                    }
                    else {
                        looper = context.getMainLooper();
                    }
                    h.c = new j0(applicationContext, looper);
                }
                // monitorexit(b)
                return h.c;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static HandlerThread c() {
        final Object b = h.b;
        // monitorenter(b)
        while (true) {
            try {
                final HandlerThread d = h.d;
                if (d != null) {
                    // monitorexit(b)
                    return d;
                }
                ((Thread)(h.d = new HandlerThread("GoogleApiHandler", 9))).start();
                // monitorexit(b)
                return h.d;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public abstract void d(final e0 p0, final ServiceConnection p1, final String p2);
    
    public final void e(final String s, final String s2, final int n, final ServiceConnection serviceConnection, final String s3, final boolean b) {
        this.d(new e0(s, s2, n, b), serviceConnection, s3);
    }
    
    public abstract boolean f(final e0 p0, final ServiceConnection p1, final String p2, final Executor p3);
}
