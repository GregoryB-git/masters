package e7;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k6 f4801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f4802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w4 f4803d;

    public z4(w4 w4Var, AtomicReference atomicReference, k6 k6Var, Bundle bundle) {
        this.f4800a = atomicReference;
        this.f4801b = k6Var;
        this.f4802c = bundle;
        this.f4803d = w4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w4 w4Var;
        n0 n0Var;
        synchronized (this.f4800a) {
            try {
                try {
                    w4Var = this.f4803d;
                    n0Var = w4Var.f4735e;
                } catch (RemoteException e10) {
                    this.f4803d.zzj().f4060o.c("Failed to get trigger URIs; remote exception", e10);
                }
                if (n0Var == null) {
                    w4Var.zzj().f4060o.b("Failed to get trigger URIs; not connected to service");
                    return;
                }
                m6.j.i(this.f4801b);
                this.f4800a.set(n0Var.m(this.f4802c, this.f4801b));
                this.f4803d.H();
                this.f4800a.notify();
            } finally {
                this.f4800a.notify();
            }
        }
    }
}
