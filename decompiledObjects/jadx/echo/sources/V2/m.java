package V2;

import A2.AbstractC0328n;
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

/* loaded from: classes.dex */
public abstract class m {
    public static Object a(AbstractC0659j abstractC0659j) {
        AbstractC0328n.g();
        AbstractC0328n.j(abstractC0659j, "Task must not be null");
        if (abstractC0659j.m()) {
            return j(abstractC0659j);
        }
        p pVar = new p(null);
        k(abstractC0659j, pVar);
        pVar.c();
        return j(abstractC0659j);
    }

    public static Object b(AbstractC0659j abstractC0659j, long j7, TimeUnit timeUnit) {
        AbstractC0328n.g();
        AbstractC0328n.j(abstractC0659j, "Task must not be null");
        AbstractC0328n.j(timeUnit, "TimeUnit must not be null");
        if (abstractC0659j.m()) {
            return j(abstractC0659j);
        }
        p pVar = new p(null);
        k(abstractC0659j, pVar);
        if (pVar.e(j7, timeUnit)) {
            return j(abstractC0659j);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static AbstractC0659j c(Executor executor, Callable callable) {
        AbstractC0328n.j(executor, "Executor must not be null");
        AbstractC0328n.j(callable, "Callback must not be null");
        K k7 = new K();
        executor.execute(new L(k7, callable));
        return k7;
    }

    public static AbstractC0659j d(Exception exc) {
        K k7 = new K();
        k7.q(exc);
        return k7;
    }

    public static AbstractC0659j e(Object obj) {
        K k7 = new K();
        k7.r(obj);
        return k7;
    }

    public static AbstractC0659j f(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((AbstractC0659j) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        K k7 = new K();
        r rVar = new r(collection.size(), k7);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            k((AbstractC0659j) it2.next(), rVar);
        }
        return k7;
    }

    public static AbstractC0659j g(AbstractC0659j... abstractC0659jArr) {
        return (abstractC0659jArr == null || abstractC0659jArr.length == 0) ? e(null) : f(Arrays.asList(abstractC0659jArr));
    }

    public static AbstractC0659j h(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return e(Collections.emptyList());
        }
        return f(collection).h(AbstractC0661l.f6442a, new n(collection));
    }

    public static AbstractC0659j i(AbstractC0659j... abstractC0659jArr) {
        return (abstractC0659jArr == null || abstractC0659jArr.length == 0) ? e(Collections.emptyList()) : h(Arrays.asList(abstractC0659jArr));
    }

    public static Object j(AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            return abstractC0659j.j();
        }
        if (abstractC0659j.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC0659j.i());
    }

    public static void k(AbstractC0659j abstractC0659j, q qVar) {
        Executor executor = AbstractC0661l.f6443b;
        abstractC0659j.e(executor, qVar);
        abstractC0659j.d(executor, qVar);
        abstractC0659j.a(executor, qVar);
    }
}
