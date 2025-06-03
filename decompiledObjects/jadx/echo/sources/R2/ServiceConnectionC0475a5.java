package R2;

import A2.AbstractC0317c;
import A2.AbstractC0328n;
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
import x2.C2188b;

/* renamed from: R2.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0475a5 implements ServiceConnection, AbstractC0317c.a, AbstractC0317c.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f5198a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Z1 f5199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D4 f5200c;

    public ServiceConnectionC0475a5(D4 d42) {
        this.f5200c = d42;
    }

    public final void a() {
        this.f5200c.n();
        Context a7 = this.f5200c.a();
        synchronized (this) {
            try {
                if (this.f5198a) {
                    this.f5200c.j().K().a("Connection attempt already in progress");
                    return;
                }
                if (this.f5199b != null && (this.f5199b.i() || this.f5199b.a())) {
                    this.f5200c.j().K().a("Already awaiting connection attempt");
                    return;
                }
                this.f5199b = new Z1(a7, Looper.getMainLooper(), this, this);
                this.f5200c.j().K().a("Connecting to remote service");
                this.f5198a = true;
                AbstractC0328n.i(this.f5199b);
                this.f5199b.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Intent intent) {
        ServiceConnectionC0475a5 serviceConnectionC0475a5;
        this.f5200c.n();
        Context a7 = this.f5200c.a();
        D2.b b7 = D2.b.b();
        synchronized (this) {
            try {
                if (this.f5198a) {
                    this.f5200c.j().K().a("Connection attempt already in progress");
                    return;
                }
                this.f5200c.j().K().a("Using local app measurement service");
                this.f5198a = true;
                serviceConnectionC0475a5 = this.f5200c.f4592c;
                b7.a(a7, intent, serviceConnectionC0475a5, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f5199b != null && (this.f5199b.a() || this.f5199b.i())) {
            this.f5199b.c();
        }
        this.f5199b = null;
    }

    @Override // A2.AbstractC0317c.a
    public final void n(int i7) {
        AbstractC0328n.d("MeasurementServiceConnection.onConnectionSuspended");
        this.f5200c.j().F().a("Service connection suspended");
        this.f5200c.e().D(new RunnableC0503e5(this));
    }

    @Override // A2.AbstractC0317c.b
    public final void o(C2188b c2188b) {
        AbstractC0328n.d("MeasurementServiceConnection.onConnectionFailed");
        Y1 E6 = this.f5200c.f5424a.E();
        if (E6 != null) {
            E6.L().b("Service connection failed", c2188b);
        }
        synchronized (this) {
            this.f5198a = false;
            this.f5199b = null;
        }
        this.f5200c.e().D(new RunnableC0496d5(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC0475a5 serviceConnectionC0475a5;
        AbstractC0328n.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f5198a = false;
                this.f5200c.j().G().a("Service connected with null binder");
                return;
            }
            R1 r12 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    r12 = queryLocalInterface instanceof R1 ? (R1) queryLocalInterface : new T1(iBinder);
                    this.f5200c.j().K().a("Bound to IMeasurementService interface");
                } else {
                    this.f5200c.j().G().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f5200c.j().G().a("Service connect failed to get IMeasurementService");
            }
            if (r12 == null) {
                this.f5198a = false;
                try {
                    D2.b b7 = D2.b.b();
                    Context a7 = this.f5200c.a();
                    serviceConnectionC0475a5 = this.f5200c.f4592c;
                    b7.c(a7, serviceConnectionC0475a5);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f5200c.e().D(new Z4(this, r12));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0328n.d("MeasurementServiceConnection.onServiceDisconnected");
        this.f5200c.j().F().a("Service disconnected");
        this.f5200c.e().D(new RunnableC0489c5(this, componentName));
    }

    @Override // A2.AbstractC0317c.a
    public final void v(Bundle bundle) {
        AbstractC0328n.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                AbstractC0328n.i(this.f5199b);
                this.f5200c.e().D(new RunnableC0482b5(this, (R1) this.f5199b.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f5199b = null;
                this.f5198a = false;
            }
        }
    }
}
