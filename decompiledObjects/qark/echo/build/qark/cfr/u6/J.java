/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 */
package u6;

import X5.g;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.K0;
import u6.F;
import u6.N;

public abstract class J {
    public static final F a = new F("NO_THREAD_ELEMENTS");
    public static final p b = .o;
    public static final p c = .o;
    public static final p d = .o;

    public static final void a(g g8, Object object) {
        if (object == a) {
            return;
        }
        if (object instanceof N) {
            ((N)object).b(g8);
            return;
        }
        Object object2 = g8.u(null, c);
        Intrinsics.c(object2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((K0)object2).D(g8, object);
    }

    public static final Object b(g object) {
        object = object.u(0, b);
        Intrinsics.b(object);
        return object;
    }

    public static final Object c(g g8, Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = J.b(g8);
        }
        if (object2 == Integer.valueOf((int)0)) {
            return a;
        }
        if (object2 instanceof Integer) {
            return g8.u(new N(g8, ((Number)object2).intValue()), d);
        }
        Intrinsics.c(object2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((K0)object2).B(g8);
    }

}

