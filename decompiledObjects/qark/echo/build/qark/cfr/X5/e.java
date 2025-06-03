/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package X5;

import X5.d;
import X5.g;
import X5.h;
import kotlin.jvm.internal.Intrinsics;

public interface e
extends g.b {
    public static final b c = b.o;

    public void C(d var1);

    public d i(d var1);

    public static final abstract class a {
        public static g.b a(e b8, g.c object) {
            Intrinsics.checkNotNullParameter(object, "key");
            boolean bl = object instanceof X5.b;
            Object var3_3 = null;
            if (bl) {
                X5.b b9 = (X5.b)object;
                object = var3_3;
                if (b9.a(b8.getKey())) {
                    b8 = b9.b(b8);
                    object = var3_3;
                    if (b8 instanceof g.b) {
                        object = b8;
                    }
                }
                return object;
            }
            if (e.c == object) {
                Intrinsics.c(b8, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return b8;
            }
            return null;
        }

        public static g b(e b8, g.c object) {
            Intrinsics.checkNotNullParameter(object, "key");
            if (object instanceof X5.b) {
                X5.b b9 = (X5.b)object;
                object = b8;
                if (b9.a(b8.getKey())) {
                    object = b8;
                    if (b9.b(b8) != null) {
                        object = h.o;
                    }
                }
                return object;
            }
            if (e.c == object) {
                b8 = h.o;
            }
            return b8;
        }
    }

    public static final class b
    implements g.c {
        public static final /* synthetic */ b o;

        static {
            o = new b();
        }
    }

}

