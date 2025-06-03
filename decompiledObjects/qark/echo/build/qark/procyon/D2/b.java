// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D2;

import android.content.ComponentName;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import G2.d;
import E2.l;
import java.util.concurrent.Executor;
import android.content.Intent;
import A2.k0;
import java.util.NoSuchElementException;
import android.content.ServiceConnection;
import android.content.Context;
import A2.n;
import java.util.concurrent.ConcurrentHashMap;

public class b
{
    public static final Object b;
    public static volatile b c;
    public ConcurrentHashMap a;
    
    static {
        b = new Object();
    }
    
    public b() {
        this.a = new ConcurrentHashMap();
    }
    
    public static b b() {
        while (true) {
            if (D2.b.c == null) {
                Object o = D2.b.b;
                // monitorenter(o)
                while (true) {
                    try {
                        if (D2.b.c == null) {
                            D2.b.c = new b();
                        }
                        // monitorexit(o)
                        o = D2.b.c;
                        n.i(o);
                        return (b)o;
                    }
                    // monitorexit(o)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public static void e(final Context context, final ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        }
        catch (IllegalArgumentException | IllegalStateException | NoSuchElementException ex) {}
    }
    
    public static boolean g(final ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof k0);
    }
    
    public static final boolean h(final Context context, final Intent intent, final ServiceConnection serviceConnection, final int n, final Executor executor) {
        if (l.j() && executor != null) {
            return a.a(context, intent, n, executor, serviceConnection);
        }
        return context.bindService(intent, serviceConnection, n);
    }
    
    public boolean a(final Context context, final Intent intent, final ServiceConnection serviceConnection, final int n) {
        return this.f(context, context.getClass().getName(), intent, serviceConnection, n, true, null);
    }
    
    public void c(final Context context, final ServiceConnection key) {
        if (g(key) && this.a.containsKey(key)) {
            try {
                e(context, this.a.get(key));
                return;
            }
            finally {
                this.a.remove(key);
            }
        }
        e(context, key);
    }
    
    public final boolean d(final Context context, final String s, final Intent intent, final ServiceConnection serviceConnection, final int n, final Executor executor) {
        return this.f(context, s, intent, serviceConnection, n, true, executor);
    }
    
    public final boolean f(final Context context, final String s, final Intent intent, final ServiceConnection serviceConnection, final int n, final boolean b, final Executor executor) {
        final ComponentName component = intent.getComponent();
        while (true) {
            if (component == null) {
                break Label_0062;
            }
            final String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((d.a(context).c(packageName, 0).flags & 0x200000) != 0x0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
                if (g(serviceConnection)) {
                    final ServiceConnection serviceConnection2 = this.a.putIfAbsent(serviceConnection, serviceConnection);
                    if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                        Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, s, intent.getAction()));
                    }
                    try {
                        final boolean h = h(context, intent, serviceConnection, n, executor);
                        return h && h;
                    }
                    finally {
                        this.a.remove(serviceConnection, serviceConnection);
                    }
                }
                return h(context, intent, serviceConnection, n, executor);
            }
            catch (PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
}
