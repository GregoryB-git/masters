package n9;

import java.util.Date;
import n9.a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final a f11363a;

    /* renamed from: b, reason: collision with root package name */
    public final a.c f11364b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11365c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11366d;

    /* renamed from: e, reason: collision with root package name */
    public long f11367e;

    /* renamed from: h, reason: collision with root package name */
    public a.C0174a f11369h;

    /* renamed from: g, reason: collision with root package name */
    public long f11368g = new Date().getTime();
    public long f = 0;

    public g(a aVar, a.c cVar, long j10, long j11) {
        this.f11363a = aVar;
        this.f11364b = cVar;
        this.f11365c = j10;
        this.f11366d = j11;
        this.f11367e = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0088, code lost:
    
        if (r0 > r2) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Runnable r11) {
        /*
            r10 = this;
            n9.a$a r0 = r10.f11369h
            if (r0 == 0) goto La
            r0.a()
            r0 = 0
            r10.f11369h = r0
        La:
            long r0 = r10.f
            double r2 = java.lang.Math.random()
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 - r4
            long r4 = r10.f
            double r4 = (double) r4
            double r2 = r2 * r4
            long r2 = (long) r2
            long r0 = r0 + r2
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r2 = r2.getTime()
            long r4 = r10.f11368g
            long r2 = r2 - r4
            r4 = 0
            long r2 = java.lang.Math.max(r4, r2)
            long r6 = r0 - r2
            long r6 = java.lang.Math.max(r4, r6)
            long r8 = r10.f
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 <= 0) goto L63
            java.lang.Class<n9.g> r4 = n9.g.class
            java.lang.String r4 = r4.getSimpleName()
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r8 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            r5[r8] = r9
            long r8 = r10.f
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 1
            r5[r9] = r8
            r8 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5[r8] = r0
            r0 = 3
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r5[r0] = r1
            java.lang.String r0 = "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)"
            p2.m0.y(r9, r4, r0, r5)
        L63:
            n9.a r0 = r10.f11363a
            n9.a$c r1 = r10.f11364b
            x0.f r2 = new x0.f
            r3 = 21
            r2.<init>(r3, r10, r11)
            n9.a$a r11 = r0.b(r1, r6, r2)
            r10.f11369h = r11
            long r0 = r10.f
            double r0 = (double) r0
            r2 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r0 = r0 * r2
            long r0 = (long) r0
            r10.f = r0
            long r2 = r10.f11365c
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 >= 0) goto L84
            goto L8a
        L84:
            long r2 = r10.f11367e
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L8c
        L8a:
            r10.f = r2
        L8c:
            long r0 = r10.f11366d
            r10.f11367e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.g.a(java.lang.Runnable):void");
    }
}
