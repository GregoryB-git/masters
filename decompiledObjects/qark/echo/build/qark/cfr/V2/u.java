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
 *  java.util.concurrent.Executor
 */
package V2;

import V2.d;
import V2.f;
import V2.g;
import V2.h;
import V2.j;
import V2.l;
import V2.v;
import java.util.concurrent.Executor;

public final class u
implements Runnable {
    public final /* synthetic */ j o;
    public final /* synthetic */ v p;

    public u(v v8, j j8) {
        this.p = v8;
        this.o = j8;
    }

    public final void run() {
        h h82;
        block5 : {
            Exception exception2;
            j j8;
            block4 : {
                try {
                    j8 = (j)v.e(this.p).a(this.o);
                    if (j8 != null) break block4;
                }
                catch (Exception exception2) {
                }
                catch (h h82) {
                    break block5;
                }
                this.p.d((Exception)new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = l.b;
            j8.e(executor, this.p);
            j8.d(executor, this.p);
            j8.a(executor, this.p);
            return;
            v.f(this.p).q(exception2);
            return;
        }
        if (h82.getCause() instanceof Exception) {
            v.f(this.p).q((Exception)h82.getCause());
            return;
        }
        v.f(this.p).q((Exception)h82);
    }
}

