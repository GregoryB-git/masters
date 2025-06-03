package R2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class X3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f5135o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f5136p;

    public X3(C3 c32, long j7) {
        this.f5136p = c32;
        this.f5135o = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5136p.E(this.f5135o, true);
        this.f5136p.t().Q(new AtomicReference());
    }
}
