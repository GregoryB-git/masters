/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package X5;

import X5.e;
import X5.h;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

public interface g {
    public b b(c var1);

    public g k(g var1);

    public Object u(Object var1, p var2);

    public g x(c var1);

    public static final abstract class a {
        public static g a(g g8, g g9) {
            Intrinsics.checkNotNullParameter(g9, "context");
            if (g9 == h.o) {
                return g8;
            }
            return (g)g9.u(g8, .o);
        }

    }

    public static interface b
    extends g {
        @Override
        public b b(c var1);

        public c getKey();

        public static final abstract class a {
            public static Object a(b b8, Object object, p p8) {
                Intrinsics.checkNotNullParameter(p8, "operation");
                return p8.invoke(object, b8);
            }

            public static b b(b b8, c c8) {
                Intrinsics.checkNotNullParameter(c8, "key");
                if (Intrinsics.a(b8.getKey(), c8)) {
                    Intrinsics.c(b8, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return b8;
                }
                return null;
            }

            public static g c(b b8, c c8) {
                Intrinsics.checkNotNullParameter(c8, "key");
                g g8 = b8;
                if (Intrinsics.a(b8.getKey(), c8)) {
                    g8 = h.o;
                }
                return g8;
            }

            public static g d(b b8, g g8) {
                Intrinsics.checkNotNullParameter(g8, "context");
                return X5.g$a.a(b8, g8);
            }
        }

    }

    public static interface c {
    }

}

