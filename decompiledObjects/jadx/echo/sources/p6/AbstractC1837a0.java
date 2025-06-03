package p6;

import W5.C0676f;

/* renamed from: p6.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1837a0 extends F {

    /* renamed from: q, reason: collision with root package name */
    public long f18520q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18521r;

    /* renamed from: s, reason: collision with root package name */
    public C0676f f18522s;

    public static /* synthetic */ void I(AbstractC1837a0 abstractC1837a0, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        abstractC1837a0.H(z7);
    }

    public static /* synthetic */ void N(AbstractC1837a0 abstractC1837a0, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        abstractC1837a0.M(z7);
    }

    public final void H(boolean z7) {
        long J6 = this.f18520q - J(z7);
        this.f18520q = J6;
        if (J6 <= 0 && this.f18521r) {
            shutdown();
        }
    }

    public final long J(boolean z7) {
        return z7 ? 4294967296L : 1L;
    }

    public final void K(U u7) {
        C0676f c0676f = this.f18522s;
        if (c0676f == null) {
            c0676f = new C0676f();
            this.f18522s = c0676f;
        }
        c0676f.g(u7);
    }

    public long L() {
        C0676f c0676f = this.f18522s;
        return (c0676f == null || c0676f.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void M(boolean z7) {
        this.f18520q += J(z7);
        if (z7) {
            return;
        }
        this.f18521r = true;
    }

    public final boolean O() {
        return this.f18520q >= J(true);
    }

    public final boolean P() {
        C0676f c0676f = this.f18522s;
        if (c0676f != null) {
            return c0676f.isEmpty();
        }
        return true;
    }

    public abstract long Q();

    public final boolean R() {
        U u7;
        C0676f c0676f = this.f18522s;
        if (c0676f == null || (u7 = (U) c0676f.W()) == null) {
            return false;
        }
        u7.run();
        return true;
    }

    public boolean S() {
        return false;
    }

    public abstract void shutdown();
}
