/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Object
 *  java.lang.System
 */
package s3;

import android.os.SystemClock;
import s3.a;

public abstract class n {
    public static n a(long l8, long l9, long l10) {
        return new a(l8, l9, l10);
    }

    public static n e() {
        return n.a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}

