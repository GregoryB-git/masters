package R2;

import A2.AbstractC0328n;

/* loaded from: classes.dex */
public final class T2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f5032o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R2 f5033p;

    public T2(R2 r22, W5 w52) {
        this.f5033p = r22;
        this.f5032o = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D5 d52;
        D5 d53;
        d52 = this.f5033p.f4983b;
        d52.o0();
        d53 = this.f5033p.f4983b;
        W5 w52 = this.f5032o;
        d53.e().n();
        d53.p0();
        AbstractC0328n.e(w52.f5115o);
        d53.g(w52);
    }
}
