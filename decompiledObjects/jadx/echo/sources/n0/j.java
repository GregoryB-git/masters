package n0;

import d0.C1194q;
import g0.M;
import k0.C1441v0;
import x0.Q;

/* loaded from: classes.dex */
public final class j implements Q {

    /* renamed from: o, reason: collision with root package name */
    public final C1194q f17855o;

    /* renamed from: q, reason: collision with root package name */
    public long[] f17857q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17858r;

    /* renamed from: s, reason: collision with root package name */
    public o0.f f17859s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17860t;

    /* renamed from: u, reason: collision with root package name */
    public int f17861u;

    /* renamed from: p, reason: collision with root package name */
    public final Q0.c f17856p = new Q0.c();

    /* renamed from: v, reason: collision with root package name */
    public long f17862v = -9223372036854775807L;

    public j(o0.f fVar, C1194q c1194q, boolean z7) {
        this.f17855o = c1194q;
        this.f17859s = fVar;
        this.f17857q = fVar.f18113b;
        d(fVar, z7);
    }

    public String b() {
        return this.f17859s.a();
    }

    public void c(long j7) {
        int d7 = M.d(this.f17857q, j7, true, false);
        this.f17861u = d7;
        if (!this.f17858r || d7 != this.f17857q.length) {
            j7 = -9223372036854775807L;
        }
        this.f17862v = j7;
    }

    public void d(o0.f fVar, boolean z7) {
        int i7 = this.f17861u;
        long j7 = i7 == 0 ? -9223372036854775807L : this.f17857q[i7 - 1];
        this.f17858r = z7;
        this.f17859s = fVar;
        long[] jArr = fVar.f18113b;
        this.f17857q = jArr;
        long j8 = this.f17862v;
        if (j8 != -9223372036854775807L) {
            c(j8);
        } else if (j7 != -9223372036854775807L) {
            this.f17861u = M.d(jArr, j7, false, false);
        }
    }

    @Override // x0.Q
    public boolean e() {
        return true;
    }

    @Override // x0.Q
    public int j(C1441v0 c1441v0, j0.i iVar, int i7) {
        int i8 = this.f17861u;
        boolean z7 = i8 == this.f17857q.length;
        if (z7 && !this.f17858r) {
            iVar.w(4);
            return -4;
        }
        if ((i7 & 2) != 0 || !this.f17860t) {
            c1441v0.f16024b = this.f17855o;
            this.f17860t = true;
            return -5;
        }
        if (z7) {
            return -3;
        }
        if ((i7 & 1) == 0) {
            this.f17861u = i8 + 1;
        }
        if ((i7 & 4) == 0) {
            byte[] a7 = this.f17856p.a(this.f17859s.f18112a[i8]);
            iVar.z(a7.length);
            iVar.f15400r.put(a7);
        }
        iVar.f15402t = this.f17857q[i8];
        iVar.w(1);
        return -4;
    }

    @Override // x0.Q
    public int m(long j7) {
        int max = Math.max(this.f17861u, M.d(this.f17857q, j7, true, false));
        int i7 = max - this.f17861u;
        this.f17861u = max;
        return i7;
    }

    @Override // x0.Q
    public void a() {
    }
}
