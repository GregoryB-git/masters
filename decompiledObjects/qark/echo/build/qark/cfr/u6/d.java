/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package u6;

import g6.p;
import u6.C;
import u6.D;
import u6.F;
import u6.e;

public abstract class d {
    public static final F a = new F("CLOSED");

    public static final e b(e object) {
        Object object2;
        while ((object2 = e.a((e)object)) != a) {
            if ((object2 = (e)object2) == null) {
                if (!object.j()) continue;
                return object;
            }
            object = object2;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final Object c(C object, long l8, p p8) {
        Object object2 = object;
        while (object2.q < l8 || object2.h()) {
            object = e.a((e)object2);
            if (object == a) {
                return D.a(a);
            }
            if ((object = (C)((e)object)) == null) {
                C c8 = (C)p8.invoke(object2.q + 1L, object2);
                if (!object2.l(c8)) continue;
                object = c8;
                if (object2.h()) {
                    object2.k();
                    object = c8;
                }
            }
            object2 = object;
        }
        return D.a(object2);
    }
}

