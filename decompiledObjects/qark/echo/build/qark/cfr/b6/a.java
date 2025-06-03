/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package b6;

import W5.g;
import j6.b;
import j6.c;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public abstract class a {
    public void a(Throwable throwable, Throwable throwable2) {
        Intrinsics.checkNotNullParameter((Object)throwable, "cause");
        Intrinsics.checkNotNullParameter((Object)throwable2, "exception");
        Method method = a.b;
        if (method != null) {
            method.invoke((Object)throwable, new Object[]{throwable2});
        }
    }

    public c b() {
        return new b();
    }

    public static final class a {
        public static final a a;
        public static final Method b;
        public static final Method c;

        static {
            Method[] arrmethod;
            Method method;
            int n8;
            int n9;
            int n10;
            Object var4_5;
            block4 : {
                a = new a();
                arrmethod = Throwable.class.getMethods();
                Intrinsics.b(arrmethod);
                n8 = arrmethod.length;
                n10 = 0;
                n9 = 0;
                do {
                    var4_5 = null;
                    if (n9 >= n8) break;
                    method = arrmethod[n9];
                    if (Intrinsics.a(method.getName(), "addSuppressed")) {
                        Object[] arrobject = method.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(arrobject, "getParameterTypes(...)");
                        if (Intrinsics.a(g.r(arrobject), Throwable.class)) break block4;
                    }
                    ++n9;
                } while (true);
                method = null;
            }
            b = method;
            n8 = arrmethod.length;
            n9 = n10;
            do {
                method = var4_5;
                if (n9 >= n8 || Intrinsics.a((method = arrmethod[n9]).getName(), "getSuppressed")) break;
                ++n9;
            } while (true);
            c = method;
        }
    }

}

