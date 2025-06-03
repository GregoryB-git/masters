package c1;

import X2.AbstractC0703v;
import X2.P;
import g0.AbstractC1297a;
import g0.M;

/* loaded from: classes.dex */
public final class g implements k {

    /* renamed from: q, reason: collision with root package name */
    public static final P f10023q = P.d().f(new W2.g() { // from class: c1.f
        @Override // W2.g
        public final Object apply(Object obj) {
            Comparable d7;
            d7 = g.d((C0816e) obj);
            return d7;
        }
    });

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC0703v f10024o;

    /* renamed from: p, reason: collision with root package name */
    public final long[] f10025p;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(java.util.List r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r17.<init>()
            int r3 = r18.size()
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r4) goto L4c
            java.lang.Object r3 = X2.B.g(r18)
            c1.e r3 = (c1.C0816e) r3
            long r7 = r3.f10020b
            long r7 = f(r7)
            long r9 = r3.f10021c
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L34
            X2.v r1 = r3.f10019a
            X2.v r1 = X2.AbstractC0703v.Z(r1)
            r0.f10024o = r1
            long[] r1 = new long[r4]
            r1[r2] = r7
            r0.f10025p = r1
            goto L4b
        L34:
            X2.v r5 = r3.f10019a
            X2.v r6 = X2.AbstractC0703v.Y()
            X2.v r5 = X2.AbstractC0703v.a0(r5, r6)
            r0.f10024o = r5
            long r5 = r3.f10021c
            long r5 = r5 + r7
            long[] r1 = new long[r1]
            r1[r2] = r7
            r1[r4] = r5
            r0.f10025p = r1
        L4b:
            return
        L4c:
            int r3 = r18.size()
            int r3 = r3 * r1
            long[] r1 = new long[r3]
            r0.f10025p = r1
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X2.P r3 = c1.g.f10023q
            r7 = r18
            X2.v r3 = X2.AbstractC0703v.g0(r3, r7)
            r7 = r2
        L6b:
            int r8 = r3.size()
            if (r2 >= r8) goto Ld1
            java.lang.Object r8 = r3.get(r2)
            c1.e r8 = (c1.C0816e) r8
            long r9 = r8.f10020b
            long r9 = f(r9)
            long r11 = r8.f10021c
            long r11 = r11 + r9
            if (r7 == 0) goto Laf
            long[] r13 = r0.f10025p
            int r14 = r7 + (-1)
            r15 = r13[r14]
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 >= 0) goto L8d
            goto Laf
        L8d:
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 != 0) goto La3
            java.lang.Object r13 = r1.get(r14)
            X2.v r13 = (X2.AbstractC0703v) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto La3
        L9d:
            X2.v r9 = r8.f10019a
            r1.set(r14, r9)
            goto Lbb
        La3:
            java.lang.String r13 = "CuesWithTimingSubtitle"
            java.lang.String r15 = "Truncating unsupported overlapping cues."
            g0.o.h(r13, r15)
            long[] r13 = r0.f10025p
            r13[r14] = r9
            goto L9d
        Laf:
            long[] r13 = r0.f10025p
            int r14 = r7 + 1
            r13[r7] = r9
            X2.v r7 = r8.f10019a
            r1.add(r7)
            r7 = r14
        Lbb:
            long r8 = r8.f10021c
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto Lcf
            long[] r8 = r0.f10025p
            int r9 = r7 + 1
            r8[r7] = r11
            X2.v r7 = X2.AbstractC0703v.Y()
            r1.add(r7)
            r7 = r9
        Lcf:
            int r2 = r2 + r4
            goto L6b
        Ld1:
            X2.v r1 = X2.AbstractC0703v.U(r1)
            r0.f10024o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.g.<init>(java.util.List):void");
    }

    public static /* synthetic */ Comparable d(C0816e c0816e) {
        return Long.valueOf(f(c0816e.f10020b));
    }

    public static long f(long j7) {
        if (j7 == -9223372036854775807L) {
            return 0L;
        }
        return j7;
    }

    @Override // c1.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0703v h(long j7) {
        int h7 = M.h(this.f10025p, j7, true, false);
        return h7 == -1 ? AbstractC0703v.Y() : (AbstractC0703v) this.f10024o.get(h7);
    }

    @Override // c1.k
    public int c(long j7) {
        int d7 = M.d(this.f10025p, j7, false, false);
        if (d7 < this.f10024o.size()) {
            return d7;
        }
        return -1;
    }

    @Override // c1.k
    public long e(int i7) {
        AbstractC1297a.a(i7 < this.f10024o.size());
        return this.f10025p[i7];
    }

    @Override // c1.k
    public int j() {
        return this.f10024o.size();
    }
}
