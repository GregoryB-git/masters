/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.NoSuchElementException
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 */
package D2;

import A2.k0;
import A2.n;
import D2.a;
import E2.l;
import G2.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class b {
    public static final Object b = new Object();
    public static volatile b c;
    public ConcurrentHashMap a = new ConcurrentHashMap();

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static b b() {
        Object object;
        if (c == null) {
            object = b;
            // MONITORENTER : object
            if (c == null) {
                c = new b();
            }
            // MONITOREXIT : object
        }
        object = c;
        n.i(object);
        return object;
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    public static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return;
        }
        catch (IllegalArgumentException | IllegalStateException | NoSuchElementException illegalStateException) {
            return;
        }
    }

    public static boolean g(ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof k0)) {
            return true;
        }
        return false;
    }

    public static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int n8, Executor executor) {
        if (l.j() && executor != null) {
            return a.a(context, intent, n8, executor, serviceConnection);
        }
        return context.bindService(intent, serviceConnection, n8);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int n8) {
        return this.f(context, context.getClass().getName(), intent, serviceConnection, n8, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (b.g(serviceConnection) && this.a.containsKey((Object)serviceConnection)) {
            try {
                b.e(context, (ServiceConnection)this.a.get((Object)serviceConnection));
                return;
            }
            finally {
                this.a.remove((Object)serviceConnection);
            }
        }
        b.e(context, serviceConnection);
    }

    public final boolean d(Context context, String string2, Intent intent, ServiceConnection serviceConnection, int n8, Executor executor) {
        return this.f(context, string2, intent, serviceConnection, n8, true, executor);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean f(Context context, String string2, Intent intent, ServiceConnection serviceConnection, int n8, boolean bl, Executor executor) {
        Object object;
        object = intent.getComponent();
        if (object != null) {
            int n9;
            object = object.getPackageName();
            "com.google.android.gms".equals(object);
            try {
                n9 = d.a((Context)context).c((String)object, (int)0).flags;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            if ((n9 & 2097152) != 0) {
                Log.w((String)"ConnectionTracker", (String)"Attempted to bind to a service in a STOPPED package.");
                return false;
            }
        }
        if (!b.g(serviceConnection)) {
            return b.h(context, intent, serviceConnection, n8, executor);
        }
        object = (ServiceConnection)this.a.putIfAbsent((Object)serviceConnection, (Object)serviceConnection);
        if (object != null && serviceConnection != object) {
            Log.w((String)"ConnectionTracker", (String)String.format((String)"Duplicate binding with the same ServiceConnection: %s, %s, %s.", (Object[])new Object[]{serviceConnection, string2, intent.getAction()}));
        }
        try {
            bl = b.h(context, intent, serviceConnection, n8, executor);
            if (bl) {
                return bl;
            }
            return false;
        }
        finally {
            this.a.remove((Object)serviceConnection, (Object)serviceConnection);
        }
    }
}

