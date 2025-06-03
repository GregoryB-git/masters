/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Future
 */
package b3;

import W2.i;
import W2.m;
import b3.b;
import b3.d;
import b3.e;
import b3.g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class c
extends d {
    public static void a(e e8, b b8, Executor executor) {
        m.j(b8);
        e8.c(new a(e8, b8), executor);
    }

    public static Object b(Future future) {
        m.q(future.isDone(), "Future was expected to be done: %s", (Object)future);
        return g.a(future);
    }

    public static final class a
    implements Runnable {
        public final Future o;
        public final b p;

        public a(Future future, b b8) {
            this.o = future;
            this.p = b8;
        }

        public void run() {
            Object object = this.o;
            try {
                object = c.b((Future)object);
            }
            catch (Throwable throwable) {
                this.p.onFailure(throwable);
                return;
            }
            catch (ExecutionException executionException) {
                this.p.onFailure(executionException.getCause());
                return;
            }
            this.p.a(object);
            return;
        }

        public String toString() {
            return i.a(this).c(this.p).toString();
        }
    }

}

