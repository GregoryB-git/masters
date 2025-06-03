/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 */
package K4;

import F4.a;
import M4.k;
import M4.o;
import android.app.ActivityManager;
import android.content.Context;

public class i {
    public static final a e = a.e();
    public final Runtime a;
    public final ActivityManager b;
    public final ActivityManager.MemoryInfo c;
    public final Context d;

    public i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public i(Runtime runtime, Context context) {
        this.a = runtime;
        this.d = context;
        runtime = (ActivityManager)context.getSystemService("activity");
        this.b = runtime;
        context = new ActivityManager.MemoryInfo();
        this.c = context;
        runtime.getMemoryInfo((ActivityManager.MemoryInfo)context);
    }

    public int a() {
        return o.c(k.t.c(this.c.totalMem));
    }

    public int b() {
        return o.c(k.t.c(this.a.maxMemory()));
    }

    public int c() {
        return o.c(k.r.c(this.b.getMemoryClass()));
    }
}

