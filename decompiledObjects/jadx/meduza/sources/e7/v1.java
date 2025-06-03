package e7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.measurement.internal.zzig;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4705a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4706b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4707c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4708d;

    public /* synthetic */ v1(w4 w4Var, k6 k6Var, e eVar) {
        this.f4705a = 2;
        this.f4706b = w4Var;
        this.f4707c = k6Var;
        this.f4708d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        switch (this.f4705a) {
            case 0:
                s1 s1Var = (s1) this.f4708d;
                t1 t1Var = s1Var.f4632b;
                String str = s1Var.f4631a;
                zzbz zzbzVar = (zzbz) this.f4706b;
                t1Var.f4668a.zzl().l();
                if (zzbzVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("package_name", str);
                    try {
                        if (zzbzVar.zza(bundle) == null) {
                            t1Var.f4668a.zzj().f4060o.b("Install Referrer Service returned a null response");
                        }
                    } catch (Exception e10) {
                        t1Var.f4668a.zzj().f4060o.c("Exception occurred while retrieving the Install Referrer", e10.getMessage());
                    }
                } else {
                    t1Var.f4668a.zzj().f4063r.b("Attempting to use Install Referrer Service while it is not initialized");
                }
                t1Var.f4668a.zzl().l();
                t1Var.f4668a.getClass();
                throw new IllegalStateException("Unexpected call on client side");
            case 1:
                ((zzig) this.f4708d).f2908a.c0();
                if (((q6) this.f4706b).D() == null) {
                    ((zzig) this.f4708d).f2908a.v(((q6) this.f4706b).f4599b, (k6) this.f4707c);
                    return;
                } else {
                    ((zzig) this.f4708d).f2908a.r((q6) this.f4706b, (k6) this.f4707c);
                    return;
                }
            case 2:
                w4 w4Var = (w4) this.f4706b;
                k6 k6Var = (k6) this.f4707c;
                e eVar = (e) this.f4708d;
                n0 n0Var = w4Var.f4735e;
                if (n0Var == null) {
                    w4Var.zzj().f4060o.b("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    n0Var.M1(k6Var, eVar);
                    w4Var.H();
                    return;
                } catch (RemoteException e11) {
                    w4Var.zzj().f4060o.d("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(eVar.f4154a), e11);
                    return;
                }
            default:
                synchronized (((AtomicReference) this.f4706b)) {
                    try {
                        try {
                        } catch (Throwable th) {
                            ((AtomicReference) this.f4706b).notify();
                            throw th;
                        }
                    } catch (RemoteException e12) {
                        ((w4) this.f4708d).zzj().f4060o.c("Failed to get app instance id", e12);
                    }
                    if (((w4) this.f4708d).j().y().p()) {
                        Object obj = this.f4708d;
                        n0 n0Var2 = ((w4) obj).f4735e;
                        if (n0Var2 == null) {
                            ((w4) obj).zzj().f4060o.b("Failed to get app instance id");
                            atomicReference = (AtomicReference) this.f4706b;
                        } else {
                            m6.j.i((k6) this.f4707c);
                            ((AtomicReference) this.f4706b).set(n0Var2.V1((k6) this.f4707c));
                            String str2 = (String) ((AtomicReference) this.f4706b).get();
                            if (str2 != null) {
                                ((w4) this.f4708d).o().P(str2);
                                ((w4) this.f4708d).j().f4458q.b(str2);
                            }
                            ((w4) this.f4708d).H();
                            atomicReference = (AtomicReference) this.f4706b;
                        }
                    } else {
                        ((w4) this.f4708d).zzj().t.b("Analytics storage consent denied; will not get app instance id");
                        ((w4) this.f4708d).o().P(null);
                        ((w4) this.f4708d).j().f4458q.b(null);
                        ((AtomicReference) this.f4706b).set(null);
                        atomicReference = (AtomicReference) this.f4706b;
                    }
                    atomicReference.notify();
                }
                return;
        }
    }

    public /* synthetic */ v1(Object obj, Object obj2, Object obj3, int i10) {
        this.f4705a = i10;
        this.f4706b = obj2;
        this.f4707c = obj3;
        this.f4708d = obj;
    }
}
