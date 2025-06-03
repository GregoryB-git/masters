package s2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1941c extends Thread {

    /* renamed from: o, reason: collision with root package name */
    public final WeakReference f19226o;

    /* renamed from: p, reason: collision with root package name */
    public final long f19227p;

    /* renamed from: q, reason: collision with root package name */
    public final CountDownLatch f19228q = new CountDownLatch(1);

    /* renamed from: r, reason: collision with root package name */
    public boolean f19229r = false;

    public C1941c(C1939a c1939a, long j7) {
        this.f19226o = new WeakReference(c1939a);
        this.f19227p = j7;
        start();
    }

    public final void a() {
        C1939a c1939a = (C1939a) this.f19226o.get();
        if (c1939a != null) {
            c1939a.c();
            this.f19229r = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f19228q.await(this.f19227p, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
