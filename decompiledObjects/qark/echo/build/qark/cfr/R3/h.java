/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R3;

import V3.j;
import android.os.Handler;
import android.os.Looper;

public class h
implements j {
    public final Handler a = new Handler(Looper.getMainLooper());

    @Override
    public void a() {
    }

    @Override
    public void b(Runnable runnable) {
        this.a.post(runnable);
    }
}

