package tc;

import java.util.concurrent.Executor;
import nc.a0;
import nc.b1;
import sc.v;

/* loaded from: classes.dex */
public final class b extends b1 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final b f14760c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f14761d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [sc.h] */
    static {
        k kVar = k.f14775c;
        int i10 = v.f14369a;
        if (64 >= i10) {
            i10 = 64;
        }
        int w0 = x6.b.w0("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12);
        kVar.getClass();
        x6.b.C(w0);
        if (w0 < j.f14771d) {
            x6.b.C(w0);
            kVar = new sc.h(kVar, w0);
        }
        f14761d = kVar;
    }

    @Override // nc.a0
    public final void A0(ub.h hVar, Runnable runnable) {
        f14761d.A0(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        z0(ub.i.f15164a, runnable);
    }

    @Override // nc.a0
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // nc.a0
    public final void z0(ub.h hVar, Runnable runnable) {
        f14761d.z0(hVar, runnable);
    }
}
