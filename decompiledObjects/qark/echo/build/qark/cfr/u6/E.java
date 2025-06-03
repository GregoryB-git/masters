/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Throwable
 */
package u6;

import V5.n;
import V5.o;
import a.a;

public abstract class E {
    public static final StackTraceElement a;
    public static final String b;
    public static final String c;

    static {
        n.a a8;
        Object object;
        a = new a().a();
        try {
            object = n.o;
            object = n.a(Z5.a.class.getCanonicalName());
        }
        catch (Throwable throwable) {
            a8 = n.o;
            object = n.a(o.a(throwable));
        }
        if (n.b(object) != null) {
            object = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String)object;
        try {
            object = n.a(E.class.getCanonicalName());
        }
        catch (Throwable throwable) {
            a8 = n.o;
            object = n.a(o.a(throwable));
        }
        if (n.b(object) != null) {
            object = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String)object;
    }

    public static final Throwable a(Throwable throwable) {
        return throwable;
    }
}

