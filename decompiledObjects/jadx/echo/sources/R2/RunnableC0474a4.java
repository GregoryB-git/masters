package R2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: R2.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0474a4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5192o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5193p = null;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f5194q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f5195r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f5196s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C3 f5197t;

    public RunnableC0474a4(C3 c32, AtomicReference atomicReference, String str, String str2, String str3, boolean z7) {
        this.f5197t = c32;
        this.f5192o = atomicReference;
        this.f5194q = str2;
        this.f5195r = str3;
        this.f5196s = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5197t.f5424a.J().T(this.f5192o, null, this.f5194q, this.f5195r, this.f5196s);
    }
}
