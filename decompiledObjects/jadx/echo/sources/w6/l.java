package w6;

import java.util.concurrent.TimeUnit;
import u6.G;
import u6.I;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20489a = G.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f20490b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20491c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20492d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f20493e;

    /* renamed from: f, reason: collision with root package name */
    public static g f20494f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f20495g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f20496h;

    static {
        long f7;
        int a7;
        int e7;
        int e8;
        long f8;
        f7 = I.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f20490b = f7;
        a7 = l6.f.a(G.a(), 2);
        e7 = I.e("kotlinx.coroutines.scheduler.core.pool.size", a7, 1, 0, 8, null);
        f20491c = e7;
        e8 = I.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f20492d = e8;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f8 = I.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f20493e = timeUnit.toNanos(f8);
        f20494f = e.f20479a;
        f20495g = new j(0);
        f20496h = new j(1);
    }
}
