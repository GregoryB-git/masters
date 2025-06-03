// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import android.content.ComponentName;
import java.util.concurrent.TimeoutException;
import A2.n;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import android.content.ServiceConnection;

public class a implements ServiceConnection
{
    public boolean a;
    public final BlockingQueue b;
    
    public a() {
        this.a = false;
        this.b = new LinkedBlockingQueue();
    }
    
    public IBinder a(final long n, final TimeUnit timeUnit) {
        n.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.a = true;
        final IBinder binder = this.b.poll(n, timeUnit);
        if (binder != null) {
            return binder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        this.b.add(binder);
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
    }
}
