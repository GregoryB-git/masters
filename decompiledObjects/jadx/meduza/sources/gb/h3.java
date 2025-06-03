package gb;

import java.util.IdentityHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h3 {

    /* renamed from: d, reason: collision with root package name */
    public static final h3 f6458d = new h3(new a());

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap<c<?>, b> f6459a = new IdentityHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final d f6460b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledExecutorService f6461c;

    public class a implements d {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f6462a;

        /* renamed from: b, reason: collision with root package name */
        public int f6463b;

        /* renamed from: c, reason: collision with root package name */
        public ScheduledFuture<?> f6464c;

        public b(Object obj) {
            this.f6462a = obj;
        }
    }

    public interface c<T> {
        T a();

        void b(T t);
    }

    public interface d {
    }

    public h3(a aVar) {
        this.f6460b = aVar;
    }

    public static <T> T a(c<T> cVar) {
        T t;
        h3 h3Var = f6458d;
        synchronized (h3Var) {
            b bVar = h3Var.f6459a.get(cVar);
            if (bVar == null) {
                bVar = new b(cVar.a());
                h3Var.f6459a.put(cVar, bVar);
            }
            ScheduledFuture<?> scheduledFuture = bVar.f6464c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                bVar.f6464c = null;
            }
            bVar.f6463b++;
            t = (T) bVar.f6462a;
        }
        return t;
    }

    public static void b(c cVar, Executor executor) {
        h3 h3Var = f6458d;
        synchronized (h3Var) {
            b bVar = h3Var.f6459a.get(cVar);
            if (bVar == null) {
                throw new IllegalArgumentException("No cached instance found for " + cVar);
            }
            x6.b.s("Releasing the wrong instance", executor == bVar.f6462a);
            x6.b.I(bVar.f6463b > 0, "Refcount has already reached zero");
            int i10 = bVar.f6463b - 1;
            bVar.f6463b = i10;
            if (i10 == 0) {
                x6.b.I(bVar.f6464c == null, "Destroy task already scheduled");
                if (h3Var.f6461c == null) {
                    ((a) h3Var.f6460b).getClass();
                    h3Var.f6461c = Executors.newSingleThreadScheduledExecutor(v0.d("grpc-shared-destroyer-%d"));
                }
                bVar.f6464c = h3Var.f6461c.schedule(new p1(new i3(h3Var, bVar, cVar, executor)), 1L, TimeUnit.SECONDS);
            }
        }
    }
}
