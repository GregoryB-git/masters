package v3;

import o7.t;
import v3.r1;
import z4.t;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final r1.b f15772a = new r1.b();

    /* renamed from: b, reason: collision with root package name */
    public final r1.c f15773b = new r1.c();

    /* renamed from: c, reason: collision with root package name */
    public final w3.a f15774c;

    /* renamed from: d, reason: collision with root package name */
    public final v5.k f15775d;

    /* renamed from: e, reason: collision with root package name */
    public long f15776e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15777g;

    /* renamed from: h, reason: collision with root package name */
    public q0 f15778h;

    /* renamed from: i, reason: collision with root package name */
    public q0 f15779i;

    /* renamed from: j, reason: collision with root package name */
    public q0 f15780j;

    /* renamed from: k, reason: collision with root package name */
    public int f15781k;

    /* renamed from: l, reason: collision with root package name */
    public Object f15782l;

    /* renamed from: m, reason: collision with root package name */
    public long f15783m;

    public s0(w3.a aVar, v5.k kVar) {
        this.f15774c = aVar;
        this.f15775d = kVar;
    }

    public static t.b m(r1 r1Var, Object obj, long j10, long j11, r1.c cVar, r1.b bVar) {
        r1Var.g(obj, bVar);
        r1Var.m(bVar.f15750c, cVar);
        int b10 = r1Var.b(obj);
        Object obj2 = obj;
        while (bVar.f15751d == 0) {
            a5.a aVar = bVar.f15753o;
            if (aVar.f215b <= 0 || !bVar.g(aVar.f218e) || bVar.c(0L) != -1) {
                break;
            }
            int i10 = b10 + 1;
            if (b10 >= cVar.f15768x) {
                break;
            }
            r1Var.f(i10, bVar, true);
            obj2 = bVar.f15749b;
            obj2.getClass();
            b10 = i10;
        }
        r1Var.g(obj2, bVar);
        int c10 = bVar.c(j10);
        return c10 == -1 ? new t.b(obj2, bVar.b(j10), j11) : new t.b(obj2, c10, bVar.f(c10), j11);
    }

    public final q0 a() {
        q0 q0Var = this.f15778h;
        if (q0Var == null) {
            return null;
        }
        if (q0Var == this.f15779i) {
            this.f15779i = q0Var.f15709l;
        }
        q0Var.f();
        int i10 = this.f15781k - 1;
        this.f15781k = i10;
        if (i10 == 0) {
            this.f15780j = null;
            q0 q0Var2 = this.f15778h;
            this.f15782l = q0Var2.f15700b;
            this.f15783m = q0Var2.f.f15735a.f17728d;
        }
        this.f15778h = this.f15778h.f15709l;
        k();
        return this.f15778h;
    }

    public final void b() {
        if (this.f15781k == 0) {
            return;
        }
        q0 q0Var = this.f15778h;
        x6.b.K(q0Var);
        this.f15782l = q0Var.f15700b;
        this.f15783m = q0Var.f.f15735a.f17728d;
        while (q0Var != null) {
            q0Var.f();
            q0Var = q0Var.f15709l;
        }
        this.f15778h = null;
        this.f15780j = null;
        this.f15779i = null;
        this.f15781k = 0;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        if (r0.g(r0.f15753o.f218e) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v3.r0 c(v3.r1 r21, v3.q0 r22, long r23) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.s0.c(v3.r1, v3.q0, long):v3.r0");
    }

    public final r0 d(r1 r1Var, t.b bVar, long j10, long j11) {
        r1Var.g(bVar.f17725a, this.f15772a);
        boolean a10 = bVar.a();
        Object obj = bVar.f17725a;
        return a10 ? e(r1Var, obj, bVar.f17726b, bVar.f17727c, j10, bVar.f17728d) : f(r1Var, obj, j11, j10, bVar.f17728d);
    }

    public final r0 e(r1 r1Var, Object obj, int i10, int i11, long j10, long j11) {
        t.b bVar = new t.b(obj, i10, i11, j11);
        long a10 = r1Var.g(obj, this.f15772a).a(i10, i11);
        long j12 = i11 == this.f15772a.f(i10) ? this.f15772a.f15753o.f216c : 0L;
        return new r0(bVar, (a10 == -9223372036854775807L || j12 < a10) ? j12 : Math.max(0L, a10 - 1), j10, -9223372036854775807L, a10, this.f15772a.g(i10), false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r6.g(r10.f218e) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v3.r0 f(v3.r1 r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.s0.f(v3.r1, java.lang.Object, long, long, long):v3.r0");
    }

    public final long g(r1 r1Var, Object obj, int i10) {
        r1Var.g(obj, this.f15772a);
        long d10 = this.f15772a.d(i10);
        return d10 == Long.MIN_VALUE ? this.f15772a.f15751d : d10 + this.f15772a.f15753o.a(i10).f232o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v3.r0 h(v3.r1 r20, v3.r0 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            z4.t$b r3 = r2.f15735a
            boolean r4 = r3.a()
            r5 = 1
            r6 = -1
            r7 = 0
            if (r4 != 0) goto L17
            int r4 = r3.f17729e
            if (r4 != r6) goto L17
            r12 = r5
            goto L18
        L17:
            r12 = r7
        L18:
            boolean r13 = r0.j(r1, r3)
            boolean r14 = r0.i(r1, r3, r12)
            z4.t$b r4 = r2.f15735a
            java.lang.Object r4 = r4.f17725a
            v3.r1$b r8 = r0.f15772a
            r1.g(r4, r8)
            boolean r1 = r3.a()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L40
            int r1 = r3.f17729e
            if (r1 != r6) goto L39
            goto L40
        L39:
            v3.r1$b r4 = r0.f15772a
            long r10 = r4.d(r1)
            goto L41
        L40:
            r10 = r8
        L41:
            boolean r1 = r3.a()
            if (r1 == 0) goto L52
            v3.r1$b r1 = r0.f15772a
            int r4 = r3.f17726b
            int r8 = r3.f17727c
            long r8 = r1.a(r4, r8)
            goto L63
        L52:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L5f
            r8 = -9223372036854775808
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L5d
            goto L5f
        L5d:
            r15 = r10
            goto L64
        L5f:
            v3.r1$b r1 = r0.f15772a
            long r8 = r1.f15751d
        L63:
            r15 = r8
        L64:
            boolean r1 = r3.a()
            if (r1 == 0) goto L75
            v3.r1$b r1 = r0.f15772a
            int r4 = r3.f17726b
            boolean r1 = r1.g(r4)
            r17 = r1
            goto L86
        L75:
            int r1 = r3.f17729e
            if (r1 == r6) goto L84
            v3.r1$b r4 = r0.f15772a
            boolean r1 = r4.g(r1)
            if (r1 == 0) goto L84
            r17 = r5
            goto L86
        L84:
            r17 = r7
        L86:
            v3.r0 r18 = new v3.r0
            long r4 = r2.f15736b
            long r6 = r2.f15737c
            r1 = r18
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r10
            r9 = r15
            r11 = r17
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.s0.h(v3.r1, v3.r0):v3.r0");
    }

    public final boolean i(r1 r1Var, t.b bVar, boolean z10) {
        int b10 = r1Var.b(bVar.f17725a);
        if (r1Var.m(r1Var.f(b10, this.f15772a, false).f15750c, this.f15773b).f15762q) {
            return false;
        }
        return (r1Var.d(b10, this.f15772a, this.f15773b, this.f, this.f15777g) == -1) && z10;
    }

    public final boolean j(r1 r1Var, t.b bVar) {
        if (!bVar.a() && bVar.f17729e == -1) {
            return r1Var.m(r1Var.g(bVar.f17725a, this.f15772a).f15750c, this.f15773b).f15768x == r1Var.b(bVar.f17725a);
        }
        return false;
    }

    public final void k() {
        t.b bVar = o7.t.f12050b;
        t.a aVar = new t.a();
        for (q0 q0Var = this.f15778h; q0Var != null; q0Var = q0Var.f15709l) {
            aVar.c(q0Var.f.f15735a);
        }
        q0 q0Var2 = this.f15779i;
        this.f15775d.e(new x0.g(this, aVar, q0Var2 == null ? null : q0Var2.f.f15735a, 2));
    }

    public final boolean l(q0 q0Var) {
        boolean z10 = false;
        x6.b.H(q0Var != null);
        if (q0Var.equals(this.f15780j)) {
            return false;
        }
        this.f15780j = q0Var;
        while (true) {
            q0Var = q0Var.f15709l;
            if (q0Var == null) {
                break;
            }
            if (q0Var == this.f15779i) {
                this.f15779i = this.f15778h;
                z10 = true;
            }
            q0Var.f();
            this.f15781k--;
        }
        q0 q0Var2 = this.f15780j;
        if (q0Var2.f15709l != null) {
            q0Var2.b();
            q0Var2.f15709l = null;
            q0Var2.c();
        }
        k();
        return z10;
    }

    public final t.b n(r1 r1Var, Object obj, long j10) {
        long j11;
        int b10;
        Object obj2 = obj;
        int i10 = r1Var.g(obj, this.f15772a).f15750c;
        Object obj3 = this.f15782l;
        if (obj3 == null || (b10 = r1Var.b(obj3)) == -1 || r1Var.f(b10, this.f15772a, false).f15750c != i10) {
            q0 q0Var = this.f15778h;
            while (true) {
                if (q0Var == null) {
                    q0Var = this.f15778h;
                    while (q0Var != null) {
                        int b11 = r1Var.b(q0Var.f15700b);
                        if (b11 == -1 || r1Var.f(b11, this.f15772a, false).f15750c != i10) {
                            q0Var = q0Var.f15709l;
                        }
                    }
                    j11 = this.f15776e;
                    this.f15776e = 1 + j11;
                    if (this.f15778h == null) {
                        this.f15782l = obj2;
                        this.f15783m = j11;
                    }
                } else {
                    if (q0Var.f15700b.equals(obj)) {
                        break;
                    }
                    q0Var = q0Var.f15709l;
                }
            }
            j11 = q0Var.f.f15735a.f17728d;
        } else {
            j11 = this.f15783m;
        }
        long j12 = j11;
        r1Var.g(obj, this.f15772a);
        r1Var.m(this.f15772a.f15750c, this.f15773b);
        boolean z10 = false;
        for (int b12 = r1Var.b(obj); b12 >= this.f15773b.f15767w; b12--) {
            r1Var.f(b12, this.f15772a, true);
            r1.b bVar = this.f15772a;
            boolean z11 = bVar.f15753o.f215b > 0;
            z10 |= z11;
            if (bVar.c(bVar.f15751d) != -1) {
                obj2 = this.f15772a.f15749b;
                obj2.getClass();
            }
            if (z10 && (!z11 || this.f15772a.f15751d != 0)) {
                break;
            }
        }
        return m(r1Var, obj2, j10, j12, this.f15773b, this.f15772a);
    }

    public final boolean o(r1 r1Var) {
        q0 q0Var;
        q0 q0Var2 = this.f15778h;
        if (q0Var2 == null) {
            return true;
        }
        int b10 = r1Var.b(q0Var2.f15700b);
        while (true) {
            b10 = r1Var.d(b10, this.f15772a, this.f15773b, this.f, this.f15777g);
            while (true) {
                q0Var = q0Var2.f15709l;
                if (q0Var == null || q0Var2.f.f15740g) {
                    break;
                }
                q0Var2 = q0Var;
            }
            if (b10 == -1 || q0Var == null || r1Var.b(q0Var.f15700b) != b10) {
                break;
            }
            q0Var2 = q0Var;
        }
        boolean l10 = l(q0Var2);
        q0Var2.f = h(r1Var, q0Var2.f);
        return !l10;
    }

    public final boolean p(r1 r1Var, long j10, long j11) {
        boolean l10;
        r0 r0Var;
        q0 q0Var = this.f15778h;
        q0 q0Var2 = null;
        while (q0Var != null) {
            r0 r0Var2 = q0Var.f;
            if (q0Var2 != null) {
                r0 c10 = c(r1Var, q0Var2, j10);
                if (c10 == null) {
                    l10 = l(q0Var2);
                } else {
                    if (r0Var2.f15736b == c10.f15736b && r0Var2.f15735a.equals(c10.f15735a)) {
                        r0Var = c10;
                    } else {
                        l10 = l(q0Var2);
                    }
                }
                return !l10;
            }
            r0Var = h(r1Var, r0Var2);
            q0Var.f = r0Var.a(r0Var2.f15737c);
            long j12 = r0Var2.f15739e;
            if (!(j12 == -9223372036854775807L || j12 == r0Var.f15739e)) {
                q0Var.h();
                long j13 = r0Var.f15739e;
                return (l(q0Var) || (q0Var == this.f15779i && !q0Var.f.f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : j13 + q0Var.f15712o) ? 1 : (j11 == ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : j13 + q0Var.f15712o) ? 0 : -1)) >= 0))) ? false : true;
            }
            q0Var2 = q0Var;
            q0Var = q0Var.f15709l;
        }
        return true;
    }
}
