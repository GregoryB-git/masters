package v3;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final b f15386a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15387b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.c f15388c;

    /* renamed from: d, reason: collision with root package name */
    public int f15389d;

    /* renamed from: e, reason: collision with root package name */
    public Object f15390e;
    public Looper f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15391g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15392h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15393i;

    public interface a {
    }

    public interface b {
        void q(int i10, Object obj);
    }

    public g1(g0 g0Var, b bVar, r1 r1Var, int i10, v5.c cVar, Looper looper) {
        this.f15387b = g0Var;
        this.f15386a = bVar;
        this.f = looper;
        this.f15388c = cVar;
    }

    public final synchronized void a(long j10) {
        boolean z10;
        x6.b.H(this.f15391g);
        x6.b.H(this.f.getThread() != Thread.currentThread());
        long d10 = this.f15388c.d() + j10;
        while (true) {
            z10 = this.f15393i;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f15388c.c();
            wait(j10);
            j10 = d10 - this.f15388c.d();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.f15392h = z10 | this.f15392h;
        this.f15393i = true;
        notifyAll();
    }

    public final void c() {
        x6.b.H(!this.f15391g);
        this.f15391g = true;
        g0 g0Var = (g0) this.f15387b;
        synchronized (g0Var) {
            if (!g0Var.H && g0Var.f15360r.getThread().isAlive()) {
                g0Var.f15358p.k(14, this).a();
            }
            v5.m.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
