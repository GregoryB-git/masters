package tc;

import java.util.concurrent.TimeUnit;
import sc.v;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14768a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f14769b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14770c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14771d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f14772e;
    public static e f;

    /* renamed from: g, reason: collision with root package name */
    public static final s8.b f14773g;

    /* renamed from: h, reason: collision with root package name */
    public static final s8.b f14774h;

    static {
        String str;
        int i10 = v.f14369a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f14768a = str;
        f14769b = x6.b.v0("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f14369a;
        if (i11 < 2) {
            i11 = 2;
        }
        f14770c = x6.b.w0("kotlinx.coroutines.scheduler.core.pool.size", i11, 1, 0, 8);
        f14771d = x6.b.w0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f14772e = TimeUnit.SECONDS.toNanos(x6.b.v0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = e.f14763b;
        f14773g = new s8.b(0);
        f14774h = new s8.b(1);
    }
}
