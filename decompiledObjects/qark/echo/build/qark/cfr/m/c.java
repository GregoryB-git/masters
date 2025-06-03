/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicInteger
 */
package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import m.b;
import m.d;

public class c
extends d {
    public final Object a = new Object();
    public final ExecutorService b;
    public volatile Handler c;

    public c() {
        this.b = Executors.newFixedThreadPool((int)4, (ThreadFactory)new ThreadFactory(){
            public final AtomicInteger a;
            {
                this.a = new AtomicInteger(0);
            }

            public Thread newThread(Runnable runnable) {
                runnable = new Thread(runnable);
                runnable.setName(String.format((String)"arch_disk_io_%d", (Object[])new Object[]{this.a.getAndIncrement()}));
                return runnable;
            }
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        }
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException illegalAccessException) {
            return new Handler(looper);
        }
        catch (InvocationTargetException invocationTargetException) {
            return new Handler(looper);
        }
    }

    @Override
    public void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override
    public boolean b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void c(Runnable runnable) {
        if (this.c == null) {
            Object object = this.a;
            // MONITORENTER : object
            if (this.c == null) {
                this.c = c.d(Looper.getMainLooper());
            }
            // MONITOREXIT : object
        }
        this.c.post(runnable);
        return;
        catch (Throwable throwable) {
            throw throwable;
        }
    }

}

