/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Messenger
 *  android.util.Log
 *  android.util.SparseArray
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Iterator
 *  java.util.Queue
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package w2;

import D2.b;
import L2.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w2.j;
import w2.k;
import w2.l;
import w2.m;
import w2.n;
import w2.p;
import w2.r;
import w2.t;
import w2.u;
import w2.w;

public final class q
implements ServiceConnection {
    public int a;
    public final Messenger b;
    public r c;
    public final Queue d;
    public final SparseArray e;
    public final /* synthetic */ w f;

    public /* synthetic */ q(w w8, p p8) {
        this.f = w8;
        this.a = 0;
        this.b = new Messenger((Handler)new f(Looper.getMainLooper(), new j(this)));
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final void a(int n8, String string2) {
        synchronized (this) {
            this.b(n8, string2, null);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(int var1_1, String var2_2, Throwable var3_4) {
        block9 : {
            // MONITORENTER : this
            if (Log.isLoggable((String)"MessengerIpcClient", (int)3)) {
                var5_5 = String.valueOf((Object)var2_2);
                var5_5 = var5_5.length() != 0 ? "Disconnected: ".concat(var5_5) : new String("Disconnected: ");
                Log.d((String)"MessengerIpcClient", (String)var5_5);
            }
            if ((var4_6 = this.a) == 0) throw new IllegalStateException();
            if (var4_6 == 1 || var4_6 == 2) ** GOTO lbl17
            if (var4_6 == 3) break block9;
            // MONITOREXIT : this
            return;
        }
        this.a = 4;
        // MONITOREXIT : this
        return;
lbl17: // 1 sources:
        if (Log.isLoggable((String)"MessengerIpcClient", (int)2)) {
            Log.v((String)"MessengerIpcClient", (String)"Unbinding service");
        }
        this.a = 4;
        b.b().c(w.a(this.f), this);
        var2_2 = new u(var1_1, (String)var2_2, var3_4);
        var3_4 = this.d.iterator();
        while (var3_4.hasNext()) {
            ((t)var3_4.next()).c((u)var2_2);
        }
        this.d.clear();
        for (var1_1 = 0; var1_1 < this.e.size(); ++var1_1) {
            ((t)this.e.valueAt(var1_1)).c((u)var2_2);
        }
        this.e.clear();
        // MONITOREXIT : this
        return;
    }

    public final void c() {
        w.e(this.f).execute((Runnable)new l(this));
    }

    public final void d() {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    if (this.a == 1) {
                        this.a(1, "Timed out while binding");
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    t t8 = (t)this.e.get(n8);
                    if (t8 != null) {
                        StringBuilder stringBuilder = new StringBuilder(31);
                        stringBuilder.append("Timing out request: ");
                        stringBuilder.append(n8);
                        Log.w((String)"MessengerIpcClient", (String)stringBuilder.toString());
                        this.e.remove(n8);
                        t8.c(new u(3, "Timed out waiting for response", null));
                        this.f();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        synchronized (this) {
            try {
                if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                    if (Log.isLoggable((String)"MessengerIpcClient", (int)2)) {
                        Log.v((String)"MessengerIpcClient", (String)"Finished handling requests, unbinding");
                    }
                    this.a = 3;
                    b.b().c(w.a(this.f), this);
                    return;
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
    public final boolean g(t t8) {
        synchronized (this) {
            Throwable throwable2;
            block13 : {
                block11 : {
                    SecurityException securityException2;
                    block12 : {
                        block10 : {
                            block7 : {
                                block8 : {
                                    block9 : {
                                        try {
                                            int n8 = this.a;
                                            if (n8 == 0) break block7;
                                            if (n8 == 1) break block8;
                                            if (n8 == 2) break block9;
                                        }
                                        catch (Throwable throwable2) {}
                                        return false;
                                    }
                                    this.d.add((Object)t8);
                                    this.c();
                                    return true;
                                    break block13;
                                }
                                this.d.add((Object)t8);
                                return true;
                            }
                            this.d.add((Object)t8);
                            boolean bl = this.a == 0;
                            A2.n.l(bl);
                            if (Log.isLoggable((String)"MessengerIpcClient", (int)2)) {
                                Log.v((String)"MessengerIpcClient", (String)"Starting bind to GmsCore");
                            }
                            this.a = 1;
                            t8 = new Intent("com.google.android.c2dm.intent.REGISTER");
                            t8.setPackage("com.google.android.gms");
                            try {
                                if (b.b().a(w.a(this.f), (Intent)t8, this, 1)) break block10;
                                this.a(0, "Unable to bind to service");
                                break block11;
                            }
                            catch (SecurityException securityException2) {
                                break block12;
                            }
                        }
                        w.e(this.f).schedule((Runnable)new m(this), 30L, TimeUnit.SECONDS);
                        break block11;
                    }
                    this.b(0, "Unable to bind to service", (Throwable)securityException2);
                }
                return true;
            }
            throw throwable2;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable((String)"MessengerIpcClient", (int)2)) {
            Log.v((String)"MessengerIpcClient", (String)"Service connected");
        }
        w.e(this.f).execute((Runnable)new n(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable((String)"MessengerIpcClient", (int)2)) {
            Log.v((String)"MessengerIpcClient", (String)"Service disconnected");
        }
        w.e(this.f).execute((Runnable)new k(this));
    }
}

