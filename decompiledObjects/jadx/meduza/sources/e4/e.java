package e4;

import c4.t;
import c4.u;
import c4.v;
import v5.e0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final v f3918a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3919b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3920c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3921d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3922e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f3923g;

    /* renamed from: h, reason: collision with root package name */
    public int f3924h;

    /* renamed from: i, reason: collision with root package name */
    public int f3925i;

    /* renamed from: j, reason: collision with root package name */
    public int f3926j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f3927k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f3928l;

    public e(int i10, int i11, long j10, int i12, v vVar) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        x6.b.q(z10);
        this.f3921d = j10;
        this.f3922e = i12;
        this.f3918a = vVar;
        int i13 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f3919b = (i11 == 2 ? 1667497984 : 1651965952) | i13;
        this.f3920c = i11 == 2 ? i13 | 1650720768 : -1;
        this.f3927k = new long[512];
        this.f3928l = new int[512];
    }

    public final u a(int i10) {
        return new u(((this.f3921d * 1) / this.f3922e) * this.f3928l[i10], this.f3927k[i10]);
    }

    public final t.a b(long j10) {
        int i10 = (int) (j10 / ((this.f3921d * 1) / this.f3922e));
        int e10 = e0.e(this.f3928l, i10, true, true);
        if (this.f3928l[e10] == i10) {
            u a10 = a(e10);
            return new t.a(a10, a10);
        }
        u a11 = a(e10);
        int i11 = e10 + 1;
        return i11 < this.f3927k.length ? new t.a(a11, a(i11)) : new t.a(a11, a11);
    }
}
