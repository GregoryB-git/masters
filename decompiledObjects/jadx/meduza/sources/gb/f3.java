package gb;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class f3 implements Executor, Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f6373d = Logger.getLogger(f3.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final a f6374e;

    /* renamed from: a, reason: collision with root package name */
    public Executor f6375a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f6376b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public volatile int f6377c = 0;

    public static abstract class a {
        public abstract boolean a(f3 f3Var);

        public abstract void b(f3 f3Var);
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicIntegerFieldUpdater<f3> f6378a;

        public b(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            this.f6378a = atomicIntegerFieldUpdater;
        }

        @Override // gb.f3.a
        public final boolean a(f3 f3Var) {
            return this.f6378a.compareAndSet(f3Var, 0, -1);
        }

        @Override // gb.f3.a
        public final void b(f3 f3Var) {
            this.f6378a.set(f3Var, 0);
        }
    }

    public static final class c extends a {
        @Override // gb.f3.a
        public final boolean a(f3 f3Var) {
            synchronized (f3Var) {
                if (f3Var.f6377c != 0) {
                    return false;
                }
                f3Var.f6377c = -1;
                return true;
            }
        }

        @Override // gb.f3.a
        public final void b(f3 f3Var) {
            synchronized (f3Var) {
                f3Var.f6377c = 0;
            }
        }
    }

    static {
        a cVar;
        try {
            cVar = new b(AtomicIntegerFieldUpdater.newUpdater(f3.class, "c"));
        } catch (Throwable th) {
            f6373d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            cVar = new c();
        }
        f6374e = cVar;
    }

    public f3(Executor executor) {
        x6.b.y(executor, "'executor' must not be null.");
        this.f6375a = executor;
    }

    public final void a(Runnable runnable) {
        if (f6374e.a(this)) {
            try {
                this.f6375a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f6376b.remove(runnable);
                }
                f6374e.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f6376b;
        x6.b.y(runnable, "'r' must not be null.");
        concurrentLinkedQueue.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        try {
            Executor executor = this.f6375a;
            while (executor == this.f6375a && (runnable = (Runnable) this.f6376b.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e10) {
                    f6373d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e10);
                }
            }
            f6374e.b(this);
            if (this.f6376b.isEmpty()) {
                return;
            }
            a(null);
        } catch (Throwable th) {
            f6374e.b(this);
            throw th;
        }
    }
}
