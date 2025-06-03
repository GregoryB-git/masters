package e7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzig;

/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4561a = 1;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ String f4562b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4563c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4564d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4565e;

    public p2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdq zzdqVar, f0 f0Var, String str) {
        this.f4563c = zzdqVar;
        this.f4564d = f0Var;
        this.f4562b = str;
        this.f4565e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4561a) {
            case 0:
                zzig.zza((zzig) this.f4563c, (Bundle) this.f4564d, this.f4562b, (k6) this.f4565e);
                return;
            case 1:
                w4 l10 = ((AppMeasurementDynamiteService) this.f4565e).f2900a.l();
                zzdq zzdqVar = (zzdq) this.f4563c;
                f0 f0Var = (f0) this.f4564d;
                String str = this.f4562b;
                l10.l();
                l10.t();
                r6 k10 = l10.k();
                k10.getClass();
                if (j6.f.f8490b.c(k10.zza(), 12451000) == 0) {
                    l10.x(new p2(l10, f0Var, str, zzdqVar));
                    return;
                } else {
                    l10.zzj().f4063r.b("Not bundling data. Service unavailable or out of date");
                    l10.k().J(zzdqVar, new byte[0]);
                    return;
                }
            default:
                byte[] bArr = null;
                try {
                    try {
                        Object obj = this.f4565e;
                        n0 n0Var = ((w4) obj).f4735e;
                        if (n0Var == null) {
                            ((w4) obj).zzj().f4060o.b("Discarding data. Failed to send event to service to bundle");
                        } else {
                            bArr = n0Var.V2((f0) this.f4563c, this.f4562b);
                            ((w4) this.f4565e).H();
                        }
                    } catch (RemoteException e10) {
                        ((w4) this.f4565e).zzj().f4060o.c("Failed to send event to the service to bundle", e10);
                    }
                    return;
                } finally {
                    ((w4) this.f4565e).k().J((zzdq) this.f4564d, bArr);
                }
        }
    }

    public /* synthetic */ p2(zzig zzigVar, Bundle bundle, String str, k6 k6Var) {
        this.f4563c = zzigVar;
        this.f4564d = bundle;
        this.f4562b = str;
        this.f4565e = k6Var;
    }

    public p2(w4 w4Var, f0 f0Var, String str, zzdq zzdqVar) {
        this.f4563c = f0Var;
        this.f4562b = str;
        this.f4564d = zzdqVar;
        this.f4565e = w4Var;
    }
}
