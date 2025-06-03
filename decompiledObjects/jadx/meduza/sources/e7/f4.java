package e7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdq;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4202c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4204e;
    public final /* synthetic */ Object f;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j0 f4205o;

    public f4(k3 k3Var, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f4200a = 0;
        this.f4204e = atomicReference;
        this.f4201b = null;
        this.f4202c = str;
        this.f = str2;
        this.f4203d = z10;
        this.f4205o = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r6 k10;
        Object obj;
        switch (this.f4200a) {
            case 0:
                w4 l10 = ((j2) ((k3) this.f4205o).f3407b).l();
                AtomicReference atomicReference = (AtomicReference) this.f4204e;
                String str = this.f4202c;
                String str2 = (String) this.f;
                boolean z10 = this.f4203d;
                l10.l();
                l10.t();
                l10.x(new h5(l10, atomicReference, str, str2, l10.I(false), z10));
                return;
            default:
                Bundle bundle = new Bundle();
                try {
                    try {
                        j0 j0Var = this.f4205o;
                        n0 n0Var = ((w4) j0Var).f4735e;
                        if (n0Var == null) {
                            ((w4) j0Var).zzj().f4060o.d("Failed to get user properties; not connected to service", this.f4201b, this.f4202c);
                        } else {
                            m6.j.i((k6) this.f4204e);
                            bundle = r6.x(n0Var.O2(this.f4201b, this.f4202c, this.f4203d, (k6) this.f4204e));
                            ((w4) this.f4205o).H();
                        }
                    } catch (RemoteException e10) {
                        ((w4) this.f4205o).zzj().f4060o.d("Failed to get user properties; remote exception", this.f4201b, e10);
                    }
                    try {
                        ((zzdq) obj).zza(bundle);
                        return;
                    } catch (RemoteException e11) {
                        ((j2) k10.f3407b).zzj().f4063r.c("Error returning bundle value to wrapper", e11);
                        return;
                    }
                } finally {
                    k10 = ((w4) this.f4205o).k();
                    zzdq zzdqVar = (zzdq) this.f;
                    k10.getClass();
                    try {
                        zzdqVar.zza(bundle);
                    } catch (RemoteException e12) {
                        ((j2) k10.f3407b).zzj().f4063r.c("Error returning bundle value to wrapper", e12);
                    }
                }
        }
    }

    public f4(w4 w4Var, String str, String str2, k6 k6Var, boolean z10, zzdq zzdqVar) {
        this.f4200a = 1;
        this.f4201b = str;
        this.f4202c = str2;
        this.f4204e = k6Var;
        this.f4203d = z10;
        this.f = zzdqVar;
        this.f4205o = w4Var;
    }
}
