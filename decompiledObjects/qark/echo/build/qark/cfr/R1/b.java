/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$ProcessErrorStateInfo
 *  android.os.Looper
 *  android.os.Process
 *  java.lang.Exception
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package R1;

import Q1.c;
import Q1.k;
import R1.a;
import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class b {
    public static final b a = new b();
    public static final int b = Process.myUid();
    public static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();
    public static String d = "";
    public static final Runnable e = new a();

    public static /* synthetic */ void a() {
        b.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b() {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Object object = B.l().getSystemService("activity");
            if (object != null) {
                b.c((ActivityManager)object);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        catch (Exception exception) {
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, b.class);
    }

    public static final void c(ActivityManager activityManager) {
        Throwable throwable2;
        block8 : {
            block7 : {
                block6 : {
                    if (T1.a.d(b.class)) {
                        return;
                    }
                    if (activityManager == null) {
                        return;
                    }
                    activityManager = activityManager.getProcessesInErrorState();
                    if (activityManager != null) break block6;
                    return;
                }
                try {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : (Iterable)activityManager) {
                        if (processErrorStateInfo.condition != 2 || processErrorStateInfo.uid != b) continue;
                        Object object = Looper.getMainLooper().getThread();
                        Intrinsics.checkNotNullExpressionValue(object, "getMainLooper().thread");
                        String string2 = k.g((Thread)object);
                        if (Intrinsics.a(string2, d) || !k.k((Thread)object)) continue;
                        d = string2;
                        object = c.a.a;
                        c.a.a(processErrorStateInfo.shortMsg, string2).g();
                    }
                    break block7;
                }
                catch (Throwable throwable2) {}
                break block8;
            }
            return;
        }
        T1.a.b(throwable2, b.class);
    }

    public static final void d() {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            c.scheduleWithFixedDelay(e, 0L, (long)500, TimeUnit.MILLISECONDS);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, b.class);
            return;
        }
    }
}

