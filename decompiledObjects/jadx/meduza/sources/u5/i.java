package u5;

import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f15023a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15024b;

    /* renamed from: c, reason: collision with root package name */
    public final TreeSet<r> f15025c = new TreeSet<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<a> f15026d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public m f15027e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f15028a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15029b;

        public a(long j10, long j11) {
            this.f15028a = j10;
            this.f15029b = j11;
        }
    }

    public i(int i10, String str, m mVar) {
        this.f15023a = i10;
        this.f15024b = str;
        this.f15027e = mVar;
    }

    public final long a(long j10, long j11) {
        x6.b.q(j10 >= 0);
        x6.b.q(j11 >= 0);
        r b10 = b(j10, j11);
        if (!b10.f15012d) {
            long j12 = b10.f15011c;
            return -Math.min(j12 == -1 ? Long.MAX_VALUE : j12, j11);
        }
        long j13 = j10 + j11;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long j15 = b10.f15010b + b10.f15011c;
        if (j15 < j14) {
            for (r rVar : this.f15025c.tailSet(b10, false)) {
                long j16 = rVar.f15010b;
                if (j16 > j15) {
                    break;
                }
                j15 = Math.max(j15, j16 + rVar.f15011c);
                if (j15 >= j14) {
                    break;
                }
            }
        }
        return Math.min(j15 - j10, j11);
    }

    public final r b(long j10, long j11) {
        long j12;
        r rVar = new r(this.f15024b, j10, -1L, -9223372036854775807L, null);
        r floor = this.f15025c.floor(rVar);
        if (floor != null && floor.f15010b + floor.f15011c > j10) {
            return floor;
        }
        r ceiling = this.f15025c.ceiling(rVar);
        if (ceiling != null) {
            long j13 = ceiling.f15010b - j10;
            if (j11 == -1) {
                j12 = j13;
                return new r(this.f15024b, j10, j12, -9223372036854775807L, null);
            }
            j11 = Math.min(j13, j11);
        }
        j12 = j11;
        return new r(this.f15024b, j10, j12, -9223372036854775807L, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if ((r12 + r14) <= (r5 + r3)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r12 >= r2.f15028a) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(long r12, long r14) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList<u5.i$a> r2 = r11.f15026d
            int r2 = r2.size()
            if (r1 >= r2) goto L3e
            java.util.ArrayList<u5.i$a> r2 = r11.f15026d
            java.lang.Object r2 = r2.get(r1)
            u5.i$a r2 = (u5.i.a) r2
            long r3 = r2.f15029b
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 1
            if (r7 != 0) goto L25
            long r2 = r2.f15028a
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 < 0) goto L23
        L21:
            r2 = r8
            goto L38
        L23:
            r2 = r0
            goto L38
        L25:
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 != 0) goto L2a
            goto L23
        L2a:
            long r5 = r2.f15028a
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 > 0) goto L23
            long r9 = r12 + r14
            long r5 = r5 + r3
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 > 0) goto L23
            goto L21
        L38:
            if (r2 == 0) goto L3b
            return r8
        L3b:
            int r1 = r1 + 1
            goto L2
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.i.c(long, long):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f15023a == iVar.f15023a && this.f15024b.equals(iVar.f15024b) && this.f15025c.equals(iVar.f15025c) && this.f15027e.equals(iVar.f15027e);
    }

    public final int hashCode() {
        return this.f15027e.hashCode() + a0.j.e(this.f15024b, this.f15023a * 31, 31);
    }
}
