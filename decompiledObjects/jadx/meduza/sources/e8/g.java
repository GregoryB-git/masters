package e8;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s.a;

/* loaded from: classes.dex */
public final class g<V> extends s.a<V> implements ScheduledFuture<V> {

    /* renamed from: p, reason: collision with root package name */
    public final ScheduledFuture<?> f4833p;

    public class a implements b<V> {
        public a() {
        }
    }

    public interface b<T> {
    }

    public interface c<T> {
        ScheduledFuture b(a aVar);
    }

    public g(c<V> cVar) {
        this.f4833p = cVar.b(new a());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f4833p.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4833p.getDelay(timeUnit);
    }

    @Override // s.a
    public final void h() {
        ScheduledFuture<?> scheduledFuture = this.f4833p;
        Object obj = this.f13913a;
        scheduledFuture.cancel((obj instanceof a.b) && ((a.b) obj).f13918a);
    }
}
