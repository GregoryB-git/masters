/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 */
package w5;

import T5.a;
import android.os.Handler;
import android.os.Looper;
import w5.c;

public class g
implements c.d {
    public final Handler a = a.a(Looper.getMainLooper());

    @Override
    public void a(Runnable runnable) {
        this.a.post(runnable);
    }
}

