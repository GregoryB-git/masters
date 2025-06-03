package p1;

import b1.t;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import x2.v;

/* loaded from: classes.dex */
public final class n<T> extends t<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f12836k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final j f12837a;

    /* renamed from: b, reason: collision with root package name */
    public final l.l f12838b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12839c;

    /* renamed from: d, reason: collision with root package name */
    public final Callable<T> f12840d;

    /* renamed from: e, reason: collision with root package name */
    public final m f12841e;
    public final AtomicBoolean f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f12842g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f12843h;

    /* renamed from: i, reason: collision with root package name */
    public final b.m f12844i;

    /* renamed from: j, reason: collision with root package name */
    public final u.a f12845j;

    public n(j jVar, l.l lVar, v vVar, String[] strArr) {
        ec.i.e(jVar, "database");
        this.f12837a = jVar;
        this.f12838b = lVar;
        this.f12839c = true;
        this.f12840d = vVar;
        this.f12841e = new m(strArr, this);
        this.f = new AtomicBoolean(true);
        this.f12842g = new AtomicBoolean(false);
        this.f12843h = new AtomicBoolean(false);
        this.f12844i = new b.m(this, 6);
        this.f12845j = new u.a(this, 5);
    }

    @Override // b1.t
    public final void onActive() {
        Executor executor;
        super.onActive();
        l.l lVar = this.f12838b;
        lVar.getClass();
        ((Set) lVar.f9391c).add(this);
        if (this.f12839c) {
            executor = this.f12837a.f12794c;
            if (executor == null) {
                ec.i.i("internalTransactionExecutor");
                throw null;
            }
        } else {
            executor = this.f12837a.f12793b;
            if (executor == null) {
                ec.i.i("internalQueryExecutor");
                throw null;
            }
        }
        executor.execute(this.f12844i);
    }

    @Override // b1.t
    public final void onInactive() {
        super.onInactive();
        l.l lVar = this.f12838b;
        lVar.getClass();
        ((Set) lVar.f9391c).remove(this);
    }
}
