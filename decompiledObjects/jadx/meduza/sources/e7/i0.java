package e7;

/* loaded from: classes.dex */
public final class i0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f4307c;

    public /* synthetic */ i0(o0 o0Var, long j10, int i10) {
        this.f4305a = i10;
        this.f4306b = j10;
        this.f4307c = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4305a) {
            case 0:
                ((a) this.f4307c).w(this.f4306b);
                break;
            default:
                q5 q5Var = (q5) this.f4307c;
                long j10 = this.f4306b;
                q5Var.l();
                q5Var.v();
                q5Var.zzj().f4067w.c("Activity paused, time", Long.valueOf(j10));
                l3.l lVar = q5Var.f4597p;
                ((b.z) ((q5) lVar.f9560b).zzb()).getClass();
                r5 r5Var = new r5(lVar, System.currentTimeMillis(), j10);
                lVar.f9559a = r5Var;
                ((q5) lVar.f9560b).f4594d.postDelayed(r5Var, 2000L);
                if (q5Var.h().A()) {
                    q5Var.f4596o.f4680c.a();
                    break;
                }
                break;
        }
    }
}
