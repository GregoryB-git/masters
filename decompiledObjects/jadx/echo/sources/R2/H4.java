package R2;

import A2.AbstractC0328n;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class H4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4698o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W5 f4699p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f4700q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D4 f4701r;

    public H4(D4 d42, AtomicReference atomicReference, W5 w52, Bundle bundle) {
        this.f4701r = d42;
        this.f4698o = atomicReference;
        this.f4699p = w52;
        this.f4700q = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        R1 r12;
        synchronized (this.f4698o) {
            try {
                try {
                    r12 = this.f4701r.f4593d;
                } catch (RemoteException e7) {
                    this.f4701r.j().G().b("Failed to get trigger URIs; remote exception", e7);
                    atomicReference = this.f4698o;
                }
                if (r12 == null) {
                    this.f4701r.j().G().a("Failed to get trigger URIs; not connected to service");
                    return;
                }
                AbstractC0328n.i(this.f4699p);
                this.f4698o.set(r12.F(this.f4699p, this.f4700q));
                this.f4701r.g0();
                atomicReference = this.f4698o;
                atomicReference.notify();
            } finally {
                this.f4698o.notify();
            }
        }
    }
}
