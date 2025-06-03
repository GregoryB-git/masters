package e7;

/* loaded from: classes.dex */
public final class p5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q5 f4571b;

    public p5(q5 q5Var, long j10) {
        this.f4570a = j10;
        this.f4571b = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var = this.f4571b;
        long j10 = this.f4570a;
        q5Var.l();
        q5Var.v();
        q5Var.zzj().f4067w.c("Activity resumed, time", Long.valueOf(j10));
        if (!q5Var.h().x(null, h0.W0) ? q5Var.h().A() || q5Var.j().C.b() : q5Var.h().A() || q5Var.f4595e) {
            t5 t5Var = q5Var.f4596o;
            t5Var.f4681d.l();
            t5Var.f4680c.a();
            t5Var.f4678a = j10;
            t5Var.f4679b = j10;
        }
        l3.l lVar = q5Var.f4597p;
        ((q5) lVar.f9560b).l();
        r5 r5Var = (r5) lVar.f9559a;
        if (r5Var != null) {
            ((q5) lVar.f9560b).f4594d.removeCallbacks(r5Var);
        }
        ((q5) lVar.f9560b).j().C.a(false);
        q5 q5Var2 = (q5) lVar.f9560b;
        q5Var2.l();
        q5Var2.f4595e = false;
        if (((q5) lVar.f9560b).h().x(null, h0.U0) && ((q5) lVar.f9560b).o().f4430w) {
            ((q5) lVar.f9560b).zzj().f4067w.b("Retrying trigger URI registration in foreground");
            ((q5) lVar.f9560b).o().N();
        }
        v5 v5Var = q5Var.f;
        v5Var.f4716a.l();
        if (((j2) v5Var.f4716a.f3407b).d()) {
            ((b.z) v5Var.f4716a.zzb()).getClass();
            v5Var.b(System.currentTimeMillis(), false);
        }
    }
}
