package b5;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b implements n {

    /* renamed from: b, reason: collision with root package name */
    public final long f1842b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1843c;

    /* renamed from: d, reason: collision with root package name */
    public long f1844d;

    public b(long j10, long j11) {
        this.f1842b = j10;
        this.f1843c = j11;
        this.f1844d = j10 - 1;
    }

    public final void c() {
        long j10 = this.f1844d;
        if (j10 < this.f1842b || j10 > this.f1843c) {
            throw new NoSuchElementException();
        }
    }

    @Override // b5.n
    public final boolean next() {
        long j10 = this.f1844d + 1;
        this.f1844d = j10;
        return !(j10 > this.f1843c);
    }
}
