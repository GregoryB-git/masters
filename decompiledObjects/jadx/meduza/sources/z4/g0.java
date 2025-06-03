package z4;

import android.net.Uri;
import v3.o0;
import v3.r1;

/* loaded from: classes.dex */
public final class g0 extends r1 {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f17644w = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f17645b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17646c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17647d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17648e;
    public final long f;

    /* renamed from: o, reason: collision with root package name */
    public final long f17649o;

    /* renamed from: p, reason: collision with root package name */
    public final long f17650p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f17651q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f17652r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f17653s;
    public final Object t;

    /* renamed from: u, reason: collision with root package name */
    public final o0 f17654u;

    /* renamed from: v, reason: collision with root package name */
    public final o0.e f17655v;

    static {
        o0.a aVar = new o0.a();
        aVar.f15539a = "SinglePeriodTimeline";
        aVar.f15540b = Uri.EMPTY;
        aVar.a();
    }

    public g0(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, Object obj, o0 o0Var, o0.e eVar) {
        this.f17645b = j10;
        this.f17646c = j11;
        this.f17647d = -9223372036854775807L;
        this.f17648e = j12;
        this.f = j13;
        this.f17649o = j14;
        this.f17650p = j15;
        this.f17651q = z10;
        this.f17652r = z11;
        this.f17653s = z12;
        this.t = obj;
        o0Var.getClass();
        this.f17654u = o0Var;
        this.f17655v = eVar;
    }

    public g0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, g5.a aVar, o0 o0Var) {
        this(-9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, aVar, o0Var, z12 ? o0Var.f15536c : null);
    }

    public g0(long j10, boolean z10, boolean z11, o0 o0Var) {
        this(j10, j10, 0L, 0L, z10, false, z11, null, o0Var);
    }

    @Override // v3.r1
    public final int b(Object obj) {
        return f17644w.equals(obj) ? 0 : -1;
    }

    @Override // v3.r1
    public final r1.b f(int i10, r1.b bVar, boolean z10) {
        x6.b.x(i10, 1);
        Object obj = z10 ? f17644w : null;
        long j10 = this.f17648e;
        long j11 = -this.f17649o;
        bVar.getClass();
        bVar.h(null, obj, 0, j10, j11, a5.a.f208o, false);
        return bVar;
    }

    @Override // v3.r1
    public final int h() {
        return 1;
    }

    @Override // v3.r1
    public final Object l(int i10) {
        x6.b.x(i10, 1);
        return f17644w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 > r5) goto L13;
     */
    @Override // v3.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v3.r1.c n(int r25, v3.r1.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            x6.b.x(r2, r1)
            long r1 = r0.f17650p
            boolean r14 = r0.f17652r
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2d
            boolean r5 = r0.f17653s
            if (r5 != 0) goto L2d
            r5 = 0
            int r5 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r5 == 0) goto L2d
            long r5 = r0.f
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L24
            goto L2a
        L24:
            long r1 = r1 + r27
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2d
        L2a:
            r16 = r3
            goto L2f
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = v3.r1.c.f15754z
            v3.o0 r5 = r0.f17654u
            java.lang.Object r6 = r0.t
            long r7 = r0.f17645b
            long r9 = r0.f17646c
            long r11 = r0.f17647d
            boolean r13 = r0.f17651q
            v3.o0$e r15 = r0.f17655v
            long r1 = r0.f
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f17649o
            r22 = r1
            r3 = r26
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.g0.n(int, v3.r1$c, long):v3.r1$c");
    }

    @Override // v3.r1
    public final int o() {
        return 1;
    }
}
