package y5;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<a> f17440a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17441b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f17442c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f17443d = false;

    public c(a aVar, long j10) {
        this.f17440a = new WeakReference<>(aVar);
        this.f17441b = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        try {
            if (this.f17442c.await(this.f17441b, TimeUnit.MILLISECONDS) || (aVar = this.f17440a.get()) == null) {
                return;
            }
            aVar.b();
            this.f17443d = true;
        } catch (InterruptedException unused) {
            a aVar2 = this.f17440a.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f17443d = true;
            }
        }
    }
}
