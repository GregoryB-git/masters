package e7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzig;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class o2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4541a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Serializable f4542b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4543c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4544d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4545e;

    public o2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdq zzdqVar, String str, String str2) {
        this.f4541a = 1;
        this.f4543c = zzdqVar;
        this.f4542b = str;
        this.f4544d = str2;
        this.f4545e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4541a) {
            case 0:
                zzig.zza((zzig) this.f4543c, (String) this.f4542b, (d6) this.f4544d, (s0) this.f4545e);
                return;
            case 1:
                w4 l10 = ((AppMeasurementDynamiteService) this.f4545e).f2900a.l();
                zzdq zzdqVar = (zzdq) this.f4543c;
                String str = (String) this.f4542b;
                String str2 = (String) this.f4544d;
                l10.l();
                l10.t();
                l10.x(new e4(l10, str, str2, l10.I(false), zzdqVar));
                return;
            default:
                w4 w4Var = (w4) this.f4543c;
                AtomicReference atomicReference = (AtomicReference) this.f4542b;
                k6 k6Var = (k6) this.f4544d;
                Bundle bundle = (Bundle) this.f4545e;
                synchronized (atomicReference) {
                    try {
                        n0 n0Var = w4Var.f4735e;
                        if (n0Var == null) {
                            w4Var.zzj().f4060o.b("Failed to request trigger URIs; not connected to service");
                        } else {
                            m6.j.i(k6Var);
                            n0Var.h2(k6Var, bundle, new a5(atomicReference));
                            w4Var.H();
                        }
                    } catch (RemoteException e10) {
                        w4Var.zzj().f4060o.c("Failed to request trigger URIs; remote exception", e10);
                        atomicReference.notifyAll();
                    }
                }
                return;
        }
    }

    public /* synthetic */ o2(Object obj, Serializable serializable, n6.a aVar, Object obj2, int i10) {
        this.f4541a = i10;
        this.f4543c = obj;
        this.f4542b = serializable;
        this.f4544d = aVar;
        this.f4545e = obj2;
    }
}
