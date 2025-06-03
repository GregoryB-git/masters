package w6;

import java.util.concurrent.Executor;
import p6.AbstractC1849g0;
import p6.F;
import u6.G;
import u6.I;

/* loaded from: classes.dex */
public final class b extends AbstractC1849g0 implements Executor {

    /* renamed from: r, reason: collision with root package name */
    public static final b f20476r = new b();

    /* renamed from: s, reason: collision with root package name */
    public static final F f20477s;

    static {
        int a7;
        int e7;
        m mVar = m.f20497q;
        a7 = l6.f.a(64, G.a());
        e7 = I.e("kotlinx.coroutines.io.parallelism", a7, 0, 0, 12, null);
        f20477s = mVar.G(e7);
    }

    @Override // p6.F
    public void E(X5.g gVar, Runnable runnable) {
        f20477s.E(gVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        E(X5.h.f7293o, runnable);
    }

    @Override // p6.F
    public String toString() {
        return "Dispatchers.IO";
    }
}
