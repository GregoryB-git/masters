package r5;

import java.util.ArrayList;
import java.util.List;
import o7.t;
import p2.m0;
import r5.h;
import v5.e0;
import v5.z;
import z4.i0;

/* loaded from: classes.dex */
public final class a extends r5.b {

    /* renamed from: g, reason: collision with root package name */
    public final t5.e f13614g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13615h;

    /* renamed from: i, reason: collision with root package name */
    public final long f13616i;

    /* renamed from: j, reason: collision with root package name */
    public final long f13617j;

    /* renamed from: k, reason: collision with root package name */
    public final int f13618k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13619l;

    /* renamed from: m, reason: collision with root package name */
    public final float f13620m;

    /* renamed from: n, reason: collision with root package name */
    public final float f13621n;

    /* renamed from: o, reason: collision with root package name */
    public final t<C0208a> f13622o;

    /* renamed from: p, reason: collision with root package name */
    public final v5.c f13623p;

    /* renamed from: q, reason: collision with root package name */
    public float f13624q;

    /* renamed from: r, reason: collision with root package name */
    public int f13625r;

    /* renamed from: s, reason: collision with root package name */
    public int f13626s;
    public long t;

    /* renamed from: u, reason: collision with root package name */
    public b5.m f13627u;

    /* renamed from: r5.a$a, reason: collision with other inner class name */
    public static final class C0208a {

        /* renamed from: a, reason: collision with root package name */
        public final long f13628a;

        /* renamed from: b, reason: collision with root package name */
        public final long f13629b;

        public C0208a(long j10, long j11) {
            this.f13628a = j10;
            this.f13629b = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0208a)) {
                return false;
            }
            C0208a c0208a = (C0208a) obj;
            return this.f13628a == c0208a.f13628a && this.f13629b == c0208a.f13629b;
        }

        public final int hashCode() {
            return (((int) this.f13628a) * 31) + ((int) this.f13629b);
        }
    }

    public static class b implements h.b {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i0 i0Var, int[] iArr, int i10, t5.e eVar, long j10, long j11, long j12, t tVar) {
        super(i0Var, iArr);
        z zVar = v5.c.f15872a;
        if (j12 < j10) {
            v5.m.f("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f13614g = eVar;
        this.f13615h = j10 * 1000;
        this.f13616i = j11 * 1000;
        this.f13617j = j12 * 1000;
        this.f13618k = 1279;
        this.f13619l = 719;
        this.f13620m = 0.7f;
        this.f13621n = 0.75f;
        this.f13622o = t.p(tVar);
        this.f13623p = zVar;
        this.f13624q = 1.0f;
        this.f13626s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            t.a aVar = (t.a) arrayList.get(i10);
            if (aVar != null) {
                aVar.c(new C0208a(j10, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        b5.m mVar = (b5.m) m0.K(list);
        long j10 = mVar.f1866g;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = mVar.f1867h;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    @Override // r5.b, r5.h
    public final void g() {
        this.f13627u = null;
    }

    @Override // r5.h
    public final int i() {
        return this.f13625r;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    @Override // r5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r9, long r11, java.util.List r13, b5.n[] r14) {
        /*
            r8 = this;
            v5.c r0 = r8.f13623p
            long r0 = r0.d()
            int r2 = r8.f13625r
            int r3 = r14.length
            if (r2 >= r3) goto L20
            r2 = r14[r2]
            boolean r2 = r2.next()
            if (r2 == 0) goto L20
            int r2 = r8.f13625r
            r14 = r14[r2]
            long r2 = r14.b()
            long r4 = r14.a()
            goto L34
        L20:
            int r2 = r14.length
            r3 = 0
        L22:
            if (r3 >= r2) goto L39
            r4 = r14[r3]
            boolean r5 = r4.next()
            if (r5 == 0) goto L36
            long r2 = r4.b()
            long r4 = r4.a()
        L34:
            long r2 = r2 - r4
            goto L3d
        L36:
            int r3 = r3 + 1
            goto L22
        L39:
            long r2 = x(r13)
        L3d:
            int r14 = r8.f13626s
            if (r14 != 0) goto L4b
            r9 = 1
            r8.f13626s = r9
            int r9 = r8.w(r0, r2)
            r8.f13625r = r9
            return
        L4b:
            int r4 = r8.f13625r
            boolean r5 = r13.isEmpty()
            r6 = -1
            if (r5 == 0) goto L56
            r5 = r6
            goto L62
        L56:
            java.lang.Object r5 = p2.m0.K(r13)
            b5.m r5 = (b5.m) r5
            v3.i0 r5 = r5.f1864d
            int r5 = r8.d(r5)
        L62:
            if (r5 == r6) goto L6d
            java.lang.Object r13 = p2.m0.K(r13)
            b5.m r13 = (b5.m) r13
            int r14 = r13.f1865e
            r4 = r5
        L6d:
            int r13 = r8.w(r0, r2)
            boolean r0 = r8.l(r4, r0)
            if (r0 != 0) goto Lad
            v3.i0[] r0 = r8.f13633d
            r1 = r0[r4]
            r0 = r0[r13]
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r7 != 0) goto L89
            long r11 = r8.f13615h
            goto L99
        L89:
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L8e
            long r11 = r11 - r2
        L8e:
            float r11 = (float) r11
            float r12 = r8.f13621n
            float r11 = r11 * r12
            long r11 = (long) r11
            long r2 = r8.f13615h
            long r11 = java.lang.Math.min(r11, r2)
        L99:
            int r0 = r0.f15453p
            int r1 = r1.f15453p
            if (r0 <= r1) goto La4
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto La4
            goto Lac
        La4:
            if (r0 >= r1) goto Lad
            long r11 = r8.f13616i
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 < 0) goto Lad
        Lac:
            r13 = r4
        Lad:
            if (r13 != r4) goto Lb0
            goto Lb1
        Lb0:
            r14 = 3
        Lb1:
            r8.f13626s = r14
            r8.f13625r = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.a.j(long, long, java.util.List, b5.n[]):void");
    }

    @Override // r5.b, r5.h
    public final void m() {
        this.t = -9223372036854775807L;
        this.f13627u = null;
    }

    @Override // r5.b, r5.h
    public final int n(long j10, List<? extends b5.m> list) {
        int i10;
        int i11;
        long d10 = this.f13623p.d();
        long j11 = this.t;
        if (!(j11 == -9223372036854775807L || d10 - j11 >= 1000 || !(list.isEmpty() || ((b5.m) m0.K(list)).equals(this.f13627u)))) {
            return list.size();
        }
        this.t = d10;
        this.f13627u = list.isEmpty() ? null : (b5.m) m0.K(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long x10 = e0.x(list.get(size - 1).f1866g - j10, this.f13624q);
        long j12 = this.f13617j;
        if (x10 < j12) {
            return size;
        }
        v3.i0 i0Var = this.f13633d[w(d10, x(list))];
        for (int i12 = 0; i12 < size; i12++) {
            b5.m mVar = list.get(i12);
            v3.i0 i0Var2 = mVar.f1864d;
            if (e0.x(mVar.f1866g - j10, this.f13624q) >= j12 && i0Var2.f15453p < i0Var.f15453p && (i10 = i0Var2.f15462z) != -1 && i10 <= this.f13619l && (i11 = i0Var2.f15461y) != -1 && i11 <= this.f13618k && i10 < i0Var.f15462z) {
                return i12;
            }
        }
        return size;
    }

    @Override // r5.h
    public final int q() {
        return this.f13626s;
    }

    @Override // r5.b, r5.h
    public final void r(float f) {
        this.f13624q = f;
    }

    @Override // r5.h
    public final Object s() {
        return null;
    }

    public final int w(long j10, long j11) {
        long g10 = (long) (this.f13614g.g() * this.f13620m);
        this.f13614g.c();
        long j12 = (long) (g10 / this.f13624q);
        if (!this.f13622o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.f13622o.size() - 1 && this.f13622o.get(i10).f13628a < j12) {
                i10++;
            }
            C0208a c0208a = this.f13622o.get(i10 - 1);
            C0208a c0208a2 = this.f13622o.get(i10);
            long j13 = c0208a.f13628a;
            long j14 = c0208a.f13629b;
            j12 = ((long) (((j12 - j13) / (c0208a2.f13628a - j13)) * (c0208a2.f13629b - j14))) + j14;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f13631b; i12++) {
            if (j10 == Long.MIN_VALUE || !l(i12, j10)) {
                if (((long) this.f13633d[i12].f15453p) <= j12) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }
}
