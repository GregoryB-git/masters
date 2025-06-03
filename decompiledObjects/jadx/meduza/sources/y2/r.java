package y2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class r implements a3.a {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f17394b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f17395c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f17393a = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final Object f17396d = new Object();

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final r f17397a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f17398b;

        public a(r rVar, Runnable runnable) {
            this.f17397a = rVar;
            this.f17398b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f17398b.run();
                synchronized (this.f17397a.f17396d) {
                    this.f17397a.a();
                }
            } catch (Throwable th) {
                synchronized (this.f17397a.f17396d) {
                    this.f17397a.a();
                    throw th;
                }
            }
        }
    }

    public r(ExecutorService executorService) {
        this.f17394b = executorService;
    }

    public final void a() {
        a poll = this.f17393a.poll();
        this.f17395c = poll;
        if (poll != null) {
            this.f17394b.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f17396d) {
            this.f17393a.add(new a(this, runnable));
            if (this.f17395c == null) {
                a();
            }
        }
    }
}
