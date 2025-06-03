package j6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8466a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f8467b = new LinkedBlockingQueue();

    public final IBinder a() {
        m6.j.h("BlockingServiceConnection.getService() called on main thread");
        if (this.f8466a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f8466a = true;
        return (IBinder) this.f8467b.take();
    }

    public final IBinder b(TimeUnit timeUnit) {
        m6.j.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f8466a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f8466a = true;
        IBinder iBinder = (IBinder) this.f8467b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f8467b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
