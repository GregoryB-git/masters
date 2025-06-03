package V2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f6445a = new CountDownLatch(1);

    public /* synthetic */ p(o oVar) {
    }

    @Override // V2.InterfaceC0656g
    public final void a(Object obj) {
        this.f6445a.countDown();
    }

    @Override // V2.InterfaceC0653d
    public final void b() {
        this.f6445a.countDown();
    }

    public final void c() {
        this.f6445a.await();
    }

    @Override // V2.InterfaceC0655f
    public final void d(Exception exc) {
        this.f6445a.countDown();
    }

    public final boolean e(long j7, TimeUnit timeUnit) {
        return this.f6445a.await(j7, timeUnit);
    }
}
