/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package n5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import n5.k;
import n5.m;
import n5.p;
import n5.q;

public class u
implements q {
    public final String a;
    public final int b;
    public HandlerThread c;
    public Handler d;

    public u(String string2, int n8) {
        this.a = string2;
        this.b = n8;
    }

    @Override
    public void a() {
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.c = null;
            this.d = null;
        }
    }

    @Override
    public /* synthetic */ void b(k k8, Runnable runnable) {
        p.a(this, k8, runnable);
    }

    @Override
    public void c(m m8) {
        this.d.post(m8.b);
    }

    @Override
    public void start() {
        HandlerThread handlerThread;
        this.c = handlerThread = new HandlerThread(this.a, this.b);
        handlerThread.start();
        this.d = new Handler(this.c.getLooper());
    }
}

