package e7;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4299b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4300c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6 f4302e;
    public final /* synthetic */ boolean f;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w4 f4303o;

    public h5(w4 w4Var, AtomicReference atomicReference, String str, String str2, k6 k6Var, boolean z10) {
        this.f4298a = atomicReference;
        this.f4300c = str;
        this.f4301d = str2;
        this.f4302e = k6Var;
        this.f = z10;
        this.f4303o = w4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w4 w4Var;
        n0 n0Var;
        AtomicReference atomicReference;
        List<q6> h02;
        synchronized (this.f4298a) {
            try {
                try {
                    w4Var = this.f4303o;
                    n0Var = w4Var.f4735e;
                } catch (RemoteException e10) {
                    this.f4303o.zzj().f4060o.a(a1.p(this.f4299b), this.f4300c, e10, "(legacy) Failed to get user properties; remote exception");
                    this.f4298a.set(Collections.emptyList());
                }
                if (n0Var == null) {
                    w4Var.zzj().f4060o.a(a1.p(this.f4299b), this.f4300c, this.f4301d, "(legacy) Failed to get user properties; not connected to service");
                    this.f4298a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f4299b)) {
                    m6.j.i(this.f4302e);
                    atomicReference = this.f4298a;
                    h02 = n0Var.O2(this.f4300c, this.f4301d, this.f, this.f4302e);
                } else {
                    atomicReference = this.f4298a;
                    h02 = n0Var.h0(this.f4299b, this.f4300c, this.f4301d, this.f);
                }
                atomicReference.set(h02);
                this.f4303o.H();
                this.f4298a.notify();
            } finally {
                this.f4298a.notify();
            }
        }
    }
}
