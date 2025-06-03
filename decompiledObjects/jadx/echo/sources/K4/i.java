package K4;

import M4.o;
import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes.dex */
public class i {

    /* renamed from: e, reason: collision with root package name */
    public static final F4.a f3208e = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f3209a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f3210b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityManager.MemoryInfo f3211c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f3212d;

    public i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return o.c(M4.k.f3557t.c(this.f3211c.totalMem));
    }

    public int b() {
        return o.c(M4.k.f3557t.c(this.f3209a.maxMemory()));
    }

    public int c() {
        return o.c(M4.k.f3555r.c(this.f3210b.getMemoryClass()));
    }

    public i(Runtime runtime, Context context) {
        this.f3209a = runtime;
        this.f3212d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f3210b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f3211c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
