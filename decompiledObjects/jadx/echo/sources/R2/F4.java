package R2;

import A2.AbstractC0328n;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1071y0;

/* loaded from: classes.dex */
public final class F4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f4667o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f4668p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W5 f4669q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f4670r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1071y0 f4671s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D4 f4672t;

    public F4(D4 d42, String str, String str2, W5 w52, boolean z7, InterfaceC1071y0 interfaceC1071y0) {
        this.f4672t = d42;
        this.f4667o = str;
        this.f4668p = str2;
        this.f4669q = w52;
        this.f4670r = z7;
        this.f4671s = interfaceC1071y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        Bundle bundle = new Bundle();
        try {
            try {
                r12 = this.f4672t.f4593d;
                if (r12 == null) {
                    this.f4672t.j().G().c("Failed to get user properties; not connected to service", this.f4667o, this.f4668p);
                } else {
                    AbstractC0328n.i(this.f4669q);
                    bundle = S5.G(r12.x0(this.f4667o, this.f4668p, this.f4670r, this.f4669q));
                    this.f4672t.g0();
                }
            } catch (RemoteException e7) {
                this.f4672t.j().G().c("Failed to get user properties; remote exception", this.f4667o, e7);
            }
        } finally {
            this.f4672t.k().U(this.f4671s, bundle);
        }
    }
}
