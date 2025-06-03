package x0;

import android.net.Uri;
import d0.AbstractC1170I;
import d0.C1198u;
import g0.AbstractC1297a;

/* loaded from: classes.dex */
public final class V extends AbstractC1170I {

    /* renamed from: r, reason: collision with root package name */
    public static final Object f20681r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static final C1198u f20682s = new C1198u.c().b("SinglePeriodTimeline").e(Uri.EMPTY).a();

    /* renamed from: e, reason: collision with root package name */
    public final long f20683e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20684f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20685g;

    /* renamed from: h, reason: collision with root package name */
    public final long f20686h;

    /* renamed from: i, reason: collision with root package name */
    public final long f20687i;

    /* renamed from: j, reason: collision with root package name */
    public final long f20688j;

    /* renamed from: k, reason: collision with root package name */
    public final long f20689k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f20690l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f20691m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f20692n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f20693o;

    /* renamed from: p, reason: collision with root package name */
    public final C1198u f20694p;

    /* renamed from: q, reason: collision with root package name */
    public final C1198u.g f20695q;

    public V(long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z7, boolean z8, boolean z9, Object obj, C1198u c1198u, C1198u.g gVar) {
        this.f20683e = j7;
        this.f20684f = j8;
        this.f20685g = j9;
        this.f20686h = j10;
        this.f20687i = j11;
        this.f20688j = j12;
        this.f20689k = j13;
        this.f20690l = z7;
        this.f20691m = z8;
        this.f20692n = z9;
        this.f20693o = obj;
        this.f20694p = (C1198u) AbstractC1297a.e(c1198u);
        this.f20695q = gVar;
    }

    @Override // d0.AbstractC1170I
    public int b(Object obj) {
        return f20681r.equals(obj) ? 0 : -1;
    }

    @Override // d0.AbstractC1170I
    public AbstractC1170I.b g(int i7, AbstractC1170I.b bVar, boolean z7) {
        AbstractC1297a.c(i7, 0, 1);
        return bVar.s(null, z7 ? f20681r : null, 0, this.f20686h, -this.f20688j);
    }

    @Override // d0.AbstractC1170I
    public int i() {
        return 1;
    }

    @Override // d0.AbstractC1170I
    public Object m(int i7) {
        AbstractC1297a.c(i7, 0, 1);
        return f20681r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // d0.AbstractC1170I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d0.AbstractC1170I.c o(int r25, d0.AbstractC1170I.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            g0.AbstractC1297a.c(r3, r1, r2)
            long r1 = r0.f20689k
            boolean r14 = r0.f20691m
            if (r14 == 0) goto L2e
            boolean r3 = r0.f20692n
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f20687i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = d0.AbstractC1170I.c.f12410q
            d0.u r5 = r0.f20694p
            java.lang.Object r6 = r0.f20693o
            long r7 = r0.f20683e
            long r9 = r0.f20684f
            long r11 = r0.f20685g
            boolean r13 = r0.f20690l
            d0.u$g r15 = r0.f20695q
            long r1 = r0.f20687i
            r18 = r1
            r21 = 0
            long r1 = r0.f20688j
            r22 = r1
            r20 = 0
            r3 = r26
            d0.I$c r1 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.V.o(int, d0.I$c, long):d0.I$c");
    }

    @Override // d0.AbstractC1170I
    public int p() {
        return 1;
    }

    public V(long j7, long j8, long j9, long j10, boolean z7, boolean z8, boolean z9, Object obj, C1198u c1198u) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j7, j8, j9, j10, z7, z8, false, obj, c1198u, z9 ? c1198u.f12802d : null);
    }

    public V(long j7, boolean z7, boolean z8, boolean z9, Object obj, C1198u c1198u) {
        this(j7, j7, 0L, 0L, z7, z8, z9, obj, c1198u);
    }
}
