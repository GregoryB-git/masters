// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R1;

import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import Q1.c;
import Q1.k;
import kotlin.jvm.internal.Intrinsics;
import android.os.Looper;
import android.app.ActivityManager$ProcessErrorStateInfo;
import java.util.List;
import android.app.ActivityManager;
import x1.B;
import java.util.concurrent.Executors;
import android.os.Process;
import java.util.concurrent.ScheduledExecutorService;

public final class b
{
    public static final b a;
    public static final int b;
    public static final ScheduledExecutorService c;
    public static String d;
    public static final Runnable e;
    
    static {
        a = new b();
        b = Process.myUid();
        c = Executors.newSingleThreadScheduledExecutor();
        R1.b.d = "";
        e = new a();
    }
    
    public static final void b() {
        if (T1.a.d(b.class)) {
            return;
        }
        while (true) {
            try {
                final Object systemService = B.l().getSystemService("activity");
                if (systemService != null) {
                    c((ActivityManager)systemService);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                final Throwable t;
                T1.a.b(t, b.class);
                return;
            }
            catch (Exception ex) {
                return;
            }
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public static final void c(final ActivityManager activityManager) {
        if (T1.a.d(b.class)) {
            return;
        }
        if (activityManager == null) {
            return;
        }
        Label_0136: {
            try {
                final List processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState == null) {
                    return;
                }
                for (final ActivityManager$ProcessErrorStateInfo activityManager$ProcessErrorStateInfo : (List<ActivityManager$ProcessErrorStateInfo>)processesInErrorState) {
                    if (activityManager$ProcessErrorStateInfo.condition == 2 && activityManager$ProcessErrorStateInfo.uid == R1.b.b) {
                        final Thread thread = Looper.getMainLooper().getThread();
                        Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                        final String g = k.g(thread);
                        if (Intrinsics.a(g, R1.b.d)) {
                            continue;
                        }
                        if (!k.k(thread)) {
                            continue;
                        }
                        R1.b.d = g;
                        final c.a a = Q1.c.a.a;
                        Q1.c.a.a(activityManager$ProcessErrorStateInfo.shortMsg, g).g();
                    }
                }
            }
            finally {
                break Label_0136;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, b.class);
    }
    
    public static final void d() {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            R1.b.c.scheduleWithFixedDelay(R1.b.e, 0L, 500, TimeUnit.MILLISECONDS);
        }
        finally {
            final Throwable t;
            T1.a.b(t, b.class);
        }
    }
}
