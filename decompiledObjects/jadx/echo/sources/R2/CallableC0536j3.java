package R2;

import java.util.concurrent.Callable;

/* renamed from: R2.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0536j3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5350o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R2 f5351p;

    public CallableC0536j3(R2 r22, String str) {
        this.f5351p = r22;
        this.f5350o = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        D5 d52;
        D5 d53;
        d52 = this.f5351p.f4983b;
        d52.o0();
        d53 = this.f5351p.f4983b;
        return d53.e0().M0(this.f5350o);
    }
}
