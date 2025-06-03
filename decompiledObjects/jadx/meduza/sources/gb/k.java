package gb;

import eb.h1;
import gb.c3;
import gb.j;
import gb.k0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class k implements b3 {
    public static final Logger f = Logger.getLogger(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f6551a;

    /* renamed from: b, reason: collision with root package name */
    public final eb.h1 f6552b;

    /* renamed from: c, reason: collision with root package name */
    public final j.a f6553c;

    /* renamed from: d, reason: collision with root package name */
    public k0 f6554d;

    /* renamed from: e, reason: collision with root package name */
    public h1.c f6555e;

    public k(k0.a aVar, ScheduledExecutorService scheduledExecutorService, eb.h1 h1Var) {
        this.f6553c = aVar;
        this.f6551a = scheduledExecutorService;
        this.f6552b = h1Var;
    }

    public final void a(c3.a aVar) {
        this.f6552b.d();
        if (this.f6554d == null) {
            ((k0.a) this.f6553c).getClass();
            this.f6554d = new k0();
        }
        h1.c cVar = this.f6555e;
        if (cVar != null) {
            h1.b bVar = cVar.f5127a;
            if ((bVar.f5126c || bVar.f5125b) ? false : true) {
                return;
            }
        }
        long a10 = this.f6554d.a();
        this.f6555e = this.f6552b.c(aVar, a10, TimeUnit.NANOSECONDS, this.f6551a);
        f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(a10));
    }
}
