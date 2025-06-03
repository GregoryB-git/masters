package i6;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzdr;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import e7.c3;
import e7.k2;
import e7.k3;
import e7.k6;
import e7.n0;
import e7.q4;
import e7.w4;
import l6.t0;
import l6.v0;
import nc.g0;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7599a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7600b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7601c;

    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        this.f7599a = i10;
        this.f7601c = obj;
        this.f7600b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String message;
        boolean z10;
        String packageName;
        String str;
        String str2;
        long j10 = 0;
        int i10 = 0;
        switch (this.f7599a) {
            case 0:
                u uVar = (u) this.f7601c;
                IBinder iBinder = (IBinder) this.f7600b;
                synchronized (uVar) {
                    if (iBinder == null) {
                        message = "Null service connection";
                    } else {
                        try {
                            try {
                                uVar.f7612c = new v(iBinder);
                                uVar.f7610a = 2;
                                uVar.f.f7623b.execute(new q(uVar, i10));
                            } finally {
                            }
                        } catch (RemoteException e10) {
                            message = e10.getMessage();
                        }
                    }
                    uVar.a(0, message);
                }
                return;
            case 1:
            default:
                ((nc.k) this.f7600b).h((nc.a0) this.f7601c, rb.h.f13851a);
                return;
            case 2:
                try {
                    try {
                        BasePendingResult.zaa.set(Boolean.TRUE);
                        ((v0) this.f7600b).getClass();
                        m6.j.i(null);
                        throw null;
                    } catch (RuntimeException e11) {
                        t0 t0Var = ((v0) this.f7600b).f;
                        t0Var.sendMessage(t0Var.obtainMessage(1, e11));
                        BasePendingResult.zaa.set(Boolean.FALSE);
                        v0.e((k6.j) this.f7601c);
                        k6.e eVar = (k6.e) ((v0) this.f7600b).f9736e.get();
                        if (eVar != null) {
                            eVar.e();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    BasePendingResult.zaa.set(Boolean.FALSE);
                    v0.e((k6.j) this.f7601c);
                    k6.e eVar2 = (k6.e) ((v0) this.f7600b).f9736e.get();
                    if (eVar2 != null) {
                        eVar2.e();
                    }
                    throw th;
                }
            case 3:
                ((c3) this.f7601c).zzd();
                if (g0.d()) {
                    ((c3) this.f7601c).zzl().u(this);
                    return;
                }
                z10 = ((e7.v) this.f7600b).f4703c != 0;
                ((e7.v) this.f7600b).f4703c = 0L;
                if (z10) {
                    ((e7.v) this.f7600b).c();
                    return;
                }
                return;
            case 4:
                w4 l10 = ((AppMeasurementDynamiteService) this.f7600b).f2900a.l();
                zzdq zzdqVar = (zzdq) this.f7601c;
                l10.l();
                l10.t();
                l10.x(new k2(l10, l10.I(false), zzdqVar));
                return;
            case 5:
                AppMeasurementDynamiteService.$r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc((AppMeasurementDynamiteService) this.f7601c, (zzdr) this.f7600b);
                return;
            case 6:
                k3 k3Var = (k3) this.f7601c;
                String str3 = (String) this.f7600b;
                e7.t0 m10 = k3Var.m();
                String str4 = m10.f4667z;
                z10 = (str4 == null || str4.equals(str3)) ? false : true;
                m10.f4667z = str3;
                if (z10) {
                    k3Var.m().x();
                    return;
                }
                return;
            case 7:
                Object obj = this.f7600b;
                w4 w4Var = (w4) obj;
                n0 n0Var = w4Var.f4735e;
                if (n0Var == null) {
                    w4Var.zzj().f4060o.b("Failed to send current screen to service");
                    return;
                }
                try {
                    Object obj2 = this.f7601c;
                    if (((q4) obj2) == null) {
                        packageName = ((w4) obj).zza().getPackageName();
                        str2 = null;
                        str = null;
                    } else {
                        j10 = ((q4) obj2).f4591c;
                        String str5 = ((q4) obj2).f4589a;
                        String str6 = ((q4) obj2).f4590b;
                        packageName = ((w4) obj).zza().getPackageName();
                        str = str6;
                        str2 = str5;
                    }
                    n0Var.d1(j10, str2, str, packageName);
                    ((w4) this.f7600b).H();
                    return;
                } catch (RemoteException e12) {
                    ((w4) this.f7600b).zzj().f4060o.c("Failed to send current screen to the service", e12);
                    return;
                }
            case 8:
                w4 w4Var2 = (w4) this.f7600b;
                n0 n0Var2 = w4Var2.f4735e;
                if (n0Var2 == null) {
                    w4Var2.zzj().f4060o.b("Failed to send consent settings to service");
                    return;
                }
                try {
                    m6.j.i((k6) this.f7601c);
                    n0Var2.C((k6) this.f7601c);
                    ((w4) this.f7600b).H();
                    return;
                } catch (RemoteException e13) {
                    ((w4) this.f7600b).zzj().f4060o.c("Failed to send consent settings to the service", e13);
                    return;
                }
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, int i10) {
        this.f7599a = i10;
        this.f7600b = obj;
        this.f7601c = obj2;
    }
}
