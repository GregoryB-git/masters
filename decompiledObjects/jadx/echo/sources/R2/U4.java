package R2;

import A2.AbstractC0328n;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class U4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f5065o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D4 f5066p;

    public U4(D4 d42, W5 w52) {
        this.f5066p = d42;
        this.f5065o = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        r12 = this.f5066p.f4593d;
        if (r12 == null) {
            this.f5066p.j().G().a("Failed to send consent settings to service");
            return;
        }
        try {
            AbstractC0328n.i(this.f5065o);
            r12.U0(this.f5065o);
            this.f5066p.g0();
        } catch (RemoteException e7) {
            this.f5066p.j().G().b("Failed to send consent settings to the service", e7);
        }
    }
}
