package R2;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class Y2 implements Callable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5159o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5160p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f5161q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ R2 f5162r;

    public Y2(R2 r22, String str, String str2, String str3) {
        this.f5162r = r22;
        this.f5159o = str;
        this.f5160p = str2;
        this.f5161q = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        D5 d52;
        D5 d53;
        d52 = this.f5162r.f4983b;
        d52.o0();
        d53 = this.f5162r.f4983b;
        return d53.e0().R(this.f5159o, this.f5160p, this.f5161q);
    }
}
