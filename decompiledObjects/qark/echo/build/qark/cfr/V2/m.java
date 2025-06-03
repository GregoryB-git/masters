/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.concurrent.Callable
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package V2;

import V2.K;
import V2.L;
import V2.b;
import V2.d;
import V2.f;
import V2.g;
import V2.j;
import V2.l;
import V2.n;
import V2.o;
import V2.p;
import V2.q;
import V2.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class m {
    public static Object a(j j8) {
        A2.n.g();
        A2.n.j(j8, "Task must not be null");
        if (j8.m()) {
            return m.j(j8);
        }
        p p8 = new p(null);
        m.k(j8, p8);
        p8.c();
        return m.j(j8);
    }

    public static Object b(j j8, long l8, TimeUnit timeUnit) {
        A2.n.g();
        A2.n.j(j8, "Task must not be null");
        A2.n.j((Object)timeUnit, "TimeUnit must not be null");
        if (j8.m()) {
            return m.j(j8);
        }
        p p8 = new p(null);
        m.k(j8, p8);
        if (p8.e(l8, timeUnit)) {
            return m.j(j8);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static j c(Executor executor, Callable callable) {
        A2.n.j((Object)executor, "Executor must not be null");
        A2.n.j((Object)callable, "Callback must not be null");
        K k8 = new K();
        executor.execute((Runnable)new L(k8, callable));
        return k8;
    }

    public static j d(Exception exception) {
        K k8 = new K();
        k8.q(exception);
        return k8;
    }

    public static j e(Object object) {
        K k8 = new K();
        k8.r(object);
        return k8;
    }

    public static j f(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            Object object = collection.iterator();
            while (object.hasNext()) {
                if ((j)object.next() != null) continue;
                throw new NullPointerException("null tasks are not accepted");
            }
            object = new K();
            r r8 = new r(collection.size(), (K)object);
            collection = collection.iterator();
            while (collection.hasNext()) {
                m.k((j)collection.next(), r8);
            }
            return object;
        }
        return m.e(null);
    }

    public static /* varargs */ j g(j ... arrj) {
        if (arrj != null && arrj.length != 0) {
            return m.f((Collection)Arrays.asList((Object[])arrj));
        }
        return m.e(null);
    }

    public static j h(Collection object) {
        if (object != null && !object.isEmpty()) {
            j j8 = m.f((Collection)object);
            object = new n((Collection)object);
            return j8.h(l.a, (b)object);
        }
        return m.e((Object)Collections.emptyList());
    }

    public static /* varargs */ j i(j ... arrj) {
        if (arrj != null && arrj.length != 0) {
            return m.h((Collection)Arrays.asList((Object[])arrj));
        }
        return m.e((Object)Collections.emptyList());
    }

    public static Object j(j j8) {
        if (j8.n()) {
            return j8.j();
        }
        if (j8.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException((Throwable)j8.i());
    }

    public static void k(j j8, q q8) {
        Executor executor = l.b;
        j8.e(executor, q8);
        j8.d(executor, q8);
        j8.a(executor, q8);
    }
}

