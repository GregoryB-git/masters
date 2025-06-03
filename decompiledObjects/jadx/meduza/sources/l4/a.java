package l4;

import c4.t;
import c4.u;
import v5.e0;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final e f9561a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9562b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9563c;

    /* renamed from: d, reason: collision with root package name */
    public final h f9564d;

    /* renamed from: e, reason: collision with root package name */
    public int f9565e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f9566g;

    /* renamed from: h, reason: collision with root package name */
    public long f9567h;

    /* renamed from: i, reason: collision with root package name */
    public long f9568i;

    /* renamed from: j, reason: collision with root package name */
    public long f9569j;

    /* renamed from: k, reason: collision with root package name */
    public long f9570k;

    /* renamed from: l, reason: collision with root package name */
    public long f9571l;

    /* renamed from: l4.a$a, reason: collision with other inner class name */
    public final class C0144a implements t {
        public C0144a() {
        }

        @Override // c4.t
        public final boolean e() {
            return true;
        }

        @Override // c4.t
        public final t.a g(long j10) {
            a aVar = a.this;
            long j11 = aVar.f9562b;
            long j12 = aVar.f9563c;
            u uVar = new u(j10, e0.j(((((j12 - j11) * ((aVar.f9564d.f9603i * j10) / 1000000)) / aVar.f) + j11) - 30000, j11, j12 - 1));
            return new t.a(uVar, uVar);
        }

        @Override // c4.t
        public final long h() {
            return (a.this.f * 1000000) / r0.f9564d.f9603i;
        }
    }

    public a(h hVar, long j10, long j11, long j12, long j13, boolean z10) {
        x6.b.q(j10 >= 0 && j11 > j10);
        this.f9564d = hVar;
        this.f9562b = j10;
        this.f9563c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f = j13;
            this.f9565e = 4;
        } else {
            this.f9565e = 0;
        }
        this.f9561a = new e();
    }

    @Override // l4.f
    public final t a() {
        if (this.f != 0) {
            return new C0144a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    @Override // l4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(c4.i r22) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.a.b(c4.i):long");
    }

    @Override // l4.f
    public final void c(long j10) {
        this.f9567h = e0.j(j10, 0L, this.f - 1);
        this.f9565e = 2;
        this.f9568i = this.f9562b;
        this.f9569j = this.f9563c;
        this.f9570k = 0L;
        this.f9571l = this.f;
    }
}
