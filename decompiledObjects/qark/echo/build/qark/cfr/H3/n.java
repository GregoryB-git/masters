/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.ThreadLocal
 *  java.lang.Void
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 */
package H3;

import V2.b;
import V2.j;
import V2.m;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class n {
    public final Executor a;
    public j b = m.e(null);
    public final Object c = new Object();
    public final ThreadLocal d = new ThreadLocal();

    public n(Executor executor) {
        this.a = executor;
        executor.execute(new Runnable(){

            public void run() {
                n.this.d.set((Object)Boolean.TRUE);
            }
        });
    }

    public void b() {
        if (this.e()) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public Executor c() {
        return this.a;
    }

    public final j d(j j8) {
        return j8.g(this.a, new b(){

            public Void b(j j8) {
                return null;
            }
        });
    }

    public final boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }

    public final b f(final Callable callable) {
        return new b(){

            @Override
            public Object a(j j8) {
                return callable.call();
            }
        };
    }

    public j g(final Runnable runnable) {
        return this.h(new Callable(){

            public Void a() {
                runnable.run();
                return null;
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j h(Callable object) {
        Object object2 = this.c;
        synchronized (object2) {
            object = this.b.g(this.a, this.f((Callable)object));
            this.b = this.d((j)object);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j i(Callable object) {
        Object object2 = this.c;
        synchronized (object2) {
            object = this.b.h(this.a, this.f((Callable)object));
            this.b = this.d((j)object);
            return object;
        }
    }

}

