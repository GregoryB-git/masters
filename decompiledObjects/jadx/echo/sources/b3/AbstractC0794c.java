package b3;

import W2.i;
import W2.m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0794c extends AbstractC0795d {

    /* renamed from: b3.c$a */
    public static final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final Future f9968o;

        /* renamed from: p, reason: collision with root package name */
        public final InterfaceC0793b f9969p;

        public a(Future future, InterfaceC0793b interfaceC0793b) {
            this.f9968o = future;
            this.f9969p = interfaceC0793b;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9969p.a(AbstractC0794c.b(this.f9968o));
            } catch (ExecutionException e7) {
                this.f9969p.onFailure(e7.getCause());
            } catch (Throwable th) {
                this.f9969p.onFailure(th);
            }
        }

        public String toString() {
            return i.a(this).c(this.f9969p).toString();
        }
    }

    public static void a(InterfaceFutureC0796e interfaceFutureC0796e, InterfaceC0793b interfaceC0793b, Executor executor) {
        m.j(interfaceC0793b);
        interfaceFutureC0796e.c(new a(interfaceFutureC0796e, interfaceC0793b), executor);
    }

    public static Object b(Future future) {
        m.q(future.isDone(), "Future was expected to be done: %s", future);
        return AbstractC0798g.a(future);
    }
}
