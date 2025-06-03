package y6;

import u6.F;
import u6.I;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21542a;

    /* renamed from: b, reason: collision with root package name */
    public static final F f21543b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f21544c;

    /* renamed from: d, reason: collision with root package name */
    public static final F f21545d;

    /* renamed from: e, reason: collision with root package name */
    public static final F f21546e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f21547f;

    static {
        int e7;
        int e8;
        e7 = I.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f21542a = e7;
        f21543b = new F("PERMIT");
        f21544c = new F("TAKEN");
        f21545d = new F("BROKEN");
        f21546e = new F("CANCELLED");
        e8 = I.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f21547f = e8;
    }

    public static final f h(long j7, f fVar) {
        return new f(j7, fVar, 0);
    }
}
