package s7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import n7.g;

/* loaded from: classes.dex */
public final class d extends e9.a {

    public static final class a<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Future<V> f14263a;

        /* renamed from: b, reason: collision with root package name */
        public final r4.c f14264b;

        public a(e eVar, r4.c cVar) {
            this.f14263a = eVar;
            this.f14264b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable a10;
            Future<V> future = this.f14263a;
            if ((future instanceof t7.a) && (a10 = ((t7.a) future).a()) != null) {
                this.f14264b.f(a10);
                return;
            }
            try {
                this.f14264b.onSuccess(d.C(this.f14263a));
            } catch (Error e10) {
                e = e10;
                this.f14264b.f(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f14264b.f(e);
            } catch (ExecutionException e12) {
                this.f14264b.f(e12.getCause());
            }
        }

        public final String toString() {
            g.a b10 = n7.g.b(this);
            r4.c cVar = this.f14264b;
            g.a.b bVar = new g.a.b();
            b10.f11290c.f11294c = bVar;
            b10.f11290c = bVar;
            bVar.f11293b = cVar;
            return b10.toString();
        }
    }

    public static <V> V C(Future<V> future) {
        V v10;
        x6.b.G(future, "Future was expected to be done: %s", future.isDone());
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }
}
