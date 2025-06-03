package n4;

import c4.t;
import c4.u;
import v5.e0;

/* loaded from: classes.dex */
public final class d implements t {

    /* renamed from: a, reason: collision with root package name */
    public final b f11263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11264b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11265c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11266d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11267e;

    public d(b bVar, int i10, long j10, long j11) {
        this.f11263a = bVar;
        this.f11264b = i10;
        this.f11265c = j10;
        long j12 = (j11 - j10) / bVar.f11258c;
        this.f11266d = j12;
        this.f11267e = b(j12);
    }

    public final long b(long j10) {
        return e0.O(j10 * this.f11264b, 1000000L, this.f11263a.f11257b);
    }

    @Override // c4.t
    public final boolean e() {
        return true;
    }

    @Override // c4.t
    public final t.a g(long j10) {
        long j11 = e0.j((this.f11263a.f11257b * j10) / (this.f11264b * 1000000), 0L, this.f11266d - 1);
        long j12 = (this.f11263a.f11258c * j11) + this.f11265c;
        long b10 = b(j11);
        u uVar = new u(b10, j12);
        if (b10 >= j10 || j11 == this.f11266d - 1) {
            return new t.a(uVar, uVar);
        }
        long j13 = j11 + 1;
        return new t.a(uVar, new u(b(j13), (this.f11263a.f11258c * j13) + this.f11265c));
    }

    @Override // c4.t
    public final long h() {
        return this.f11267e;
    }
}
