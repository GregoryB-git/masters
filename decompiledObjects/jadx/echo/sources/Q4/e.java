package Q4;

import V2.AbstractC0659j;
import V2.InterfaceC0653d;
import V2.InterfaceC0655f;
import V2.InterfaceC0656g;
import V2.InterfaceC0658i;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static final Map f4421d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f4422e = new r1.m();

    /* renamed from: a, reason: collision with root package name */
    public final Executor f4423a;

    /* renamed from: b, reason: collision with root package name */
    public final p f4424b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0659j f4425c = null;

    public static class b implements InterfaceC0656g, InterfaceC0655f, InterfaceC0653d {

        /* renamed from: a, reason: collision with root package name */
        public final CountDownLatch f4426a;

        public b() {
            this.f4426a = new CountDownLatch(1);
        }

        @Override // V2.InterfaceC0656g
        public void a(Object obj) {
            this.f4426a.countDown();
        }

        @Override // V2.InterfaceC0653d
        public void b() {
            this.f4426a.countDown();
        }

        public boolean c(long j7, TimeUnit timeUnit) {
            return this.f4426a.await(j7, timeUnit);
        }

        @Override // V2.InterfaceC0655f
        public void d(Exception exc) {
            this.f4426a.countDown();
        }
    }

    public e(Executor executor, p pVar) {
        this.f4423a = executor;
        this.f4424b = pVar;
    }

    public static Object c(AbstractC0659j abstractC0659j, long j7, TimeUnit timeUnit) {
        b bVar = new b();
        Executor executor = f4422e;
        abstractC0659j.e(executor, bVar);
        abstractC0659j.d(executor, bVar);
        abstractC0659j.a(executor, bVar);
        if (!bVar.c(j7, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (abstractC0659j.n()) {
            return abstractC0659j.j();
        }
        throw new ExecutionException(abstractC0659j.i());
    }

    public static synchronized e h(Executor executor, p pVar) {
        e eVar;
        synchronized (e.class) {
            try {
                String b7 = pVar.b();
                Map map = f4421d;
                if (!map.containsKey(b7)) {
                    map.put(b7, new e(executor, pVar));
                }
                eVar = (e) map.get(b7);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public void d() {
        synchronized (this) {
            this.f4425c = V2.m.e(null);
        }
        this.f4424b.a();
    }

    public synchronized AbstractC0659j e() {
        try {
            AbstractC0659j abstractC0659j = this.f4425c;
            if (abstractC0659j != null) {
                if (abstractC0659j.m() && !this.f4425c.n()) {
                }
            }
            Executor executor = this.f4423a;
            final p pVar = this.f4424b;
            Objects.requireNonNull(pVar);
            this.f4425c = V2.m.c(executor, new Callable() { // from class: Q4.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return p.this.d();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return this.f4425c;
    }

    public com.google.firebase.remoteconfig.internal.b f() {
        return g(5L);
    }

    public com.google.firebase.remoteconfig.internal.b g(long j7) {
        synchronized (this) {
            try {
                AbstractC0659j abstractC0659j = this.f4425c;
                if (abstractC0659j != null && abstractC0659j.n()) {
                    return (com.google.firebase.remoteconfig.internal.b) this.f4425c.j();
                }
                try {
                    return (com.google.firebase.remoteconfig.internal.b) c(e(), j7, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e7) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e7);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Void i(com.google.firebase.remoteconfig.internal.b bVar) {
        return this.f4424b.e(bVar);
    }

    public final /* synthetic */ AbstractC0659j j(boolean z7, com.google.firebase.remoteconfig.internal.b bVar, Void r32) {
        if (z7) {
            m(bVar);
        }
        return V2.m.e(bVar);
    }

    public AbstractC0659j k(com.google.firebase.remoteconfig.internal.b bVar) {
        return l(bVar, true);
    }

    public AbstractC0659j l(final com.google.firebase.remoteconfig.internal.b bVar, final boolean z7) {
        return V2.m.c(this.f4423a, new Callable() { // from class: Q4.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void i7;
                i7 = e.this.i(bVar);
                return i7;
            }
        }).p(this.f4423a, new InterfaceC0658i() { // from class: Q4.d
            @Override // V2.InterfaceC0658i
            public final AbstractC0659j a(Object obj) {
                AbstractC0659j j7;
                j7 = e.this.j(z7, bVar, (Void) obj);
                return j7;
            }
        });
    }

    public final synchronized void m(com.google.firebase.remoteconfig.internal.b bVar) {
        this.f4425c = V2.m.e(bVar);
    }
}
