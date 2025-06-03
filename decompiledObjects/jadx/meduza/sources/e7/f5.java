package e7;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4207b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4208c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6 f4210e;
    public final /* synthetic */ w4 f;

    public f5(w4 w4Var, AtomicReference atomicReference, String str, String str2, k6 k6Var) {
        this.f4206a = atomicReference;
        this.f4208c = str;
        this.f4209d = str2;
        this.f4210e = k6Var;
        this.f = w4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w4 w4Var;
        n0 n0Var;
        AtomicReference atomicReference;
        List<f> h12;
        synchronized (this.f4206a) {
            try {
                try {
                    w4Var = this.f;
                    n0Var = w4Var.f4735e;
                } catch (RemoteException e10) {
                    this.f.zzj().f4060o.a(a1.p(this.f4207b), this.f4208c, e10, "(legacy) Failed to get conditional properties; remote exception");
                    this.f4206a.set(Collections.emptyList());
                }
                if (n0Var == null) {
                    w4Var.zzj().f4060o.a(a1.p(this.f4207b), this.f4208c, this.f4209d, "(legacy) Failed to get conditional properties; not connected to service");
                    this.f4206a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f4207b)) {
                    m6.j.i(this.f4210e);
                    atomicReference = this.f4206a;
                    h12 = n0Var.T2(this.f4208c, this.f4209d, this.f4210e);
                } else {
                    atomicReference = this.f4206a;
                    h12 = n0Var.h1(this.f4207b, this.f4208c, this.f4209d);
                }
                atomicReference.set(h12);
                this.f.H();
                this.f4206a.notify();
            } finally {
                this.f4206a.notify();
            }
        }
    }
}
