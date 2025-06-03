/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package n5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import n5.m;
import n5.n;

public class o {
    public final String a;
    public final int b;
    public HandlerThread c;
    public Handler d;
    public Runnable e;
    public m f;

    public o(String string2, int n8) {
        this.a = string2;
        this.b = n8;
    }

    public static /* synthetic */ void a(o o8, m m8) {
        o8.c(m8);
    }

    public boolean b() {
        m m8 = this.f;
        if (m8 != null && m8.b()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void c(m m8) {
        this.h(m8);
    }

    public Integer d() {
        m m8 = this.f;
        if (m8 != null) {
            return m8.a();
        }
        return null;
    }

    public void e(m m8) {
        this.d.post((Runnable)new n(this, m8));
    }

    public void f() {
        synchronized (this) {
            Throwable throwable2;
            block5 : {
                block4 : {
                    HandlerThread handlerThread;
                    try {
                        handlerThread = this.c;
                        if (handlerThread == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    handlerThread.quit();
                    this.c = null;
                    this.d = null;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void g(Runnable runnable) {
        synchronized (this) {
            HandlerThread handlerThread;
            this.c = handlerThread = new HandlerThread(this.a, this.b);
            handlerThread.start();
            this.d = new Handler(this.c.getLooper());
            this.e = runnable;
            return;
        }
    }

    public void h(m m8) {
        m8.b.run();
        this.f = m8;
        this.e.run();
    }
}

