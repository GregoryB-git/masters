package R1;

import Q1.c;
import Q1.k;
import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4527a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final int f4528b = Process.myUid();

    /* renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f4529c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d, reason: collision with root package name */
    public static String f4530d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final Runnable f4531e = new Runnable() { // from class: R1.a
        @Override // java.lang.Runnable
        public final void run() {
            b.b();
        }
    };

    public static final void b() {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Object systemService = C2146B.l().getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            c((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }

    public static final void c(ActivityManager activityManager) {
        if (T1.a.d(b.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                return;
            }
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f4528b) {
                    Thread thread = Looper.getMainLooper().getThread();
                    Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                    String g7 = k.g(thread);
                    if (!Intrinsics.a(g7, f4530d) && k.k(thread)) {
                        f4530d = g7;
                        c.a aVar = c.a.f4333a;
                        c.a.a(processErrorStateInfo.shortMsg, g7).g();
                    }
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }

    public static final void d() {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            f4529c.scheduleWithFixedDelay(f4531e, 0L, 500, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }
}
