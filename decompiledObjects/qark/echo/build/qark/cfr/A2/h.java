/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.HandlerThread
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 */
package A2;

import A2.e0;
import A2.j0;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

public abstract class h {
    public static int a = 4225;
    public static final Object b = new Object();
    public static j0 c;
    public static HandlerThread d;
    public static boolean e = false;

    public static int a() {
        return a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h b(Context context) {
        Object object = b;
        synchronized (object) {
            try {
                if (c == null) {
                    Context context2 = context.getApplicationContext();
                    context = e ? h.c().getLooper() : context.getMainLooper();
                    c = new j0(context2, (Looper)context);
                }
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HandlerThread c() {
        Object object = b;
        synchronized (object) {
            try {
                HandlerThread handlerThread = d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                d = handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public abstract void d(e0 var1, ServiceConnection var2, String var3);

    public final void e(String string2, String string3, int n8, ServiceConnection serviceConnection, String string4, boolean bl) {
        this.d(new e0(string2, string3, n8, bl), serviceConnection, string4);
    }

    public abstract boolean f(e0 var1, ServiceConnection var2, String var3, Executor var4);
}

