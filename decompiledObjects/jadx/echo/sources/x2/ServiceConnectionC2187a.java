package x2;

import A2.AbstractC0328n;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceConnectionC2187a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21165a = false;

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue f21166b = new LinkedBlockingQueue();

    public IBinder a(long j7, TimeUnit timeUnit) {
        AbstractC0328n.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f21165a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f21165a = true;
        IBinder iBinder = (IBinder) this.f21166b.poll(j7, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f21166b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
