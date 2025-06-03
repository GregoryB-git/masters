// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.Collections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import A2.n;

public abstract class m
{
    public static Object a(final j j) {
        n.g();
        n.j(j, "Task must not be null");
        if (j.m()) {
            return j(j);
        }
        final p p = new p(null);
        k(j, p);
        p.c();
        return j(j);
    }
    
    public static Object b(final j j, final long n, final TimeUnit timeUnit) {
        n.g();
        n.j(j, "Task must not be null");
        n.j(timeUnit, "TimeUnit must not be null");
        if (j.m()) {
            return j(j);
        }
        final p p3 = new p(null);
        k(j, p3);
        if (p3.e(n, timeUnit)) {
            return j(j);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
    
    public static j c(final Executor executor, final Callable callable) {
        n.j(executor, "Executor must not be null");
        n.j(callable, "Callback must not be null");
        final K k = new K();
        executor.execute(new L(k, callable));
        return k;
    }
    
    public static j d(final Exception ex) {
        final K k = new K();
        k.q(ex);
        return k;
    }
    
    public static j e(final Object o) {
        final K k = new K();
        k.r(o);
        return k;
    }
    
    public static j f(final Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            final Iterator<j> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() != null) {
                    continue;
                }
                throw new NullPointerException("null tasks are not accepted");
            }
            final K k = new K();
            final r r = new r(collection.size(), k);
            final Iterator<j> iterator2 = collection.iterator();
            while (iterator2.hasNext()) {
                k(iterator2.next(), r);
            }
            return k;
        }
        return e(null);
    }
    
    public static j g(final j... a) {
        if (a != null && a.length != 0) {
            return f(Arrays.asList(a));
        }
        return e(null);
    }
    
    public static j h(final Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return f(collection).h(l.a, new V2.n(collection));
        }
        return e(Collections.emptyList());
    }
    
    public static j i(final j... a) {
        if (a != null && a.length != 0) {
            return h(Arrays.asList(a));
        }
        return e(Collections.emptyList());
    }
    
    public static Object j(final j j) {
        if (j.n()) {
            return j.j();
        }
        if (j.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(j.i());
    }
    
    public static void k(final j j, final q q) {
        final Executor b = l.b;
        j.e(b, q);
        j.d(b, q);
        j.a(b, q);
    }
}
