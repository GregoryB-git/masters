// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import java.util.concurrent.Executor;
import android.content.ServiceConnection;
import android.os.Handler$Callback;
import M2.e;
import android.os.Looper;
import D2.b;
import android.os.Handler;
import android.content.Context;
import java.util.HashMap;

public final class j0 extends h
{
    public final HashMap f;
    public final Context g;
    public volatile Handler h;
    public final i0 i;
    public final b j;
    public final long k;
    public final long l;
    
    public j0(final Context context, final Looper looper) {
        this.f = new HashMap();
        final i0 i = new i0(this, null);
        this.i = i;
        this.g = context.getApplicationContext();
        this.h = new e(looper, (Handler$Callback)i);
        this.j = D2.b.b();
        this.k = 5000L;
        this.l = 300000L;
    }
    
    @Override
    public final void d(final e0 key, final ServiceConnection serviceConnection, final String s) {
        n.j(serviceConnection, "ServiceConnection must not be null");
        final HashMap f = this.f;
        // monitorenter(f)
        while (true) {
            try {
                final g0 g0 = this.f.get(key);
                if (g0 == null) {
                    final String string = key.toString();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (g0.h(serviceConnection)) {
                    g0.f(serviceConnection, s);
                    if (g0.i()) {
                        this.h.sendMessageDelayed(this.h.obtainMessage(0, (Object)key), this.k);
                    }
                    // monitorexit(f)
                    return;
                }
                final String string2 = key.toString();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(string2);
                throw new IllegalStateException(sb2.toString());
                // monitorexit(f)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final boolean f(final e0 e0, final ServiceConnection serviceConnection, final String s, final Executor executor) {
        n.j(serviceConnection, "ServiceConnection must not be null");
        final HashMap f = this.f;
        // monitorenter(f)
        while (true) {
            try {
                final g0 g0 = this.f.get(e0);
                g0 g2;
                if (g0 == null) {
                    final g0 value = new g0(this, e0);
                    value.d(serviceConnection, serviceConnection, s);
                    value.e(s, executor);
                    this.f.put(e0, value);
                    g2 = value;
                }
                else {
                    this.h.removeMessages(0, (Object)e0);
                    if (g0.h(serviceConnection)) {
                        final String string = e0.toString();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    g0.d(serviceConnection, serviceConnection, s);
                    final int a = g0.a();
                    if (a != 1) {
                        if (a != 2) {
                            g2 = g0;
                        }
                        else {
                            g0.e(s, executor);
                            g2 = g0;
                        }
                    }
                    else {
                        serviceConnection.onServiceConnected(g0.b(), g0.c());
                        g2 = g0;
                    }
                }
                // monitorexit(f)
                return g2.j();
                // monitorexit(f)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
