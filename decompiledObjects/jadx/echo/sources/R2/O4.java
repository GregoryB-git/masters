package R2;

import A2.AbstractC0328n;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class O4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f4953o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D4 f4954p;

    public O4(D4 d42, W5 w52) {
        this.f4954p = d42;
        this.f4953o = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        r12 = this.f4954p.f4593d;
        if (r12 == null) {
            this.f4954p.j().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            AbstractC0328n.i(this.f4953o);
            r12.c0(this.f4953o);
            this.f4954p.q().J();
            this.f4954p.F(r12, null, this.f4953o);
            this.f4954p.g0();
        } catch (RemoteException e7) {
            this.f4954p.j().G().b("Failed to send app launch to the service", e7);
        }
    }
}
