package D2;

import A2.AbstractC0328n;
import A2.k0;
import E2.l;
import G2.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1247b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile b f1248c;

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f1249a = new ConcurrentHashMap();

    public static b b() {
        if (f1248c == null) {
            synchronized (f1247b) {
                try {
                    if (f1248c == null) {
                        f1248c = new b();
                    }
                } finally {
                }
            }
        }
        b bVar = f1248c;
        AbstractC0328n.i(bVar);
        return bVar;
    }

    public static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof k0);
    }

    public static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        boolean bindService;
        if (!l.j() || executor == null) {
            return context.bindService(intent, serviceConnection, i7);
        }
        bindService = context.bindService(intent, i7, executor, serviceConnection);
        return bindService;
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i7) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i7, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f1249a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f1249a.get(serviceConnection));
        } finally {
            this.f1249a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        return f(context, str, intent, serviceConnection, i7, true, executor);
    }

    public final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, boolean z7, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((d.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i7, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f1249a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean h7 = h(context, intent, serviceConnection, i7, executor);
            if (h7) {
                return h7;
            }
            return false;
        } finally {
            this.f1249a.remove(serviceConnection, serviceConnection);
        }
    }
}
