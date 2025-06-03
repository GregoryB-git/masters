package R2;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class W2 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5085o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5086p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f5087q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ R2 f5088r;

    public W2(R2 r22, String str, String str2, String str3) {
        this.f5088r = r22;
        this.f5085o = str;
        this.f5086p = str2;
        this.f5087q = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        D5 d52;
        D5 d53;
        d52 = this.f5088r.f4983b;
        d52.o0();
        d53 = this.f5088r.f4983b;
        return d53.e0().y0(this.f5085o, this.f5086p, this.f5087q);
    }
}
