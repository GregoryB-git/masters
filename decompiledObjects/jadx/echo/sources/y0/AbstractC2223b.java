package y0;

import java.util.NoSuchElementException;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2223b implements n {

    /* renamed from: b, reason: collision with root package name */
    public final long f21227b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21228c;

    /* renamed from: d, reason: collision with root package name */
    public long f21229d;

    public AbstractC2223b(long j7, long j8) {
        this.f21227b = j7;
        this.f21228c = j8;
        f();
    }

    public final void c() {
        long j7 = this.f21229d;
        if (j7 < this.f21227b || j7 > this.f21228c) {
            throw new NoSuchElementException();
        }
    }

    public final long d() {
        return this.f21229d;
    }

    public boolean e() {
        return this.f21229d > this.f21228c;
    }

    public void f() {
        this.f21229d = this.f21227b - 1;
    }

    @Override // y0.n
    public boolean next() {
        this.f21229d++;
        return !e();
    }
}
