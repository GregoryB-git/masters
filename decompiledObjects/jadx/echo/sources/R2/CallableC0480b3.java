package R2;

import java.util.concurrent.Callable;

/* renamed from: R2.b3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0480b3 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5210o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5211p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f5212q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ R2 f5213r;

    public CallableC0480b3(R2 r22, String str, String str2, String str3) {
        this.f5213r = r22;
        this.f5210o = str;
        this.f5211p = str2;
        this.f5212q = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        D5 d52;
        D5 d53;
        d52 = this.f5213r.f4983b;
        d52.o0();
        d53 = this.f5213r.f4983b;
        return d53.e0().R(this.f5210o, this.f5211p, this.f5212q);
    }
}
