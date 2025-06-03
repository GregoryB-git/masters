/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Object
 *  java.lang.System
 */
package E2;

import E2.e;
import android.os.SystemClock;

public class h
implements e {
    public static final h a = new h();

    public static e d() {
        return a;
    }

    @Override
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public final long c() {
        return System.nanoTime();
    }
}

