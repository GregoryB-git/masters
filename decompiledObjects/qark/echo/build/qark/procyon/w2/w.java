// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.util.Log;
import V2.j;
import android.os.Bundle;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import F2.a;
import L2.e;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

public final class w
{
    public static w e;
    public final Context a;
    public final ScheduledExecutorService b;
    public q c;
    public int d;
    
    public w(final Context context, final ScheduledExecutorService b) {
        this.c = new q(this, null);
        this.d = 1;
        this.b = b;
        this.a = context.getApplicationContext();
    }
    
    public static w b(final Context context) {
        // monitorenter(w.class)
        while (true) {
            try {
                if (w.e == null) {
                    L2.e.a();
                    w.e = new w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a("MessengerIpcClient"))));
                }
                // monitorexit(w.class)
                return w.e;
                // monitorexit(w.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final j c(final int n, final Bundle bundle) {
        return this.g(new s(this.f(), 2, bundle));
    }
    
    public final j d(final int n, final Bundle bundle) {
        return this.g(new v(this.f(), 1, bundle));
    }
    
    public final int f() {
        synchronized (this) {
            return this.d++;
        }
    }
    
    public final j g(final t obj) {
        // monitorenter(this)
        while (true) {
            try {
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    final String value = String.valueOf(obj);
                    final StringBuilder sb = new StringBuilder(value.length() + 9);
                    sb.append("Queueing ");
                    sb.append(value);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                if (!this.c.g(obj)) {
                    (this.c = new q(this, null)).g(obj);
                }
                // monitorexit(this)
                return obj.b.a();
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
