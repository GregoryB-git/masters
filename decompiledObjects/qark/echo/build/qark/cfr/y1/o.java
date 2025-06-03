/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Set
 */
package y1;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import y1.G;
import y1.H;
import y1.a;
import y1.f;
import y1.g;

public final class o {
    public static final o a = new o();
    public static final String b = o.class.getName();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(a a8, H h8) {
        synchronized (o.class) {
            boolean bl = T1.a.d(o.class);
            if (bl) {
                return;
            }
            try {
                void var1_2;
                Intrinsics.checkNotNullParameter(a8, "accessTokenAppIdPair");
                Intrinsics.checkNotNullParameter(var1_2, "appEvents");
                G1.g.b();
                G g8 = g.a();
                g8.a(a8, var1_2.d());
                g.b(g8);
            }
            catch (Throwable throwable) {
                T1.a.b(throwable, o.class);
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(f f8) {
        synchronized (o.class) {
            boolean bl = T1.a.d(o.class);
            if (bl) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(f8, "eventsToPersist");
                G1.g.b();
                G g8 = g.a();
                for (a a8 : f8.f()) {
                    H h8 = f8.c(a8);
                    if (h8 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    g8.a(a8, h8.d());
                }
                g.b(g8);
            }
            catch (Throwable throwable) {}
            return;
            T1.a.b(throwable, o.class);
            return;
        }
    }
}

