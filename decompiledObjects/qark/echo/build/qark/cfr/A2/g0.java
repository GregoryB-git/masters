/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.StrictMode
 *  android.os.StrictMode$VmPolicy
 *  android.os.StrictMode$VmPolicy$Builder
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.concurrent.Executor
 */
package A2;

import A2.e0;
import A2.f0;
import A2.j0;
import A2.k0;
import E2.l;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

public final class g0
implements ServiceConnection,
k0 {
    public final Map a;
    public int b;
    public boolean c;
    public IBinder d;
    public final e0 e;
    public ComponentName f;
    public final /* synthetic */ j0 g;

    public g0(j0 j02, e0 e02) {
        this.g = j02;
        this.e = e02;
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

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String string2) {
        this.a.put((Object)serviceConnection, (Object)serviceConnection2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(String object, Executor executor) {
        StrictMode.VmPolicy vmPolicy;
        Throwable throwable2;
        block6 : {
            this.b = 3;
            vmPolicy = StrictMode.getVmPolicy();
            if (l.l()) {
                StrictMode.setVmPolicy((StrictMode.VmPolicy)f0.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                boolean bl;
                j0 j02 = this.g;
                this.c = bl = j0.j(j02).d(j0.h(j02), (String)object, this.e.c(j0.h(j02)), this, this.e.a(), executor);
                if (bl) {
                    object = j0.i(this.g).obtainMessage(1, (Object)this.e);
                    j0.i(this.g).sendMessageDelayed((Message)object, j0.g(this.g));
                    break block6;
                }
                this.b = 2;
                try {
                    object = this.g;
                    j0.j((j0)object).c(j0.h((j0)object), this);
                }
                catch (IllegalArgumentException illegalArgumentException) {}
            }
            catch (Throwable throwable2) {}
        }
        StrictMode.setVmPolicy((StrictMode.VmPolicy)vmPolicy);
        return;
        StrictMode.setVmPolicy((StrictMode.VmPolicy)vmPolicy);
        throw throwable2;
    }

    public final void f(ServiceConnection serviceConnection, String string2) {
        this.a.remove((Object)serviceConnection);
    }

    public final void g(String object) {
        j0.i(this.g).removeMessages(1, (Object)this.e);
        object = this.g;
        j0.j((j0)object).c(j0.h((j0)object), this);
        this.c = false;
        this.b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.a.containsKey((Object)serviceConnection);
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public final boolean j() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap = j0.k(this.g);
        synchronized (hashMap) {
            try {
                j0.i(this.g).removeMessages(1, (Object)this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator iterator = this.a.values().iterator();
                do {
                    if (!iterator.hasNext()) {
                        this.b = 1;
                        return;
                    }
                    ((ServiceConnection)iterator.next()).onServiceConnected(componentName, iBinder);
                } while (true);
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
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap = j0.k(this.g);
        synchronized (hashMap) {
            try {
                j0.i(this.g).removeMessages(1, (Object)this.e);
                this.d = null;
                this.f = componentName;
                Iterator iterator = this.a.values().iterator();
                do {
                    if (!iterator.hasNext()) {
                        this.b = 2;
                        return;
                    }
                    ((ServiceConnection)iterator.next()).onServiceDisconnected(componentName);
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

