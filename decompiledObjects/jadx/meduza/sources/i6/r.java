package i6;

import android.os.RemoteException;
import e7.a4;
import e7.d5;
import e7.h0;
import e7.j2;
import e7.k3;
import e7.n0;
import e7.o4;
import e7.q5;
import e7.r5;
import e7.v3;
import e7.w4;
import java.util.Objects;
import l6.d0;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7604a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7605b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f7604a = i10;
        this.f7605b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 1;
        int i11 = 0;
        switch (this.f7604a) {
            case 0:
                ((u) this.f7605b).a(2, "Service disconnected");
                return;
            case 1:
                ((d0) this.f7605b).e();
                return;
            case 2:
            default:
                j2 j2Var = (j2) this.f7605b;
                if (!j2Var.m().D0()) {
                    j2Var.zzj().f4063r.b("registerTrigger called but app not eligible");
                    return;
                }
                k3 k10 = j2Var.k();
                k10.l();
                v3 v3Var = k10.f4428u;
                if (v3Var != null) {
                    v3Var.a();
                }
                k3 k11 = j2Var.k();
                Objects.requireNonNull(k11);
                new Thread(new a4(k11, i10)).start();
                return;
            case 3:
                w4 w4Var = (w4) this.f7605b;
                n0 n0Var = w4Var.f4735e;
                if (n0Var == null) {
                    w4Var.zzj().f4060o.b("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    n0Var.l1(w4Var.I(false));
                    w4Var.H();
                    return;
                } catch (RemoteException e10) {
                    w4Var.zzj().f4060o.c("Failed to send storage consent settings to the service", e10);
                    return;
                }
            case 4:
                r5 r5Var = (r5) this.f7605b;
                l3.l lVar = r5Var.f4623c;
                long j10 = r5Var.f4621a;
                long j11 = r5Var.f4622b;
                ((q5) lVar.f9560b).l();
                ((q5) lVar.f9560b).zzj().f4066v.b("Application going to the background");
                ((q5) lVar.f9560b).j().C.a(true);
                q5 q5Var = (q5) lVar.f9560b;
                q5Var.l();
                q5Var.f4595e = true;
                if (!((q5) lVar.f9560b).h().A()) {
                    ((q5) lVar.f9560b).f4596o.a(j11, false, false);
                    ((q5) lVar.f9560b).f4596o.f4680c.a();
                }
                ((q5) lVar.f9560b).zzj().f4065u.c("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
                k3 o10 = ((q5) lVar.f9560b).o();
                o10.l();
                o10.t();
                w4 q10 = o10.q();
                q10.l();
                q10.t();
                if (!q10.F() || q10.k().s0() >= 242600) {
                    w4 q11 = o10.q();
                    q11.l();
                    q11.t();
                    q11.x(new d5(q11, q11.I(true), i11));
                }
                if (((q5) lVar.f9560b).h().x(null, h0.N0)) {
                    long s10 = ((q5) lVar.f9560b).k().p0(((q5) lVar.f9560b).zza().getPackageName(), ((q5) lVar.f9560b).h().f4228d) ? 1000L : ((q5) lVar.f9560b).h().s(((q5) lVar.f9560b).zza().getPackageName(), h0.A);
                    ((q5) lVar.f9560b).zzj().f4067w.c("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(s10));
                    o4 o4Var = ((j2) ((q5) lVar.f9560b).f3407b).F;
                    if (o4Var == null) {
                        throw new IllegalStateException("Component not created");
                    }
                    o4Var.v(s10);
                    return;
                }
                return;
        }
    }
}
