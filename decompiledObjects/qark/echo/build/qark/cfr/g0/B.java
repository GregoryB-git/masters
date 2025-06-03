/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.SystemClock
 *  java.lang.Object
 *  java.lang.System
 */
package g0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import g0.C;
import g0.c;
import g0.k;

public class B
implements c {
    @Override
    public long a() {
        return System.currentTimeMillis();
    }

    @Override
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public long c() {
        return System.nanoTime();
    }

    @Override
    public long d() {
        return SystemClock.uptimeMillis();
    }

    @Override
    public k e(Looper looper, Handler.Callback callback) {
        return new C(new Handler(looper, callback));
    }

    @Override
    public void f() {
    }
}

