/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package p6;

import V5.n;
import V5.o;
import X5.d;
import kotlin.jvm.internal.g;
import p6.A;
import p6.l;
import p6.z;

public abstract class D {
    public static final Object a(Object object, d object2) {
        object2 = object;
        if (object instanceof z) {
            object2 = n.o;
            object2 = o.a(((z)object).a);
        }
        return n.a(object2);
    }

    public static final Object b(Object object, g6.l l8) {
        Object object2 = n.b(object);
        if (object2 == null) {
            object2 = object;
            if (l8 != null) {
                return new A(object, l8);
            }
        } else {
            object2 = new z((Throwable)object2, false, 2, null);
        }
        return object2;
    }

    public static final Object c(Object object, l l8) {
        l8 = n.b(object);
        if (l8 == null) {
            return object;
        }
        return new z((Throwable)l8, false, 2, null);
    }

    public static /* synthetic */ Object d(Object object, g6.l l8, int n8, Object object2) {
        if ((n8 & 1) != 0) {
            l8 = null;
        }
        return D.b(object, l8);
    }
}

