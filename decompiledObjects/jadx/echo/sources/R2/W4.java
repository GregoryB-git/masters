package R2;

import A2.AbstractC0328n;
import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class W4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f5091o = true;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W5 f5092p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f5093q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0497e f5094r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0497e f5095s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D4 f5096t;

    public W4(D4 d42, boolean z7, W5 w52, boolean z8, C0497e c0497e, C0497e c0497e2) {
        this.f5096t = d42;
        this.f5092p = w52;
        this.f5093q = z8;
        this.f5094r = c0497e;
        this.f5095s = c0497e2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R1 r12;
        r12 = this.f5096t.f4593d;
        if (r12 == null) {
            this.f5096t.j().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f5091o) {
            AbstractC0328n.i(this.f5092p);
            this.f5096t.F(r12, this.f5093q ? null : this.f5094r, this.f5092p);
        } else {
            try {
                if (TextUtils.isEmpty(this.f5095s.f5263o)) {
                    AbstractC0328n.i(this.f5092p);
                    r12.m0(this.f5094r, this.f5092p);
                } else {
                    r12.n0(this.f5094r);
                }
            } catch (RemoteException e7) {
                this.f5096t.j().G().b("Failed to send conditional user property to the service", e7);
            }
        }
        this.f5096t.g0();
    }
}
