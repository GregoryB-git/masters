/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package V2;

import V2.h;
import V2.j;
import V2.t;

public final class s
implements Runnable {
    public final /* synthetic */ j o;
    public final /* synthetic */ t p;

    public s(t t8, j j8) {
        this.p = t8;
        this.o = j8;
    }

    public final void run() {
        h h82;
        block5 : {
            Object object;
            if (this.o.l()) {
                t.b(this.p).s();
                return;
            }
            try {
                object = t.a(this.p).a(this.o);
            }
            catch (Exception exception) {
            }
            catch (h h82) {
                break block5;
            }
            t.b(this.p).r(object);
            return;
            t.b(this.p).q(exception);
            return;
        }
        if (h82.getCause() instanceof Exception) {
            t.b(this.p).q((Exception)h82.getCause());
            return;
        }
        t.b(this.p).q((Exception)h82);
    }
}

