package k0;

import g0.AbstractC1297a;

/* renamed from: k0.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f16072a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16073b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16074c;

    /* renamed from: k0.y0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public long f16075a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        public float f16076b = -3.4028235E38f;

        /* renamed from: c, reason: collision with root package name */
        public long f16077c = -9223372036854775807L;

        public C1447y0 d() {
            return new C1447y0(this);
        }

        public b e(long j7) {
            AbstractC1297a.a(j7 >= 0 || j7 == -9223372036854775807L);
            this.f16077c = j7;
            return this;
        }

        public b f(long j7) {
            this.f16075a = j7;
            return this;
        }

        public b g(float f7) {
            AbstractC1297a.a(f7 > 0.0f || f7 == -3.4028235E38f);
            this.f16076b = f7;
            return this;
        }
    }

    public C1447y0(b bVar) {
        this.f16072a = bVar.f16075a;
        this.f16073b = bVar.f16076b;
        this.f16074c = bVar.f16077c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1447y0)) {
            return false;
        }
        C1447y0 c1447y0 = (C1447y0) obj;
        return this.f16072a == c1447y0.f16072a && this.f16073b == c1447y0.f16073b && this.f16074c == c1447y0.f16074c;
    }

    public int hashCode() {
        return W2.k.b(Long.valueOf(this.f16072a), Float.valueOf(this.f16073b), Long.valueOf(this.f16074c));
    }
}
