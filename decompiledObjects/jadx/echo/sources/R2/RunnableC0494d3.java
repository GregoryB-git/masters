package R2;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.C0979n6;

/* renamed from: R2.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0494d3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W5 f5250o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R2 f5251p;

    public RunnableC0494d3(R2 r22, W5 w52) {
        this.f5251p = r22;
        this.f5250o = w52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D5 d52;
        D5 d53;
        d52 = this.f5251p.f4983b;
        d52.o0();
        d53 = this.f5251p.f4983b;
        W5 w52 = this.f5250o;
        d53.e().n();
        d53.p0();
        AbstractC0328n.e(w52.f5115o);
        C0585q3 f7 = C0585q3.f(w52.f5106J, (C0979n6.a() && d53.c0().s(K.f4805T0)) ? w52.f5111O : 100);
        C0585q3 Q6 = d53.Q(w52.f5115o);
        d53.j().K().c("Setting consent, package, consent", w52.f5115o, f7);
        d53.B(w52.f5115o, f7);
        if (f7.t(Q6)) {
            d53.b0(w52);
        }
        if (C0979n6.a() && d53.c0().s(K.f4805T0)) {
            C0643z c7 = C0643z.c(w52.f5112P);
            if (C0643z.f5622f.equals(c7)) {
                return;
            }
            d53.j().K().c("Setting DMA consent. package, consent", w52.f5115o, c7);
            d53.A(w52.f5115o, c7);
        }
    }
}
