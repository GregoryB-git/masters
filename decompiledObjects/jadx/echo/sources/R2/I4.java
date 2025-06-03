package R2;

import A2.AbstractC0328n;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class I4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f4750o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D4 f4751p;

    public I4(D4 d42, W5 w52) {
        this.f4751p = d42;
        this.f4750o = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        r12 = this.f4751p.f4593d;
        if (r12 == null) {
            this.f4751p.j().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            AbstractC0328n.i(this.f4750o);
            r12.D0(this.f4750o);
        } catch (RemoteException e7) {
            this.f4751p.j().G().b("Failed to reset data on the service: remote exception", e7);
        }
        this.f4751p.g0();
    }
}
