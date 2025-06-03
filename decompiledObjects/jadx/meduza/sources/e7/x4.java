package e7;

/* loaded from: classes.dex */
public final class x4 extends v {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4761e;
    public final /* synthetic */ w4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4(w4 w4Var, c3 c3Var, int i10) {
        super(c3Var);
        this.f4761e = i10;
        this.f = w4Var;
    }

    @Override // e7.v
    public final void c() {
        switch (this.f4761e) {
            case 0:
                w4 w4Var = this.f;
                w4Var.l();
                if (w4Var.C()) {
                    w4Var.zzj().f4067w.b("Inactivity, disconnecting from the service");
                    w4Var.B();
                    break;
                }
                break;
            default:
                this.f.zzj().f4063r.b("Tasks have been queued for a long time");
                break;
        }
    }
}
