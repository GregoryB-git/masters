package R2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: R2.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0481b4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5214o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5215p = null;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f5216q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f5217r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C3 f5218s;

    public RunnableC0481b4(C3 c32, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f5218s = c32;
        this.f5214o = atomicReference;
        this.f5216q = str2;
        this.f5217r = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5218s.f5424a.J().S(this.f5214o, null, this.f5216q, this.f5217r);
    }
}
