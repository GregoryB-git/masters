/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package p6;

import V5.a;
import X5.g;
import p6.G;
import u6.h;

public abstract class H {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(g g8, Throwable throwable) {
        Throwable throwable22;
        block3 : {
            try {
                G g9 = (G)g8.b(G.m);
                if (g9 != null) {
                    g9.h(g8, throwable);
                    return;
                }
            }
            catch (Throwable throwable22) {
                break block3;
            }
            h.a(g8, throwable);
            return;
        }
        h.a(g8, H.b(throwable, throwable22));
    }

    public static final Throwable b(Throwable throwable, Throwable throwable2) {
        if (throwable == throwable2) {
            return throwable;
        }
        throwable2 = new RuntimeException("Exception while trying to handle coroutine exception", throwable2);
        a.a(throwable2, throwable);
        return throwable2;
    }
}

