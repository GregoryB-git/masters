package R2;

import A2.AbstractC0328n;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class K2 extends Thread {

    /* renamed from: o, reason: collision with root package name */
    public final Object f4874o;

    /* renamed from: p, reason: collision with root package name */
    public final BlockingQueue f4875p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4876q = false;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G2 f4877r;

    public K2(G2 g22, String str, BlockingQueue blockingQueue) {
        this.f4877r = g22;
        AbstractC0328n.i(str);
        AbstractC0328n.i(blockingQueue);
        this.f4874o = new Object();
        this.f4875p = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f4874o) {
            this.f4874o.notifyAll();
        }
    }

    public final void b(InterruptedException interruptedException) {
        this.f4877r.j().L().b(getName() + " was interrupted", interruptedException);
    }

    public final void c() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        K2 k22;
        K2 k23;
        obj = this.f4877r.f4685i;
        synchronized (obj) {
            try {
                if (!this.f4876q) {
                    semaphore = this.f4877r.f4686j;
                    semaphore.release();
                    obj2 = this.f4877r.f4685i;
                    obj2.notifyAll();
                    k22 = this.f4877r.f4679c;
                    if (this == k22) {
                        this.f4877r.f4679c = null;
                    } else {
                        k23 = this.f4877r.f4680d;
                        if (this == k23) {
                            this.f4877r.f4680d = null;
                        } else {
                            this.f4877r.j().G().a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.f4876q = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z7;
        boolean z8 = false;
        while (!z8) {
            try {
                semaphore = this.f4877r.f4686j;
                semaphore.acquire();
                z8 = true;
            } catch (InterruptedException e7) {
                b(e7);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                L2 l22 = (L2) this.f4875p.poll();
                if (l22 != null) {
                    Process.setThreadPriority(l22.f4886p ? threadPriority : 10);
                    l22.run();
                } else {
                    synchronized (this.f4874o) {
                        if (this.f4875p.peek() == null) {
                            z7 = this.f4877r.f4687k;
                            if (!z7) {
                                try {
                                    this.f4874o.wait(30000L);
                                } catch (InterruptedException e8) {
                                    b(e8);
                                }
                            }
                        }
                    }
                    obj = this.f4877r.f4685i;
                    synchronized (obj) {
                        if (this.f4875p.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
