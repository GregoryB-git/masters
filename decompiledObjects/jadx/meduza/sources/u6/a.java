package u6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import m6.j;
import m6.t0;
import x6.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15071b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f15072c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f15073a = new ConcurrentHashMap();

    public static a b() {
        if (f15072c == null) {
            synchronized (f15071b) {
                if (f15072c == null) {
                    f15072c = new a();
                }
            }
        }
        a aVar = f15072c;
        j.i(aVar);
        return aVar;
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i10, null);
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        if (!(!(serviceConnection instanceof t0)) || !this.f15073a.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) this.f15073a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                this.f15073a.remove(serviceConnection);
            }
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((d.a(context).a(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        boolean z10 = true;
        if (!(!(serviceConnection instanceof t0))) {
            if (executor == null) {
                executor = null;
            }
            if (!(Build.VERSION.SDK_INT >= 29) || executor == null) {
                return context.bindService(intent, serviceConnection, i10);
            }
            bindService = context.bindService(intent, i10, executor, serviceConnection);
            return bindService;
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f15073a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            if (Build.VERSION.SDK_INT < 29) {
                z10 = false;
            }
            boolean bindService2 = (!z10 || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
            if (bindService2) {
                return bindService2;
            }
            this.f15073a.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            this.f15073a.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
