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
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.Executor
 */
package V2;

import V2.F;
import V2.d;
import V2.f;
import V2.g;
import V2.h;
import V2.j;
import V2.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class E
implements Runnable {
    public final /* synthetic */ j o;
    public final /* synthetic */ F p;

    public E(F f8, j j8) {
        this.p = f8;
        this.o = j8;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        h h8222;
        block6 : {
            j j8;
            Exception exception222;
            block5 : {
                try {
                    j8 = F.e(this.p).a(this.o.j());
                    if (j8 != null) break block5;
                }
                catch (Exception exception222) {
                }
                catch (h h8222) {
                    break block6;
                }
                this.p.d((Exception)new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = l.b;
            j8.e(executor, this.p);
            j8.d(executor, this.p);
            j8.a(executor, this.p);
            return;
            this.p.d(exception222);
            return;
        }
        if (h8222.getCause() instanceof Exception) {
            this.p.d((Exception)h8222.getCause());
            return;
        }
        this.p.d((Exception)h8222);
        return;
        catch (CancellationException cancellationException) {}
        this.p.b();
    }
}

