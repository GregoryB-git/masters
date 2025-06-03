package H3;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f2225a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f2226b = new AtomicInteger();

    public int a() {
        return this.f2226b.get();
    }

    public int b() {
        return this.f2225a.get();
    }

    public void c() {
        this.f2226b.getAndIncrement();
    }

    public void d() {
        this.f2225a.getAndIncrement();
    }

    public void e() {
        this.f2226b.set(0);
    }
}
