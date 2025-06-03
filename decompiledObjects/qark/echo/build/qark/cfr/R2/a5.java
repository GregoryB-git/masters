/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.DeadObjectException
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.RemoteException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package R2;

import A2.c;
import A2.n;
import D2.b;
import R2.D4;
import R2.G2;
import R2.N2;
import R2.R1;
import R2.T1;
import R2.Y1;
import R2.Z1;
import R2.Z4;
import R2.a2;
import R2.b5;
import R2.c5;
import R2.d5;
import R2.e5;
import R2.m3;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

public final class a5
implements ServiceConnection,
c.a,
c.b {
    public volatile boolean a;
    public volatile Z1 b;
    public final /* synthetic */ D4 c;

    public a5(D4 d42) {
        this.c = d42;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        this.c.n();
        Context context = this.c.a();
        synchronized (this) {
            try {
                if (this.a) {
                    this.c.j().K().a("Connection attempt already in progress");
                    return;
                }
                if (this.b != null && (this.b.i() || this.b.a())) {
                    this.c.j().K().a("Already awaiting connection attempt");
                    return;
                }
                this.b = new Z1(context, Looper.getMainLooper(), this, this);
                this.c.j().K().a("Connecting to remote service");
                this.a = true;
                n.i(this.b);
                this.b.q();
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
    public final void c(Intent intent) {
        this.c.n();
        Context context = this.c.a();
        b b8 = b.b();
        synchronized (this) {
            try {
                if (this.a) {
                    this.c.j().K().a("Connection attempt already in progress");
                    return;
                }
                this.c.j().K().a("Using local app measurement service");
                this.a = true;
                b8.a(context, intent, D4.i0(this.c), 129);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void d() {
        if (this.b != null && (this.b.a() || this.b.i())) {
            this.b.c();
        }
        this.b = null;
    }

    @Override
    public final void n(int n8) {
        n.d("MeasurementServiceConnection.onConnectionSuspended");
        this.c.j().F().a("Service connection suspended");
        this.c.e().D(new e5(this));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void o(x2.b b8) {
        n.d("MeasurementServiceConnection.onConnectionFailed");
        Y1 y12 = this.c.a.E();
        if (y12 != null) {
            y12.L().b("Service connection failed", b8);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.e().D(new d5(this));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onServiceConnected(ComponentName object, IBinder object2) {
        block13 : {
            n.d("MeasurementServiceConnection.onServiceConnected");
            // MONITORENTER : this
            if (object2 == null) {
                this.a = false;
                this.c.j().G().a("Service connected with null binder");
                // MONITOREXIT : this
                return;
            }
            Object var3_6 = null;
            IInterface iInterface = null;
            object = var3_6;
            try {
                String string2 = object2.getInterfaceDescriptor();
                object = var3_6;
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals((Object)string2)) {
                    object = var3_6;
                    iInterface = object2.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    object = var3_6;
                    if (iInterface instanceof R1) {
                        object = var3_6;
                        object2 = (R1)iInterface;
                    } else {
                        object = var3_6;
                        object2 = new T1((IBinder)object2);
                    }
                    object = object2;
                    this.c.j().K().a("Bound to IMeasurementService interface");
                    object = object2;
                } else {
                    object = var3_6;
                    this.c.j().G().b("Got binder with a wrong descriptor", string2);
                    object = iInterface;
                }
                break block13;
            }
            catch (RemoteException remoteException) {}
            this.c.j().G().a("Service connect failed to get IMeasurementService");
        }
        if (object != null) {
            this.c.e().D(new Z4(this, (R1)object));
            // MONITOREXIT : this
            return;
        }
        this.a = false;
        try {
            b.b().c(this.c.a(), D4.i0(this.c));
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        n.d("MeasurementServiceConnection.onServiceDisconnected");
        this.c.j().F().a("Service disconnected");
        this.c.e().D(new c5(this, componentName));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void v(Bundle object) {
        n.d("MeasurementServiceConnection.onConnected");
        // MONITORENTER : this
        n.i(this.b);
        object = (R1)this.b.D();
        this.c.e().D(new b5(this, (R1)object));
        return;
        catch (DeadObjectException | IllegalStateException deadObjectException) {}
        this.b = null;
        this.a = false;
        // MONITOREXIT : this
    }
}

