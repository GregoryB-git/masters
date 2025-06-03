package e7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdq;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4175c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4177e;
    public final /* synthetic */ j0 f;

    public e4(k3 k3Var, AtomicReference atomicReference, String str, String str2) {
        this.f4173a = 0;
        this.f4176d = atomicReference;
        this.f4174b = null;
        this.f4175c = str;
        this.f4177e = str2;
        this.f = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4173a) {
            case 0:
                w4 l10 = ((j2) ((k3) this.f).f3407b).l();
                AtomicReference atomicReference = (AtomicReference) this.f4176d;
                String str = this.f4175c;
                String str2 = (String) this.f4177e;
                l10.l();
                l10.t();
                l10.x(new f5(l10, atomicReference, str, str2, l10.I(false)));
                return;
            default:
                ArrayList<Bundle> arrayList = new ArrayList<>();
                try {
                    try {
                        j0 j0Var = this.f;
                        n0 n0Var = ((w4) j0Var).f4735e;
                        if (n0Var == null) {
                            ((w4) j0Var).zzj().f4060o.d("Failed to get conditional properties; not connected to service", this.f4174b, this.f4175c);
                        } else {
                            m6.j.i((k6) this.f4176d);
                            arrayList = r6.g0(n0Var.T2(this.f4174b, this.f4175c, (k6) this.f4176d));
                            ((w4) this.f).H();
                        }
                    } catch (RemoteException e10) {
                        ((w4) this.f).zzj().f4060o.a(this.f4174b, this.f4175c, e10, "Failed to get conditional properties; remote exception");
                    }
                    return;
                } finally {
                    ((w4) this.f).k().H((zzdq) this.f4177e, arrayList);
                }
        }
    }

    public e4(w4 w4Var, String str, String str2, k6 k6Var, zzdq zzdqVar) {
        this.f4173a = 1;
        this.f4174b = str;
        this.f4175c = str2;
        this.f4176d = k6Var;
        this.f4177e = zzdqVar;
        this.f = w4Var;
    }
}
