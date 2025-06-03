package q3;

import e8.g;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k3.s;
import s3.b;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements b.a, g.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13250c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13251d;

    public /* synthetic */ i(e8.f fVar, Callable callable, long j10, TimeUnit timeUnit) {
        this.f13249b = fVar;
        this.f13250c = callable;
        this.f13248a = j10;
        this.f13251d = timeUnit;
    }

    public /* synthetic */ i(k kVar, Iterable iterable, s sVar, long j10) {
        this.f13249b = kVar;
        this.f13250c = iterable;
        this.f13251d = sVar;
        this.f13248a = j10;
    }

    @Override // s3.b.a
    public final Object a() {
        k kVar = (k) this.f13249b;
        Iterable<r3.i> iterable = (Iterable) this.f13250c;
        s sVar = (s) this.f13251d;
        long j10 = this.f13248a;
        kVar.f13257c.s0(iterable);
        kVar.f13257c.P(kVar.f13260g.a() + j10, sVar);
        return null;
    }

    @Override // e8.g.c
    public final ScheduledFuture b(final g.a aVar) {
        final e8.f fVar = (e8.f) this.f13249b;
        final Callable callable = (Callable) this.f13250c;
        return fVar.f4832b.schedule(new Callable() { // from class: e8.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.this.f4831a.submit(new w.g(15, callable, aVar));
            }
        }, this.f13248a, (TimeUnit) this.f13251d);
    }
}
