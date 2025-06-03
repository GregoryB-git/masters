package e7;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class z3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k3 f4799c;

    public /* synthetic */ z3(k3 k3Var, long j10, int i10) {
        this.f4797a = i10;
        this.f4798b = j10;
        this.f4799c = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        switch (this.f4797a) {
            case 0:
                this.f4799c.j().f4461u.b(this.f4798b);
                this.f4799c.zzj().f4066v.c("Session timeout duration set", Long.valueOf(this.f4798b));
                break;
            default:
                k3 k3Var = this.f4799c;
                long j11 = this.f4798b;
                k3Var.l();
                k3Var.t();
                k3Var.zzj().f4066v.b("Resetting analytics data (FE)");
                q5 r10 = k3Var.r();
                r10.l();
                t5 t5Var = r10.f4596o;
                t5Var.f4680c.a();
                if (t5Var.f4681d.h().x(null, h0.X0)) {
                    ((b.z) t5Var.f4681d.zzb()).getClass();
                    j10 = SystemClock.elapsedRealtime();
                } else {
                    j10 = 0;
                }
                t5Var.f4678a = j10;
                t5Var.f4679b = j10;
                k3Var.m().x();
                boolean d10 = ((j2) k3Var.f3407b).d();
                l1 j12 = k3Var.j();
                j12.f4457p.b(j11);
                if (!TextUtils.isEmpty(j12.j().F.a())) {
                    j12.F.b(null);
                }
                j12.f4466z.b(0L);
                j12.A.b(0L);
                if (!j12.h().B()) {
                    j12.t(!d10);
                }
                j12.G.b(null);
                j12.H.b(0L);
                j12.I.b(null);
                w4 q10 = k3Var.q();
                q10.l();
                q10.t();
                k6 I = q10.I(false);
                q10.n().x();
                q10.x(new l6.q0(3, q10, I));
                k3Var.r().f.a();
                k3Var.B = !d10;
                this.f4799c.q().y(new AtomicReference<>());
                break;
        }
    }
}
