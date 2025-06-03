package z4;

import java.io.IOException;
import java.util.ArrayList;
import v3.r1;
import z4.t;

/* loaded from: classes.dex */
public final class d extends l0 {
    public long A;
    public long B;
    public final long t;

    /* renamed from: u, reason: collision with root package name */
    public final long f17609u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f17610v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList<c> f17611w;

    /* renamed from: x, reason: collision with root package name */
    public final r1.c f17612x;

    /* renamed from: y, reason: collision with root package name */
    public a f17613y;

    /* renamed from: z, reason: collision with root package name */
    public b f17614z;

    public static final class a extends l {

        /* renamed from: c, reason: collision with root package name */
        public final long f17615c;

        /* renamed from: d, reason: collision with root package name */
        public final long f17616d;

        /* renamed from: e, reason: collision with root package name */
        public final long f17617e;
        public final boolean f;

        public a(r1 r1Var, long j10, long j11) {
            super(r1Var);
            boolean z10 = false;
            if (r1Var.h() != 1) {
                throw new b(0);
            }
            r1.c m10 = r1Var.m(0, new r1.c());
            long max = Math.max(0L, j10);
            if (!m10.t && max != 0 && !m10.f15761p) {
                throw new b(1);
            }
            long max2 = j11 == Long.MIN_VALUE ? m10.f15766v : Math.max(0L, j11);
            long j12 = m10.f15766v;
            if (j12 != -9223372036854775807L) {
                max2 = max2 > j12 ? j12 : max2;
                if (max > max2) {
                    throw new b(2);
                }
            }
            this.f17615c = max;
            this.f17616d = max2;
            this.f17617e = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
            if (m10.f15762q && (max2 == -9223372036854775807L || (j12 != -9223372036854775807L && max2 == j12))) {
                z10 = true;
            }
            this.f = z10;
        }

        @Override // v3.r1
        public final r1.b f(int i10, r1.b bVar, boolean z10) {
            this.f17694b.f(0, bVar, z10);
            long j10 = bVar.f15752e - this.f17615c;
            long j11 = this.f17617e;
            bVar.h(bVar.f15748a, bVar.f15749b, 0, j11 == -9223372036854775807L ? -9223372036854775807L : j11 - j10, j10, a5.a.f208o, false);
            return bVar;
        }

        @Override // v3.r1
        public final r1.c n(int i10, r1.c cVar, long j10) {
            this.f17694b.n(0, cVar, 0L);
            long j11 = cVar.f15769y;
            long j12 = this.f17615c;
            cVar.f15769y = j11 + j12;
            cVar.f15766v = this.f17617e;
            cVar.f15762q = this.f;
            long j13 = cVar.f15765u;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                cVar.f15765u = max;
                long j14 = this.f17616d;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                cVar.f15765u = max - this.f17615c;
            }
            long R = v5.e0.R(this.f17615c);
            long j15 = cVar.f15759e;
            if (j15 != -9223372036854775807L) {
                cVar.f15759e = j15 + R;
            }
            long j16 = cVar.f;
            if (j16 != -9223372036854775807L) {
                cVar.f = j16 + R;
            }
            return cVar;
        }
    }

    public static final class b extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Illegal clipping: "
                java.lang.StringBuilder r0 = defpackage.f.l(r0)
                if (r3 == 0) goto L17
                r1 = 1
                if (r3 == r1) goto L14
                r1 = 2
                if (r3 == r1) goto L11
                java.lang.String r3 = "unknown"
                goto L19
            L11:
                java.lang.String r3 = "start exceeds end"
                goto L19
            L14:
                java.lang.String r3 = "not seekable to start"
                goto L19
            L17:
                java.lang.String r3 = "invalid period count"
            L19:
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z4.d.b.<init>(int):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, long j10, long j11) {
        super(tVar);
        tVar.getClass();
        x6.b.q(j10 >= 0);
        this.t = j10;
        this.f17609u = j11;
        this.f17610v = true;
        this.f17611w = new ArrayList<>();
        this.f17612x = new r1.c();
    }

    @Override // z4.l0
    public final void D(r1 r1Var) {
        if (this.f17614z != null) {
            return;
        }
        F(r1Var);
    }

    public final void F(r1 r1Var) {
        long j10;
        long j11;
        r1Var.m(0, this.f17612x);
        long j12 = this.f17612x.f15769y;
        if (this.f17613y == null || this.f17611w.isEmpty()) {
            long j13 = this.t;
            long j14 = this.f17609u;
            this.A = j12 + j13;
            this.B = j14 != Long.MIN_VALUE ? j12 + j14 : Long.MIN_VALUE;
            int size = this.f17611w.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = this.f17611w.get(i10);
                long j15 = this.A;
                long j16 = this.B;
                cVar.f17604e = j15;
                cVar.f = j16;
            }
            j10 = j13;
            j11 = j14;
        } else {
            long j17 = this.A - j12;
            j11 = this.f17609u != Long.MIN_VALUE ? this.B - j12 : Long.MIN_VALUE;
            j10 = j17;
        }
        try {
            a aVar = new a(r1Var, j10, j11);
            this.f17613y = aVar;
            v(aVar);
        } catch (b e10) {
            this.f17614z = e10;
            for (int i11 = 0; i11 < this.f17611w.size(); i11++) {
                this.f17611w.get(i11).f17605o = this.f17614z;
            }
        }
    }

    @Override // z4.t
    public final void g(r rVar) {
        x6.b.H(this.f17611w.remove(rVar));
        this.f17695s.g(((c) rVar).f17600a);
        if (this.f17611w.isEmpty()) {
            a aVar = this.f17613y;
            aVar.getClass();
            F(aVar.f17694b);
        }
    }

    @Override // z4.f, z4.t
    public final void h() {
        b bVar = this.f17614z;
        if (bVar != null) {
            throw bVar;
        }
        super.h();
    }

    @Override // z4.t
    public final r o(t.b bVar, t5.b bVar2, long j10) {
        c cVar = new c(this.f17695s.o(bVar, bVar2, j10), this.f17610v, this.A, this.B);
        this.f17611w.add(cVar);
        return cVar;
    }

    @Override // z4.f, z4.a
    public final void w() {
        super.w();
        this.f17614z = null;
        this.f17613y = null;
    }
}
