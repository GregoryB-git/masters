package F0;

import F0.M;

/* loaded from: classes.dex */
public final class P implements M {

    /* renamed from: a, reason: collision with root package name */
    public final long f1803a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1804b;

    public P(long j7) {
        this(j7, 0L);
    }

    @Override // F0.M
    public boolean h() {
        return true;
    }

    @Override // F0.M
    public M.a j(long j7) {
        return new M.a(new N(j7, this.f1804b));
    }

    @Override // F0.M
    public long l() {
        return this.f1803a;
    }

    public P(long j7, long j8) {
        this.f1803a = j7;
        this.f1804b = j8;
    }
}
