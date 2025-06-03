package e7;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class s5 extends v {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4648e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5(Object obj, j2 j2Var, int i10) {
        super(j2Var);
        this.f4648e = i10;
        this.f = obj;
    }

    @Override // e7.v
    public final void c() {
        switch (this.f4648e) {
            case 0:
                t5 t5Var = (t5) this.f;
                t5Var.f4681d.l();
                ((b.z) t5Var.f4681d.zzb()).getClass();
                t5Var.a(SystemClock.elapsedRealtime(), false, false);
                q5 q5Var = t5Var.f4681d;
                a aVar = ((j2) q5Var.f3407b).f4374y;
                if (aVar == null) {
                    throw new IllegalStateException("Component not created");
                }
                ((b.z) q5Var.zzb()).getClass();
                aVar.s(SystemClock.elapsedRealtime());
                return;
            default:
                ((x5) this.f).s();
                ((x5) this.f).zzj().f4067w.b("Starting upload from DelayedRunnable");
                ((x5) this.f).f4804c.e0();
                return;
        }
    }
}
