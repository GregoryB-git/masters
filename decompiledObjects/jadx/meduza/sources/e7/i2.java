package e7;

import com.google.android.gms.internal.measurement.zzdi;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class i2<V> extends FutureTask<V> implements Comparable<i2<V>> {

    /* renamed from: a, reason: collision with root package name */
    public final long f4313a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4314b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2 f4316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(e2 e2Var, Runnable runnable, boolean z10, String str) {
        super(zzdi.zza().zza(runnable), null);
        this.f4316d = e2Var;
        long andIncrement = e2.t.getAndIncrement();
        this.f4313a = andIncrement;
        this.f4315c = str;
        this.f4314b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            e2Var.zzj().f4060o.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i2 i2Var = (i2) obj;
        boolean z10 = this.f4314b;
        if (z10 != i2Var.f4314b) {
            return z10 ? -1 : 1;
        }
        long j10 = this.f4313a;
        long j11 = i2Var.f4313a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f4316d.zzj().f4061p.c("Two tasks share the same index. index", Long.valueOf(this.f4313a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f4316d.zzj().f4060o.c(this.f4315c, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(e2 e2Var, Callable callable, boolean z10) {
        super(zzdi.zza().zza(callable));
        this.f4316d = e2Var;
        long andIncrement = e2.t.getAndIncrement();
        this.f4313a = andIncrement;
        this.f4315c = "Task exception on worker thread";
        this.f4314b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            e2Var.zzj().f4060o.b("Tasks index overflow");
        }
    }
}
