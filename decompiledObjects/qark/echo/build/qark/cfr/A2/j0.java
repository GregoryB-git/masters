/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.concurrent.Executor
 */
package A2;

import A2.e0;
import A2.g0;
import A2.h;
import A2.h0;
import A2.i0;
import A2.n;
import D2.b;
import M2.e;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class j0
extends h {
    public final HashMap f = new HashMap();
    public final Context g;
    public volatile Handler h;
    public final i0 i;
    public final b j;
    public final long k;
    public final long l;

    public j0(Context context, Looper looper) {
        i0 i02;
        this.i = i02 = new i0(this, null);
        this.g = context.getApplicationContext();
        this.h = new e(looper, i02);
        this.j = b.b();
        this.k = 5000L;
        this.l = 300000L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(e0 object, ServiceConnection serviceConnection, String string2) {
        n.j((Object)serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f;
        synchronized (hashMap) {
            try {
                g0 g02 = (g0)this.f.get(object);
                if (g02 == null) {
                    object = object.toString();
                    serviceConnection = new StringBuilder();
                    serviceConnection.append("Nonexistent connection status for service config: ");
                    serviceConnection.append((String)object);
                    throw new IllegalStateException(serviceConnection.toString());
                }
                if (!g02.h(serviceConnection)) {
                    object = object.toString();
                    serviceConnection = new StringBuilder();
                    serviceConnection.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    serviceConnection.append((String)object);
                    throw new IllegalStateException(serviceConnection.toString());
                }
                g02.f(serviceConnection, string2);
                if (g02.i()) {
                    object = this.h.obtainMessage(0, object);
                    this.h.sendMessageDelayed((Message)object, this.k);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean f(e0 object, ServiceConnection serviceConnection, String string2, Executor executor) {
        n.j((Object)serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f;
        synchronized (hashMap) {
            try {
                g0 g02 = (g0)this.f.get(object);
                if (g02 == null) {
                    g02 = new g0(this, (e0)object);
                    g02.d(serviceConnection, serviceConnection, string2);
                    g02.e(string2, executor);
                    this.f.put(object, (Object)g02);
                    object = g02;
                    return object.j();
                } else {
                    this.h.removeMessages(0, object);
                    if (g02.h(serviceConnection)) {
                        object = object.toString();
                        serviceConnection = new StringBuilder();
                        serviceConnection.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        serviceConnection.append((String)object);
                        throw new IllegalStateException(serviceConnection.toString());
                    }
                    g02.d(serviceConnection, serviceConnection, string2);
                    int n8 = g02.a();
                    if (n8 != 1) {
                        if (n8 != 2) {
                            object = g02;
                            return object.j();
                        } else {
                            g02.e(string2, executor);
                            object = g02;
                        }
                        return object.j();
                    } else {
                        serviceConnection.onServiceConnected(g02.b(), g02.c());
                        object = g02;
                    }
                }
                return object.j();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

