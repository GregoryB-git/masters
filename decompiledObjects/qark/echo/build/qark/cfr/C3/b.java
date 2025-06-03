/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.Locale
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicLong
 */
package C3;

import C3.a;
import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class b
implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong a = new AtomicLong();
    public final String b;
    public final int c;
    public final StrictMode.ThreadPolicy d;

    public b(String string2, int n8, StrictMode.ThreadPolicy threadPolicy) {
        this.b = string2;
        this.c = n8;
        this.d = threadPolicy;
    }

    public static /* synthetic */ void a(b b8, Runnable runnable) {
        b8.b(runnable);
    }

    public final /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority((int)this.c);
        StrictMode.ThreadPolicy threadPolicy = this.d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        runnable = e.newThread((Runnable)new a(this, runnable));
        runnable.setName(String.format((Locale)Locale.ROOT, (String)"%s Thread #%d", (Object[])new Object[]{this.b, this.a.getAndIncrement()}));
        return runnable;
    }
}

