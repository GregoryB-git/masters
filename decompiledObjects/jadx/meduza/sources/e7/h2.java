package e7;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class h2 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4290a;

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue<i2<?>> f4291b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4292c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2 f4293d;

    public h2(e2 e2Var, String str, BlockingQueue<i2<?>> blockingQueue) {
        this.f4293d = e2Var;
        m6.j.i(blockingQueue);
        this.f4290a = new Object();
        this.f4291b = blockingQueue;
        setName(str);
    }

    public final void a(InterruptedException interruptedException) {
        this.f4293d.zzj().f4063r.c(getName() + " was interrupted", interruptedException);
    }

    public final void b() {
        synchronized (this.f4293d.f4163r) {
            if (!this.f4292c) {
                this.f4293d.f4164s.release();
                this.f4293d.f4163r.notifyAll();
                e2 e2Var = this.f4293d;
                if (this == e2Var.f4158d) {
                    e2Var.f4158d = null;
                } else if (this == e2Var.f4159e) {
                    e2Var.f4159e = null;
                } else {
                    e2Var.zzj().f4060o.b("Current scheduler thread is neither worker nor network");
                }
                this.f4292c = true;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f4293d.f4164s.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                a(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                i2<?> poll = this.f4291b.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.f4314b ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.f4290a) {
                        if (this.f4291b.peek() == null) {
                            this.f4293d.getClass();
                            try {
                                this.f4290a.wait(30000L);
                            } catch (InterruptedException e11) {
                                a(e11);
                            }
                        }
                    }
                    synchronized (this.f4293d.f4163r) {
                        if (this.f4291b.peek() == null) {
                            b();
                            return;
                        }
                    }
                }
            }
        } finally {
            b();
        }
    }
}
