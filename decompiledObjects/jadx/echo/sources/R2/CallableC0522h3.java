package R2;

import java.util.concurrent.Callable;

/* renamed from: R2.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0522h3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I f5317o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5318p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ R2 f5319q;

    public CallableC0522h3(R2 r22, I i7, String str) {
        this.f5319q = r22;
        this.f5317o = i7;
        this.f5318p = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        D5 d52;
        D5 d53;
        d52 = this.f5319q.f4983b;
        d52.o0();
        d53 = this.f5319q.f4983b;
        return d53.j0().y(this.f5317o, this.f5318p);
    }
}
