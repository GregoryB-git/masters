package e7;

/* loaded from: classes.dex */
public final /* synthetic */ class r3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4614a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ k3 f4615b;

    public /* synthetic */ r3(k3 k3Var, int i10) {
        this.f4614a = i10;
        this.f4615b = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4614a) {
            case 0:
                k3 k3Var = this.f4615b;
                k3Var.l();
                if (!k3Var.j().D.b()) {
                    long a10 = k3Var.j().E.a();
                    k3Var.j().E.b(1 + a10);
                    if (a10 < 5) {
                        if (k3Var.C == null) {
                            k3Var.C = new d4(k3Var, (j2) k3Var.f3407b);
                        }
                        k3Var.C.b(0L);
                        break;
                    } else {
                        k3Var.zzj().f4063r.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        k3Var.j().D.a(true);
                        break;
                    }
                } else {
                    k3Var.zzj().f4066v.b("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                }
            default:
                this.f4615b.L();
                break;
        }
    }
}
