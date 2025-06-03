package p1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import x0.q0;

/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f12852a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<Runnable> f12853b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f12854c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12855d;

    public q(Executor executor) {
        ec.i.e(executor, "executor");
        this.f12852a = executor;
        this.f12853b = new ArrayDeque<>();
        this.f12855d = new Object();
    }

    public final void a() {
        synchronized (this.f12855d) {
            Runnable poll = this.f12853b.poll();
            Runnable runnable = poll;
            this.f12854c = runnable;
            if (poll != null) {
                this.f12852a.execute(runnable);
            }
            rb.h hVar = rb.h.f13851a;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ec.i.e(runnable, "command");
        synchronized (this.f12855d) {
            this.f12853b.offer(new q0(3, runnable, this));
            if (this.f12854c == null) {
                a();
            }
            rb.h hVar = rb.h.f13851a;
        }
    }
}
