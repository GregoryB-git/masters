// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import java.util.Iterator;
import android.os.StrictMode$VmPolicy;
import android.os.StrictMode$VmPolicy$Builder;
import E2.l;
import android.os.StrictMode;
import java.util.concurrent.Executor;
import java.util.HashMap;
import android.content.ComponentName;
import android.os.IBinder;
import java.util.Map;
import android.content.ServiceConnection;

public final class g0 implements ServiceConnection, k0
{
    public final Map a;
    public int b;
    public boolean c;
    public IBinder d;
    public final e0 e;
    public ComponentName f;
    public final /* synthetic */ j0 g;
    
    public g0(final j0 g, final e0 e) {
        this.g = g;
        this.e = e;
        this.a = new HashMap();
        this.b = 2;
    }
    
    public final int a() {
        return this.b;
    }
    
    public final ComponentName b() {
        return this.f;
    }
    
    public final IBinder c() {
        return this.d;
    }
    
    public final void d(final ServiceConnection serviceConnection, final ServiceConnection serviceConnection2, final String s) {
        this.a.put(serviceConnection, serviceConnection2);
    }
    
    public final void e(final String s, final Executor executor) {
        this.b = 3;
        final StrictMode$VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (l.l()) {
            StrictMode.setVmPolicy(f0.a(new StrictMode$VmPolicy$Builder(vmPolicy)).build());
        }
        while (true) {
            while (true) {
                try {
                    final j0 g = this.g;
                    Label_0145: {
                        if (this.c = j0.j(g).d(j0.h(g), s, this.e.c(j0.h(g)), (ServiceConnection)this, this.e.a(), executor)) {
                            j0.i(this.g).sendMessageDelayed(j0.i(this.g).obtainMessage(1, (Object)this.e), j0.g(this.g));
                            break Label_0145;
                        }
                        this.b = 2;
                        try {
                            final j0 g2 = this.g;
                            j0.j(g2).c(j0.h(g2), (ServiceConnection)this);
                            StrictMode.setVmPolicy(vmPolicy);
                            return;
                            StrictMode.setVmPolicy(vmPolicy);
                        }
                        catch (IllegalArgumentException ex) {}
                    }
                }
                finally {}
                continue;
            }
        }
    }
    
    public final void f(final ServiceConnection serviceConnection, final String s) {
        this.a.remove(serviceConnection);
    }
    
    public final void g(final String s) {
        j0.i(this.g).removeMessages(1, (Object)this.e);
        final j0 g = this.g;
        j0.j(g).c(j0.h(g), (ServiceConnection)this);
        this.c = false;
        this.b = 2;
    }
    
    public final boolean h(final ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }
    
    public final boolean i() {
        return this.a.isEmpty();
    }
    
    public final boolean j() {
        return this.c;
    }
    
    public final void onServiceConnected(final ComponentName f, final IBinder d) {
        final HashMap k = j0.k(this.g);
        // monitorenter(k)
        while (true) {
            try {
                j0.i(this.g).removeMessages(1, (Object)this.e);
                this.d = d;
                this.f = f;
                final Iterator<ServiceConnection> iterator = this.a.values().iterator();
                while (iterator.hasNext()) {
                    iterator.next().onServiceConnected(f, d);
                }
                this.b = 1;
                // monitorexit(k)
                return;
                // monitorexit(k)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void onServiceDisconnected(final ComponentName f) {
        final HashMap k = j0.k(this.g);
        // monitorenter(k)
        while (true) {
            try {
                j0.i(this.g).removeMessages(1, (Object)this.e);
                this.d = null;
                this.f = f;
                final Iterator<ServiceConnection> iterator = this.a.values().iterator();
                while (iterator.hasNext()) {
                    iterator.next().onServiceDisconnected(f);
                }
                this.b = 2;
                // monitorexit(k)
                return;
                // monitorexit(k)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
