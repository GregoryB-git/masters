package v3;

import z4.t;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final t.b f15735a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15736b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15737c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15738d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15739e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15740g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15741h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15742i;

    public r0(t.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        x6.b.q(!z13 || z11);
        x6.b.q(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        x6.b.q(z14);
        this.f15735a = bVar;
        this.f15736b = j10;
        this.f15737c = j11;
        this.f15738d = j12;
        this.f15739e = j13;
        this.f = z10;
        this.f15740g = z11;
        this.f15741h = z12;
        this.f15742i = z13;
    }

    public final r0 a(long j10) {
        return j10 == this.f15737c ? this : new r0(this.f15735a, this.f15736b, j10, this.f15738d, this.f15739e, this.f, this.f15740g, this.f15741h, this.f15742i);
    }

    public final r0 b(long j10) {
        return j10 == this.f15736b ? this : new r0(this.f15735a, j10, this.f15737c, this.f15738d, this.f15739e, this.f, this.f15740g, this.f15741h, this.f15742i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f15736b == r0Var.f15736b && this.f15737c == r0Var.f15737c && this.f15738d == r0Var.f15738d && this.f15739e == r0Var.f15739e && this.f == r0Var.f && this.f15740g == r0Var.f15740g && this.f15741h == r0Var.f15741h && this.f15742i == r0Var.f15742i && v5.e0.a(this.f15735a, r0Var.f15735a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f15735a.hashCode() + 527) * 31) + ((int) this.f15736b)) * 31) + ((int) this.f15737c)) * 31) + ((int) this.f15738d)) * 31) + ((int) this.f15739e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f15740g ? 1 : 0)) * 31) + (this.f15741h ? 1 : 0)) * 31) + (this.f15742i ? 1 : 0);
    }
}
