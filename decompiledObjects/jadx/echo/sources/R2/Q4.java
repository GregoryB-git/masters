package R2;

import A2.AbstractC0328n;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class Q4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f4979o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Bundle f4980p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D4 f4981q;

    public Q4(D4 d42, W5 w52, Bundle bundle) {
        this.f4981q = d42;
        this.f4979o = w52;
        this.f4980p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        r12 = this.f4981q.f4593d;
        if (r12 == null) {
            this.f4981q.j().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            AbstractC0328n.i(this.f4979o);
            r12.O0(this.f4980p, this.f4979o);
        } catch (RemoteException e7) {
            this.f4981q.j().G().b("Failed to send default event parameters to service", e7);
        }
    }
}
