// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.os.IBinder;
import android.content.ComponentName;
import java.util.concurrent.TimeUnit;
import android.content.Intent;
import A2.n;
import java.util.Iterator;
import D2.b;
import android.util.Log;
import java.util.ArrayDeque;
import android.os.Handler;
import android.os.Handler$Callback;
import L2.f;
import android.os.Looper;
import android.util.SparseArray;
import java.util.Queue;
import android.os.Messenger;
import android.content.ServiceConnection;

public final class q implements ServiceConnection
{
    public int a = 0;
    public final Messenger b = new Messenger((Handler)new f(Looper.getMainLooper(), (Handler$Callback)new j(this)));
    public r c;
    public final Queue d = new ArrayDeque();
    public final SparseArray e = new SparseArray();
    public final /* synthetic */ w f;
    
    public final void a(final int n, final String s) {
        synchronized (this) {
            this.b(n, s, null);
        }
    }
    
    public final void b(int i, final String obj, final Throwable t) {
        // monitorenter(this)
        while (true) {
            try {
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    final String value = String.valueOf(obj);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Disconnected: ".concat(value);
                    }
                    else {
                        concat = new String("Disconnected: ");
                    }
                    Log.d("MessengerIpcClient", concat);
                }
                final int a = this.a;
                if (a == 0) {
                    throw new IllegalStateException();
                }
                if (a == 1 || a == 2) {
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Unbinding service");
                    }
                    this.a = 4;
                    D2.b.b().c(w.a(this.f), (ServiceConnection)this);
                    final u u = new u(i, obj, t);
                    final Iterator iterator = this.d.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().c(u);
                    }
                    this.d.clear();
                    for (i = 0; i < this.e.size(); ++i) {
                        ((t)this.e.valueAt(i)).c(u);
                    }
                    this.e.clear();
                    // monitorexit(this)
                    return;
                }
                if (a != 3) {
                    // monitorexit(this)
                    return;
                }
                this.a = 4;
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void c() {
        w.e(this.f).execute(new l(this));
    }
    
    public final void d() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0027: {
            try {
                if (this.a == 1) {
                    this.a(1, "Timed out while binding");
                    // monitorexit(this)
                    return;
                }
            }
            finally {
                break Label_0027;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public final void e(final int i) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0088: {
            try {
                final t t = (t)this.e.get(i);
                if (t != null) {
                    final StringBuilder sb = new StringBuilder(31);
                    sb.append("Timing out request: ");
                    sb.append(i);
                    Log.w("MessengerIpcClient", sb.toString());
                    this.e.remove(i);
                    t.c(new u(3, "Timed out waiting for response", null));
                    this.f();
                    // monitorexit(this)
                    return;
                }
            }
            finally {
                break Label_0088;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public final void f() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                    }
                    this.a = 3;
                    D2.b.b().c(w.a(this.f), (ServiceConnection)this);
                    // monitorexit(this)
                    return;
                }
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean g(final t t) {
        // monitorenter(this)
        // monitorexit(this)
        // monitorexit(this)
        final Throwable t2;
        Label_0204: {
            Label_0063: {
                try {
                    final int a = this.a;
                    if (a == 0) {
                        break Label_0063;
                    }
                    if (a != 1) {
                        if (a != 2) {
                            // monitorexit(this)
                            return false;
                        }
                        this.d.add(t);
                        this.c();
                        // monitorexit(this)
                        return true;
                    }
                }
                finally {
                    break Label_0204;
                }
                this.d.add(t2);
                return true;
            }
            this.d.add(t2);
            n.l(this.a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.a = 1;
            final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            Label_0200: {
                Label_0192: {
                    try {
                        if (!D2.b.b().a(w.a(this.f), intent, (ServiceConnection)this, 1)) {
                            this.a(0, "Unable to bind to service");
                            break Label_0200;
                        }
                    }
                    catch (SecurityException ex) {
                        break Label_0192;
                    }
                    w.e(this.f).schedule(new m(this), 30L, TimeUnit.SECONDS);
                    break Label_0200;
                }
                final SecurityException ex;
                this.b(0, "Unable to bind to service", ex);
            }
            return true;
        }
        // monitorexit(this)
        throw t2;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        w.e(this.f).execute(new w2.n(this, binder));
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        w.e(this.f).execute(new k(this));
    }
}
