package R2;

import A2.AbstractC0328n;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class L4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4891o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W5 f4892p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D4 f4893q;

    public L4(D4 d42, AtomicReference atomicReference, W5 w52) {
        this.f4893q = d42;
        this.f4891o = atomicReference;
        this.f4892p = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        R1 r12;
        synchronized (this.f4891o) {
            try {
                try {
                } catch (RemoteException e7) {
                    this.f4893q.j().G().b("Failed to get app instance id", e7);
                    atomicReference = this.f4891o;
                }
                if (!this.f4893q.i().J().y()) {
                    this.f4893q.j().M().a("Analytics storage consent denied; will not get app instance id");
                    this.f4893q.r().T(null);
                    this.f4893q.i().f5390g.b(null);
                    this.f4891o.set(null);
                    return;
                }
                r12 = this.f4893q.f4593d;
                if (r12 == null) {
                    this.f4893q.j().G().a("Failed to get app instance id");
                    return;
                }
                AbstractC0328n.i(this.f4892p);
                this.f4891o.set(r12.G(this.f4892p));
                String str = (String) this.f4891o.get();
                if (str != null) {
                    this.f4893q.r().T(str);
                    this.f4893q.i().f5390g.b(str);
                }
                this.f4893q.g0();
                atomicReference = this.f4891o;
                atomicReference.notify();
            } finally {
                this.f4891o.notify();
            }
        }
    }
}
