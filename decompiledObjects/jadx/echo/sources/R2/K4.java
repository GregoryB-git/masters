package R2;

import A2.AbstractC0328n;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1071y0;

/* loaded from: classes.dex */
public final class K4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f4878o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1071y0 f4879p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D4 f4880q;

    public K4(D4 d42, W5 w52, InterfaceC1071y0 interfaceC1071y0) {
        this.f4880q = d42;
        this.f4878o = w52;
        this.f4879p = interfaceC1071y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        String str = null;
        try {
            try {
                if (this.f4880q.i().J().y()) {
                    r12 = this.f4880q.f4593d;
                    if (r12 == null) {
                        this.f4880q.j().G().a("Failed to get app instance id");
                    } else {
                        AbstractC0328n.i(this.f4878o);
                        str = r12.G(this.f4878o);
                        if (str != null) {
                            this.f4880q.r().T(str);
                            this.f4880q.i().f5390g.b(str);
                        }
                        this.f4880q.g0();
                    }
                } else {
                    this.f4880q.j().M().a("Analytics storage consent denied; will not get app instance id");
                    this.f4880q.r().T(null);
                    this.f4880q.i().f5390g.b(null);
                }
            } catch (RemoteException e7) {
                this.f4880q.j().G().b("Failed to get app instance id", e7);
            }
        } finally {
            this.f4880q.k().V(this.f4879p, null);
        }
    }
}
