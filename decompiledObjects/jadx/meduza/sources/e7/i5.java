package e7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class i5 implements ServiceConnection, a.InterfaceC0041a, a.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f4327a;

    /* renamed from: b, reason: collision with root package name */
    public volatile z0 f4328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w4 f4329c;

    public i5(w4 w4Var) {
        this.f4329c = w4Var;
    }

    @Override // com.google.android.gms.common.internal.a.b
    public final void g(j6.b bVar) {
        int i10;
        m6.j.d("MeasurementServiceConnection.onConnectionFailed");
        a1 a1Var = ((j2) this.f4329c.f3407b).f4367q;
        if (a1Var == null || !a1Var.f4148c) {
            a1Var = null;
        }
        if (a1Var != null) {
            a1Var.f4063r.c("Service connection failed", bVar);
        }
        synchronized (this) {
            i10 = 0;
            this.f4327a = false;
            this.f4328b = null;
        }
        this.f4329c.zzl().u(new j5(this, i10));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m6.j.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f4327a = false;
                this.f4329c.zzj().f4060o.b("Service connected with null binder");
                return;
            }
            Object obj = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    obj = queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new q0(iBinder);
                    this.f4329c.zzj().f4067w.b("Bound to IMeasurementService interface");
                } else {
                    this.f4329c.zzj().f4060o.c("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f4329c.zzj().f4060o.b("Service connect failed to get IMeasurementService");
            }
            if (obj == null) {
                this.f4327a = false;
                try {
                    u6.a.b().c(this.f4329c.zza(), this.f4329c.f4734d);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f4329c.zzl().u(new i6.t(3, this, obj));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m6.j.d("MeasurementServiceConnection.onServiceDisconnected");
        this.f4329c.zzj().f4066v.b("Service disconnected");
        this.f4329c.zzl().u(new s2(4, this, componentName));
    }

    @Override // com.google.android.gms.common.internal.a.InterfaceC0041a
    public final void r(int i10) {
        m6.j.d("MeasurementServiceConnection.onConnectionSuspended");
        this.f4329c.zzj().f4066v.b("Service connection suspended");
        this.f4329c.zzl().u(new i6.q(this, 4));
    }

    @Override // com.google.android.gms.common.internal.a.InterfaceC0041a
    public final void s(Bundle bundle) {
        m6.j.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                m6.j.i(this.f4328b);
                this.f4329c.zzl().u(new l6.q0(4, this, this.f4328b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f4328b = null;
                this.f4327a = false;
            }
        }
    }
}
