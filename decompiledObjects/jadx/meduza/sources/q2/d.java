package q2;

import ec.i;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import o2.n;
import p2.h0;
import p2.i0;
import p2.x;
import x0.q0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final n f13217a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f13218b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13219c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13220d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f13221e;

    public d(p2.c cVar, i0 i0Var) {
        i.e(cVar, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f13217a = cVar;
        this.f13218b = i0Var;
        this.f13219c = millis;
        this.f13220d = new Object();
        this.f13221e = new LinkedHashMap();
    }

    public final void a(x xVar) {
        Runnable runnable;
        i.e(xVar, "token");
        synchronized (this.f13220d) {
            runnable = (Runnable) this.f13221e.remove(xVar);
        }
        if (runnable != null) {
            this.f13217a.b(runnable);
        }
    }

    public final void b(x xVar) {
        q0 q0Var = new q0(4, this, xVar);
        synchronized (this.f13220d) {
        }
        this.f13217a.a(q0Var, this.f13219c);
    }
}
