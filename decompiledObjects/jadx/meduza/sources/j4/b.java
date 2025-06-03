package j4;

import c4.t;
import c4.u;
import v5.e0;
import v5.n;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long f8383a;

    /* renamed from: b, reason: collision with root package name */
    public final n f8384b;

    /* renamed from: c, reason: collision with root package name */
    public final n f8385c;

    /* renamed from: d, reason: collision with root package name */
    public long f8386d;

    public b(long j10, long j11, long j12) {
        this.f8386d = j10;
        this.f8383a = j12;
        n nVar = new n();
        this.f8384b = nVar;
        n nVar2 = new n();
        this.f8385c = nVar2;
        nVar.a(0L);
        nVar2.a(j11);
    }

    @Override // j4.e
    public final long a(long j10) {
        return this.f8384b.b(e0.d(this.f8385c, j10));
    }

    public final boolean b(long j10) {
        n nVar = this.f8384b;
        return j10 - nVar.b(nVar.f15926a - 1) < 100000;
    }

    @Override // j4.e
    public final long c() {
        return this.f8383a;
    }

    @Override // c4.t
    public final boolean e() {
        return true;
    }

    @Override // c4.t
    public final t.a g(long j10) {
        int d10 = e0.d(this.f8384b, j10);
        long b10 = this.f8384b.b(d10);
        u uVar = new u(b10, this.f8385c.b(d10));
        if (b10 != j10) {
            n nVar = this.f8384b;
            if (d10 != nVar.f15926a - 1) {
                int i10 = d10 + 1;
                return new t.a(uVar, new u(nVar.b(i10), this.f8385c.b(i10)));
            }
        }
        return new t.a(uVar, uVar);
    }

    @Override // c4.t
    public final long h() {
        return this.f8386d;
    }
}
