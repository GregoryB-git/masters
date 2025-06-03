package e7;

import android.content.Context;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicLong;
import m6.n;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: d, reason: collision with root package name */
    public static y0 f4771d;

    /* renamed from: e, reason: collision with root package name */
    public static final Duration f4772e = Duration.ofMinutes(30);

    /* renamed from: a, reason: collision with root package name */
    public final j2 f4773a;

    /* renamed from: b, reason: collision with root package name */
    public final o6.c f4774b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f4775c = new AtomicLong(-1);

    public y0(Context context, j2 j2Var) {
        m6.n nVar = m6.n.f10298b;
        n.a aVar = new n.a();
        aVar.f10300a = "measurement:api";
        this.f4774b = new o6.c(context, new m6.n(aVar.f10300a));
        this.f4773a = j2Var;
    }

    public static y0 a(j2 j2Var) {
        if (f4771d == null) {
            f4771d = new y0(j2Var.f4360a, j2Var);
        }
        return f4771d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: all -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x0036, B:16:0x001d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(int r21, int r22, long r23, long r25) {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            e7.j2 r0 = r1.f4773a     // Catch: java.lang.Throwable -> L6b
            b.z r0 = r0.f4371v     // Catch: java.lang.Throwable -> L6b
            r0.getClass()     // Catch: java.lang.Throwable -> L6b
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.atomic.AtomicLong r0 = r1.f4775c     // Catch: java.lang.Throwable -> L6b
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L6b
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L1d
            goto L2f
        L1d:
            java.util.concurrent.atomic.AtomicLong r0 = r1.f4775c     // Catch: java.lang.Throwable -> L6b
            long r6 = r0.get()     // Catch: java.lang.Throwable -> L6b
            long r6 = r2 - r6
            java.time.Duration r0 = e7.y0.f4772e     // Catch: java.lang.Throwable -> L6b
            long r8 = r0.toMillis()     // Catch: java.lang.Throwable -> L6b
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L31
        L2f:
            r0 = r5
            goto L32
        L31:
            r0 = r4
        L32:
            if (r0 != 0) goto L36
            monitor-exit(r20)
            return
        L36:
            o6.c r0 = r1.f4774b     // Catch: java.lang.Throwable -> L6b
            m6.m r6 = new m6.m     // Catch: java.lang.Throwable -> L6b
            m6.g[] r5 = new m6.g[r5]     // Catch: java.lang.Throwable -> L6b
            m6.g r19 = new m6.g     // Catch: java.lang.Throwable -> L6b
            r8 = 36301(0x8dcd, float:5.0869E-41)
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r7 = r19
            r9 = r21
            r11 = r23
            r13 = r25
            r18 = r22
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L6b
            r5[r4] = r19     // Catch: java.lang.Throwable -> L6b
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L6b
            r6.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.tasks.Task r0 = r0.a(r6)     // Catch: java.lang.Throwable -> L6b
            c5.e r4 = new c5.e     // Catch: java.lang.Throwable -> L6b
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6b
            r0.addOnFailureListener(r4)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r20)
            return
        L6b:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.y0.b(int, int, long, long):void");
    }
}
