package e7;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4782a = 1;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4783b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Serializable f4784c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Parcelable f4785d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4786e;

    public y4(b1.v vVar, String str, String str2, Bundle bundle) {
        this.f4783b = str;
        this.f4784c = str2;
        this.f4785d = bundle;
        this.f4786e = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4782a) {
            case 0:
                w4 w4Var = (w4) this.f4783b;
                AtomicReference atomicReference = (AtomicReference) this.f4784c;
                k6 k6Var = (k6) this.f4785d;
                d6 d6Var = (d6) this.f4786e;
                synchronized (atomicReference) {
                    try {
                        n0 n0Var = w4Var.f4735e;
                        if (n0Var == null) {
                            w4Var.zzj().f4060o.b("[sgtm] Failed to get upload batches; not connected to service");
                        } else {
                            m6.j.i(k6Var);
                            n0Var.N1(k6Var, d6Var, new c5(atomicReference));
                            w4Var.H();
                        }
                    } catch (RemoteException e10) {
                        w4Var.zzj().f4060o.c("[sgtm] Failed to get upload batches; remote exception", e10);
                        atomicReference.notifyAll();
                    }
                }
                return;
            default:
                r6 b02 = ((i6) ((b1.v) this.f4786e).f1801a).b0();
                String str = (String) this.f4784c;
                Bundle bundle = (Bundle) this.f4785d;
                ((b.z) ((i6) ((b1.v) this.f4786e).f1801a).zzb()).getClass();
                f0 y10 = b02.y(str, bundle, "auto", System.currentTimeMillis(), false);
                i6 i6Var = (i6) ((b1.v) this.f4786e).f1801a;
                m6.j.i(y10);
                i6Var.p(y10, (String) this.f4783b);
                return;
        }
    }

    public /* synthetic */ y4(w4 w4Var, AtomicReference atomicReference, k6 k6Var, d6 d6Var) {
        this.f4783b = w4Var;
        this.f4784c = atomicReference;
        this.f4785d = k6Var;
        this.f4786e = d6Var;
    }
}
