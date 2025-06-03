package H3;

import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0651b;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f2254a = A.c("awaitEvenIfOnMainThread task continuation executor");

    public static Object f(AbstractC0659j abstractC0659j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC0659j.g(f2254a, new InterfaceC0651b() { // from class: H3.X
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j2) {
                Object i7;
                i7 = c0.i(countDownLatch, abstractC0659j2);
                return i7;
            }
        });
        countDownLatch.await(Looper.getMainLooper() == Looper.myLooper() ? 3L : 4L, TimeUnit.SECONDS);
        if (abstractC0659j.n()) {
            return abstractC0659j.j();
        }
        if (abstractC0659j.l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC0659j.m()) {
            throw new IllegalStateException(abstractC0659j.i());
        }
        throw new TimeoutException();
    }

    public static boolean g(CountDownLatch countDownLatch, long j7, TimeUnit timeUnit) {
        boolean z7 = false;
        try {
            long nanos = timeUnit.toNanos(j7);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static AbstractC0659j h(final Executor executor, final Callable callable) {
        final C0660k c0660k = new C0660k();
        executor.execute(new Runnable() { // from class: H3.Y
            @Override // java.lang.Runnable
            public final void run() {
                c0.k(callable, executor, c0660k);
            }
        });
        return c0660k.a();
    }

    public static /* synthetic */ Object i(CountDownLatch countDownLatch, AbstractC0659j abstractC0659j) {
        countDownLatch.countDown();
        return null;
    }

    public static /* synthetic */ Object j(C0660k c0660k, AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            c0660k.c(abstractC0659j.j());
            return null;
        }
        if (abstractC0659j.i() == null) {
            return null;
        }
        c0660k.b(abstractC0659j.i());
        return null;
    }

    public static /* synthetic */ void k(Callable callable, Executor executor, final C0660k c0660k) {
        try {
            ((AbstractC0659j) callable.call()).g(executor, new InterfaceC0651b() { // from class: H3.b0
                @Override // V2.InterfaceC0651b
                public final Object a(AbstractC0659j abstractC0659j) {
                    Object j7;
                    j7 = c0.j(C0660k.this, abstractC0659j);
                    return j7;
                }
            });
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static /* synthetic */ Void l(C0660k c0660k, AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            c0660k.e(abstractC0659j.j());
            return null;
        }
        if (abstractC0659j.i() == null) {
            return null;
        }
        c0660k.d(abstractC0659j.i());
        return null;
    }

    public static /* synthetic */ Void m(C0660k c0660k, AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            c0660k.e(abstractC0659j.j());
            return null;
        }
        if (abstractC0659j.i() == null) {
            return null;
        }
        c0660k.d(abstractC0659j.i());
        return null;
    }

    public static AbstractC0659j n(AbstractC0659j abstractC0659j, AbstractC0659j abstractC0659j2) {
        final C0660k c0660k = new C0660k();
        InterfaceC0651b interfaceC0651b = new InterfaceC0651b() { // from class: H3.a0
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j3) {
                Void l7;
                l7 = c0.l(C0660k.this, abstractC0659j3);
                return l7;
            }
        };
        abstractC0659j.f(interfaceC0651b);
        abstractC0659j2.f(interfaceC0651b);
        return c0660k.a();
    }

    public static AbstractC0659j o(Executor executor, AbstractC0659j abstractC0659j, AbstractC0659j abstractC0659j2) {
        final C0660k c0660k = new C0660k();
        InterfaceC0651b interfaceC0651b = new InterfaceC0651b() { // from class: H3.Z
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j3) {
                Void m7;
                m7 = c0.m(C0660k.this, abstractC0659j3);
                return m7;
            }
        };
        abstractC0659j.g(executor, interfaceC0651b);
        abstractC0659j2.g(executor, interfaceC0651b);
        return c0660k.a();
    }
}
