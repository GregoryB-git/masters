package y2;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f17362e = o2.j.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final o2.n f17363a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f17364b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f17365c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f17366d = new Object();

    public interface a {
        void a(x2.l lVar);
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final b0 f17367a;

        /* renamed from: b, reason: collision with root package name */
        public final x2.l f17368b;

        public b(b0 b0Var, x2.l lVar) {
            this.f17367a = b0Var;
            this.f17368b = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f17367a.f17366d) {
                if (((b) this.f17367a.f17364b.remove(this.f17368b)) != null) {
                    a aVar = (a) this.f17367a.f17365c.remove(this.f17368b);
                    if (aVar != null) {
                        aVar.a(this.f17368b);
                    }
                } else {
                    o2.j.d().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f17368b));
                }
            }
        }
    }

    public b0(p2.c cVar) {
        this.f17363a = cVar;
    }

    public final void a(x2.l lVar) {
        synchronized (this.f17366d) {
            if (((b) this.f17364b.remove(lVar)) != null) {
                o2.j.d().a(f17362e, "Stopping timer for " + lVar);
                this.f17365c.remove(lVar);
            }
        }
    }
}
