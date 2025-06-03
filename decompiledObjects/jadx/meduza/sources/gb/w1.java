package gb;

import gb.r1;

/* loaded from: classes.dex */
public final class w1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f6881a;

    public w1(r1 r1Var) {
        this.f6881a = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6881a.M();
        if (this.f6881a.f6736z != null) {
            this.f6881a.f6736z.getClass();
        }
        r1.k kVar = this.f6881a.f6735y;
        if (kVar != null) {
            kVar.f6752a.f6468b.e();
        }
    }
}
