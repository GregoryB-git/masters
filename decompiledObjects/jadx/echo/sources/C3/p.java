package C3;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u.AbstractC1996a;

/* loaded from: classes.dex */
public class p extends AbstractC1996a implements ScheduledFuture {

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledFuture f987v;

    public class a implements b {
        public a() {
        }

        @Override // C3.p.b
        public void a(Throwable th) {
            p.this.C(th);
        }

        @Override // C3.p.b
        public void set(Object obj) {
            p.this.z(obj);
        }
    }

    public interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    public interface c {
        ScheduledFuture a(b bVar);
    }

    public p(c cVar) {
        this.f987v = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f987v.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f987v.getDelay(timeUnit);
    }

    @Override // u.AbstractC1996a
    public void h() {
        this.f987v.cancel(F());
    }
}
