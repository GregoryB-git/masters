// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import V5.o;
import V5.n;
import a.a;

public abstract class E
{
    public static final StackTraceElement a;
    public static final String b;
    public static final String c;
    
    static {
        a = new a().a();
        Object a2 = null;
        try {
            final n.a o = n.o;
            n.a(Z5.a.class.getCanonicalName());
        }
        finally {
            final n.a o2 = n.o;
            final Throwable t;
            a2 = n.a(o.a(t));
        }
        if (n.b(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String)a2;
        Object a3 = null;
        try {
            n.a(E.class.getCanonicalName());
        }
        finally {
            final n.a o3 = n.o;
            final Throwable t2;
            a3 = n.a(o.a(t2));
        }
        if (n.b(a3) != null) {
            a3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String)a3;
    }
    
    public static final Throwable a(final Throwable t) {
        return t;
    }
}
