// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b6;

import W5.g;
import j6.b;
import j6.c;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public abstract class a
{
    public void a(final Throwable obj, final Throwable t) {
        Intrinsics.checkNotNullParameter(obj, "cause");
        Intrinsics.checkNotNullParameter(t, "exception");
        final Method b = a.b;
        if (b != null) {
            b.invoke(obj, t);
        }
    }
    
    public c b() {
        return new b();
    }
    
    public static final class a
    {
        public static final a a;
        public static final Method b;
        public static final Method c;
        
        static {
            a = new a();
            final Method[] methods = Throwable.class.getMethods();
            Intrinsics.b(methods);
            final int length = methods.length;
            final int n = 0;
            int n2 = 0;
            Method method;
            Method b2;
            while (true) {
                method = null;
                if (n2 >= length) {
                    b2 = null;
                    break;
                }
                b2 = methods[n2];
                if (Intrinsics.a(b2.getName(), "addSuppressed")) {
                    final Class<?>[] parameterTypes = b2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.a(g.r(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                ++n2;
            }
            b = b2;
            final int length2 = methods.length;
            int n3 = n;
            Method c2;
            while (true) {
                c2 = method;
                if (n3 >= length2) {
                    break;
                }
                c2 = methods[n3];
                if (Intrinsics.a(c2.getName(), "getSuppressed")) {
                    break;
                }
                ++n3;
            }
            c = c2;
        }
    }
}
