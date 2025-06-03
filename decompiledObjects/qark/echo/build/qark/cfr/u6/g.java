/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.ServiceLoader
 */
package u6;

import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceLoader;
import n6.c;
import p6.G;

public abstract class g {
    public static final Collection a = (Collection)c.e(c.a(ServiceLoader.load(G.class, (ClassLoader)G.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return a;
    }

    public static final void b(Throwable throwable) {
        Thread thread = Thread.currentThread();
        thread.getUncaughtExceptionHandler().uncaughtException(thread, throwable);
    }
}

