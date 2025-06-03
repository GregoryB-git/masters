package R2;

import A2.AbstractC0328n;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class R4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f4988o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D4 f4989p;

    public R4(D4 d42, W5 w52) {
        this.f4989p = d42;
        this.f4988o = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        r12 = this.f4989p.f4593d;
        if (r12 == null) {
            this.f4989p.j().G().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            AbstractC0328n.i(this.f4988o);
            r12.N(this.f4988o);
            this.f4989p.g0();
        } catch (RemoteException e7) {
            this.f4989p.j().G().b("Failed to send measurementEnabled to the service", e7);
        }
    }
}
