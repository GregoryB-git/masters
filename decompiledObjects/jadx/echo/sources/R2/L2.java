package R2;

import A2.AbstractC0328n;
import com.google.android.gms.internal.measurement.AbstractC0991p0;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class L2 extends FutureTask implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public final long f4885o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4886p;

    /* renamed from: q, reason: collision with root package name */
    public final String f4887q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G2 f4888r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2(G2 g22, Runnable runnable, boolean z7, String str) {
        super(AbstractC0991p0.a().b(runnable), null);
        AtomicLong atomicLong;
        this.f4888r = g22;
        AbstractC0328n.i(str);
        atomicLong = G2.f4678l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f4885o = andIncrement;
        this.f4887q = str;
        this.f4886p = z7;
        if (andIncrement == Long.MAX_VALUE) {
            g22.j().G().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        L2 l22 = (L2) obj;
        boolean z7 = this.f4886p;
        if (z7 != l22.f4886p) {
            return z7 ? -1 : 1;
        }
        long j7 = this.f4885o;
        long j8 = l22.f4885o;
        if (j7 < j8) {
            return -1;
        }
        if (j7 > j8) {
            return 1;
        }
        this.f4888r.j().I().b("Two tasks share the same index. index", Long.valueOf(this.f4885o));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f4888r.j().G().b(this.f4887q, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2(G2 g22, Callable callable, boolean z7, String str) {
        super(AbstractC0991p0.a().a(callable));
        AtomicLong atomicLong;
        this.f4888r = g22;
        AbstractC0328n.i(str);
        atomicLong = G2.f4678l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f4885o = andIncrement;
        this.f4887q = str;
        this.f4886p = z7;
        if (andIncrement == Long.MAX_VALUE) {
            g22.j().G().a("Tasks index overflow");
        }
    }
}
