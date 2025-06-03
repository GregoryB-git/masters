package R2;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class M4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0627w4 f4899o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D4 f4900p;

    public M4(D4 d42, C0627w4 c0627w4) {
        this.f4900p = d42;
        this.f4899o = c0627w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        r12 = this.f4900p.f4593d;
        if (r12 == null) {
            this.f4900p.j().G().a("Failed to send current screen to service");
            return;
        }
        try {
            C0627w4 c0627w4 = this.f4899o;
            if (c0627w4 == null) {
                r12.I0(0L, null, null, this.f4900p.a().getPackageName());
            } else {
                r12.I0(c0627w4.f5576c, c0627w4.f5574a, c0627w4.f5575b, this.f4900p.a().getPackageName());
            }
            this.f4900p.g0();
        } catch (RemoteException e7) {
            this.f4900p.j().G().b("Failed to send current screen to the service", e7);
        }
    }
}
