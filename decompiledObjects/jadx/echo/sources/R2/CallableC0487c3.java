package R2;

import java.util.concurrent.Callable;

/* renamed from: R2.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0487c3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f5234o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R2 f5235p;

    public CallableC0487c3(R2 r22, W5 w52) {
        this.f5235p = r22;
        this.f5234o = w52;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        D5 d52;
        D5 d53;
        d52 = this.f5235p.f4983b;
        d52.o0();
        d53 = this.f5235p.f4983b;
        return new C0560n(d53.l(this.f5234o.f5115o));
    }
}
