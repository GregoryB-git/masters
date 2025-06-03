/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package u6;

import V5.a;
import p6.G;
import p6.H;
import u6.g;
import u6.i;

public abstract class h {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(X5.g g8, Throwable throwable) {
        for (G g9 : g.a()) {
            try {
                g9.h(g8, throwable);
            }
            catch (Throwable throwable2) {
                g.b(H.b(throwable, throwable2));
            }
        }
        try {
            a.a(throwable, (Throwable)new i(g8));
        }
        catch (Throwable throwable3) {}
        g.b(throwable);
    }
}

