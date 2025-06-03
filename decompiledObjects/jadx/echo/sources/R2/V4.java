package R2;

import A2.AbstractC0328n;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class V4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5077o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5078p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f5079q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f5080r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W5 f5081s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D4 f5082t;

    public V4(D4 d42, AtomicReference atomicReference, String str, String str2, String str3, W5 w52) {
        this.f5082t = d42;
        this.f5077o = atomicReference;
        this.f5078p = str;
        this.f5079q = str2;
        this.f5080r = str3;
        this.f5081s = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        R1 r12;
        AtomicReference atomicReference2;
        List K02;
        synchronized (this.f5077o) {
            try {
                try {
                    r12 = this.f5082t.f4593d;
                } catch (RemoteException e7) {
                    this.f5082t.j().G().d("(legacy) Failed to get conditional properties; remote exception", Y1.v(this.f5078p), this.f5079q, e7);
                    this.f5077o.set(Collections.emptyList());
                    atomicReference = this.f5077o;
                }
                if (r12 == null) {
                    this.f5082t.j().G().d("(legacy) Failed to get conditional properties; not connected to service", Y1.v(this.f5078p), this.f5079q, this.f5080r);
                    this.f5077o.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f5078p)) {
                    AbstractC0328n.i(this.f5081s);
                    atomicReference2 = this.f5077o;
                    K02 = r12.V0(this.f5079q, this.f5080r, this.f5081s);
                } else {
                    atomicReference2 = this.f5077o;
                    K02 = r12.K0(this.f5078p, this.f5079q, this.f5080r);
                }
                atomicReference2.set(K02);
                this.f5082t.g0();
                atomicReference = this.f5077o;
                atomicReference.notify();
            } finally {
                this.f5077o.notify();
            }
        }
    }
}
